//389. Find the Difference
       
       int frequency[] = new int[26];
       for(int i = 0; i < s.length();i++)
       {
        frequency[s.charAt(i) - 'a']++;
       } 
       for(int i = 0; i < t.length(); i++)
       {
        frequency [t.charAt(i) - 'a']--;
       }
       for(int i = 0; i < 26; i++)
       {
        if(frequency[i] != 0)
        return (char)(i + 97);
       }

//T.C - 3ms
