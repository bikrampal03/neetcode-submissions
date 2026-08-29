class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String arr[] = path.split("/");

        for(String i:arr){
            if(!st.isEmpty() && i.equals("..")){
                st.pop();
            }else if(!i.equals("") && !i.equals(".") && !i.equals("..")){
                st.push(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String i:st){
            sb.append("/");
            sb.append(i);
        }
        return sb.length() == 0 ? "/" :sb.toString();
    }
}