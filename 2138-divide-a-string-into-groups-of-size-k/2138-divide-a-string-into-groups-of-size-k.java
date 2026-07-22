class Solution {
    public String[] divideString(String s, int k, char fill) {
       int n=s.length()%k==0?s.length()/k:(s.length()/k)+1;
       int index=0;
       String word[]=new String[n];
       for(int i=0;i<n;i++){
        if(i!=n-1)
        word[i]=s.substring(index,index+k);
        else{
            word[i]=s.substring(index,s.length());
            while(word[i].length()<k){
                word[i]+=fill;
            }
        }
        index+=k;
       }
       return word;
    }
}