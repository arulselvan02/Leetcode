class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i: nums){
            if(s.add(i)){
                
            }
            else return i;
        }
        return -1;
    }
}