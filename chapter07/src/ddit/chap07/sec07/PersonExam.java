package ddit.chap07.sec07;

public class PersonExam {
	public static void main(String[] args) {
		Person p = new Dancer(10);
		p.speak();
		// p.dance(); �θ�Ŭ������ �ҷ����� ������ �ڽ�Ŭ���� �ż���� �ҷ��� �� ����
		((Dancer) p).dance(); // �׷��� down casting �������
	}
}
