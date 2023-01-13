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

        i("================colorPrint==============");

        i("32;0: \u001b[32;0mHelloWorld!\u001b[0m");
        i("32;1: \u001b[32;1mHelloWorld!\u001b[0m");
        i("32;2: \u001b[32;2mHelloWorld!\u001b[0m");
        i("32;3: \u001b[32;3mHelloWorld!\u001b[0m");
        i("32;4: \u001b[32;4mHelloWorld!\u001b[0m");
        i("32;5: \u001b[32;5mHelloWorld!\u001b[0m");
        i("32;6: \u001b[32;6mHelloWorld!\u001b[0m");

        i("32: \u001b[32;1mI/sanbo:\u001b[0m \u001b[32;2m Greem HelloWorld!\u001b[0m");
        i("32: \033[32;1mI/sanbo:\u001b[0m \u001b[32;2m Greem HelloWorld!\033[0m");

        i("34: \u001b[34;1mI/sanbo:\u001b[0m \u001b[34;2m Blue HelloWorld!\u001b[0m");
        i("34: \033[34;1mI/sanbo:\u001b[0m \u001b[34;2mBlue HelloWorld!\033[0m");

        i("31: \u001b[31;1mE/sanbo:\u001b[0m \u001b[31;2m Red HelloWorld!\u001b[0m");
        i("31: \033[31;1mE/sanbo:\u001b[0m \u001b[31;2m Red HelloWorld!\033[0m");

        i("33: \u001b[33;1mW/sanbo:\u001b[0m \u001b[33;2m yellow HelloWorld!\u001b[0m");
        i("33: \033[33;1mW/sanbo:\u001b[0m \u001b[33;2m yellow HelloWorld!\033[0m");

        i("37: \u001b[37;1mV/sanbo:\u001b[0m \u001b[37;2m gray HelloWorld!\u001b[0m");
        i("37: \033[37;1mV/sanbo:\u001b[0m \u001b[37;2m gray HelloWorld!\033[0m");

        for (int i = 90; i < 98; i++) {
            i(i + "----[u001b]-------\u001b[" + i + ";1mV/sanbo:\u001b[0m \u001b[" + i
                    + ";2m xbbbbbbbbbb!\u001b[0m"
                    + "\r\n\t[033]-------\033[" + i + ";1mV/sanbo:\u001b[0m \u001b[" + i
                    + ";2m xbbbbbbbbbb!\033[0m");
        }
        for (int i = 30; i < 38; i++) {
            i(i + "----[u001b]-------\u001b[" + i + ";1mV/sanbo:\u001b[0m \u001b[" + i
                    + ";2m xbbbbbbbbbb!\u001b[0m"
                    + "\r\n\t[033]-------\033[" + i + ";1mV/sanbo:\u001b[0m \u001b[" + i
                    + ";2m xbbbbbbbbbb!\033[0m");

        }
    }

    private static void i(String string) {
        System.out.println(string);
    }

    /**
     * for (int i = 30; i < 48; i++) {
     * for (int j = 30; j < 48; j++) {
     * for (int k = 30; k < 48; k++) {
     * System.out.println("[" + i + ";" + j + ";" + k + "m]----> \033[" + i + ";" +
     * j + ";" + k + "m"
     * + "BBBBBBBBBBBBBBBBBBBBBBBBBBBB!" + "\033[0m");
     * }
     *
     * }
     * }
     */
}
