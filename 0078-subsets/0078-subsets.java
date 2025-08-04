class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        answer(0, nums, temp, res);
        return res;
    }

    public void answer(int s, int[] nums, List<Integer> temp, List<List<Integer>> res) {
        res.add(new ArrayList<>(temp)); 
        for (int i = s; i < nums.length; i++) {
            temp.add(nums[i]);
            answer(i + 1, nums, temp, res);
            temp.remove(temp.size() - 1);
        }
    }
}
