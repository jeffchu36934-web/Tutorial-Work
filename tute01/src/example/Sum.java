package example;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        String str = scan.nextLine();
        int total = 0;

        String[] arr = str.split(" ");

        for (String number : arr) {
            total += Integer.parseInt(number);
        }

        System.out.println(total);

        scan.close();
    }
}
