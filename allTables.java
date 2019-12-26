import java.util.*;
import java.util.function.Function;
public class allTables {
	
	
	public static List<Integer> on_all(List<Integer> numberlist , Function<Integer,Integer> func) {
		
		List<Integer> square = new ArrayList<Integer>();
		
		for(int i=0;i<numberlist.size();i++) {
		
		 square.add(func.apply(numberlist.get(i)));
		
		
		}
		
		
		
		
		return square;
		 
		
	}
	
	public static void main(String args[]) {
		
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
                   
		
		Function<Integer,Integer> squaring = n->n*n;
		  
		List<Integer> squares = on_all(list,squaring);
		
		for(int j=0;j<squares.size();j++) {
			
			System.out.println(squares.get(j));
		}
			
		
	}
	
	
	
	
	
	
	 
	
	

}
