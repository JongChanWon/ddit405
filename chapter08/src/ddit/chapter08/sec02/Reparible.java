package ddit.chapter08.sec02;

public interface Reparible {

}

class Unit {
	int hitPoint;
	final int MAX_HP;

	Unit(int hp) {
		MAX_HP = hp;
	}
}

class GroundUnit extends Unit {

	GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Unit {

	AirUnit(int hp) {
		super(hp);
	}
}

class DropShip extends AirUnit implements Reparible {

	DropShip() {
		super(200);
	}

	@Override
	public String toString() {
		return "DROPSHIP";
	}
}

class Tank extends GroundUnit implements Reparible {

	Tank() {
		super(150);
	}

	@Override
	public String toString() {
		return "TANK";
	}
}

class SCV extends GroundUnit implements Reparible {

	SCV() {
		super(50);
	}

	@Override
	public String toString() {
		return "SCV";
	}

	public void repair(Reparible r) {
		
		System.out.println("===========");
		System.out.println(r);
		System.out.println("===========");
		
		
		// Unit class를 상속 받았으니까 Unit class객체
		if (r instanceof Unit) { // Down Casting
			Unit u = (Unit) r;
			while (u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u + "의 수리가 완료 되었습니다");
		}
	}
}

class Marine extends GroundUnit {

	Marine() {
		super(100);

	}

	@Override
	public String toString() {
		return "MARINE";
	}
}
