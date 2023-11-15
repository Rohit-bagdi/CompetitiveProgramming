//link
//https://www.geeksforgeeks.org/consecutive-sequenced-numbers-in-a-string/


//Given a string that contains only numeric digits, we need to check whether that strings contains numbers in a consecutive sequential manner in increasing order. 

//Note: Negative numbers are not considered part of this problem. So we consider that input only contains positive integer.

//Examples: 

//Input :  str = "1234"
//Output : Yes




// Java Program to check whether a String contains
// consecutive sequential numbers or not
class GFG 
{

// function to check consecutive sequential number
static int isConsecutive(String str)
{
	// variable to store starting number
	int start;

	// length of the input String
	int length = str.length();

	// find the number till half of the String
	for (int i = 0; i < length / 2; i++) 
	{

		// new String containing the starting
		// substring of input String
		String new_str = str.substring(0, i + 1);

		// converting starting substring into number
		int num = Integer.parseInt(new_str);

		// backing up the starting number in start
		start = num;

		// while loop until the new_String is 
		// smaller than input String
		while (new_str.length() < length) 
		{

			// next number
			num++;

			// concatenate the next number
			new_str = new_str + String.valueOf(num);
		}

		// check if new String becomes equal to
		// input String
		if (new_str.equals(str)) 
		return start;
	}

	// if String doesn't contains consecutive numbers
	return -1;
}

// Driver Code
public static void main(String[] args) 
{
	String str = "99100";
	System.out.println("String: " + str);
	int start = isConsecutive(str);
	if (start != -1)
		System.out.println("Yes \n" + start);
	else
		System.out.println("No");

	String str1 = "121315";
	System.out.println("\nString: " + str1);
	start = isConsecutive(str1);
	if (start != -1)
		System.out.println("Yes \n" + start);
	else
		System.out.println("No");
	}
}

// This code contributed by Rajput-Ji

         1
