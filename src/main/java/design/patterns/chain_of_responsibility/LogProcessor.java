package design.patterns.chain_of_responsibility;

public abstract class LogProcessor {
    public LogProcessor(LogProcessor next) {
        this.next = next;
    }

    private LogProcessor next;
    public void log(String level, String msg){
        if (next!=null){
            this.next.log(level, msg);
        }
    }
}
