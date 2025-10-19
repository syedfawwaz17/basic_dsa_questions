package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {34,61,52,23,90,53,24,16,10,79,101,185,43};
        for(int i = 0 ; i< arr.length-1;i++){
            int min = i;
            for(int j = i+1;j< arr.length;j++){
                if(arr[j]<arr[min])
                    min=j;
            }
            if(min!=i){
                int temp = arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
        for (int num : arr){
            System.out.print(num + " ");
        }
    }
}
