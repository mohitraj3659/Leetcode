class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        int total=source[0]+source[1]+target[0]+target[1];
        if(total%2==1) return -1;
        if(Math.abs(source[0]-target[0])==Math.abs(source[1]-target[1])) return 1;
        else return 2;
    }
}