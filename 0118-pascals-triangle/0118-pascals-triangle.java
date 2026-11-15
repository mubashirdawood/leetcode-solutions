import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {
            List<Integer> currentRow = new ArrayList<>();
            for (int col = 0; col <= row; col++) {
                if (col == 0 || col == row) {
                    currentRow.add(1);
                } else {
                    List<Integer> prevRow = triangle.get(row - 1);
                    currentRow.add(prevRow.get(col - 1) + prevRow.get(col));
                }
            }
            triangle.add(currentRow);
        }

        return triangle;
    }
}