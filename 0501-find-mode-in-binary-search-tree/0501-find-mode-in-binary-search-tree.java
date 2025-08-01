import java.util.*;

class Solution {
    public HashMap<Integer, Integer> help(HashMap<Integer, Integer> map, TreeNode root) {
        if (root == null) return map;

        help(map, root.left);
        map.put(root.val, map.getOrDefault(root.val, 0) + 1);
        help(map, root.right);

        return map;
    }

    public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map = help(map, root);

        int maxFreq = 0;
        for (int freq : map.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxFreq) {
                result.add(entry.getKey());
            }
        }

        int[] modeArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            modeArray[i] = result.get(i);
        }

        return modeArray;
    }
}
