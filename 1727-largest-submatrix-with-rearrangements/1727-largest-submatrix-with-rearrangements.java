class Solution {
  public int largestSubmatrix(int[][] matrix) {
    int n = matrix[0].length;
    int ans = 0;
    int[] hist = new int[n];
    for (int[] row : matrix) {
      for (int i = 0; i < n; ++i)
        hist[i] = row[i] == 0 ? 0 : hist[i] + 1;
      int[] sortedHist = hist.clone();
      Arrays.sort(sortedHist);
      for (int i = 0; i < n; ++i)
        ans = Math.max(ans, sortedHist[i] * (n - i));
    }

    return ans;
  }
}