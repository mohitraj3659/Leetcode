class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int arr[]=new int[capacity.length];
        for(int i=0;i<arr.length;i++){
            int diff=capacity[i]-rocks[i];
            arr[i]=diff>=0?diff:0;
        }
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(additionalRocks>=arr[i]){
                additionalRocks-=arr[i];
                count++;
            }
            else break;
        }
        return count;
    }
}