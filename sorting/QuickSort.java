package sorting;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {34,61,52,23,90,53,24,16,10,79,101,12234,185,43};
        int lb = 0,ub = arr.length-1;
        quickSort(arr,lb,ub);
        for (int num: arr) {
            System.out.print(num + " ");

        }
    }
    public static void quickSort(int arr[],int lb,int ub){

        if(lb<ub){
            int loc = partition(arr,lb,ub);
            quickSort(arr,lb,loc-1);
            quickSort(arr,loc+1,ub);


        }

    }

    public static int partition(int arr[],int lb,int ub){
        int pivot = arr[lb];
        int start = lb;
        int end = ub;
        while(start<end){
            while(arr[start]<=pivot)
                start++;
            while(arr[end]>pivot)
                end--;
            if(start<end){
                int temp = arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
            }
        }
        int temp = arr[lb];
        arr[lb]=arr[end];
        arr[end]=temp;

        return end;

    }
}
