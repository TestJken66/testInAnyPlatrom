
import java.util.Map;
import java.util.Properties;

public class Tx {
    public static void main(String[] args) {
        Properties ps = System.getProperties();
        System.out.println("===================Properties=====================");
        for (Map.Entry entry : ps.entrySet()) {
            System.out.println(entry.getKey() + "_______" + entry.getValue());
        }

        Map<String, String> maps = System.getenv();

        System.out.println("===================env=====================");
        for (Map.Entry<String, String> entry : maps.entrySet()) {
            System.out.println(entry.getKey() + "-------------------" + entry.getValue());
        }
    }
}
