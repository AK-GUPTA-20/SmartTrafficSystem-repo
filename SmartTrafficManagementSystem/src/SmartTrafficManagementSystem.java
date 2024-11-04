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
