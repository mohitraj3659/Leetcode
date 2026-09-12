class Solution {
    public int countSpecialIntegers(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            int arr[]=new int[3];
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    if(count<3)
                    arr[count]=j;
                    count++;
                }
                if(j<i&&count!=0) break;
            }
            if(count==3){
                if(arr[2]-arr[1]==arr[1]-arr[0]) ans++;
            }
        }
        return ans;
    }
}