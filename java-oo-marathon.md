## Getting Started

```no-highlight
et get java-oo-marathon
cd java-oo-marathon
idea .
```

## Your bright idea!

You have decided to create an app called gÜber. This app will combine the success of ride-sharing with the utility of a moving company. You want to be able to minimize the amount of repeated code in your app, so you decide to take an Object Oriented approach to the issue. This will allow you to apply the benefits of inheritance while you assemble your fleet of `Automobiles`.

In your app, a `Car` will always be a vehicle to transport passengers and a `Truck` will always refer to a vehicle to transport cargo.

1. Create an `Automobile` class. This class should have a constructor that accepts `type`, `name`, `make`, `mpg`, `fuelCapacity`, and a **boolean** for `running`.
1. Create a method `toggleEngine` that starts and stops the automobile.
   - If the automobile is running it should stop it.
   - If the automobile is not running it should start it
1. Create a child class for `Car` which inherits from `Automobile`.
   - In addition to the functionality from `Automobile`, it should take `capacity`, and `numPassengers` in its constructor.
1. Create an `addPassengers` method for a `Car` which allows you to add passengers to the `Car`.

   - It should take the number of new passengers in as an argument
   - It should check to ensure that the `Car` has room for them.
   - If it does not then do not add the passengers and it returns false.

1. Create an `exitPassengers` method for a `Car` which allows you remove passengers from the `Car`

   - It should take the number of exiting passengers in as an argument
   - If the passengers exiting would lower the `numPassengers` below zero then it should set the `numPassengers` to zero instead.

1. Create a child class for `Truck` which inherits from `Automobile`.

   - In addition to the functionality from `Automobile` the `Truck` should also take `bedLengthFeet`, `bedWidthFeet` in its constructor.
   - It should also allow for an optional item in its constructor for `containerHeightFeet`.
   - Finally it should also allow for an option for `currentLoadCubicFeet` whether or not the `containerHeightFeet` is supplied.

1. Can you create an automobile? Make it an `abstract` class

1. The `Truck` should have methods to calculate its capacity in volume.

   - If no `containerHeightFeet` is supplied use 3'.

1. The `Truck` should have a method to add to the currentLoad.

   - If there's sufficient capacity, it should adjust the cargo and return true
   - If the user attempts to add more cargo than the truck can carry, it should not adjust the cargo and return false

1. The `Truck` should have a method to empty the currentLoad

   - This should just set `currentLoadCubicFeet` to 0

1. Update the `Automobile` class to pass down a `inService` attribute and a method to determine if the vehicle is `inService`. When constructed, `inService` should be true.

   - Update child classes as needed
   - Trucks are always breaking down. Set the `Truck` to **override** the parent behavior and default to **false**.

1. Create a `repair` method that sets `inService` to true.

1. Create an **abstract method** for `companyGreeting`.

   - When a `Car` operator greets a customer they should say `Thank you for riding with gÜber we hope you enjoy your ride`
   - When a `Truck` operator greets a customer they should say `Thank you for shipping with gÜber.`
