
import java.util.Scanner;

public class Pher {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter  size of the arry : ");
        int size, searchedid;
        size = input.nextInt();
        int[] ids = new int[size];
        fillarry(ids);
        printarry(ids);
        System.out.println("Enter the id to search for : ");
        searchedid = input.nextInt();
        int returnrdindx = search(ids, searchedid);

        if (returnrdindx >= 0) {
            System.out.println("The item is found");
        } else {
            System.out.println("The item isn't found...");
        }

    }

    public static void fillarry(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println("Enter no " + (i + 1) + ":");
            list[i] = input.nextInt();
        }
    }

    public static void printarry(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    public static int search(int[] list, int target) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == target) {
                return i;
            }
        }
        return -1;
    }

}

}
