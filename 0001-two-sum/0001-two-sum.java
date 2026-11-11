class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length<=0) return null;
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            
            if(numMap.containsKey(nums[i])){
                return new int[] {numMap.get(nums[i]),i};
            }
            int difference = target-nums[i];
            numMap.put(difference, i);
            
        }
        return null;
        
    }
}