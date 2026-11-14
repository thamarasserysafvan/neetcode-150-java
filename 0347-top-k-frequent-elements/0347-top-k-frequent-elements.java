class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> numMap=new HashMap<>();
    
        for (int i: nums){
        numMap.put(i,numMap.getOrDefault(i,0)+1);
        }
        List<Integer>[] bucket = new List[nums.length+1];    
        for(int i : numMap.keySet()){
            int freq = numMap.get(i);
            if(bucket[freq]==null){
                bucket[freq]=new ArrayList<>();  
                      }
            bucket[freq].add(i);
        }
    int resK=0;
    int[] result=new int[k];
    for(int i=bucket.length-1;i>=0 && resK<k;i--){
        if(bucket[i]!=null){
            for(int num:bucket[i]){
                result[resK]=num;
                resK++;
            }
        }
    }
    return result;

}
}
