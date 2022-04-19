package CreazyStation;


public class TrainListElement {
    private CreazyStation.Train Train;
    private CreazyStation.TrainListElement nextListElement;

    public TrainListElement(Train Train){
        this.Train = Train;
        nextListElement = null;
    }

    public TrainListElement(Train Train, CreazyStation.TrainListElement nextListelement){
        this.Train = Train;
        this.nextListElement = nextListelement;
    }

    public CreazyStation.TrainListElement getNextListElement() {
        return nextListElement;
    }

    public void setNextListElement(CreazyStation.TrainListElement nextListElement) {
        this.nextListElement = nextListElement;
    }

    public Train getTrain() {
        return Train;
    }

    public void setTrain(Train newTrain){
        this.Train = newTrain;
    }
}
