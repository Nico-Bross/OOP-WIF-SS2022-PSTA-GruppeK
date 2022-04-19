package CreazyStation;

public class CarLinkedList implements CarList {

    CarListElement head; // Kopf der CarList

    public CarLinkedList(){
        head = null; // this means the list is empty at the beginning
    }

    @Override
    public Car get(int i) {
        int count = 0;

        CarListElement currentElement = head;
        while(currentElement != null){
            if(i == count){
                return currentElement.getCar();
            }
            count++;
            currentElement = currentElement.getNextListElement();
        }
        return null; //if we get here the list was shorter than int i
    }

    @Override
    public boolean put(int i, Car car) {
        int count = 0;

        CarListElement currentElement = head;
        while (currentElement != null){
            if(i == count){
                currentElement.setCar(car);
                return true;

            }
                count++;
                currentElement = currentElement.getNextListElement();
        }

        return false;
    }

    @Override
    public boolean add(Car car) {
        CarListElement newListElement = new CarListElement(car);
        if(head == null){
            head = newListElement;
            return true;
        }
        CarListElement currentElement = head;
        while(currentElement != null){
            if(currentElement.getNextListElement() == null){
                currentElement.setNextListElement(newListElement);
                return true;
            }
            currentElement = currentElement.getNextListElement();
        }

        //We will never get here since every list has an end
        return false;
    }



    @Override
    public boolean add(int i, Car car) {
        CarListElement newListElement = new CarListElement(car);
        if(i == 0){
            newListElement.setNextListElement(head);
            head = newListElement;
            return true;
        }
        int count = 0;

        CarListElement currentElement = head;
        while (currentElement != null){
            if(i == count + 1){
                newListElement.setNextListElement(currentElement.getNextListElement());
                currentElement.setNextListElement(newListElement);

                return true;

            }
            count++;
            currentElement = currentElement.getNextListElement();
        }
        return false;
    }

    @Override
    public Car remove(int i) {
        int count = 0;
        if(i == 0) {
            CarListElement deletedCar = head;
            if(head != null) head = head.getNextListElement();
            return deletedCar.getCar();
        }

        CarListElement currentElement = head;
        while (currentElement != null){
            if(i == count + 1){

                CarListElement deletedCar = currentElement.getNextListElement();
                if(deletedCar != null) {
                    currentElement.setNextListElement(deletedCar.getNextListElement());
                    return deletedCar.getCar();
                }
                return null; //The deleted Car is null so we return null

            }
            count++;
            currentElement = currentElement.getNextListElement();
        }

        //This is an error and we return null, since the requested car position i was not in the list
        return null;
    }

    @Override
    public Car remove() {
        if(head == null){
            return null; //the list is empty so we only can return null
        }
        if(head.getNextListElement() == null){
            CarListElement deletetCarListElemnt = head;
            head = null; //Now the list is empty since we removed the last element
            return deletetCarListElemnt.getCar();
        }
        CarListElement currentElement = head;
        while (currentElement.getNextListElement().getNextListElement() != null) {
            currentElement = currentElement.getNextListElement();
        }
        CarListElement deletedCar = currentElement.getNextListElement();
        currentElement.setNextListElement(null);
        return deletedCar.getCar();
        }

        public int getLength() {
         int count= 0;
         CarListElement currentElement = head;
         while(currentElement != null) {
             ++count;
             currentElement = currentElement.getNextListElement();
         }
         return count;

        }

        @Override
        public String toString() {
            String result = "CarList with length = " + getLength() ;
            if(head != null) {result = result + " First Car = " + head.getCar().getCarID();}
            return result;
        }

    }

