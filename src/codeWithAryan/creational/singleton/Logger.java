package codeWithAryan.creational.singleton;

public class Logger {
    public static Logger logger;
    private static int instances;
    private Logger(){
        System.out.println("logger init");
        instances++;
    }

    public static Logger getLogger() {
        if(logger==null) {
            synchronized (Logger.class) {
                if (logger==null)
                    logger = new Logger();

            }
        }
        return logger;
    }
    public void log(String input){
        System.out.println(input+" logger instances "+instances);
    }
}
