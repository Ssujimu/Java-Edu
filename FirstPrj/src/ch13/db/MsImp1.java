package ch13.db;

public class MsImp1 implements DbInterface{
	
	@Override
	public void connect() {
		System.out.println("Ms-SQL 데이터베이스 시스템에 연결합니다.");
	}
	
	@Override
	public void select() {
		System.out.println("Ms-SQL 데이터베이스 시스템에서 데이터를 검색합니다.");
	}
	
	@Override
	public void insert() {
		System.out.println("MS-SQL 데이터베이스 시스템에 데이터를 추가합니다.");
	}
	
	@Override
	public void update() {
		System.out.println("MS-SQL 데이터베이스 시스템에서 데이터를 수정합니다.");
	}
	
	@Override
	public void delete() {
		System.out.println("Ms-SQL 데이터베이스 시스템에서 데이터를 삭제합니다.");
	}
}
