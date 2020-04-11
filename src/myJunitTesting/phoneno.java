package myJunitTesting;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class phoneno {

	@Test
	public void testPhoneno() {
		//fail("Not yet implemented");
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no");
		String str=in.next();
		TourManage ob= new TourManage();
		int result=ob.phoneno(str);
		assertEquals(10,result);
	}

}
