package patterns_Singlton;

import java.util.ArrayList;
import java.util.Date;

public class Logger {

    ArrayList<String> logList;
    private static Logger logger;

    public Logger() {
        this.logList = new ArrayList<>();
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String logInfo) {
        logList.add(logInfo);
    }

    public void showLog() {
        for (int i = 0; i < logList.size(); i++) {
            System.out.println(logList.get(i));
        }
    }

    public String currentDate() {
        Date date = new Date();
        return date.toString() + " " + logList.size() + ". ";
    }

}
