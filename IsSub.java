//Pesudocode
 IsSubsequence
int i = 0,j = 0;
        if(s.length() < 1)
        return true;
        while(j < t.length() && i < s.length())
        {
            if(t.charAt(j) == s.charAt(i))
            i++;
            if(i == s.length())
            return true;
            j++;
        }
        return false;

T.C - 2ms