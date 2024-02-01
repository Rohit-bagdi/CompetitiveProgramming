class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //https://takeuforward.org/data-structure/next-greater-element-using-stack/
  int n = temperatures.length;
        int nge[] = new int[n];
        Stack < Integer > st = new Stack < > ();
        for (int i =  n - 1; i >= 0; i--) {
            while (st.isEmpty() == false && temperatures[st.peek()] <= temperatures[i]) {
                st.pop();
            }

            if (i < n) {
                if (st.isEmpty() == false) nge[i] = st.peek()-i;
                else nge[i] = 0;
            }

            st.push(i);
        }
        return nge;
    }
 
}
