package decorator;

import java.io.IOException;

public class UpperDecorator extends IDecorator implements ILogger {


    public UpperDecorator(ILogger logger) {
        super(logger);
    }

    public void decorate(String msg) throws IOException {
        logger.log(msg.toUpperCase());
    }


    @Override
    public void log(String msg) throws IOException {
        this.decorate(msg);
    }
}


