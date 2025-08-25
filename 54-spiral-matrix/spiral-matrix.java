class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int n = arr.length;
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = arr[0].length-1;
        int count = 1;
        int total = n * arr[0].length;
        List<Integer> al = new ArrayList<>();
        while (count <= total) {
            for (int i = left; i <= right && count <= total; i++) {
                al.add(arr[top][i]);
                count++;
            }
            top++;
            for (int i = top; count <= total && i <= bottom; i++) {
                al.add(arr[i][right]);
                count++;
            }
            right--;
            for (int i = right; i >= left && count <= total; i--) {
                al.add(arr[bottom][i]);
                count++;
            }
            bottom--;
            for (int i = bottom; i >= top && count <= total; i--) {
                al.add(arr[i][left] );
                count++;
            }
            left++;
        }
        return al;
    }
}