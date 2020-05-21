import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        listNumbers();
        calcNumbers();
        sumNumbers();
        showNumber();
        System.out.println(isNegativeNumber(-1));
        printMyText(" ");
    }

    public static void listNumbers() {
        byte b1 = 115;
        short s1 = 10000;
        long l1 = 89L;
        float f1 = 14.76f;
        double d1 = 149.9;
        char c1 = 'c';
        int i1 = 70;
        boolean boo1 = true;
        System.out.println(b1 + " " + s1 + " " + l1 + " " + f1 + " " + " " + d1 + " " + c1 + " " + i1);
    }

    public static int calcNumbers() {
        int a = 300, b = 23, c = 43, d = 70;
        int calculationResult = a * (b + (c / d));
        return calculationResult;
    }

    public static void sumNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number please");
        int a = scanner.nextInt();
        System.out.println("Input the second number please");
        int b = scanner.nextInt();
        int sumResult = a + b;
        if(sumResult >= 10 && sumResult <= 20) {
            System.out.println("The result is " + sumResult);
            System.out.println("The sum of numbers is between 10 and 20");
        } else {
            System.out.println("The result is " + sumResult);
            System.out.println("The sum of numbers is not between 10 and 20");
        }


    }

    public static void showNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number please");
        int a = scanner.nextInt();
        if (a < 0) {
            System.out.println("Your number is negative");
        } else if (a == 0 || a > 0) {
            System.out.println("Your number is positive");
        }
    }

    public static boolean isNegativeNumber (int someNumber) {
        if(someNumber < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printMyText(String name) {
        name = "Masato";
        System.out.println("Hello! Nice to meet you, " + name);
    }

}

