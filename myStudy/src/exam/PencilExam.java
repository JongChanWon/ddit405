package exam;

public class PencilExam {
	public static void main(String[] args) {
		Pencil pen = new Ballpen(10, "�Ķ�");
		((Ballpen) pen).printPen();

		Pencil fountainPen = new FountainPen(20, "���");
		((FountainPen) fountainPen).refill(20);

		Pencil sharpPencil = new SharpPencil(400, 500);
		((SharpPencil) sharpPencil).print();
	}
}
