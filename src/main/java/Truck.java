public class Truck extends Automobiles {
private int bedLengthFeet;
private int bedWidthFeet;
private  int containerHeightFeet;
private double currentLoadCubicFeet; // signature has to be different to work.
private double possibleLoad;

//None of the extra items
  public Truck(String type, String name, String make, int mpg, int fuelCapacity,
      int bedLengthFeet, int bedWidthFeet) {
    super(type, name, make, mpg, fuelCapacity);
    this.bedLengthFeet = bedLengthFeet;
    this.bedWidthFeet = bedWidthFeet;
    containerHeightFeet = 3;
    setInService(false);
  }
//  just container height
  public Truck(String type, String name, String make, int mpg, int fuelCapacity,
      int bedLengthFeet, int bedWidthFeet, int containerHeightFeet) {
    this(type, name, make, mpg, fuelCapacity, bedLengthFeet, bedWidthFeet);
    this.containerHeightFeet= containerHeightFeet;

  }

//  just current load without container height
  public Truck(String type, String name, String make, int mpg, int fuelCapacity,
      int bedLengthFeet, int bedWidthFeet, double currentLoadCubicFeet) {
    this(type, name, make, mpg, fuelCapacity, bedLengthFeet, bedWidthFeet);
    this.currentLoadCubicFeet= currentLoadCubicFeet;
  }
//  With both
  public Truck(String type, String name, String make, int mpg, int fuelCapacity,
      int bedLengthFeet, int bedWidthFeet, int containerHeightFeet, double currentLoadCubicFeet) {
    this(type, name, make, mpg, fuelCapacity, bedLengthFeet, bedWidthFeet);
    this.currentLoadCubicFeet= currentLoadCubicFeet;
    this.containerHeightFeet= containerHeightFeet;
  }

  public void maxVolume() {
    possibleLoad = containerHeightFeet*bedWidthFeet*bedLengthFeet;
    System.out.println(possibleLoad);
  }

  public boolean addToCurrentLoad(double newLoad) {
    if (currentLoadCubicFeet + newLoad <= possibleLoad) {
      currentLoadCubicFeet+= newLoad;
      return true;
    } else {
      return false;
    }
  }

  public void dumpCurrentLoad(){
    currentLoadCubicFeet = 0;
  }

  @Override
  public String companyGreeting() {
    return "Thank you for shipping with gÜber.";
  }
}
