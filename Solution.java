class Solution{

    public static int kadanae_algo(int[] arr){
        int max_sum=arr[0];
        int current_sum=arr[0];

        for(int i=1;i<arr.length;i++){
            current_sum=Math.max(arr[i],current_sum+arr[i]);
            max_sum=Math.max(max_sum,current_sum);
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};

        int sum=kadanae_algo(arr);

        System.out.println(sum);
    }
}