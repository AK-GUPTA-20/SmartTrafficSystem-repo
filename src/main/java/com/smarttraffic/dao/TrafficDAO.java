package com.smarttraffic.dao;

import com.smarttraffic.model.TrafficSignal;
import com.smarttraffic.util.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TrafficDAO {

    public List<TrafficSignal> getAllTrafficSignals() {
        List<TrafficSignal> signals = new ArrayList<>();
        String query = "SELECT * FROM traffic_signals";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query);
             ResultSet rs = statement.executeQuery()) {

            while (rs.next()) {
                TrafficSignal signal = new TrafficSignal(
                    rs.getInt("signal_id"),
                    rs.getString("location"),
                    rs.getString("current_status"),
                    rs.getTimestamp("last_updated").toLocalDateTime()
                );
                signals.add(signal);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return signals;
    }

    public boolean updateTrafficSignalStatus(int signalId, String status) {
        String query = "UPDATE traffic_signals SET current_status = ?, last_updated = NOW() WHERE signal_id = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, status);
            statement.setInt(2, signalId);
            return statement.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
