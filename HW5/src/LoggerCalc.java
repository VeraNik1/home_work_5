package src;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerCalc {
    public static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message = "Calculator's has started";

    public LoggerCalc() {
        // create a file handler
        Handler fileHandler;
        // the file handler constructor may throw an exception,
        // so we have to put it into try-catch block
        try {
            DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyyMMddHHmms");
            fileHandler = new FileHandler("./HW5/src/important" + LocalDateTime.now().format(pattern) +".log");
            // set the file handler's minimum level
            fileHandler.setLevel(Level.ALL);
            // add the handler to the logger
            LOGGER.addHandler(fileHandler);
        } catch (IOException e) {
            // log the exception
            LOGGER.log(Level.SEVERE, "Error occur in FileHandler.", e.getMessage());
        }

        // logging
        LOGGER.finest("finest message log");
        LOGGER.finer("finer message log");
        LOGGER.fine("fine message log");
        LOGGER.config("config message log");
        LOGGER.info(message);
        /*
        LOGGER.warning("warn message");
        LOGGER.severe("error message");
        */

    }
}


