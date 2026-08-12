class Solution {
    public boolean isValid(String s) {
        if(s.length()==1) return false;
        Stack <Character> ch=new Stack<>();
        for(int i=0;i<s.length();i++){
            char temp=s.charAt(i);
            if(i==0&&!(temp=='('||temp=='{'||temp=='[')) return false;
            if(temp=='('||temp=='{'||temp=='[') ch.push(temp);
            else if(ch.size()<1) return false;
            else if(temp==')'&&ch.peek()=='(') ch.pop();
            else if(temp==']'&&ch.peek()=='[') ch.pop();
            else if(temp=='}'&&ch.peek()=='{') ch.pop();
            else return false;
        }
        return ch.size()==0?true:false;
    }
}