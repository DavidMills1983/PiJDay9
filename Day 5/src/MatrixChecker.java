public class MatrixChecker {
    boolean isSymmetrical(int[] myArray){
        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] != myArray[myArray.length - (i + 1)]){
                return false;
            }
        }
        return true;
    }

    boolean isSymmetrical(int[][] myArray){
        int outerArrayLen = myArray.length;

        for(int i = 0; i < outerArrayLen; i++){
            int innerArrayLen = myArray[i].length;
            for(int j = 0; j < innerArrayLen; j++){
                if (myArray[i][j] != myArray[outerArrayLen - (i + 1)][innerArrayLen - (j +1)]){
                    return false;
            }

            }
        }
    return true;

    }

    boolean isTriangular(int[][] myArray){
        for(int i = 0; i < myArray.length; i++){
            for(int j = 0; j < i; j++){
                if (myArray[i][j] != 0){
                    return false;
                }
            }
        }
        return true;

    }
}
