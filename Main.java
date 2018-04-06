import java.util.Arrays;

public class Main {

  // Insertion sort loops over items in the array,
  // inserting each new item into the subarray before the new item.
  public static void insertionSort(int[] elements) {
    // Loop through the array, starting at the 2nd element 
    int temp = 0;
    
    for(int i = 1; i < elements.length; i ++){
      for(int k = i; k>0; k--){
        if(elements[k] < elements[k-1]){
          temp = elements[k-1];
          elements[k-1] = elements[k];
          elements[k] = temp;
        }
      }
    }
  }

  public static void main(String[] args) {
    int[] arr1 = {3, 86, -20, 14, 40};
    System.out.println(Arrays.toString(arr1));
    insertionSort(arr1);
    System.out.println(Arrays.toString(arr1));
  }
}
