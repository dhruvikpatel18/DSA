public class maximumSubarray {
//    //check the sum of every possible subarray
////    TC:O(N^3)
////    SC:O(1)
//    public static int maxSubarraySum(int[] arr, int n){
//        int max = Integer.MIN_VALUE;
//        for(int i=0; i<n; i++){
//            for(int j=i; j<n; j++){
//                //subarray of arr[i...j]
//                int sum=0;
//                for(int k=i;k<=j;k++){
//                    sum += arr[k];
//                }
//                max = Math.max(max,sum);
//            }
//        }
//        return max;
//    }
//
//    //TC:O(N^2) to get the sum of the current subarray we just need to add the current element to the sum of the previous subarray
//    public static int maxSubarraySum(int[] arr, int n){
//        int max = Integer.MIN_VALUE;
//        for(int i=0; i<n; i++){
//            int sum =0;
//            for(int j=i; j<n; j++){
//                sum +=arr[j];
//                max = Math.max(max,sum);
//            }
//        }
//        return max;
//    }
//    public static void main(String[] args) {
//        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
//        int n = arr.length;
//        int maxSum = maxSubarraySum(arr, n);
//        System.out.println("The maximum subarray sum is: " + maxSum);
//    }

    //kadane's Algo
    //TC:O(N)
    //SC:O(1)
    public static int maxSubarraySum(int[] arr, int n){
        int max = arr[0];
        int curr=0;
        for(int i=0; i<n; i++){
            curr += arr[i];
            if(curr > max){
                max = curr;
            }
            if(curr < 0){
                curr=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        long maxSum = maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);
    }

}
