package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {34,61,52,23,90,53,24,16,10,79,101,12234,185,43};
        for(int i = 1 ; i< arr.length;i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;

            }
            arr[j+1]=temp;
        }
        for (int nums: arr) {
            System.out.print(nums + " ");
        }
    }
}
