package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

/*
* Requeriments:
*  create an application for parking lot system.
* 1. a parking lot should have a parking lot ID, number of floors, and number of slots on each floor
* 2. each slot in the parking lot has a type of vehicle that can park there.
*    valid types are car, bike and truck. you can include any vehicle type as per your needs
*    you can also decide which slots should go to each type. here iam assigning the first slot on each floor to a truck,
*    the next two bikes and rest for cars.
* 3. when a vehicle pulls into the parking lot, the application takes the vehicle's type, registration number, and its color.}
*    you can also have additional details like the vehicle's name, the driver's name and so on.
* 4. after that a slot is assigned to the vehicle. the selection strategy could be anything you want. here we eill
*    choose the lowest floor ans earliest available slot.
* 5. when a vehicle is assigned a slot, the app should return a ticket. the ticket should be a string of the from.
*    for example, the vehicle parked on floor 2, slot 5 wuld be PR123_2_5.
* 6. to unpark the veicle, the user shoukd present the valid ticket. after that, the vehicle is removed from the slot.
* 7. the app sjould be able to display the number of available slots and a list of available and unavailable slots for a specif vehicle type.
*
* */

import org.example.Entities.ParkingLot;

public class Main {
    public static void main(String[] args) {
        int nfloors = 4;
        int nSlotsPerFloor = 6;
        ParkingLot parkingLot = new ParkingLot("PR1234", nfloors, nSlotsPerFloor);

        parkingLot.getNoOfOpenSlots("car");

        String ticket1 = parkingLot.parkVehhicle("car", "MH-03", "red");
        String ticket2 = parkingLot.parkVehhicle("car", "MH-04", "purple");

        parkingLot.displayOccupiedSlots("car");
    }
}