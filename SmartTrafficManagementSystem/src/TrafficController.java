import java.util.Timer;
import java.util.TimerTask;

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
