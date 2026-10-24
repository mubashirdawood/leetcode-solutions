import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n = deck.length;
        int[] result = new int[n];
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < n; i++) {
            queue.add(i);
        }
        
        for (int card : deck) {
            result[queue.poll()] = card;
            if (!queue.isEmpty()) {
                queue.add(queue.poll());
            }
        }
        
        return result;
    }
}