class Solution {
    public boolean uniformArray(int[] nums1) {
        int even=0;
        int odd=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2==0){
                even++;
            }
            else if(nums1[i]%2==1){
                odd++;
            }
            if(nums1[i]<min) min=nums1[i];
        }
        if(even==0||odd==0) return true;
        return (min%2==1);
    }
}