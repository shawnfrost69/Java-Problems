import java.util.Scanner;
public class QuickSort {

    public static int partition(int[] arr, int lo, int hi){
        int pivot = arr[hi];
        int i = lo -1;

        for (int j = lo; j < hi; j++) {
            if(arr[j] <pivot){
                i++;
                // Swap
                int temp= arr[i];
                arr[i] =arr[j];
                arr[j] =temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[hi] = temp;
        return i;
            
    }

    public static void quickSort(int[] arr, int lo, int hi){
        if(lo < hi){
            int pidx = partition(arr, lo, hi);

            quickSort(arr, lo, pidx-1);
            quickSort(arr, pidx +1, hi);
        }
    }
   public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int [] arr = new int[n];
       for (int i = 0; i < arr.length; i++) {
           arr[i] = scn.nextInt();
       }
       quickSort(arr, 0, n-1);
       for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i] + " ");
       }
   }
}
