import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sample string:");
        String str1 = scan.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = str1.length() - 1; i >= 0; i--) {
            char c = str1.charAt(i);
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
