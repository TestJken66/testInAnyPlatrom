
import java.util.Map;
import java.util.Properties;

public class SystemInfo {
    public static void main(String[] args) {

        String platform = System.getProperty("os.name", "");
        String arch = System.getProperty("os.arch", "");
        String version = System.getProperty("os.version", "");
        System.out.println("platform:" + platform
                + "\r\narch:" + arch
                + "\r\nversion:" + version);

        colorPrint();
    }

    private static void colorPrint() {

        System.out.println("================colorPrint==============");
        System.out.println("\033[30;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[31;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[32;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[33;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[34;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[35;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[36;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[37;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[40;31;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[41;32;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[42;33;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[43;34;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[44;35;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[45;36;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[46;37;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[47;4m" + "Hello,Akina!" + "\033[0m");

    }

}
