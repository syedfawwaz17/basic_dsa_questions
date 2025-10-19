package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {34,61,52,23,90,53,24,16,10,79,101,185,43};
        for(int i = 0;i<arr.length-1;i++){
            int flag = 0;
            for(int j = 0;j< arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag =1;
                }
            }
                if(flag == 0)
                    break;

        }
        System.out.println("Sorted array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

