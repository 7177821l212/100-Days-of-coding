//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input = sc.nextLine();
            Scanner ss = new Scanner(input);
            while (ss.hasNextInt()) {
                arr.add(ss.nextInt());
            }
            Solution ob = new Solution();
            int ans = ob.print2largest(arr);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int print2largest(List<Integer> arr) {
        // Code Here
        // List<Integer>list = new ArrayList<>();
        // int larger = -1;
        // int second_larger = -1;
        // for(num : arr)
        // {
        //     if(num > larger)
        //     {
        //         second_larger = larger;
        //         larger = num;
        //     }
        //     else if(num > second_larger && num != larger)
        //     second_larger = num;
        //     list.add(second_larger);
        // }
        // return list;
         int n = arr.size();
        
        if (n < 2) {
            return -1;
        }
        
        int large = arr.get(0);
        int second_Large = Integer.MIN_VALUE;
        
        for (int i = 1; i < n; i++) {
            int value = arr.get(i);
            if (value > large) {
                second_Large = large;
                large = value;
            } else if (value > second_Large && value != large) {
                second_Large = value;
            }
        }
        
        if (second_Large == Integer.MIN_VALUE) {
            return -1; 
        }
        
        return second_Large;
    }
}