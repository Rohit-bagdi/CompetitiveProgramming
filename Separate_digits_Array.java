
//Given an array of positive integers nums, return an array answer that consists of the digits of each integer in nums after separating them in the same order they appear in nums.

//To separate the digits of an integer is to get all the digits it has in the same order.

//For example, for the integer 10921, the separation of its digits is [1,0,9,2,1].



class Solution {
    public int[] separateDigits(int[] nums) {
        StringBuilder sb = new StringBuilder();
        for(int x: nums) sb.append(x);
        String str = sb.toString();
        int[] res = new int[str.length()];
        for(int i=0;i<res.length;i++){
            res[i] = str.charAt(i)-'0';
        }
        return res;
    }
}
