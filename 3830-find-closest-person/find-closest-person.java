class Solution {
    public int findClosest(int x, int y, int z) {
        int sol1 = Math.abs(z - x);
        int sol2 = Math.abs(z - y);
        if(sol1 > sol2){
            return 2;
        }
        else if(sol1 < sol2){
            return 1;
        }
        else{
            return 0;
        }
    }
}