class Solution {
    public int minimumDeletions(int[] nums) {
        int min=-1;
        int max=-1;
        int minnum=Integer.MAX_VALUE;
        int maxnum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maxnum){
                maxnum=nums[i];
                max=i;
            }
            if(nums[i]<minnum){
                minnum=nums[i];
                min=i;
            }
        }
        int res1=Math.min(Math.max(min,max)+1,Math.max(nums.length-min,nums.length-max));
        int res2=(Math.min(min,max)+1)+(nums.length-Math.max(min,max));
        return Math.min(res1,res2);
    }
}