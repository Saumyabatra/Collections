package Collections;
import java.util.*;;
public class array_list {
	public static void main(String args[]){  
	TreeSet <String> list=new TreeSet<String>();//Creating arraylist  
	list.add("Ravi");//ding object in arraylist  
	list.add("Vijay");  
	list.add("Ravi");  
	list.add("1");  
	//Traversing list through Iterator  
	Iterator itr=list.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	}  
	}
