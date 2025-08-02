class Solution {
    public int hIndex(int[] citations) {
        int freq[]=new int[citations.length+1];
        for(int i:citations){
            if(i>freq.length-1){
                freq[freq.length-1]++;
            }else{
                freq[i]++;
            }
        }
        int sum=0;
        for(int i=freq.length-1;i>=0;i--){
        sum+=freq[i];
        if(sum>=i){
            return i;
        }}
        return 0;
    }
}