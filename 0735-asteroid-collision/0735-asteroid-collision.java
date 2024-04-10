class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<n; i++){
            int next = asteroids[i];
            if(stack.size() == 0){
                stack.add(next);
            }
            else {
                int prev = stack.peek();
                if((prev < 0 && next < 0) || (prev > 0 && next > 0)){
                    stack.add(asteroids[i]);
                    continue;
                }
                if(prev < 0 && next > 0){
                    stack.add(asteroids[i]);
                    continue;
                }
                boolean needToAddNext = false;
                while(stack.peek() > 0 && next < 0){
                    if((-1*next) > stack.peek()){
                        stack.pop();
                        if(stack.size() == 0) {
                            needToAddNext = false;
                            stack.add(next);
                            break;
                        }
                        needToAddNext = true;
                    }
                    else if((-1*next) == stack.peek()) {
                        stack.pop();
                        needToAddNext = false;
                        break;
                    }
                    else{
                        needToAddNext = false;
                        break;
                    }
                }
                if(needToAddNext) {
                    stack.add(next);
                }
            }
        }
        int [] res = new int[stack.size()];
        int i = stack.size() -1;
        while(stack.size() != 0){
            res[i] = stack.pop();
            i--;
        }
        return res;
    }
}