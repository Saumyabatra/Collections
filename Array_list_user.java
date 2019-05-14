package Collections;
import java.util.*;
public class Array_list_user {
public static void main(String args[]){
	ArrayList <String> a1=new ArrayList<String>();
	ArrayList<String> a2=new ArrayList<String>();
	a2.add("1");
	a2.add("2");
	System.out.println("Enter the number of elememts to be added to arraylist at run time:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println("Enter the elements in the arraylist:");
	for(int i=0;i<n;i++){
		String n1=sc.nextLine();
		a1.add(n1);
	}
	a1.addAll(a2);
	Iterator itr=a1.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	//.remove(3);//letion of element
		Iterator itr2=a1.iterator();
		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}
	//.remove(itr);
		System.out.println("size"+a1.size());
		
	//.retainAll(a2);
	Iterator itr3=a1.iterator();
	while(itr3.hasNext()){
		System.out.println(itr3.next());
	}
	System.out.println("size"+a1.size());
	System.out.println("it contains"+a1.contains(itr3));
	System.out.println("it contains"+a1.contains("saumya"));
	a1.toArray();
}
}