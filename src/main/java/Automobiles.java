public abstract class Automobiles {
  private String type;
  private String name;
  private String make;
  private int mpg;
  private int fuelCapacity;
  private boolean running;
  private boolean inService;

  public Automobiles(String type, String name, String make, int mpg, int fuelCapacity) {
    this.type = type;
    this.name = name;
    this.make = make;
    this.mpg = mpg;
    this.fuelCapacity = fuelCapacity;
    this.running = false;
    this.inService=true;
  }

  public void toggleEngine(){
    this.running = !this.running;
  }

  public void setInService(boolean inService) {
    this.inService = inService;
  }
  public void repair(){
    this.inService = true;
  }
  public abstract String companyGreeting();


  }

