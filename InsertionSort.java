public class InsertionSort {
  public static void main(String[] args) {
      int[] ints = {5, 4, 3, 5, 1};
      insertionSort(ints);
   
   }
   
   public static int[] insertionSort(int[] ints){
      for(int i = 0; i < ints.length; i++) {
         for(int j = i; j > 0; j--) {
            if(ints[j] < ints[j - 1]) {
               int swap = ints[j];
               ints[j] = ints[j - 1];
               ints[j - 1] = swap;
            } else break;
         }
      }
      return ints;
   }
}
