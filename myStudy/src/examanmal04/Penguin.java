package examanmal04;

public class Penguin extends Bird {
	@Override
	void eat() {
		System.out.println("ÆØ±Ï °°ÀÌ ¸Ô´Â´Ù");
	}

	@Override
	void cry() {
		System.out.println("ÆØ±Ï ¼Ò¸®¸¦ ³½´Ù");
	}

	@Override
	void move() {
		System.out.println("ÆØ±Ï °°ÀÌ ¿òÁ÷ÀÎ´Ù");
	}

	void onlyForPenguin() {
		System.out.println("ÆØ±Ï ±â´É");
	}
}
