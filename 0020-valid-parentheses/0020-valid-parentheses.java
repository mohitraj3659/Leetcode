class Solution {
    public boolean isValid(String s1) {
        Stack<Character> s=new Stack<>();
        for(char ch:s1.toCharArray()){
            if(ch=='('||ch=='{'||ch=='[') s.push(ch);
            else{
                if(s.size()==0) return false;
                else if((ch==')'&&s.peek()!='(')||(ch=='}'&&s.peek()!='{')||(ch==']'&&s.peek()!='[')) return false;
                else s.pop();
            }
        }
        return s.size()==0;
    }
}