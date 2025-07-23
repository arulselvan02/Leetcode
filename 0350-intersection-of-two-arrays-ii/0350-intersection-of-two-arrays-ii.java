class Solution {
    public int[] intersect(int[] n1, int[] n2) {
        int a[] = new int[1001];
        int[] max, min;

        if (n1.length < n2.length) {
            max = n2;
            min = n1;
        } else {
            max = n1;
            min = n2;
        }

        for (int i : max)
            a[i]++;

        int[] temp = new int[min.length];
        int count = 0;

        for (int i : min) {
            if (a[i] > 0) {
                temp[count++] = i;
                a[i]--;
            }
        }

        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }
}
