package ddit.chap07.sec08;

public class AnimalExample {
	public static void main(String[] args) {
//		init(new Dog());
//		init(new Tiger());
//		init(new Sparrow("����"));
		Dog dog = new Dog();
//		dog.sound();
//		System.out.println(dog.kind); // ���޸𸮿� ������ ���� ������ �����ڸ� ���ؼ� ������ �ʱ�ȭ ��ų ���� �ִ�
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
