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

        //
        System.out.println("\u001b[32;1mHelloWorld!\u001b[0m");
        System.out.println("\u001b[32;0mHelloWorld!\u001b[0m");
        System.out.println("\u001b[32;2mHelloWorld!\u001b[0m");

        System.out.println("\u001b[32;1mI/sanbo:\u001b[0m \u001b[32;2m Greem HelloWorld!\u001b[0m");
        System.out.println("\033[32;1mI/sanbo:\u001b[0m \u001b[32;2m Greem HelloWorld!\033[0m");

        System.out.println("\u001b[34;1mI/sanbo:\u001b[0m \u001b[34;2m Blue HelloWorld!\u001b[0m");
        System.out.println("\033[34;1mI/sanbo:\u001b[0m \u001b[34;2mBlue HelloWorld!\033[0m");

        System.out.println("\u001b[31;1mE/sanbo:\u001b[0m \u001b[31;2m Red HelloWorld!\u001b[0m");
        System.out.println("\033[31;1mE/sanbo:\u001b[0m \u001b[31;2m Red HelloWorld!\033[0m");

        System.out.println("\u001b[33;1mW/sanbo:\u001b[0m \u001b[33;2m Red HelloWorld!\u001b[0m");
        System.out.println("\033[33;1mW/sanbo:\u001b[0m \u001b[33;2m Red HelloWorld!\033[0m");

        System.out.println("\u001b[37;1mV/sanbo:\u001b[0m \u001b[37;2m Red HelloWorld!\u001b[0m");
        System.out.println("\033[37;1mV/sanbo:\u001b[0m \u001b[37;2m Red HelloWorld!\033[0m");

        for (int i = 90; i < 98; i++) {
            System.out.println(i + "----[u001b]-------\u001b[" + i + ";1mV/sanbo:\u001b[0m \u001b[" + i + ";2m xbbbbbbbbbb!\u001b[0m");
            System.out.println(i + "----[033]-------\033[" + i + ";1mV/sanbo:\u001b[0m \u001b[" + i + ";2m xbbbbbbbbbb!\033[0m");
        }
        for (int i = 30; i < 38; i++) {
            System.out.println(i + "----[u001b]-------\u001b[" + i + ";1mV/sanbo:\u001b[0m \u001b[" + i + ";2m xbbbbbbbbbb!\u001b[0m");
            System.out.println(i + "----[033]-------\033[" + i + ";1mV/sanbo:\u001b[0m \u001b[" + i + ";2m xbbbbbbbbbb!\033[0m");
        }

//        System.out.println("30 \033[30;4m" + "Hello,Akina!" + "\033[0m");
//        System.out.println("31 \033[31;4m" + "Hello,Akina!" + "\033[0m");
//        System.out.println("32 \033[32;4m" + "Hello,Akina!" + "\033[0m");
//        System.out.println("33 \033[33;4m" + "Hello,Akina!" + "\033[0m");
//        System.out.println("34 \033[34;4m" + "Hello,Akina!" + "\033[0m");
//        System.out.println("35 \033[35;4m" + "Hello,Akina!" + "\033[0m");
//        System.out.println("36 \033[36;4m" + "Hello,Akina!" + "\033[0m");
//        System.out.println("37 \033[37;4m" + "Hello,Akina!" + "\033[0m");
//        System.out.println("40;31 \033[40;31;4m" + "Hello,Akina!" + "\033[0m");
//        System.out.println("41;32 \033[41;32;4m" + "Hello,Akina!" + "\033[0m");
//        System.out.println("42;33 \033[42;33;4m" + "Hello,Akina!" + "\033[0m");
//        System.out.println("43;34 \033[43;34;4m" + "Hello,Akina!" + "\033[0m");
//        System.out.println("44;35 \033[44;35;4m" + "Hello,Akina!" + "\033[0m");
//        System.out.println("45;36 \033[45;36;4m" + "Hello,Akina!" + "\033[0m");
//        System.out.println("46;37 \033[46;37;4m" + "Hello,Akina!" + "\033[0m");
//        System.out.println("47 \033[47;4m" + "Hello,Akina!" + "\033[0m");


        // for (int i = 30; i < 48; i++) {
        // for (int j = 30; j < 48; j++) {
        // for (int k = 30; k < 48; k++) {
        // System.out.println("[" + i + ";" + j + ";" + k + "m]----> \033[" + i + ";" +
        // j + ";" + k + "m"
        // + "BBBBBBBBBBBBBBBBBBBBBBBBBBBB!" + "\033[0m");
        // }

        // }
        // }

    }

}
