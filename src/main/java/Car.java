public class Car extends Automobiles {
  private int capacity;
  private int numPassengers;
  public Car(String type, String name, String make, int mpg,
      int fuelCapacity, int capacity, int numPassengers) {
    super(type, name, make, mpg, fuelCapacity);
    this.capacity = capacity;
    this.numPassengers = numPassengers;
  }
  public boolean addPassengers(int newPassengers) {
    if (newPassengers <= (capacity - numPassengers)) {
      numPassengers += newPassengers;
      return true;
    } else {
      return false;
    }
  }
  public void exitPassengers(int exitingPassengers) {
    if (numPassengers - exitingPassengers < 0){
      numPassengers = 0;
    } else {
      numPassengers -= exitingPassengers;
    }
  }

  @Override
  public String companyGreeting() {
    return "Thank you for riding with gÜber we hope you enjoy your ride";
  }
}
