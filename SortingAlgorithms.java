import java.util.Arrays;
public class SortingAlgorithms {
    public static void bubbleSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]){
               //Swap
               int temp = arr[j];
               arr[j] = arr[j+1] ;
               arr[j+1] = temp;
                }
            }
        }
    }
    public static void PrintArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void SelectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int MinPos = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[MinPos] > arr[j]){
                    MinPos = j;
                }
            }
            //Swap
            int temp = arr[MinPos];
            arr[MinPos] = arr[i];
            arr[i]  = temp;
        }
    }
    public static void InsertionSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            //finding out the current position to insert
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }
    // Counting Sort
    public static void CountingSort(int arr[]){
        // Find largest number
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest,arr[i]); 
        }
        // creating new array for store count 
        int count[] = new int[largest+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        //sorting
        int j=0;
        for (int i = 0; i < count.length; i++) {
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    //Question 2 : Swap two numbers without using any third variable.
    public static void Swap(int a, int b){
        System.out.println("before swap "+a+" and "+b);
        //swap
        a = a^b;
        b = a^b;
        a = a^b;
        //without bit maipulation 
        // a = a+b;
        // b = a-b;
        // a = a-b;
        System.out.println("after swap "+a+" and "+b);
    }
    //Question 3 : Add 1 to an integer using Bit Manipulation.
    //(Hint : try using Bitwise NOT Operator)
    public static void addone(int a){
        System.out.println("add 1 int a  "+~a);
    }
    //Question 4 : This question is based on a trick, please directly look at the solution.
    //Convert uppercase characters to lowercase using bits.


    public static void main(String[] args) {
        int arr[] = {9,8,5,7,4,3,1,2,6};
        //bubbleSort(arr);
        //SelectionSort(arr);
        //InsertionSort(arr);
        //Arrays.sort(arr);
        //CountingSort(arr);
        //PrintArr(arr);
        //Swap(5,7);
        //addone(5);
        for (int ch = 'A'; ch <= 'z'; ch++) {
        System.out.print((char)(ch | ' '));
    }
}
}