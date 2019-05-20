
 
import java.lang.reflect.Field;
 
import java.util.*;


public class Arraylist {


		public static void main(String[] args) throws Exception  {
			 
	        ArrayList<Integer>  al = new ArrayList<Integer>();
	 
	       Vector<Integer>  vector = new Vector<Integer> (); 
	 
	        for (int i = 0; i < 34; i++)
	 
	               {
	 
	               al.add(i);
	 
	               vector.add(i);
	 
	             }
	 
	       System.out.println("Array List  : Size =  "+ al.size() + " Capacity = "+  findCapacity(al));
	 
	       System.out.println("Vector  : Size =  "+ vector.size() + " Capacity = "+  vector.capacity());
	 
	    }
	 
	     //returns capacity of an ArrayList
	 
	  static int findCapacity(ArrayList<Integer> al) throws Exception {
	 
	        Field field = ArrayList.class.getDeclaredField("elementData");
	 
	        field.setAccessible(true);
	 
	        return ((Object[]) field.get(al)).length;
	 
	    }

}
