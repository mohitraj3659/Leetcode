class Solution {
    public char kthCharacter(int k) {
        StringBuilder s=new StringBuilder("a");
        while(s.length()<k){
            StringBuilder s1=new StringBuilder();
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(ch=='z') s1.append('a');
                else s1.append((char)(ch+1));
            }
            s.append(s1);
        }
        return s.charAt(k-1);
    }
}