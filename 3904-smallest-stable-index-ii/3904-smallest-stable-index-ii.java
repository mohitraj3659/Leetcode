class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int pre[]=new int[n];
        pre[0]=nums[0];
        int suf[]=new int[n];
        suf[n-1]=nums[n-1];
        for(int i=0;i<n;i++){
            if(i!=0)
            pre[i]=Math.max(pre[i-1],nums[i]);
            if(i!=n-1)
            suf[n-i-2]=Math.min(nums[n-i-2],suf[n-i-1]);
        }
        for(int i=0;i<n;i++){
            if(pre[i]-suf[i]<=k) return i;
        }
        return -1;
    }
}