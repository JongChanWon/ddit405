package examanmal03;

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
//				System.out.println("������");
//			}
//			
//			@Override
//			void eat() {
//				System.out.println("�Ծ�");
//				
//			}
//			
//			@Override
//			void cry() {
//				System.out.println("���");
//				
//			}
//		};
//		ani.cry();
//		ani.eat();
//		ani.move();

		Animal[] animal = new Animal[] { new Dog(), new Cat() };

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
