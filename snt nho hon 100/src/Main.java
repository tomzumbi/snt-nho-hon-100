public class Main {
    public static void main(String[] args) {
        int count = 0;
        int b = 0;
        do {
            for (int i = 1; i <= b; i++) {
                if (b % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(b);
            }
            b = b + 1;
            count = 0;

        } while (b < 100);
    }

}