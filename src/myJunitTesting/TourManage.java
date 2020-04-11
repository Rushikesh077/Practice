package myJunitTesting;

public class TourManage {
	public int phoneno(String str)
	{
		int count=str.length();
		return count;
	}
public int billCheck(int val)
{
	if(val<=0)
		return 0;
	    return 1;
}
 public char emailCheck(String str)
 {
	 int idx=str.indexOf('@');
	 if(idx>=0)
	 return 1;
	return 0;
 }
}
