class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        long res=0;
        int i=nums.length-1;
        Arrays.sort(nums);
        while(k-->0){
            if(mul>0) res+=nums[i]*(long)mul;
            else res+=nums[i];
            i--;
            mul--;
        }
        return res;
    }
}