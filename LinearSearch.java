public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {15,5,20,35,2,42,67,17};
        int data = 42;
        int flag=0;
        for(int i = 0;i<arr.length;i++) {
            if (arr[i] == data) {
                System.out.println("Element found");
                flag = 1;
                break;
            }
        }
            if(flag == 0)
                System.out.println("not found");

    }
}
