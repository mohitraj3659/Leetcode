class Solution {
    public int minimumPushes(String word) {
        int cost=0;
        int term=1;
        int n=word.length();
        while(n>7){
          cost+=(term*8);
          n-=8;
          term++;
        }
        return cost+(term*n);
    }
}