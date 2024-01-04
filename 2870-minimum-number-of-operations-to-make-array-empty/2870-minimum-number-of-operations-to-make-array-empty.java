class Solution {
  public int minOperations(int[] nums) {
    int ans = 0;
    Map<Integer, Integer> count = new HashMap<>();

    for (int num : nums)
      count.merge(num, 1, Integer::sum);

    for (int freq : count.values()) {
      if (freq == 1)
        return -1;
      ans += (freq + 2) / 3;
    }

    return ans;
  }
}