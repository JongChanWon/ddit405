package examanmal04;

public class Main {
	public static void main(String[] args) {
//		Dog dog = new Dog();
//		dog.eat();
//		dog.cry();
//		dog.move();
//		dog.onlyForDog();
//
//		Cat cat = new Cat();
//		cat.eat();
//		cat.cry();
//		cat.move();
//		cat.onlyForCat();

//		Animal ani = new Animal() {
//			
//			@Override
//			void move() {
//				System.out.println("움직여");
//			}
//			
//			@Override
//			void eat() {
//				System.out.println("먹어");
//				
//			}
//			
//			@Override
//			void cry() {
//				System.out.println("울어");
//				
//			}
//		};
//		ani.cry();
//		ani.eat();
//		ani.move();
		// has ~ a : 서로 관계는 없는데 참조를 해야할때는 has a 관계
		// is ~ a : 상속관계.. ex) dog is a Animal
		Dog dog = new Dog();
		Cat cat = new Cat();
		Whale whale = new Whale();
		Shark shark = new Shark();
		Penguin penguin = new Penguin();
		Eagle eagle = new Eagle();

		// 포유류
		Mammalia[] mam = new Mammalia[] { dog, cat, whale };

		// 어류
		Fish fish = shark;

		// 조류
		Bird[] bird = new Bird[] { penguin, eagle };

		Animal[] animal = new Animal[] { new Dog(), new Cat(), whale, shark, penguin, eagle };

		for (int i = 0; i < animal.length; i++) {
			animal[i].eat();
			animal[i].cry();
			animal[i].move();
			if (animal[i] instanceof Dog) {
				Dog tmp = (Dog) animal[i];
				tmp.onlyForDog();
				System.out.println();
			} else if (animal[i] instanceof Cat) {
				Cat tmp = (Cat) animal[i];
				tmp.onlyForCat();
			}

		}
	}
}
