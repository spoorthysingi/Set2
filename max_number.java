import java.util.*;
public class max_number {
	
	public static int max_n(List<Integer> numberlist)
	{
		Collections.sort(numberlist);
		int max_number = numberlist.get(numberlist.size()-1);
		return max_number;
		
	}
	public static int min_n(List<Integer> numberklist) {
		Collections.sort(numberklist);
		int min_number = numberklist.get(0);
		return min_number;
		
		
	}
	
	@SuppressWarnings("static-access")
	public static void main(String args[]) {
		max_number mn = new max_number();

		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter size of list ");
		  int numberlist = myObj.nextInt();
		  List<Integer> list = new ArrayList<>();
		  for(int i=1; i<=numberlist; i++) {
			  System.out.println("Enter the number : "+ i + ": ");
			  int addnumber = myObj.nextInt();
			  list.add(addnumber);
			  
			  
		
		  }
		  int mx_number = mn.max_n(list);
		  int mn_number = min_n(list);
		  System.out.print("the maximun number : " + mx_number + "\n");
		  System.out.print("the minimum number : " + mn_number);
		
		
		
		
	}
	

}
