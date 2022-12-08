import java.io.*;
 
class Palindromic
{
    static boolean isPalindrome(String str,
                                int startRange, 
                                int endRange)
    {
        //edge case, I assume if length is 0, it is a palindrome and it will return true
        if(str.length() == 0) {
            return true;
        }
        //edge case, if there is only 1 character it is a palindrome
        if (startRange == endRange) {
            return true;
        }
 
        //first and last character needs to match for it to be a palindrome
        if ((str.charAt(startRange)) != (str.charAt(endRange))) {
            return false;
        }
 
        if (startRange < endRange + 1) {
            return isPalindrome(str, startRange + 1, endRange - 1);
        }
    }
        return true;
}