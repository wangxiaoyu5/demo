class Solution {
    public int findString(String[] words, String s) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == 0)
            continue;
            if (s.equals(words[i])) 
            return i;
        }
        return -1;
    }
}