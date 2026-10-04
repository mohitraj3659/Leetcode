class Solution {
    public int minRotations(String s) {
        int ans=0;
        int prev=0;
        for(int i=0;i<s.length();i++){
            int d=s.charAt(i)-'0';
            ans+=Math.min(Math.abs(prev-d),(10-Math.abs(prev-d)));
            prev=d;
        }
        return ans;
    }
}