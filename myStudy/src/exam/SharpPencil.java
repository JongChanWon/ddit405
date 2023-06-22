//package exam;
//
//public class SharpPencil {
//	private int width;
//	private int amount;
//
//	SharpPencil(int amount) {
//		this.amount = amount;
//	}
//
//	public int getAmount() {
//		return amount;
//	}
//
//	public void setAmount(int amount) {
//		this.amount = amount;
//	}
//}
//
//class Ballpen extends SharpPencil {
//
//	private String color;
//
//	Ballpen(int amount, String color) {
//		super(amount);
//		this.color = color;
//	}
//
//	public String getColor() {
//		return color;
//	}
//
//	public void setColor(String color) {
//		this.color = color;
//	}
//}
//
//class FountainPen extends Ballpen { // ∏∏≥‚« 
//
//	FountainPen(int amount, String color) {
//		super(amount, color);
//	}
//
//	public void refill(int n) {
//		setAmount(n);
//	}
//}
