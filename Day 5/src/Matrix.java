public class Matrix {
    private int[][] matrix;

    public Matrix(int row, int col){

        matrix = new int[row][col];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = 1;
            }
        }
    }

    public void setElement(int row, int col, int newValue){
        if(row >= 0 && col >= 0 && row < matrix.length && col < matrix[0].length){
            matrix[row][col] = newValue;
        }
    }

    public void setRow(int row, String newRow){
        if(row >= 0 && row < matrix[0].length){
            int[] numbers = parseNumbersFromString(newRow);
            if (matrix[row].length >= numbers.length){
                matrix[row] = numbers;
            }
        }
    }

    public void setColumn(int col, String newCol){
        if(col >=0 && col < matrix[0].length){
            int[] numbers = parseNumbersFromString(newCol);
            if (numbers.length < matrix.length){
                for(int i = 0; i < numbers.length; i++){
                    matrix[i][col] = numbers[i];
                }
            }

        }
    }

    int[] parseNumbersFromString(String newNumbers){
        String[] parts = newNumbers.split(",");
        int[] numbers = new int[parts.length];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(parts[i].trim());
        }
        return numbers;
    }

    String asString(){
        String matrixValues = "[";
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(j != matrix.length-1){
                    matrixValues = matrixValues + matrix[i][j] + ", ";
                }
                else {
                    matrixValues = matrixValues + matrix[i][j];
                }

            }
            if(i != matrix.length - 1){
                matrixValues += "; ";
            }
        }
        matrixValues += "]";
        return matrixValues;
    }

    public void prettyPrint() {
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

//        for (int[] row : matrix) {
//            for (int element : row) {
//                System.out.print(element + "\t");
//            }
//            System.out.println();
//            }

        }

    void setMatrix(String numbers) {




        }



}







