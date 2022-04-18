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
            head = head.getNextListElement();
            return deletedCar.getCar();
        }

        CarListElement currentElement = head;
        while (currentElement != null){
            if(i == count + 1){
                CarListElement deletedCar = currentElement.getNextListElement();
                currentElement.setNextListElement(deletedCar.getNextListElement());
                return deletedCar.getCar();

            }
            count++;
            currentElement = currentElement.getNextListElement();
        }

        //We will never get here since every list has an end
        return null;
    }

    @Override
    public Car remove() {
        if(head == null){
            return null;
        }
        CarListElement currentElement = head;
        while(currentElement != null){
            if(currentElement.getNextListElement().getNextListElement() == null){
                CarListElement deletedCar = currentElement.getNextListElement();
                currentElement.setNextListElement(null);
                return deletedCar.getCar();
            }
            currentElement = currentElement.getNextListElement();
        }
        return null;
    }
}

class CarListElement {
    private Car car;
    private CarListElement nextListElement;

    public CarListElement(Car car){
        this.car = car;
        nextListElement = null;
    }

    public CarListElement(Car car, CarListElement nextListelement){
        this.car = car;
        this.nextListElement = nextListelement;
    }

    public CarListElement getNextListElement() {
        return nextListElement;
    }

    public void setNextListElement(CarListElement nextListElement) {
        this.nextListElement = nextListElement;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car newCar){
        this.car = newCar;
    }
}
