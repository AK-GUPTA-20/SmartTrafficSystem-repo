# SmartTrafficSystem-repo
## Overview

This project simulates a simple smart traffic light control system written in Java. The system manages two traffic lights that alternate between "RED" and "GREEN" states to control traffic flow for North-South and East-West directions. Each light switches colors at regular intervals, demonstrating a basic approach to traffic light management using a timer.

## Features

- Simulates two traffic lights (North-South and East-West) in an intersection.
- Traffic lights alternate between "RED" and "GREEN" states.
- Lights change every 10 seconds.
- Easy start and stop functionality for the traffic management simulation.

## How It Works

The program is designed with two main classes:

1. **TrafficLight**: Represents a single traffic light with a current color (either "RED" or "GREEN") and a name indicating its direction (e.g., "North-South").

2. **TrafficController**: Controls the two traffic lights, alternating their colors using a `Timer` and `TimerTask`. Every 10 seconds, the controller toggles the lights:
    - If the North-South light is "RED," it switches to "GREEN," while the East-West light turns "RED."
    - If the North-South light is "GREEN," it switches to "RED," and the East-West light turns "GREEN."

The main class, `SmartTrafficManagementSystem`, initializes and starts the traffic controller, allowing the system to run for 30 seconds before stopping.

## Code Structure

```plaintext
├── src/
│   ├── TrafficLight.java
│   ├── TrafficController.java
│   └── SmartTrafficManagementSystem.java
├── README.md
├── .gitignore
└── pom.xml   
