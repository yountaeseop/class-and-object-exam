package Java2021_11_02_datamanager_ver_arraylist_method;

public class ClassExam {

	public static void main(String[] args) {
		
		// 사람
		
		// String name;
		// String home;
		// int age;
		
		Person p1 = new Person(); // 복사본(인스턴스) 만들어줘
		Person p2 = new Person();
		Person p3 = new Person();
		
		p1.name = "홍길동";
		p1.age = 20;
		p1.home = "대전";
		
		p2.name = "홍길순";
		p2.age = 21;
		p2.home = "서울";
		
		p1.introduce();
		//introduce(age2, name2, home2);
		p2.introduce();
		

	}
	
	

}

class Person{
	 String name; 
	 String home; 
	 int age;
	 
	 public void introduce() {
			System.out.println(home+"사는"+age+"살"+name+"입니다.");
		
		}
}
