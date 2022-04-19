package CreazyStation;

public class TrainLinkedList implements TrainList {

    TrainListElement head; // Kopf der TrainList

    public TrainLinkedList(){
        head = null; // this means the list is empty at the beginning
    }

    @Override
    public Train get(int i) {
        int count = 0;

        TrainListElement currentElement = head;
        while(currentElement != null){
            if(i == count){
                return currentElement.getTrain();
            }
            count++;
            currentElement = currentElement.getNextListElement();
        }
        return null; //if we get here the list was shorter than int i
    }

    @Override
    public boolean put(int i, Train train) {
        int count = 0;

        TrainListElement currentElement = head;
        while (currentElement != null){
            if(i == count){
                currentElement.setTrain(train);
                return true;

            }
            count++;
            currentElement = currentElement.getNextListElement();
        }

        return false;
    }

    @Override
    public boolean add(Train train) {
        TrainListElement newListElement = new TrainListElement(train);
        if(head == null){
            head = newListElement;
            return true;
        }
        TrainListElement currentElement = head;
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
    public boolean add(int i, Train train) {
        TrainListElement newListElement = new TrainListElement(train);
        if(i == 0){
            newListElement.setNextListElement(head);
            head = newListElement;
            return true;
        }
        int count = 0;

        TrainListElement currentElement = head;
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
    public Train remove(int i) {
        int count = 0;
        if(i == 0) {
            TrainListElement deletedTrain = head;
            if(head != null) head = head.getNextListElement();
            return deletedTrain.getTrain();
        }

        TrainListElement currentElement = head;
        while (currentElement != null){
            if(i == count + 1){

                TrainListElement deletedTrain = currentElement.getNextListElement();
                if(deletedTrain != null) {
                    currentElement.setNextListElement(deletedTrain.getNextListElement());
                    return deletedTrain.getTrain();
                }
                return null; //The deleted Train is null so we return null

            }
            count++;
            currentElement = currentElement.getNextListElement();
        }

        //This is an error and we return null, since the requested Train position i was not in the list
        return null;
    }

    @Override
    public Train remove() {
        if(head == null){
            return null; //the list is empty so we only can return null
        }
        if(head.getNextListElement() == null){
            TrainListElement deletetTrainListElemnt = head;
            head = null; //Now the list is empty since we removed the last element
            return deletetTrainListElemnt.getTrain();
        }
        TrainListElement currentElement = head;
        while (currentElement.getNextListElement().getNextListElement() != null) {
            currentElement = currentElement.getNextListElement();
        }
        TrainListElement deletedTrain = currentElement.getNextListElement();
        currentElement.setNextListElement(null);
        return deletedTrain.getTrain();
    }

    public int getLength() {
        int count= 0;
        TrainListElement currentElement = head;
        while(currentElement != null) {
            ++count;
            currentElement = currentElement.getNextListElement();
        }
        return count;

    }

    @Override
    public String toString() {
        String result = "TrainList with length = " + getLength() ;
        if(head != null) {result = result + " First Station = " + head.getTrain().getStation() + " Central Station = " + head.getTrain().getCentral();}
        return result;
    }

}

