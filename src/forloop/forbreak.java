package forloop;

public class forbreak {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println("i..>" + i);
            if (i == 5) {
                break;
            }
        }
    }
}
