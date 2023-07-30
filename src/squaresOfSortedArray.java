import java.util.Arrays;

public class squaresOfSortedArray {
    //TC:(NlogN)
    //SC:(N)
//    public static void sortSquares(int[]arr){
//        int n = arr.length;
//        for(int i=0; i<n; i++){
//            arr[i] *= arr[i];
//        }
//        Arrays.sort(arr);
//    }
//    public static void main(String[] args) {
//        int arr[] = { -6, -3, -1, 2, 4, 5 };
//        int n = arr.length;
//
//        System.out.println("Before sort ");
//        for (int i = 0; i < n; i++)
//            System.out.print(arr[i] + " ");
//
//        sortSquares(arr);
//        System.out.println("");
//        System.out.println("After Sort ");
//        for (int i = 0; i < n; i++)
//            System.out.print(arr[i] + " ");
//    }

    //TC:(N)
    //SC:(N)
    public static void sortSquares(int[] arr){
        int n = arr.length;
        int left=0,right=n-1,pointer=n-1;
        int res[] = new int[n];

        while(left <= right){
            if(Math.abs(arr[left]) > Math.abs(arr[right]) ){
                res[pointer] = arr[left]*arr[left];
                left ++;
            }else{
                res[pointer] = arr[right]*arr[right];
                right--;
            }
            pointer--;
        }
        for(int i=0;i <n; i++){
            arr[i] = res[i];
        }
    }
    public static void main(String[] args) {
        int arr[] = { -6, -3, -1, 2, 4, 5 };//sorted
        int n = arr.length;

        System.out.println("Before sort ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        sortSquares(arr);
        System.out.println("");
        System.out.println("After Sort ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
