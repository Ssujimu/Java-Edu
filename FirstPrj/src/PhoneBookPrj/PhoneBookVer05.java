/*
 * 전화번호 관리 프로그램 구현 프로젝트
 * Version 0.5
 */

package PhoneBookPrj;

import java.util.Scanner;

interface INIT_MENU {
	int INPUT = 1, SEARCH = 2, DELETE = 3, EXIT = 4;
}

interface INPUT_SELECT {
	int NORMAL = 1, UNIV = 2, COMPANY = 3;
}

class PhoneInfo5 {
	String name;
	String phoneNumber;
	
	public PhoneInfo5(String name, String num) {
		this.name = name;
		phoneNumber = num;
	}
	
	public void showPhoneInfo() {
		System.out.println("name : " + name);
		System.out.println("phone : " + phoneNumber);
	}
}

class PhoneUnivInfo2 extends PhoneInfo5 {
	String major;
	int year;
	
	public PhoneUnivInfo2(String name, String num, String major, int year) {
		super(name, num);
		this.major = major;
		this.year = year;
	}
	
	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("major : " + major);
		System.out.println("year : " + year);
	}
}

class PhoneCompanyInfo2 extends PhoneInfo5 {
	String company;
	
	public PhoneCompanyInfo2(String name, String num, String company) {
		super(name, num);
		this.company = company;
	}
	
	public void showPhoneInfo()
	{
		super.showPhoneInfo();
		System.out.println("company : " + company);
	}
}

class PhoneBookManager3 {
	final int MAX_CNT=100;
	PhoneInfo5[] infoStorage = new PhoneInfo5[MAX_CNT];
	int curCnt = 0;
	
	static PhoneBookManager3 inst = null;
	public static PhoneBookManager3 createManagerInst()
	{
		if(inst==null)
			inst = new PhoneBookManager3();
		
		return inst;
	}
	
	private PhoneBookManager3(){}
	
	private PhoneInfo5 readFriendInfo2() {
		System.out.println("이름 : ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.println("전화번호 : ");
		String phone = MenuViewer.keyboard.nextLine();
		return new PhoneInfo5(name, phone);
	}
	
	private PhoneInfo5 readUnivFriendInfo2() {
		System.out.println("이름 : ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.println("전화번호 : ");
		String phone = MenuViewer.keyboard.nextLine();
		System.out.println("전공 : ");
		String major = MenuViewer.keyboard.nextLine();
		System.out.println("학년 : ");
		int year = MenuViewer.keyboard.nextInt();
		return new PhoneUnivInfo2(name, phone, major, year);
	}
	
	private PhoneInfo5 readCompanyFriendInfo2() {
		System.out.println("이름 : ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.println("전화번호 : ");
		String phone = MenuViewer.keyboard.nextLine();
		System.out.println("회사 : ");
		String company = MenuViewer.keyboard.nextLine();
		return new PhoneCompanyInfo2(name, phone, company);
	}

	public void inputData() {
		System.out.println("데이터 입력을 시작합니다...");
		System.out.println("1. 일반, 2. 대학, 3. 회사");
		System.out.println("선택 >> ");
		int choice = MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine();
		PhoneInfo5 info = null;
		
		switch(choice) {
		case INPUT_SELECT.NORMAL:
			info = readFriendInfo2();
			break;
		case INPUT_SELECT.UNIV:
			info = readUnivFriendInfo2();
			break;
		case INPUT_SELECT.COMPANY:
			info = readCompanyFriendInfo2();
			break;
		}
		
		infoStorage[curCnt++] = info;
		System.out.println("데이터 입력이 완료되었습니다. \n");
	}
	
	public void searchData()
	{
		System.out.println("데이터 검색을 시작합니다..");
		
		System.out.println("이름 : ");
		String name = MenuViewer.keyboard.nextLine();
		
		int dataIdx = search(name);
		if(dataIdx < 0) {
			System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
		} else {
			infoStorage[dataIdx].showPhoneInfo();
			System.out.println("데이터 검색이 완료되었습니다. \n");
		}
	}
	
	public void deleteData()
	{
		System.out.println("데이터 삭제를 시작합니다.");
		
		System.out.println("이름 : ");
		String name = MenuViewer.keyboard.nextLine();
		
		int dataIdx = search(name);
		if(dataIdx < 0) {
			System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
		} else {
			for(int idx = dataIdx; idx < (curCnt-1); idx++) { 
				infoStorage[idx] = infoStorage[idx+1];
		}
				
			curCnt--;
			System.out.println("데이터 삭제가 완료되었습니다. \n");
		}
	}
	
	private int search(String name) {
		for(int idx = 0; idx < curCnt; idx++) {
			PhoneInfo5 curInfo = infoStorage[idx];
			if(name.compareTo(curInfo.name) == 0)
				return idx;
		}
		return -1;
	}
}

class MenuViewer3 {
	public static Scanner keyboard = new Scanner(System.in);
	
	public static void showMenu() {
		System.out.println("선택하세요...");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제");
		System.out.println("4. 프로그램 종료");
		System.out.println("선택 : ");
	}
}

public class PhoneBookVer05 {

	public static void main(String[] args) {
		PhoneBookManager3 manager = PhoneBookManager3.createManagerInst();
		int choice;
		
		while(true) {
			MenuViewer.showMenu();
			choice = MenuViewer.keyboard.nextInt();
			MenuViewer.keyboard.nextLine();
			
			switch(choice) {
			case INIT_MENU.INPUT:
				manager.inputData();
				break;
			case INIT_MENU.SEARCH:
				manager.searchData();
				break;
			case INIT_MENU.DELETE:
				manager.deleteData();
				break;
			case INIT_MENU.EXIT:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}
}
