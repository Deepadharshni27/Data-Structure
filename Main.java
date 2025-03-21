import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int[] arr = new int[10]; 
        System.out.print("Enter the number of elements (max 10): ");
        int n = s.nextInt(); 

        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        
        if (n > 0) {
            n--; 
        } else {
            System.out.println("Array is already empty. Nothing to delete.");
        }

        
        System.out.print("Updated array after deleting the last element: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        s.close();
    }
}
