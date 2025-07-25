package ChainOfResponsibilityPattern;

public class DebugLogProcessor extends LogProcessor {

    DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int logLevel, String message) {

        if(logLevel == INFO){
            System.out.println("Debug:" + message);
        }else {
            super.log(logLevel, message);
        }
    }
}