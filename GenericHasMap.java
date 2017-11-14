package hashmap;
import java.util.HashMap;
import java.util.Iterator;
public class GenericHasMap {
	//public : members which can access as public,public members are visible to all other classes.
			//class : is a context of java that are used to create objects and to define object data types and methods.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Public is a keyword that is used as an access modifier for methods and variables.
				//static used to prepare a field,method or inner classes as a class field.
				//void: it is void if the method does not return a value.
				//main:it is a function name When a program starts running, it has to start execution from somewhere.
				//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
		//interface.HashMap<k,v>
				//K: It is the type of keys maintained by this map.
				//V: It is the type of mapped values.
				HashMap<Integer,String> employeeNames=new HashMap<Integer,String>();
				//put(K key, V value) method is used to associate the specified 
				//value with the specified key in this map.
				employeeNames.put(1,"nag");
				 employeeNames.put(2,"sudha");
				 employeeNames.put(3,"srujan");
				 employeeNames.put(4,"sravan");
				
				//system is final class
			     //out is a static member of system class and type printStream
			     //println is method of printStream class.ln means nextline
			    
				System.out.println("Employees are:");
				
			//creating the values and iterating
				Iterator valueIterator= employeeNames.values().iterator();
		//hasNext() method Returns true if this scanner has another token in its input. 
				while(valueIterator.hasNext())
				{
					System.out.println(valueIterator.next());	
					//system is final class
				      //out is a static member of system class and type printStream
				      //println is method of printStream class.ln means nextline
				    
				
				}
				  
	}

}
