
import java.util.Map;
import java.util.Properties;

public class SystemInfo {
    public static void main(String[] args) {

        String platform = System.getProperty("os.name", "");
        String arch = System.getProperty("os.arch", "");
        String version = System.getProperty("os.version", "");
        System.out.println("系统:" + platform
                + "\r\narch:" + arch
                + "\r\nversion:" + version);
    }
}
