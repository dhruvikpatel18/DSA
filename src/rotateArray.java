public class rotateArray {
//    *********TC:O(N)
//    *********SC:O(K) //temp array
//    public static void rotateArrayByK(int[]arr, int n, int k){
//        if(n==0){
//            return;
//        }
//        k = k % n;
//        if(k>n){
//            return;
//        }
//        int temp[] = new int[k];
//        for(int i=n-k; i<n; i++){
//            temp[i-n+k] = arr[i];
//        }
//        for(int i=n-k-1; i>=0; i--){//shift every element right by k
//            arr[i+k] = arr[i];
//        }
//        for(int i=0; i<k; i++){
//            arr[i] = temp[i];
//        }
//
//    }
//    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,5,6,7};
//        int n=arr.length;
//        int k = 3;
//        rotateArrayByK(arr,n,k);
//        System.out.println("Rotated Array By " +k+" is:" );
//        for(int i=0; i<n; i++){
//            System.out.print(arr[i] +" ");
//        }
//    }

    //TC:O(N)
    //SC:O(1)
    public static void reverse(int[] arr, int start, int end){
        while(start<=end){
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }
public static void rotateArrayByK(int[] arr, int n, int k){
    if(n == 0)return;
    k = k%n;
    if(k>n)return;

    //reverse first n-k elements
    reverse(arr,0,n-k-1);
    //reverse last k elements
    reverse(arr,n-k,n-1);
    //reverse whole array
    reverse(arr,0,n-1);
}
public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6,7};
        int n=arr.length;
        int k = 3;
        rotateArrayByK(arr,n,k);
        System.out.println("Rotated Array By " +k+" is:" );
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
}
}
