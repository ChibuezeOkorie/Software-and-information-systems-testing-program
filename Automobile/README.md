This program demostrates and defines a superclass Vehicle, which has attributes like type, make, and model, and abstract methods describeVehicle() and rateQuality() that must be implemented by subclasses.

****************It creates two subclasses:***************************

Bicycle, which adds attributes like bicycleType and rating, and implements its own way of describing a bicycle and rating its quality.

Automobile, which adds attributes like engine and horsepower, and implements its own description and quality rating logic.

A test class VehicleTest is written to:

Create different Bicycle and Automobile objects using various constructors.

Use getters, setters, and toString() methods to display object details.

Modify some attributes of the objects and reprint them.

Store all vehicles in an array and use a loop to demonstrate polymorphic behavior by calling describeVehicle() and rateQuality() on each object.

in Summary, the program models vehicles (bicycles and automobiles), prints details about them, updates some of their properties, and demonstrates polymorphism by treating all of them as Vehicle objects while still executing their specific subclass methods.
