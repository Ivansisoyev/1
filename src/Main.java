import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       boolean result = true;
        while (result){
        System.out.print("Enter the String:");
        String s = sc.nextLine();
        if (s.equals("exit")) {
            result = false;
        }
        int len = s.length();
        System.out.println("lenght of String = " + len);
        }

    }

    }















