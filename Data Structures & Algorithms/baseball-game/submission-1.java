class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String op : operations){
            if(op.equals("+")){
                int top1 = st.pop();
                int top2 = st.peek();
                int newTop = top1+top2;
                st.push(top1);
                st.push(newTop);
            }else if(op.equals("D")){
                st.push(2*st.peek());
            }else if(op.equals("C")){
                st.pop();
            }else{
                st.push(Integer.parseInt(op));
            }
        }int sum = 0;
        while(st.size()>0){
            sum+= st.pop();
        }
        return sum;
    }
}