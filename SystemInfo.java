
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

        colorPrint();
    }

    // //格式
    // "\033[*;*;*m" //比如 "\033[1;2;3m"
    // 前缀"\033["，后缀"m"
    // 颜色、背景颜色、样式都是用数字表示
    // 所以只需要把对应的字码用";"隔开就好了
    // 范围
    // 转义符之后的字符都会变成转义符所表示的样式
    // 样式
    // 0 空样式
    // 1 粗体
    // 4 下划线
    // 7 反色
    // 颜色1：
    // 30 白色
    // 31 红色
    // 32 绿色
    // 33 黄色
    // 34 蓝色
    // 35 紫色
    // 36 浅蓝
    // 37 灰色
    // 背景颜色：
    // 40-47 和颜色顺序相同
    // 颜色2：
    // 90-97 比颜色1更鲜艳一些

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

    // 字体颜色： 黄色：33 绿色：32 青色：36 红色：31 黑色：30 蓝色：34 白色：37
    // 背景颜色： 黄色：43 绿色：42 青色：46 红色：41 黑色：40 蓝色：44 白色：47
    // 字体效果：删除线：9 下划线：4 斜体：3 默认：0 反显：7 或 8 粗体：1
    // 温馨提示：Java控制台无法输出背景色！
    // Java彩色字体格式："\033[你的字体颜色;字体效果m你的字符（输出的字符）\033[0m"
    // 例子：
    // System.out.println("\033[31;9m微信到账：1亿元\033[0m"); }

    ///////////////////////// Python输出彩色字的方法///////
    // 顺便拓展一下，Python输出彩色字的方法：
    // 格式："\033[字体效果;字体颜色;背景颜色m你的字符（输出的字符）\033[0m"
    // 例子：
    // print('\033[1;36;40m哈哈哈，测试\033[0m')
}
