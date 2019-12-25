/*
 *  Three functions that compute the sum of the numbers in a list: using a for-loop, a while-loop and recursion.
 */

/**
 * @author spoorthy reddy
 */
import java.util.*;
public class addNumber {
    public int ifAdd(List<Integer> numberlist){
 
    int sum = 0;
    for (int i: numberlist) {
        sum = sum + i;
    }
    return sum;
}
    public int whileAdd(List<Integer> numberlist) {
    	
    	int sum = 0;
    	int i = 0;
    	int size = numberlist.size();
    	while(i < size) {
    		sum = sum + numberlist.get(i);
    		i++;
    		\
    		
    	}
    	
    	
    	return sum;
    }
    public static int recursionAdd(List<Integer> numberlist) {		
    	int size = numberlist.size();
        if(size > 0) {
            return numberlist.get(0) + recursionAdd(numberlist.subList(1, size));           
        }
        else
        return 0;
		
   
    }
        
    
	public static void main(String args[]) {
		addNumber a = new addNumber();

		
		@SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter size of list ");
		  int numberlist = myObj.nextInt();
		  List<Integer> list = new ArrayList<>();
		  for(int i=1; i<=numberlist; i++) {
			  System.out.println("Enter the number : "+ (i-1) + ": ");
			  int addnumber = myObj.nextInt();
			  list.add(addnumber);
		  }
                  
                  int  num = a.ifAdd(list);
		  System.out.print("the sum of elements using for loop " + num + "\n");
		  		int num1 = a.whileAdd(list);
		  		System.out.println("the sum of elements using while loop" + num1 +"\n");
		  		int sum = recursionAdd(list);
		        System.out.println("Sum of the list:"+" "+sum);
}
	
}

<p>