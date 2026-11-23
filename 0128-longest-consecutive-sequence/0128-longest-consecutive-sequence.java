class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<=1){
            return nums.length;
        }
        Arrays.sort(nums);
        int res=1;
        int count=1;
        for (int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]-1){
                count++;
            }
            else if(nums[i]==nums[i+1]){
                continue;
            }
            else{
            count=1;
            }
            if(count>=res){
                res= count;
            }
        } 
        return res;
        
    }
}