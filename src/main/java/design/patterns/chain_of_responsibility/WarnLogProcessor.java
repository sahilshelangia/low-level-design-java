package design.patterns.chain_of_responsibility;

import static design.patterns.chain_of_responsibility.Main.WARN;

public class WarnLogProcessor extends LogProcessor{
    public WarnLogProcessor(LogProcessor next) {
        super(next);
    }

    @Override
    public void log(String level, String msg) {
        if(WARN.equals(level)){
            System.out.println("Warn: "+msg);
        }else{
            super.log(level, msg);
        }
    }
}
