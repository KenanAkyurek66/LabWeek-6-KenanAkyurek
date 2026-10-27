/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labweek6_kenanakyurek;

/**
 *
 * @author akyur
 */
public class SharedRide extends EconomyRide{
    
    private int passengerCount;

    public SharedRide(String passengerName, String pickup, String destination,
                      double distanceKm, int durationMin, double pricePerKm,
                      double pricePerMinute, int passengerCount) {

        super(passengerName, pickup, destination,
                distanceKm, durationMin, pricePerKm, pricePerMinute);

        if (passengerCount >= 1 && passengerCount <= 4) {
            this.passengerCount = passengerCount;
        } else {
            System.out.println("Warning: Passenger count must be between 1 and 4.");
            this.passengerCount = 1;
        }
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    @Override
    public double calculateFare() {

        double economyFare = super.calculateFare();

        double farePerPassenger = economyFare / passengerCount;

        return farePerPassenger + (farePerPassenger * 0.10);
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nRide Type: Shared Ride"
                + "\nPassenger Count: " + passengerCount;
    }
    
}
