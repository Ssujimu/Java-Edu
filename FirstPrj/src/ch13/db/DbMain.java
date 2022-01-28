package ch13.db;

public class DbMain {

	public static void main(String[] args) {
		Process p1 = new Process(new OracleTmp1());
		p1.connect();
		p1.select();
		p1.insert();
		p1.update();
		p1.delete();
		
		Process p2 = new Process(new MsImp1());
		p2.connect();
		p2.select();
		p2.insert();
		p2.update();
		p2.delete();
	}

}
