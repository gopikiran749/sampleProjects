package ArrarsTest;

import java.util.ArrayList;
import java.util.List;

public class objects_array {

	public static void main(String[] args) {
		//objects in array
		
		List<Object> x = new ArrayList<Object>();
		x.add("gopi");
		x.add(25);
		x.add("guntur");
		x.add(522262);
		System.out.println(x.get(2));
	}

}
