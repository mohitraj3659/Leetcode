class Solution {
    public int pivotIndex(int[] nums) {
        int arr[]=new int[nums.length];
        arr[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            arr[i]=arr[i-1]+nums[i];
        }
        for(int i=0;i<arr.length;i++){
            if(i!=0){
                if(arr[i-1]==(arr[nums.length-1]-arr[i])) return i;
            }
            else if((arr[nums.length-1]-arr[i])==0) return i;
        }
        return -1;
    }
}