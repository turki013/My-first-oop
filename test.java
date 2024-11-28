
import java.util.Scanner;

public class test {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] matrix = new int[5][3];
        fillArray(matrix);
        System.out.println("Array filled");

        System.out.println("Array will be printed.......");
        printarry(matrix);
        System.out.println("Array will be summed........");
        int total = sum(matrix);
        System.out.println(total);

    }

    public static void fillArray(int[][] list) {
        for (int row = 0; row < list.length; row++) {
            for (int cool = 0; cool < list[0].length; cool++) {
                System.out.println("Enter data for Row no " + (row + 1) + " And column no " + (cool + 1) + ":");
                list[row][cool] = input.nextInt();
            }
        }
    }

    public static void printarry(int[][] list) {
        for (int row = 0; row < list.length; row++) {
            for (int cool = 0; cool < list[0].length; cool++) {
                System.out.println(list[row][cool]);

            }
        }
    }

    public static int sum(int[][] list) {
        int sum = 0;
        for (int row = 0; row < list.length; row++) {
            for (int cool = 0; cool < list[0].length; cool++) {
                sum += list[row][cool];
            }

        }
        return sum;
    }
}
