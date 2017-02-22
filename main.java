
/**
 * Write a description of class main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class main
{
    private int[] intArray = {1, 3, 2, 5, 4, 6};
    
    public void insertionSort(int[] intArray)
    {
        int i, k;
        int key;
        int count = 0;
        for(i=1; i<intArray.length; i++)// for loop to run through array
        {
            key = intArray[i]; //sets key as the second element of an integer array
            k = i-1; // defines k as the position one before i
            while(k>=0 && key < intArray[i])
            {
                intArray[i+1] = intArray[i];
                i--;
                // the while loop runs as long as key is smaller than the compared element
            }
            intArray[i+1] = key; // if key is not smaller than the compared element, it gets shifted one position to the right
            count++;// everytime there is a shift you increase the count by one
            System.out.println(intArray[i]); //this line is to print the array after every sort
       
        }
        System.out.println(count);// prints out the final value for count after all sorting in the for loop
    }
}
