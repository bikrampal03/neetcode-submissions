class Solution {
    public String decodeString(String s) {
        Stack<Integer> counts = new Stack<>();
        Stack<String> result = new Stack<>();

        String res = "";
        int num = 0;
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                num = num *10 +(ch-'0');
            }else if(ch == '['){
                counts.push(num);
                result.push(res);
                num = 0;
                res = "";
            }else if(ch == ']'){
                int count = counts.pop();
                StringBuilder temp = new StringBuilder(result.pop());
                for(int i=0;i<count;i++){
                    temp.append(res);
                }
                res = temp.toString();
            }else{
                res+=ch;
            }
        }
        return res;
    }
}