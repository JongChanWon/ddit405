package ddit.chap07.sec02.homework;
/*����1]

�θ�Ŭ����- ���Ŭ����( Person )
	   	 �Ӽ�: �̸�(name), ����(age)
	   	 �޼���: ������ �� �̸��� ����ϴ� �޼���( getName() )

�ڽ�Ŭ����- �л�Ŭ����(Student)
	          �Ӽ�: ����(kor), ����(eng), ����(mat) ����
	          �޼���: ������, ������ ����� ���ϴ� �޼��� ( calculateScore() )
		 ����ǥ�� ����ϴ� �޼���( printScore() ) - �θ�Ŭ���� getName() ���*/

public class Person {
	String name;
	int age;

	Person() {
	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void getName() {
		System.out.println(name);
	}
}
