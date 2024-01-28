package design.patterns.chain_of_responsibility;

import static design.patterns.chain_of_responsibility.Main.ERROR;

public class ErrorLogProcessor extends LogProcessor{
    public ErrorLogProcessor(LogProcessor next) {
        super(next);
    }

    @Override
    public void log(String level, String msg) {
        if(ERROR.equals(level)){
            System.out.println("Error: "+msg);
        }else{
            super.log(level, msg);
        }
    }
}
