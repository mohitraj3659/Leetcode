class Solution {
    public int[] productExceptSelf(int[] nums) {
        long prod=1;
        int zero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0) prod*=nums[i];
            else zero++;
        }
        if(zero>1) return new int[nums.length];
        int arr[]=new int[nums.length];
        for(int i=0;i<arr.length;i++){
            if(nums[i]!=0&&zero==0) arr[i]=(int)(prod/nums[i]);
            else if(nums[i]==0) arr[i]=(int) prod;
        }
        return arr;
    }
}