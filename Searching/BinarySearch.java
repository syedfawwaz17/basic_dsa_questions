package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {5,8,17,23,25,55,59,63,75,89};
        int data = 69;
        int bs = binarySearch(arr,data);
        if(bs==-1){
            System.out.println("Not Found");
        }
        else
            System.out.println("Found");
    }

    public static int binarySearch(int arr[], int data){
        int l=0,r=arr.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(data == arr[mid])
                return mid;
            else if(data<arr[mid])
                r=mid-1;
            else
                l=mid+1;
        }
        return -1;
    }
}
