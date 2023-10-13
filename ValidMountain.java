// Given an array of integers arr, return true if and only if it is a valid mountain array.
// Recall that arr is a mountain array if and only if:
// arr.length >= 3
// There exists some i with 0 < i < arr.length - 1 such that:
// arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
// arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

// Example 1:

// Input: arr = [2,1]
// Output: false
// Example 2:

// Input: arr = [3,5,5]
// Output: false
// Example 3:

// Input: arr = [0,3,2,1]
// Output: true


Class Solution{

public Boolean ValidMountain(int [] array)
{
  int l= 0;r=array.length-1;
  if(array.length==2) return false;
    while(l<=r)
    {
     if(array[l]<array[l+1]
        {
         l++;
     }
      else if(array[r-1]>array[r]
              {

       r--; 
      }
      else
      {
        break;
      }

    }
  return l!=0&&l==r&&r!=array.length-1;
}
 
  }

/*   Start from 0 and iterate till last index while you are doing so check if 
   1) L <L+1 i.e the the next elemenet should be greater than the current l 
   2) if not then this is the end of the peak so it will decrease now so accordingly you can check if the 
   !! Right most element is smaller than the prev Right element 
   3) Next you need to check 3 things 1) where is the peak i.e the highest peak which is left element should not be at 0
   and where is the Reducing Peak (from which it will decrease) it should not be at last i.e  it is not present last but not least since 
   we know the valid mountain should have one Single Peak we check if thats the case if so return True else return false

   
*











*/

