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
    public static void main(String[] args) {
        int arr[] = {9,8,5,7,4,3,1,2,6};
        //bubbleSort(arr);
        //SelectionSort(arr);
        InsertionSort(arr);
        PrintArr(arr);
    }
}