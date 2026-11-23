class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<=1){
            return nums.length;
        }
        Arrays.sort(nums);
        // ArrayList<Integer>temp  = new ArrayList<Integer>();
        int res=1;
        int count=1;
        for (int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]-1){
                // temp.add(nums[i]);
                count++;
            }
            else if(nums[i]==nums[i+1]){
                continue;
            }
            else{
            
            count=1;
                // temp.clear();
            }
            
            System.out.println(count);
            // System.out.println(temp);
            // if(temp.size()+1>res) res= temp.size()+1;
            if(count>=res){
                res= count;
            }
        } 
        return res;
        
    }
}