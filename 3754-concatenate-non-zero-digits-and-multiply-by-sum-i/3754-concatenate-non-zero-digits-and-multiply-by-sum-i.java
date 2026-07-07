class Solution {
    public long sumAndMultiply(int n) {
        long x=0;
        long base=1;
        long sum=0;
        while(n>0){
            if(n%10!=0){
                x+=(n%10*base);
            sum+=n%10;
            base*=10;
            }
            n/=10;
        }
        return sum*x;
    }
}