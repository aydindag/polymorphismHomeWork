public class Main {

    public static void main(String[] args) {

        BaseLogger dbLogger = new DbLogger();
        dbLogger.save(new Product(1, "Phone", "Tech", 350));

        BaseLogger filelogger = new FileLogger();
        filelogger.save(new Product(2, "Tv", "Tech", 2000));

        BaseLogger emailLogger = new EmailLogger();
        emailLogger.save(new Product(1, "BMW", "Car", 350000));

    }
}