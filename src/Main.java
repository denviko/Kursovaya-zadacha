import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "12345678910";

        int mid = s.length() / 2;
        String[] parts = {
                s.substring(0, mid),
                s.substring(mid),};
        System.out.println(Arrays.toString(parts));

    }
}