//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(
                new Solution().infixToPostfix(br.readLine().trim()));
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to convert an infix expression to a postfix expression.
    
    static int prec(char c)
    {
        if(c=='^')
        return 3;
        else if(c=='*'||c=='/')
        return 2;
        else if(c=='+'||c=='-')
        return 1;
        else
        return -1;
        
    }
    public static String infixToPostfix(String exp) {
        
        Stack<Character> st = new Stack<Character>();
        
        String res="";
        
        for(int i=0;i<exp.length();i++)
        {
            if(exp.charAt(i)=='+'||exp.charAt(i)=='-'||exp.charAt(i)=='^'||exp.charAt(i)=='/'||exp.charAt(i)=='*')
            {
                while(!(st.isEmpty()) && prec(st.peek())>=prec(exp.charAt(i)))
                {
                    char c=st.pop();
                    res+=c;
                    
                }
                
                
                st.push(exp.charAt(i));
            }
            
            else
            {
                if(exp.charAt(i)=='(')
                st.push(exp.charAt(i));
                
                else if(exp.charAt(i)==')')
                {
                    while(st.peek()!='(')
                    {
                        char c=st.pop();
                          res+=c;
                    }
                    st.pop();
                }
                
                else
                res+=exp.charAt(i);
            }
            
           
        }
        
         while(!st.isEmpty())
            {
                char c=st.pop();
                     res+=c;
            }
            return res;
       
    }
    
}
