public class BubbleSort {
  public static void main(String[] args) {
  
    int[] ints = {1,5,3,2,4};
    ints = bubbleSort(ints);
  
    for(int i = 0; i < ints.length; i++) {
      System.out.println(ints[i]);
    }
  
  }
  
  public static int[] bubbleSort(int[] ints) {
    int j;
    boolean flag = true;
    int temp;
    
    while(flag == true) {
      flag = false;
      for(j = 0; j < ints.length - 1; j++) {
        if(ints[j] < ints[j + 1]) {
          int swap = ints[j];
          ints[j] = ints[j + 1];
          ints[j + 1] = swap;
          flag = true;
        }
      }
    }
    return ints;
  }
}
          