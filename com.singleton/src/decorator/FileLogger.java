package decorator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileLogger implements ILogger {
    @Override
    public void log(String msg) throws IOException {
        FileOutputStream fos = new FileOutputStream("com.singleton/src/decorator/a.xml");
        byte []bytes = msg.getBytes(StandardCharsets.UTF_8);
        fos.write(bytes);
        fos.close();
        System.out.println("文件存储："+msg);
    }
}
