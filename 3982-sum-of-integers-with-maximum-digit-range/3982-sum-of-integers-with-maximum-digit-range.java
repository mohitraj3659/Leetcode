class Solution {
    public int maxDigitRange(int[] nums) {
        int range[]=new int[nums.length];
        int maxrange=-1;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            while(temp>0){
                int rem=temp%10;
                if(rem>max) max=rem;
                if(rem<min) min=rem;
                temp/=10;
            }
            range[i]=max-min;
            maxrange=Math.max(maxrange,range[i]);
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(range[i]==maxrange) sum+=nums[i];
        }
        return sum;
    }
}