class Solution {
    public boolean isAnagram(String s, String t) {
        int[] s_arr = new int[26];

        for(int i = 0 ; i < s.length() ; i++){
            s_arr[s.charAt(i)-97]++;
        }

        int[] t_arr = new int[26];
        for(int i = 0 ; i < t.length() ; i++){
            t_arr[t.charAt(i)-97]++;
        }

        for(int i = 0 ; i < 26 ; i++){
            if(s_arr[i] != t_arr[i])
                return false;
        }

        return true;
    }
}
