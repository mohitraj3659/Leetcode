class Solution {
    public int getLeastFrequentDigit(int n) {
        int arr[]=new int[10];
        while(n>0){
            arr[n%10]++;
            n/=10;
        }
        int index=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<10;i++){
            if(arr[i]==0) continue;
            if(arr[i]<min){
                min=arr[i];
                index=i;
            }
            else if(arr[i]==arr[index]) index=Math.min(index,i);
        }
        return index;
    }
}