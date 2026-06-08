class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int[] window = new int[26];
        int[] temp = new int[26];
        int m = s1.length();
        int n = s2.length();
        if(m > n) return false;
        for(int i = 0; i< m; i++){
            window[s1.charAt(i) - 'a']++;
            temp[s2.charAt(i) - 'a']++;
        }

        if(Arrays.equals(temp, window)) return true;

        for(int i = m ; i < n;i++){

            temp[s2.charAt(i) - 'a']++;
            temp[s2.charAt(i-m) - 'a']--;

            if(Arrays.equals(temp, window)) return true;



           



        }

        return false;

        
    }
}