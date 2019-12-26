import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class concat1 {
	public static List<String> merge(List<String> list1, List<String> list2)
	{
		List<String> list = new ArrayList<>();
		

		list.addAll(list1);
		list.addAll(list2);

		return list;
	}
	
	
	
	public static  void main(String args[]) {
		

		
		@SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter size of list 1 ");
		  int numberlist = myObj.nextInt();
		 List<String> list1 = new ArrayList<>();
		  List<String> list2 = new ArrayList<>();
		  @SuppressWarnings("resource")
		Scanner myObj1 = new Scanner(System.in);
		  for(int i=1; i<=numberlist; i++) {
			  System.out.println("Enter the string : "+ (i) + ": ");
			  String addnumber = myObj1.nextLine();
			  list1.add(addnumber);
		  }
			
		  Scanner myObj3 = new Scanner(System.in);
		  System.out.println("Enter size of list 2 ");
		  int stringlist = myObj3.nextInt();
		  Scanner myObj4 = new Scanner(System.in);
		  for(int i=1; i<=stringlist; i++) {
			  System.out.println("Enter the string : "+ (i) + ": ");
			  String addnumber = myObj4.nextLine();
			  list2.add(addnumber);
		  }
		  
		  List<String> mergedlist = merge(list1,list2);
		  System.out.println(mergedlist);
		 
			  
			  }
	
	
		  
	}



