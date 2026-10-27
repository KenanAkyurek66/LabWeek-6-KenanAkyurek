/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labweek6_kenanakyurek;

/**
 *
 * @author akyur
 */
public class Ride {
    
    private String passengerName;
    private String pickup;
    private String destination;
    private double distanceKm;
    private int durationMin;
    private double pricePerKm;

    public Ride(String passengerName, String pickup, String destination,
                double distanceKm, int durationMin, double pricePerKm) {

        this.passengerName = passengerName;
        this.pickup = pickup;
        this.destination = destination;

        if (distanceKm > 0) {
            this.distanceKm = distanceKm;
        } else {
            System.out.println("Warning: Distance must be positive.");
            this.distanceKm = 1;
        }

        if (durationMin > 0) {
            this.durationMin = durationMin;
        } else {
            System.out.println("Warning: Duration must be positive.");
            this.durationMin = 1;
        }

        if (pricePerKm > 0) {
            this.pricePerKm = pricePerKm;
        } else {
            System.out.println("Warning: Price per km must be positive.");
            this.pricePerKm = 1;
        }
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getPickup() {
        return pickup;
    }

    public String getDestination() {
        return destination;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public int getDurationMin() {
        return durationMin;
    }

    public double getPricePerKm() {
        return pricePerKm;
    }

    public double calculateFare() {
        return distanceKm * pricePerKm;
    }

    @Override
    public String toString() {
        return "Passenger: " + passengerName
                + "\nPickup: " + pickup
                + "\nDestination: " + destination
                + "\nDistance: " + distanceKm + " km"
                + "\nDuration: " + durationMin + " min"
                + "\nPrice per km: " + pricePerKm;
    }
    
}
