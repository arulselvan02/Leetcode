class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
    
        for(int i: nums){
            if(i %2 == 0)
                map.put(i,map.getOrDefault(i,0)+1);
        }
        int maxFreq = 0;
        int result = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            if (freq > maxFreq || (freq == maxFreq && num < result)) {
                maxFreq = freq;
                result = num;
            }
        }

        return result;
    }
}