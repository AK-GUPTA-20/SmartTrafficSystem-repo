CREATE TABLE traffic_signals (
    signal_id INT AUTO_INCREMENT PRIMARY KEY,
    location VARCHAR(255) NOT NULL,
    current_status ENUM('RED', 'GREEN', 'YELLOW') NOT NULL,
    last_updated DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE vehicles (
    vehicle_id INT AUTO_INCREMENT PRIMARY KEY,
    vehicle_type ENUM('CAR', 'TRUCK', 'BIKE', 'BUS') NOT NULL,
    signal_id INT,
    timestamp DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (signal_id) REFERENCES traffic_signals(signal_id)
);
