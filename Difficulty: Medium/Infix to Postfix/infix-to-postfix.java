class Solution {
    public static String infixToPostfix(String s) {
        // code here
        Stack<String> val = new Stack<>();
Stack<Character> op = new Stack<>();
for(int i=0;i<s.length();i++){
    char ch = s.charAt(i);
    int ascii = (int) ch;
    if((ascii>=65 && ascii<=90) || (ascii>=97 && ascii<=122) || (ascii>=48 && ascii<=57)) val.push(ch+"");
    else if(op.isEmpty()) op.push(ch);
    else if(op.peek()=='(' && ch!=')') op.push(ch);
    else{
        if(ch=='-' || ch=='+'){
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            val.push(v1+v2+o);
            if(op.isEmpty()) op.push(ch);
            else i--;
        }else if(ch=='*' || ch=='/'){
            if(op.peek()=='+' || op.peek()=='-') op.push(ch);
            else{
                String v2 = val.pop();
                String v1 = val.pop();
                char o = op.pop();
                val.push(v1+v2+o);
                if(op.isEmpty()) op.push(ch);
                else i--;
            }
        }else if(ch=='^') op.push('^');
        else{
            if(ch=='(') op.push(ch);
            if(ch==')'){
                while(op.peek()!='('){
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    val.push(v1+v2+o);
                }
                op.pop();
            }
        }
    }
}
while(val.size()!=1){
    String v2 = val.pop();
    String v1 = val.pop();
    char o = op.pop();
    val.push(v1+v2+o);
}
String ans = val.peek();
return ans;     
    }
}
