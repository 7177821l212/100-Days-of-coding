class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++)
        {
            list.add(i);
        }
        int current_idx = 0;
        while(list.size() > 1)
        {
            int next_ele_remove = (current_idx + k - 1) % list.size();
            list.remove(next_ele_remove);
            current_idx = next_ele_remove;
        }
          return list.get(0);
    }
}