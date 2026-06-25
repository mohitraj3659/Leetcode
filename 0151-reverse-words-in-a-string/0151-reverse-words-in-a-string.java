class Solution {
    public String reverseWords(String s) {
        String s1[]=s.trim().split("\\s+");
        StringBuilder res=new StringBuilder();
        for(int i=s1.length-1;i>=0;i--){
            if(i!=0){
                res.append(s1[i]);
                res.append(" ");
            }
            else res.append(s1[i]);
        }
        return res.toString();
    }
}