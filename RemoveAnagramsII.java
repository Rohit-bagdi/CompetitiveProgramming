 class Solution {
     boolean isang(String p,String q){
    int[] cnt= new int[26];
    int res=0;
    for(int i=0;i<p.length();i++) cnt[p.charAt(i)-'a']++;
    for(int i=0;i<q.length();i++) cnt[q.charAt(i)-'a']--;
    for(int i:cnt) if(i!=0) return false;
    return true;
}
    public List<String> removeAnagrams(String[] words) {
        List<String> ans= new ArrayList<>();
    int n= words.length;
    for(int i=0;i<n;){
        int j=i+1;
        while( j<n && isang(words[i],words[j]) ) j++;
        ans.add(words[i]);
        i=j;
    }
    return ans;
    }
     
 }  
