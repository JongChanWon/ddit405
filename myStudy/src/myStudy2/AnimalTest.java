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
//			// tAnimal.hunting(); // Animal��ü���� hunting �޼��尡 ���� �׷��� Tiger��ü�� ����ȯ �� �Ŀ� �����;��Ѵ�
//			((Tiger) tAnimal).hunting();
//		}

		AnimalTest test = new AnimalTest(); // ��ü ����
//		test.moveAnimal(hAnimal); // ��ü�� �Ű�������,,
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
