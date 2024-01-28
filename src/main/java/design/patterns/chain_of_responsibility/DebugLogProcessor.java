package design.patterns.chain_of_responsibility;

import static design.patterns.chain_of_responsibility.Main.DEBUG;

public class DebugLogProcessor extends LogProcessor{
    public DebugLogProcessor(LogProcessor next) {
        super(next);
    }

    @Override
    public void log(String level, String msg) {
        if(DEBUG.equals(level)){
            System.out.println("Debug: "+msg);
        }else{
            super.log(level, msg);
        }
    }
}
