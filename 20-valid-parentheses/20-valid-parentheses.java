class Solution {
    public boolean isValid(String s) {
        Stack <String> stk=new Stack<String>();
        if(s.length()%2 !=0) return false;
        else
        {
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
                stk.push(Character.toString(s.charAt(i)));
             else if(s.charAt(i)==')' && !stk.isEmpty() && stk.peek().equals("("))
                  stk.pop();
        else if(s.charAt(i)==']' && !stk.isEmpty() && stk.peek().equals("["))
                  stk.pop();
            else if(s.charAt(i)=='}' && !stk.isEmpty() && stk.peek().equals("{"))
                  stk.pop();
            else
                return false;
                
        }
        }
        return stk.isEmpty();
        
    }
}