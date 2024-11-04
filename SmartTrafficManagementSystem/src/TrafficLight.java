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
