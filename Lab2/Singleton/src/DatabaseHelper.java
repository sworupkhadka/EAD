public class DatabaseHelper {
    // Static instance variable
    private static DatabaseHelper instance;
    
    // Private constructor to prevent instantiation
    private DatabaseHelper() {
        // Prevent instantiation from reflection
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }
    
    // Static getInstance method to initialize and return the single instance
    public static DatabaseHelper getInstance() {
        // Lazy initialization
        if (instance == null) {
            synchronized (DatabaseHelper.class) {
                if (instance == null) {
                    instance = new DatabaseHelper();
                }
            }
        }
        return instance;
    }
    
    // Example method for database operations
    public void connect() {
        System.out.println("Connected to the database");
    }
}