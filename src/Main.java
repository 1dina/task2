import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int num;

    public static void main(String[] args) {
        System.out.println("Please enter number from 1 to 7 :");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        switch (num) {
            case (1):
                fun();
                break;
            case (2):
            case (3):
                arr();
            case (4):
                break;
            case (5):
                D2arr();
                break;
            case (6):
                add(new int[]{1, 2, 4, 5});
                break;
            case (7):
                first(3);
                first(3.14f);
                first("Dina");



        }


    }

    public static void fun() {
        int rows = 6, k = 0;

        for (int i = 1; i <= rows; ++i, k = 0) {

            for (int space = 1; space <= rows - i; ++space) {

                System.out.print("  ");

            }
            while (k != 2 * i - 1) {
                if (i == 3 || i == 4) break;

                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
    }

    public static void arr() {
        int total = 0;
        int avg;
        System.out.println("Please enter a number : ");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int[] arr = new int[i--];
        System.out.println("please enter elements : ");
        for (int k = 0; k < arr.length; k++) {
            arr[k] = in.nextInt();
        }
        for (int m = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        avg = total / num;
        System.out.println("The average is :" + avg);


    }

    public static void D2arr() {
        Scanner in = new Scanner(System.in);
        int[][] D2arr = new int[2][3];
        System.out.println("Please enter your 2x3 array elements : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {

                D2arr[i][j] = in.nextInt();
            }
        }
        System.out.println("your array : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(D2arr[i][j] + " ");

            }
            System.out.println();
        }

    }

    public static void add(int[] arr) {
        for (int i = 0; i < 4; i++) {
            arr[i] = arr[i] + 5;
        }
        System.out.println("Your array after adding : ");
        for (int i = 0; i < 4; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    public static void first(int n ){
        for (int i =0;i<n;i++){
            System.out.println("oop");
        }
    }
    public static void first(float f ){
      f = f*3 ;
      System.out.println(f);
    }
    public static void first( String name ){
     System.out.println("Hello " +name);
    }

}