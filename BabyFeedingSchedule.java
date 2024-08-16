/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.babyfeedingschedule;

/**
 *
 * @author user
 */
public class BabyFeedingSchedule {
    public static void main(String[] args) {
        // Baby's cup capacity in liters
        double cupCapacity = 0.5;

        // Amount of porridge and milk in liters
        double porridgeAmount = 2;
        double milkAmount = 2;

        // Waiting time 
        int porridgeWaitTime = 45;
        int milkWaitTime = 30;

        // Calculate number of feeds for porridge and milk
        int porridgeFeeds = (int) (porridgeAmount / cupCapacity);
        int milkFeeds = (int) (milkAmount / cupCapacity);

        // Calculate total time for porridge and milk feeds
        int porridgeTime = porridgeFeeds * porridgeWaitTime;
        int milkTime = milkFeeds * milkWaitTime;

        // Calculate total time to finish both porridge and milk
        int totalTime = porridgeTime + milkTime;

        System.out.println("Time to finish porridge: " + porridgeTime + " minutes");
        System.out.println("Time to finish milk: " + milkTime + " minutes");
        System.out.println("Total time to finish both: " + totalTime + " minutes");
    }
}



