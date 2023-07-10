package decorator;

import java.io.IOException;

public class XMLDecorator extends IDecorator implements ILogger{


    public XMLDecorator(ILogger logger) {
        super(logger);
    }

    public void decorate(String msg) throws IOException {
        logger.log("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n"+"<root>\n<message>"+msg+"</message>\n</root>");
    }


    @Override
    public void log(String msg) throws IOException {
        this.decorate(msg);
    }
}
