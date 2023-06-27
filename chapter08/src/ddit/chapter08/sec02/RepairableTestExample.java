package ddit.chapter08.sec02;

public class RepairableTestExample {
	public static void main(String[] args) {
		Tank tank = new Tank();

		SCV scv = new SCV();
		System.out.println(tank.MAX_HP);
		tank.hitPoint = 30;
		System.out.println(tank.MAX_HP);
		
		scv.repair(tank);

		
		try {
			scv.repair(scv);
			scv.repair(tank);
			scv.repair((Reparible) new Marine());
			scv.repair(new DropShip());
				
		} catch (ClassCastException cc) {
			cc.getMessage();
			System.out.println("ÄÉ½ºÆ® ÀÍ¼Á¼Ç");
		} catch (RuntimeException r) {
			r.fillInStackTrace();
			System.out.println("runtime");
		}finally {
			System.out.println("²ô¼¼¿ä");
		}

	}
}
