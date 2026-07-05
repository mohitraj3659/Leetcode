class Solution {
    public String largestEven(String s) {
        int index=-1;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='2'){
                index=i;
                break;
            }
        }
        return index==-1?"":s.substring(0,index+1);
    }
}