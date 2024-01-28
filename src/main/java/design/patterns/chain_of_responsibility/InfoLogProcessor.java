package design.patterns.chain_of_responsibility;

import static design.patterns.chain_of_responsibility.Main.INFO;

public class InfoLogProcessor extends LogProcessor{
    public InfoLogProcessor(LogProcessor next) {
        super(next);
    }

    @Override
    public void log(String level, String msg) {
        if(INFO.equals(level)){
            System.out.println("Info: "+msg);
        }else{
            super.log(level, msg);
        }
    }
}
