class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();

        for(int a : asteroids) {

            while(!s.isEmpty() && a < 0 && s.peek() > 0) {

                int sum = s.peek() + a;

                if(sum < 0) {
                    s.pop();
                } 
                else if(sum > 0) {
                    a = 0;
                } 
                else {
                    s.pop();
                    a = 0;
                }
            }

            if(a != 0) {
                s.push(a);
            }
        }

        int b = s.size();
        int arr[] = new int[b];

        int i = arr.length - 1;

        while(!s.isEmpty()) {
            arr[i] = s.pop();
            i--;
        }

        return arr;
    }
}