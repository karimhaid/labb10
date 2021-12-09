import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
public class testSelectionSort {
@Test
public void test() {
testPositive();
testNegative();
testMixed();
testDuplicates();
}
    public testSelectionSort() {
    }

    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

        /** add tests to check for this unit test **/
    }

    public void testNegative(){

        /** Test data contains negative values only **/
    }

    public void testMixed(){
      int[] arr = new int[5];
      arr[0] = -8;
      arr[1] = 9;
      arr[2] = -7;
      arr[3] = 10;
      arr[4] = 2;

      int[] Sortedarr = new int[5];
      Sortedarr[0] = -8;
      Sortedarr[1] = -7;
      Sortedarr[2] = 2;
      Sortedarr[3] = 9;
      Sortedarr[4] = 10;

      SelectionSort temp= new SelectionSort();
      temp.basicSelectionSort(arr);
      assertArrayEquals("test mixed failed",Sortedarr,arr);
      /** Test data contains with both positive, negative and zeros **/
    }

    public void testDuplicates(){
      int[] arr = new int[5];
       arr[0] = 8;
       arr[1] = 9;
       arr[2] = 9;
       arr[3] = 10;
       arr[4] = 8;

       int[] Sortedarr = new int[5];
       Sortedarr[0] = 8;
       Sortedarr[1] = 8;
       Sortedarr[2] = 9;
       Sortedarr[3] = 9;
       Sortedarr[4] = 10;

       SelectionSort temp= new SelectionSort();
       temp.basicSelectionSort(arr);
       assertArrayEquals("test dup failed",Sortedarr,arr);
       /** Test data contains duplicates **/
    }
}
