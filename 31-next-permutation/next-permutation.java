class Solution {
    public void nextPermutation(int[] n) {
        int i=n.length-2;
        while(i>=0 && n[i]>=n[i+1]){
            i--;
        }

        if(i>=0){
            int j=n.length-1;
            while(j>=0 && n[j]<=n[i])
                j--;
                swap(n,i,j);
        }
            reverse(n,i+1,n.length-1);
        }

        private void swap(int[] n,int i,int j){
            int temp=n[i];
            n[i]=n[j];
            n[j]=temp;
        }

        private void reverse(int[] n,int start,int end){
            while(start<end){
                swap(n,start,end);
                start++;
                end--;
            }
        }

    }
