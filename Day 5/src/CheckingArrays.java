public class CheckingArrays {
    boolean isSymmetrical(int[] numArray){

        for(int i = 0; i < numArray.length; i++){

            if (numArray[i] != numArray[numArray.length - (i + 1)]){
                int[] newArray = reverse(numArray);
                String newArrayAsString = "";

                for (int j = 0; j < newArray.length; j++){
                    newArrayAsString = newArrayAsString + newArray[j] + " ";
                }
                System.out.println(newArrayAsString);
                return false;
            }
        }
        return true;
    }

    int[] reverse(int[] numArray){
        int[] newArray = {};
        newArray = new int[numArray.length];
        for(int i = 0; i < numArray.length; i++){
            newArray[i] = numArray[numArray.length - (i + 1)];
        }
        return newArray;

    }

}
