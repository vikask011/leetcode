class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas=0;
        int currentgas=0;
        int startindex=0;

        for(int i=0;i<gas.length;i++){
            int fuel=gas[i]-cost[i];
            totalgas+=fuel;
            currentgas+=fuel;

        
           if(currentgas<0){
            startindex=i+1;
            currentgas=0;
           }}
           if(totalgas>=0){
            return startindex;
           }else{
            return -1;
           }

    }
}