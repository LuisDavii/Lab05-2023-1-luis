package ordenadores;
public class OrdenarPorMerge implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        return array;
    }

    public int[] merge(int[] array1, int[] array2) {
        int[] mArray = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                mArray[k++] = array1[i++];
            } else {
                mArray[k++] = array2[j++];
            }
        }

        while (i < array1.length) {
            mArray[k++] = array1[i++];
        }

        while (j < array2.length) {
            mArray[k++] = array2[j++];
        }

        return mArray;
    }
    
}