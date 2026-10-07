class Solution {
    public int longestMountain(int[] arr) {
        int l=0;
        int b1 = 0;
        int b2=0;
        for (int i = 1; i < arr.length - 1; i++) {
    
            if(arr[i+1] < arr[i] && arr[i-1]<arr[i]){
                b1 = i-1;
                b2 = i+1;

                while(b1>0 && arr[b1] > arr[b1-1]){
                b1 = b1-1;
            }
                while(b2 < arr.length-1 && arr[b2]> arr[b2+1]){
                b2 = b2 +1;
            }
                 int length = (b2-b1)+1;
                if(length>l){
                l = length;
            }
            
           
        }
        }
        
        return l;
    }
}
