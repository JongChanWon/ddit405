package ddit.chap05.sec21;

public class Student {
	// �̸�, ����, ����
	// �������� ��ġ��
	private String name; // �� Ŭ���� ���ο����� ���� ����
	private int age;
	private boolean gender;

	// �Ű������� ���ؼ� Ŭ���� �ۿ��� �����;� �������� ������ �� �ִ� (Ŭ���� �ۿ��� ������ �ö�) - setter
	// ������ �������� ��ȯ���� �ʿ��� - getter
//	public Student(String name, int age, boolean gender) {
//		// ������ �޼���� ��������� �ʱ�ȭ �ϱ� ���� ���
//		// �Ķ���ͷ� ���� ����(��������)�� stack������ ��ġ��
//		// new�� �����Ҷ� ��� ��Ÿ���ٰ� ����� (������ �޼���) �׷��� this�� �Ἥ �Ȼ������..
//		// this: �ڱⰡ ���� Ŭ������ ��ġ�� => Ŭ���� �� ��𼭵� �� �� ����
//		this.name = name;
//		this.age = age;
//		this.gender = gender;
//	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean getGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

}
