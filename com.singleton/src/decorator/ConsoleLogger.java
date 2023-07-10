package decorator;

import org.dom4j.io.SAXReader;

import javax.xml.parsers.DocumentBuilderFactory;

public class ConsoleLogger implements ILogger{
    @Override
    public void log(String msg) {
        System.out.println("屏幕显示"+msg);
    }
}
