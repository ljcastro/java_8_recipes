import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DeferredExecution {
    private Logger logger = Logger.getLogger(this.getClass().getName());

    private String createExpensiveMessage(String msg) {
        System.out.println("Creating expensive message at "
                + logger.getLevel() + " level");
        return "The message is " + msg;
    }

    public void logStuff(String message) {
        String msg = createExpensiveMessage(message);
        Supplier<String> supplier = () -> createExpensiveMessage(message);

        logger.info(msg);
        logger.info(supplier);
    }

    public static void main(String[] args) {
        DeferredExecution de = new DeferredExecution();
        de.logger.setLevel(Level.SEVERE);
        de.logStuff("logging at SEVERE level");

        de.logger.setLevel(Level.WARNING);
        de.logStuff("logging at WARNING level");

        de.logger.setLevel(Level.INFO);
        de.logStuff("logging at INFO level");

        de.logger.setLevel(Level.FINE);
        de.logStuff("logging at FINE level");

    }
}
