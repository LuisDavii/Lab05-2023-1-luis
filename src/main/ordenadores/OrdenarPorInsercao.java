package ordenadores;
public class OrdenarPorInsercao implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        for(int i=1;i<array.length;i++){
           int atual = array[i];
           int j = i-1;
           while(j>0 && array[i]>atual){
            array[j+i] = array[j];
            j--;
            }
            array[j+1]=atual;
        }
        return array;
    }
    
}
