# CarService
Customers can select a vehicle type and services from a menu when using the Java programme known as the Vehicle Service System. Based on the chosen services, the programme determines the total bill and displays the type of vehicle and the total amount due. Cleaning is offered without charge if the final tab exceeds 10,000.

## Code Structure

The code is structured into multiple classes to achieve modularity and separation of concerns. Here's an overview of the classes and their functionalities:

1. `Vehicle` (abstract class):
   - Represents a vehicle and provides a method to get the vehicle type.
   - Subclasses:
     - `Hatchback`: Represents a hatchback vehicle.
     - `Sedan`: Represents a sedan vehicle.
     - `SUV`: Represents an SUV vehicle.

2. `Service` (abstract class):
   - Represents a service offered by the vehicle service station.
   - Contains a service code and a map of prices for different vehicle types.
   - Provides an abstract method to calculate the total bill for a specific vehicle.
   - Subclasses:
     - `BasicService`: Represents basic servicing.
     - `EngineFixing`: Represents engine fixing.
     - `ClutchFixing`: Represents clutch fixing.
     - `BrakeFixing`: Represents brake fixing.
     - `GearFixing`: Represents gear fixing.

3. `ServiceFactory`:
   - Provides a static method to create instances of different services based on the service code.

4. `ServiceBill`:
   - Represents a bill for services rendered to a vehicle.
   - Contains a vehicle object and a list of services.
   - Provides methods to add services and calculate the total bill.

5. `VehicleService`:
   - The main class that contains the `main` method.
   - Implements the user interface for the vehicle service system.
   - Prompts the user to select a vehicle type and services.
   - Displays the type of vehicle, total bill, and provides complimentary cleaning if the bill exceeds 10,000.


## Author

👤 **Nitesh Choudhary**

* GitHub: [Nitesh choudhary](https://github.com/itsmenitesh)

* LinkedIn: [Nitesh choudhary](https://www.linkedin.com/in/niteshchoudhary17/)
    
---

## 🤝 Contributing

Contributions, issues and feature requests are welcome.
    
---
    
## Show your support

Give a ⭐️ if this project helped you!
    
---
    
## 📝 License

Copyright © 2023 [Nitesh Choudhary](https://github.com/itsmenitesh).<br />
    
---
