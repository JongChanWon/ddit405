package ddit.chap05.sec21;

// @15db9742 16������ ǥ���Ǿ��� �ּ� (@��)
public class StudentExample {
	public static void main(String[] args) {
		Student sc = new Student();
		int sc1 = sc.getAge();
		String name = sc.getName();
		System.out.println(name);
		boolean flag = sc.getGender();
		System.out.println(flag);

//		Student[] st = new Student[28];
//		st[0] = new Student("�ɿ��", 30, false); //�ʱ�ȭ ��Ű�鼭 ��ü�迭
//		Student[] st = { new Student("�ɿ��", 30, false), new Student("�̻��", 27, false), new Student("������", 25, true),
//				new Student("������", 26, false) }; // 5���� ��ü�迭
	}
}