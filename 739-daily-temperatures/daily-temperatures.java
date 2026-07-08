class Solution {
     private static class TempIndex {
        int temperature;
        int index;
        
        TempIndex(int temperature, int index) {
            this.temperature = temperature;
            this.index = index; // Fixed: was this.temperature = index
        }
    }

    public int[] dailyTemperatures(int[] temperatures) {
        Deque<TempIndex> stack = new ArrayDeque<>();
        int n = temperatures.length;
        int[] ans = new int[n];

        for(int i = n-1; i >= 0; i--){
            int val = temperatures[i];
            while(!stack.isEmpty() && stack.peekFirst().temperature <= val ){
                stack.pop();
            }

            if(stack.isEmpty()){
                ans[i] = 0;
            }else{
                ans[i] = stack.peekFirst().index - i;
            }


            stack.push(new TempIndex(val, i));
        }


        return ans;
    }
}