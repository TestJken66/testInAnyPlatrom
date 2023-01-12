
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
        System.out.println("30 \033[30;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("31 \033[31;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("32 \033[32;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("33 \033[33;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("34 \033[34;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("35 \033[35;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("36 \033[36;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("37 \033[37;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("40;31 \033[40;31;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("41;32 \033[41;32;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("42;33 \033[42;33;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("43;34 \033[43;34;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("44;35 \033[44;35;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("45;36 \033[45;36;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("46;37 \033[46;37;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("47 \033[47;4m" + "Hello,Akina!" + "\033[0m");

        // ||| \033[字体颜色;字体背景色;样式m你的字符（输出的字符）\033[0m |||
        for (int i = 10; i < 100; i++) {
            // System.out.println("字体颜色变动" + i + "----> \033[" + i + ";4m" + "彩色字符测试!" +
            // "\033[0m");
            for (int j = 10; j < 100; j++) {
                for (int k = 0; k < 100; k++) {
                    System.out.println("[" + i + ";" + j + ";" + k + "m]----> \033[" + i + ";" + j + ";" + k + "m"
                            + "彩色字符测试!" + "\033[0m");
                }

            }
        }

    }

}
