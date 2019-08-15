import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("String 1:");
        String str1 = scan.nextLine();
        System.out.println("String 2:");
        String str2 = scan.nextLine();

        boolean result = str1.equalsIgnoreCase(str2);
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("\"" + str1 + "\" " + (result ? "is equal to" : "is not equal to") + " \"" + str2 + "\"");
    }

}
