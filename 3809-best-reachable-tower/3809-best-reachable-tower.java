class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {
        int res[]={-1,-1};
            int quality=-1;
        for(int i=0;i<towers.length;i++){
            int d=Math.abs(towers[i][0]-center[0])+Math.abs(towers[i][1]-center[1]);
            if(d<=radius){
                if(quality==towers[i][2]){
                    if(towers[i][0]<res[0]||(towers[i][0]==res[0]&&towers[i][1]<res[1])){
                        res[0]=towers[i][0];
                        res[1]=towers[i][1];
                    }
                }
                else if(towers[i][2]>quality){
                    res[0]=towers[i][0];
                    res[1]=towers[i][1];
                }
                quality=Math.max(quality,towers[i][2]);
            }
        }
        return res;
    }
}