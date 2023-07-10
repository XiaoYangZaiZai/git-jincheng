package decorator;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface ILogger {
    void log(String msg) throws IOException;
}
