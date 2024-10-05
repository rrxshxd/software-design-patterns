package CreationalPatterns.Singleton;

public class DriverManager {
    private static DriverManager instance;
    private DriverManager() {}

    //Lazy double-checking
    public static DriverManager getInstance() {
        if(instance == null) {
            synchronized(DriverManager.class) {
                if(instance == null) {
                    instance = new DriverManager();
                }
            }
        }
        return instance;
    }

    public String findNearestDriver(String location) {
        System.out.println("Nearest driver found: " + "Driver1");
        return "Driver1";
    }
}
