package myJunitTesting;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class emailCheck {

	@Test
	public void testEmailCheck() {
		//fail("Not yet implemented");
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the mail");
		String str=in.next();
		TourManage ob= new TourManage();
		int result=ob.emailCheck(str);
		assertEquals(1,result);
	}

}
