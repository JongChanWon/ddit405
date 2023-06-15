package ddit.chap05.sec21;

// @15db9742 16진수로 표현되어진 주소 (@뒤)
public class StudentExample {
	public static void main(String[] args) {
		Student sc = new Student();
		int sc1 = sc.getAge();
		String name = sc.getName();
		System.out.println(name);
		boolean flag = sc.getGender();
		System.out.println(flag);

//		Student[] st = new Student[28];
//		st[0] = new Student("심우식", 30, false); //초기화 시키면서 객체배열
//		Student[] st = { new Student("심우식", 30, false), new Student("이상민", 27, false), new Student("전유빈", 25, true),
//				new Student("지윤서", 26, false) }; // 5명의 객체배열
	}
}