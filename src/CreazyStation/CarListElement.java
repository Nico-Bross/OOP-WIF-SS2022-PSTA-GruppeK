package CreazyStation;

public class CarListElement {
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
