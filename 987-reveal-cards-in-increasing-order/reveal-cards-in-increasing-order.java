class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;

        Arrays.sort(deck);

        Deque<Integer> queue = new ArrayDeque();

        for(int i = 0; i < n; i++){
            queue.offer(i);
        } 

        int[] result = new int[n];

        for(int i = 0; i < n; i++){
            int position = queue.poll();
            result[position] = deck[i];
            if(!queue.isEmpty()){
                queue.offer(queue.poll());
            }
        }

        return result;
    }
}