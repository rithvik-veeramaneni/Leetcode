public class Q35_Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        int high = nums.length-1;
        int low = 0;
        
        while (high >= low){
            int middle =low+ (high - low)/2;
            if(target==nums[middle]){
                return middle;
            }
            else if(target>nums[middle]){
                low = middle +1;
            }
            else if(target<nums[middle]){
                high = middle -1;
            }
            
        }
        return low;
        

    }
} 
