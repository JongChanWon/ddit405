package ddit.chap07.sec08;

public class AnimalExample {
	public static void main(String[] args) {
//		init(new Dog());
//		init(new Tiger());
//		init(new Sparrow("조류"));
		Dog dog = new Dog();
//		dog.sound();
//		System.out.println(dog.kind); // 힙메모리에 생성될 수는 없지만 생성자를 통해서 변수를 초기화 시킬 수는 있다
		Tiger tiger = new Tiger();
		Animal[] animal = new Animal[] {
				dog, tiger
		};
		
		for(int i = 0; i < animal.length; i++) {
			animal[i].sound();
			animal[i].breathe();
		}
		
	}
	
	public static void init(Animal ani) {
		ani.sound();
	}
}
