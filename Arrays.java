import java.util.Scanner;

public class Arrays {
    /*public static void main(String[] args) {
        int arr[] = {62,39,93,20,92,22};
        // printing element of array
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);

        //using for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }*/

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("please enter size of Array : ");
        int size = sc.nextInt();
        int arr[] = new int[size] ;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("please enter "+(i+1)+" element : ");
            arr[i] = sc.nextInt();
        }
        // for printing the element of the array :
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}
