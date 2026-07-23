class Solution {
    public String generateTag(String caption) {
        StringBuilder s=new StringBuilder("#");
        boolean space=false;
        for(int i=0;i<caption.length();i++){
            char ch=caption.charAt(i);
            if(ch==' '){
                space=true;
                continue;
            }
            if(space&&s.length()!=1){
                s.append(Character.toUpperCase(ch));
                space=false;
            }
            else{
                s.append(Character.toLowerCase(ch));
                space=false;
            }
            if(s.length()==100) break;
        }
        return s.toString();
    }
}