package myJunitTesting;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class billCheck {

	@Test
	public void testBillCheck() {
		//fail("Not yet implemented");
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the bill amount");
		int num=in.nextInt();
		TourManage ob= new TourManage();
		int result=ob.billCheck(num);
		assertEquals(1,result);
	}

}
