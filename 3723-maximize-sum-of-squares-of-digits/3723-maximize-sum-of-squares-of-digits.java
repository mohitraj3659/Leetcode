class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(num*9<sum) return "";
        StringBuilder s=new StringBuilder();
        while(s.length()<num){
            while(sum>9){
                s.append('9');
                sum-=9;
            }
            s.append(sum);
            sum-=sum;
        }
        return s.toString();
    }
}