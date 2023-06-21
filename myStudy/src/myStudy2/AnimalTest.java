package myStudy2;

import java.util.ArrayList;

public class AnimalTest {
	public static void main(String[] args) {
//		Animal hAnimal = new Human();
//		Animal tAnimal = new Tiger();
//		Animal eAnimal = new Eagle();

		Human human = new Human();
		Tiger tiger = new Tiger();
		Eagle eagle = new Eagle();

//		if (tAnimal instanceof Tiger) {
//			// tAnimal.hunting(); // Animal객체에는 hunting 메서드가 없다 그래서 Tiger객체로 형변환 한 후에 가져와야한다
//			((Tiger) tAnimal).hunting();
//		}

		AnimalTest test = new AnimalTest(); // 객체 생성
//		test.moveAnimal(hAnimal); // 객체를 매개변수로,,
//		test.moveAnimal(tAnimal);
//		test.moveAnimal(eAnimal);

		test.moveAnimal(human);
		test.moveAnimal(eagle);
		test.moveAnimal(tiger);

		System.out.println("===================");

		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(human);
		animalList.add(tiger);
		animalList.add(eagle);

		for (Animal animal : animalList) {
			animal.move();
		}
	}

	public void moveAnimal(Animal animal) {
		animal.move();
	}

//	public void moveAnimal(Tiger tiger) {
//		tiger.move();
//	}
//
//	public void moveAnimal(Eagle eagle) {
//		eagle.move();
//	}
//
//	public void moveAnimal(Human human) {
//		human.move();
//	}
}
