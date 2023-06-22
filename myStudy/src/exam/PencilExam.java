package exam;

public class PencilExam {
	public static void main(String[] args) {
		Pencil pen = new Ballpen(10, "ÆÄ¶û");
		((Ballpen) pen).printPen();

		Pencil fountainPen = new FountainPen(20, "³ë¶û");
		((FountainPen) fountainPen).refill(20);

		Pencil sharpPencil = new SharpPencil(400, 500);
		((SharpPencil) sharpPencil).print();
	}
}
