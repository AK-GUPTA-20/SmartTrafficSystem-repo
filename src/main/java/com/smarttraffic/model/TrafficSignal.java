package com.smarttraffic.model;

import java.time.LocalDateTime;

public class TrafficSignal {
    private int signalId;
    private String location;
    private String currentStatus;
    private LocalDateTime lastUpdated;

    public TrafficSignal(int signalId, String location, String currentStatus, LocalDateTime lastUpdated) {
        this.signalId = signalId;
        this.location = location;
        this.currentStatus = currentStatus;
        this.lastUpdated = lastUpdated;
    }

    // Getters and setters
    public int getSignalId() {
        return signalId;
    }

    public void setSignalId(int signalId) {
        this.signalId = signalId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
