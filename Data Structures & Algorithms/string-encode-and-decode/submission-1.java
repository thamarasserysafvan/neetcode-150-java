class Solution {

    public String encode(List<String> strs) {
        String str="";
        for(String s : strs){
            str=str+s.length()+"#"+s;
        }
        System.out.println(str);
        return str;
    }

    public List<String> decode(String str) {
        ArrayList<String> strs=new ArrayList<String>();
        int i=0;
        while(i<str.length()){
            int hashOfEachStr=str.indexOf('#',i);
            int lenOfStr=Integer.parseInt(str.substring(i,hashOfEachStr));
            i=hashOfEachStr+1+lenOfStr;
            strs.add(str.substring(hashOfEachStr+1,i));
           
        }
        System.out.println(strs);
        
        return strs;


    }
}
