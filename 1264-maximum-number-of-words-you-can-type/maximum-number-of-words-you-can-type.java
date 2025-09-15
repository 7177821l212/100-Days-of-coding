class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {

        String words[] = text.split(" ");
        boolean broken[] = new boolean[26];

        for (char ch : brokenLetters.toCharArray()) {
            broken[ch - 'a'] = true;
        }

        int count = 0;

        for (String word : words) {
            boolean type = true;
            for (char c : word.toCharArray()) {
                if (broken[c - 'a']) {
                    type = false;
                    break;
                }
            }
            if (type)
                count++;
        }
        return count;

    }
}