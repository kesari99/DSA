class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int n = nums2.length;
        int m = nums1.length;
        Deque<Integer> stack = new ArrayDeque<>();
        int[] ans = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[m];


        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() < nums2[i]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                ans[i] = stack.peek();
                map.put(nums2[i], stack.peek());
            } else {
                ans[i] = -1;
                map.put(nums2[i], -1);
            }

            stack.push(nums2[i]);

        }

        for(int i = 0; i < m; i++){
            result[i] = map.get(nums1[i]);
        }

        return result;
    }
}