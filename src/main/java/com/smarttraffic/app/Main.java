package com.smarttraffic.app;

import com.smarttraffic.dao.TrafficDAO;
import com.smarttraffic.model.TrafficSignal;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TrafficDAO trafficDAO = new TrafficDAO();

        System.out.println("All Traffic Signals:");
        List<TrafficSignal> signals = trafficDAO.getAllTrafficSignals();
        for (TrafficSignal signal : signals) {
            System.out.println(signal.getSignalId() + " - " + signal.getLocation() + " - " + signal.getCurrentStatus());
        }

        System.out.println("\nUpdating Traffic Signal...");
        boolean updated = trafficDAO.updateTrafficSignalStatus(1, "GREEN");
        System.out.println("Update successful: " + updated);
    }
}
