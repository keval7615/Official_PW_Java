// Bubble sort in Java
class BUBBLESORT {
 
  // bubble sort
  static void bubbleSort(int arr[]) {
    int size = arr.length;
    
    // loop over array elements
    for (int i = 0; i < size - 1; i++)
    
      // loop to compare array elements
      for (int j = 0; j < size - i - 1; j++)
 
        // compare two adjacent elements
        if (arr[j] > arr[j + 1]) {
 
          //swap if elements are out-of-order
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          
        }
  }
}
