public class gUber {

  public static void main(String[] args) {
    Automobiles testDrive = new Car("Sedan", "Nissan", "Sentra", 30, 10, 5, 1);
    System.out.println(testDrive.companyGreeting());

    Truck longHaul = new Truck("Big rig", "Ford", "F-150", 10, 30, 8, 6, 3);
    System.out.println(longHaul.companyGreeting());
    longHaul.maxVolume();

  }
}
