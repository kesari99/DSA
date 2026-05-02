class Solution {
    public void Permutation(int[] nums, List<Integer> ds, boolean[] freq, List<List<Integer>> ans) {

        if (ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!freq[i]) {
                freq[i] = true;
                ds.add(nums[i]);
                Permutation(nums, ds, freq, ans);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }

        }

    }

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];

        Permutation(nums, ds, freq, ans);
        return ans;

    }
}