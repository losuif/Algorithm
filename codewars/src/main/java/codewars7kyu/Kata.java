package codewars7kyu;

// https://www.codewars.com/kata/5259b20d6021e9e14c0010d4
// Reverse words

/*
* Complete the function that accepts a string parameter,
* and reverses each word in the string.
* All spaces in the string should be retained.
*
* Examples)
* "This is an example!" ==> "sihT si na !elpmaxe"
* "double  spaces"      ==> "elbuod  secaps"*/

public class Kata {

    public static String reverseWords(final String str)
    {
        String answer       = "";
        String temp         = "";
        String reverseStr   = "";
        int space           = 0;

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if (ch != ' ') temp += ch;
            else {
                reverseStr = temp.substring(space, i);
                reverseStr = new StringBuilder(reverseStr).reverse().toString();

                space   = i + 1;
                temp    += ch;

                answer  += reverseStr + ch;
            }

            if (i == str.length()-1) {
                reverseStr = temp.substring(answer.length(), i+1);
                reverseStr = new StringBuilder(reverseStr).reverse().toString();

                answer += reverseStr;
            }
        }
        return answer;
    }
}