package design.patterns.chain_of_responsibility;

public class Main {
    public static String INFO = "info";
    public static String WARN = "warn";
    public static String ERROR = "error";
    public static String DEBUG = "debug";
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new WarnLogProcessor(new ErrorLogProcessor(null))));
        logProcessor.log(INFO, "this is info message");
    }
}
