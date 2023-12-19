// Date: 6th Dec 2023
//https://leetcode.com/problems/decode-string/
class Solution {
    public String decodeString(String s) {
        Stack<Integer> numberStack = new Stack<>();
        Stack<String> mainStack = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch>='0' && ch<='9'){
                int num = 0;
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
            num = num*10 + (int)(s.charAt(i)-'0');
            i++;
        }
        i--;
        numberStack.push(num);
            }else if(ch!=']'){
                mainStack.push(ch +"");
            }else{
                String str ="";
                while(!mainStack.peek().equals("[")){
                    str = mainStack.pop()+str;
                }
                mainStack.pop();
             int repeatationNumber = numberStack.pop();

             StringBuilder sb = new StringBuilder("");
             while(repeatationNumber>0){
                 sb.append(str);
                 repeatationNumber--;
               }
               mainStack.push(sb.toString());
            }
        }
        StringBuilder ans = new StringBuilder("");
        while(mainStack.size()>0){
            ans.insert(0, mainStack.pop());
        }
        return ans.toString();
        
    }
}
