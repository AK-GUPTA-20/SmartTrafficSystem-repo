import java.util.Timer;
import java.util.TimerTask;

class TrafficLight {
    private String color;
    private final String name;

    public TrafficLight(String name) {
        this.name = name;
        this.color = "RED"; // Initial state
    }

    public String getColor() {
        return color;
    }

    public void changeColor(String color) {
        this.color = color;
        System.out.println(name + " light is now " + color);
    }
}

class TrafficController {
    private TrafficLight northSouthLight;
    private TrafficLight eastWestLight;
    private Timer timer;

    public TrafficController() {
        northSouthLight = new TrafficLight("North-South");
        eastWestLight = new TrafficLight("East-West");
        timer = new Timer();
    }

    public void start() {
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                cycleTrafficLights();
            }
        }, 0, 10000); // Change lights every 10 seconds
    }

    private void cycleTrafficLights() {
        if (northSouthLight.getColor().equals("RED")) {
            northSouthLight.changeColor("GREEN");
            eastWestLight.changeColor("RED");
        } else {
            northSouthLight.changeColor("RED");
            eastWestLight.changeColor("GREEN");
        }
    }

    public void stop() {
        timer.cancel();
    }
}

public class SmartTrafficManagementSystem {
    public static void main(String[] args) {
        TrafficController controller = new TrafficController();
        controller.start();
        
        // Simulate running for a period and then stop
        try {
            Thread.sleep(30000); // Run for 30 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        controller.stop();
        System.out.println("Traffic management system stopped.");
    }
}