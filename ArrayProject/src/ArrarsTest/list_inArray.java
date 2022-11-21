package ArrarsTest;

import java.util.ArrayList;

public class list_inArray {

	public static void main(String[] args) {
		//arraylisy
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("redcar");
		cars.add("greencar");
		System.out.println(cars);
		cars.add("blakccar");
		//find index
		System.out.println(cars.get(2));
		System.out.println(cars.size());
	}

}
