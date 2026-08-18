class Solution {
    boolean check(String s){
        int n=s.length();
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)) return false;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(String s:words){
            if(check(s)) return s;
        }
        return "";
    }
}