/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labweek6_kenanakyurek;

/**
 *
 * @author akyur
 */
public class PremiumRide extends Ride{
    
    private double comfortFee;
    private double surgeMultiplier;

    public PremiumRide(String passengerName, String pickup, String destination,
                       double distanceKm, int durationMin, double pricePerKm,
                       double comfortFee, double surgeMultiplier) {

        super(passengerName, pickup, destination,
                distanceKm, durationMin, pricePerKm);

        this.comfortFee = comfortFee;

        if (surgeMultiplier >= 1.0 && surgeMultiplier <= 3.0) {
            this.surgeMultiplier = surgeMultiplier;
        } else {
            System.out.println("Warning: Surge multiplier must be between 1.0 and 3.0.");
            this.surgeMultiplier = 1.0;
        }
    }

    public double getComfortFee() {
        return comfortFee;
    }

    public double getSurgeMultiplier() {
        return surgeMultiplier;
    }

    @Override
    public double calculateFare() {
        return (super.calculateFare() + comfortFee) * surgeMultiplier;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nRide Type: Premium Ride"
                + "\nComfort Fee: " + comfortFee
                + "\nSurge Multiplier: " + surgeMultiplier;
    }
}
