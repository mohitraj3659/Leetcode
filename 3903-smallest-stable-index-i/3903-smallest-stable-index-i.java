class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int minindex=Integer.MAX_VALUE;
        //Highest //Lowest
        for(int i=0;i<nums.length;i++){
            //Highest
            int diff=0;
            int max=Integer.MIN_VALUE;
            for(int j=0;j<=i;j++){
                if(nums[j]>max) max=nums[j]; 
            }
            int min=Integer.MAX_VALUE;
            for(int j=i;j<nums.length;j++){
                if(nums[j]<min) min=nums[j];
            }
            if(max-min<=k&&i<minindex)  minindex=i;
        }
        if(minindex==Integer.MAX_VALUE) return -1;
        else
        return minindex;
    }
}