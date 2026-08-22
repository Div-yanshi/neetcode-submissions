class Solution {
    public boolean isValid(String s) {
        if((s.charAt(0)=='}') || (s.charAt(0)==']') || (s.charAt(0)==')'))
             return false;
       Stack<Character> st=new Stack<>();
       for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(c=='{'|| c=='['|| c=='(')
        st.push(c);
        else if(!st.isEmpty()){
        if((st.peek()=='[' && c==']') || (st.peek()=='{' && c=='}') || (st.peek()=='(' && c==')') )
        st.pop();
        else 
        return false;}
        else
        return false;
       }

       if(st.isEmpty())
       return true;
       else
       return false;

    }
}
