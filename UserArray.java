/* program to print the elements of an array entered by the user */
import java.util.*;

public class UserArray {
    public static void main(String[] args){
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of an elements:");
        n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println(" Enter the elements of an array u want to put:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] +" ");
        }

    }
    
}
