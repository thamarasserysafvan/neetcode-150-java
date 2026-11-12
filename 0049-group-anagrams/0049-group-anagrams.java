class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> grp= new HashMap<>();

        for (int i=0;i<strs.length;i++){
            char[] arr= strs[i].toCharArray();
            Arrays.sort(arr);
            String Key= new String(arr);
            grp.computeIfAbsent(Key, k->new ArrayList<>()).add(strs[i]);
            }
            return(new ArrayList<>(grp.values()));

    }
}