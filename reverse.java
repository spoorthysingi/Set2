import java.util.*;
public class reverse {
	
	public static String rev(List<Integer> numberlist)
	{
		int size = numberlist.size()-1;
		String rev = "";
		for(int i=size; i>=0;i--) {
			int revlist = numberlist.get(i);
			if(i<size) {
			rev = rev + "," + revlist; 
			}
			else {
				rev = revlist + "";
			}
			
		}
		return rev;
	}
	
	@SuppressWarnings("static-access")
	public static void main(String args[]) {
		reverse r = new reverse();

		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter size of list ");
		  int numberlist = myObj.nextInt();
		  List<Integer> list = new ArrayList<>();
		  for(int i=1; i<=numberlist; i++) {
			  System.out.println("Enter the number : "+ i + ": ");
			  int addnumber = myObj.nextInt();
			  list.add(addnumber);
			  
		  }
		 String reversenum = r.rev(list);
		  System.out.print("the reverse order of a list is : " + reversenum + "\n");
		  
		
		
		
		
	}
	

}
