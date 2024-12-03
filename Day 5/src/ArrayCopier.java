public class ArrayCopier {
    int[] copy(int[] src, int[] dst){
        if (src.length == dst.length){
            for(int i = 0; i < src.length; i++){
                dst[i] = src[i];
            }

        } else if (src.length > dst.length){
            for(int i = 0; i < dst.length; i++){
                dst[i] = src[i];
            }
        } else if (src.length < dst.length){
            int lengthDiff = dst.length - src.length;
            for(int i = 0; i < src.length; i++){
                dst[i] = src[i];
            }
            for(int i = lengthDiff; i < dst.length; i++){
                dst[i] = 0;
            }
        }
    return dst;
    }
}







