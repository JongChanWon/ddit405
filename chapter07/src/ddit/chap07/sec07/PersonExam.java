package ddit.chap07.sec07;

public class PersonExam {
	public static void main(String[] args) {
		Person p = new Dancer(10);
		p.speak();
		// p.dance(); 부모클래스를 불러오기 때문에 자식클래스 매서드는 불러올 수 없다
		((Dancer) p).dance(); // 그래서 down casting 해줘야함
	}
}
