class Solution {
    public boolean squareIsWhite(String coordinates) {
        int piece=(coordinates.charAt(0)-'a'+1)+(coordinates.charAt(1)-'0');
        return piece%2==1;
    }
}