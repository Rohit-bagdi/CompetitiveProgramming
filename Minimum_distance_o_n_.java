// C++ program to find Minimum Distance
// Between Words of a String
#include <bits/stdc++.h>
using namespace std;

int shortestDistance(vector<string> &s, string word1, string word2)
 {
  if(word1==word2) return 0;
  int ans = INT_MAX;
 //To store the lastposition of word1
  int lastPos = -1;
  for(int i = 0 ; i < s.size() ; i++)
  {
   if(s[i] == word1 || s[i] == word2)
   {
   //first occurrence of word1
    if(lastPos == -1)
    lastPos = i;
    else
    {
     //if word1 repeated again we store the last position of word1
     if(s[lastPos]==s[i])
     lastPos = i;
     else
     {
     //find the difference of position of word1 and word2
      ans = min(ans , (i-lastPos)-1);
      lastPos = i;
     }
    }
   }
  }
  return ans;
}
//Driver code
int main() {
 vector<string> s{"geeks", "for", "geeks", "contribute",
 "practice"};
 string w1 = "geeks";
 string w2 = "practice";

 cout<<shortestDistance(s, w1, w2)<<"\n";
 
 return 0;
}
 
