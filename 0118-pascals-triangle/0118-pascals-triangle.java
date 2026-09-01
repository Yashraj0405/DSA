class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result = new ArrayList<>();

        for(int row = 1 ; row <= numRows ; row++){
            result.add(generateRow(row));
        }

        return result;
    }

    private List<Integer> generateRow(int row){
        int ans = 1;
        List<Integer> ansList = new ArrayList<>();
        ansList.add(1);
        for(int col = 1 ; col < row; col++){
            ans = ans * (row - col);
            ans = ans / col;
            ansList.add(ans);
        }

        return ansList;
    }
}