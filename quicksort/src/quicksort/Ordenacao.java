package quicksort;

public class Ordenacao {
	
	int array[];
    int tamanho;
   
   public Ordenacao(int[] valores){
   	
       array = valores;
       tamanho = valores.length;
   }
   
   public void inicia() {
       ordena(0, tamanho - 1);
   }
   
   private void ordena(int menor, int maior) {
   	int aux;
       int i = menor;
       int j = maior;
       
       
       int pivo = array[menor+(maior-menor)/2];
       
       
       while (i <= j) {
           
           while (array[i] < pivo) {
               i++;
           }
           while (array[j] > pivo) {
               j--;
           }
           if (i <= j) {
           	 aux = array[i];
           	 array[i] = array[j];
           	 array[j] = aux;
               i++;
               j--;
           }
       }
       
       
       if (menor < j)
           ordena(menor, j);
       if (i < maior)
           ordena(i, maior);
   }
   
}

