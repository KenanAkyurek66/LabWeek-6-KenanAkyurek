/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labweek6_kenanakyurek;

import java.util.ArrayList;

public class LabWeek6_KenanAkyurek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         ArrayList<Ride> rides = new ArrayList<>();

        Ride ride1 = new Ride(
                "Kenan",
                "Talas",
                "Erciyes University",
                10,
                20,
                12
        );

        EconomyRide ride2 = new EconomyRide(
                "Ali",
                "City Center",
                "University",
                8,
                15,
                10,
                2
        );

        PremiumRide ride3 = new PremiumRide(
                "Mehmet",
                "Airport",
                "Hotel",
                15,
                25,
                15,
                50,
                1.5
        );

        SharedRide ride4 = new SharedRide(
                "Ayse",
                "Talas",
                "City Center",
                12,
                20,
                10,
                2,
                3
        );

        rides.add(ride1);
        rides.add(ride2);
        rides.add(ride3);
        rides.add(ride4);

        for (int i = 0; i < rides.size(); i++) {

            System.out.println(rides.get(i));

            System.out.println(
                    "Fare: " + rides.get(i).calculateFare() + " TL"
            );

            System.out.println("-----------------------------");
        }
        
    }
    
}
