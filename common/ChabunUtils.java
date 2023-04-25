package a.b.c.kos.common;

public abstract class ChabunUtils {

	public static final String BIZ_GUBUN_MEMBER = "M"; 
			
	public static String numPad(String c){

		for (int i = c.length(); i < 4; i++) {
			c = "0" + c;
		}
		String ymd = DateFormatUtil.ymdFormat();
		return ymd.concat(c);
	}
	
	public static String getMemChabun() {
		
		String commNum = ChabunQuery.getMemChabunQuery();	
		return BIZ_GUBUN_MEMBER.concat(ChabunUtils.numPad(commNum));									
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		System.out.println(">>> : " + ChabunUtils.getMemChabun());
	}
}
