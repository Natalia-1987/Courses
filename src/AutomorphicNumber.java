import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Input a number:");
        long num = sn.nextInt();
        long sq_num = num * num;

        String str_num = Long.toString(num);
        String square = Long.toString(sq_num);

        if (square.endsWith(str_num))
            System.out.println("Automorphic Number.");
        else
            System.out.println("Not an Automorphic Number.");

    }
}
