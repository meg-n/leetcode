class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        List<Integer> result = new ArrayList<>();        

        Deque<Integer> deque = new ArrayDeque<>(deck.length);
        for(int i = 0;i<deck.length;i++){
            deque.offer(i);
        }   
        Arrays.sort(deck);
        int[] a = new int[deck.length];
        for(int n : deck){
            a[deque.pollFirst()] = n;
            if(!deque.isEmpty()){
                deque.offerLast(deque.pollFirst());
            }
        }

        return a;
    }
}