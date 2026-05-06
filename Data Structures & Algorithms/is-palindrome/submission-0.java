class Solution {
    public boolean isPalindrome(String s) {
        char[] str = s.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0;i<str.length;i++){
            char ch = str[i];
            if(Character.isLetterOrDigit(ch)){
                list.add(Character.toLowerCase(ch));
            }
        }
        int i=0,j=list.size() - 1;
        while(i<j){
            if(!list.get(i).equals(list.get(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}