import java.util.Stack;
public class DecodeString {
    
    public String decodeString(String s){
        Stack<Integer> numberStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int k = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                // Handle multi-digit numbers
                k = k * 10 + (ch - '0');
            } else if (ch == '[') {
                // Push the current multiplier and the string built so far
                numberStack.push(k);
                stringStack.push(currentString);
                // Reset for the content inside the brackets
                currentString = new StringBuilder();
                k = 0;
            } else if (ch == ']') {
                // Pop the multiplier and the previous string context
                int repeatTimes = numberStack.pop();
                StringBuilder decodedString = stringStack.pop();
                
                // Append the current inner string 'repeatTimes' times
                for (int i = 0; i < repeatTimes; i++) {
                    decodedString.append(currentString);
                }
                currentString = decodedString;
            } else {
                // It's a character, just append to current string
                currentString.append(ch);
            }
        }
        return currentString.toString();
    
    }
}


class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        int k =0;

        for(char ch: s.toCharArray()){
            if(Character.isDigit(ch)){
                k = k*10 + (ch-'0'); //This is basically explicit conversion of char into int
                continue;
            } 
            
            if(ch=='['){
                numStack.push(k);
                k=0;
                strStack.push(String.valueOf(ch));
                continue;
            }

            if(ch!=']'){
                strStack.push(String.valueOf(ch));
                continue;
            }

            StringBuilder temp = new StringBuilder();
            while(!strStack.peek().equals("[")){
                temp.insert(0,strStack.pop());
            }

            //remove the '['
            strStack.pop();

            //Get new string
            StringBuilder replacment = new StringBuilder();
            int count = numStack.pop();
            for(int i = 0; i<count; i++){
                replacment.append(temp);
            }

            //Add it to the stack
            strStack.push(replacment.toString());
        }

        StringBuilder result = new StringBuilder();
        while(!strStack.isEmpty()){
            result.insert(0, strStack.pop());
        }
        return result.toString();
    }
}