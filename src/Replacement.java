import java.util.Scanner;

public class Replacement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sample string:");
        String str1 = scan.nextLine();
        System.out.println("Substring to replace:");
        String str2 = scan.nextLine();
        System.out.println("Replacement string");
        String str3 = scan.nextLine();

        String result = str1.replaceAll(str2,str3);
        System.out.println("Result: " + result);
    }
}
