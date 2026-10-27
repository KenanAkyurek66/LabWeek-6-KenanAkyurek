/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labweek6_kenanakyurek;

/**
 *
 * @author akyur
 */
public class EconomyRide extends Ride{
    
    private double pricePerMinute;

    public EconomyRide(String passengerName, String pickup, String destination,
                       double distanceKm, int durationMin, double pricePerKm,
                       double pricePerMinute) {

        super(passengerName, pickup, destination,
                distanceKm, durationMin, pricePerKm);

        this.pricePerMinute = pricePerMinute;
    }

    public double getPricePerMinute() {
        return pricePerMinute;
    }

    @Override
    public double calculateFare() {

        double fare = super.calculateFare()
                + (getDurationMin() * pricePerMinute);

        if (fare < 50) {
            return 50;
        }

        return fare;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nRide Type: Economy Ride"
                + "\nPrice per minute: " + pricePerMinute;
    }
}
