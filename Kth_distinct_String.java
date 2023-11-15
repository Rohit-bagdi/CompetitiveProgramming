
//A distinct string is a string that is present only once in an array.

//Given an array of strings arr, and an integer k, return the kth distinct string present in arr. If there are fewer than k distinct strings, return an empty string "".

//Note that the strings are considered in the order in which they appear in the array.

class Solution {
   
      public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> map=new HashMap<>();
        
        for(String s:arr){
            
            if(map.containsKey(s)) map.put(s,map.get(s)+1);
             else map.put(s,1);
        }
		int i=0;
        for(String s:arr){
            if(map.get(s)==1 && ++i==k){
                
                    return s;
                } 
                 
        }
        return "";
        
    }

}






class Solution {
    public String kthDistinct(String[] arr, int k) {
        String[] Array = new String[arr.length]; 
        int a=0;
        for(int i =0;i<arr.length;i++)
        {
            String word = arr[i];
             int count =0;
            for(int j =0;j<arr.length;j++)
            {
               
                if(word.equals(arr[j]))
                {
                    count++;
                }
            }
            if(count ==1)
            {
                Array[a]= word;
                
                if(a+1==k)
                {
                    return Array[a];
                }
                a++;
            }
         
    }
    return "";
}
}
