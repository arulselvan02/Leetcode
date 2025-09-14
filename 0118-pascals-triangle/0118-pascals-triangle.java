import java.util.*;

class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> p = new ArrayList<>();

        for(int i=0;i<n;i++){
            List<Integer> row= new ArrayList<>(Collections.nCopies(i+1,1));

            for(int j=1;j<i;j++){
                int val =p.get(i-1).get(j-1)+p.get(i-1).get(j);
                row.set(j,val);
            }
            p.add(row);
        }
        return p;
    }
}