package decorator;

import java.io.IOException;

public abstract class IDecorator {
    ILogger logger;
    public abstract void log(String msg) throws IOException;
    public abstract void decorate(String msg) throws IOException;
    IDecorator(ILogger logger){
        this.logger = logger;
    }
}
