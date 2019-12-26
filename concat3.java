/*a function that combines two lists by alternatingly taking elements, e.g. [a,b,c], [1,2,3] → [a,1,b,2,c,3] */

import java.util.*;
public class concat3 {
	public static List<String> merge(List<String> list1, List<String> list2)
	{
		List<String> list = new ArrayList<>();
		int list1_size = list1.size();
		int list2_size = list2.size();
		Iterator<String> itr = list1.iterator();  
		Iterator<String> itr2 =list2.iterator();  
	
		
		if(list1_size >= list2_size) {
			while(itr.hasNext()){  
				
	              list.add(itr.next());  
	              while(itr2.hasNext()) {
	            	  list.add(itr2.next());
	            	  break;
	            	  
	              }
	          }  
			
		}
		else {
			while(itr2.hasNext()){  
				
	              list.add(itr2.next());  
	              while(itr.hasNext()) {
	            	  list.add(itr.next());
	            	  break;
	            	  
	              }
	          }  
			
		}
       
		
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
			
		  @SuppressWarnings("resource")
		Scanner myObj3 = new Scanner(System.in);
		  System.out.println("Enter size of list 2 ");
		  int stringlist = myObj3.nextInt();
		 
		@SuppressWarnings("resource")
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





