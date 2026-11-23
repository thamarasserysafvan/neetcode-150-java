class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()<=1) return true;
        s=s.toLowerCase();
        String str2="";
        char[] arr= s.toCharArray();
        String str="";
        for(int i=arr.length-1;i>=0;i--){
            char ch= arr[i];
            if((ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
                str+=ch;
                str2=ch+str2;
            }
        }
        System.out.println(str);
        System.out.println(str2);
        if (str.equals(str2)) return true;
        return false;
        
    }
}