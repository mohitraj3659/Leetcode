class Solution {
    public String finalString(String s) {
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='i') s1.reverse();
            else s1.append(ch);
        }
        return s1.toString();
    }
}