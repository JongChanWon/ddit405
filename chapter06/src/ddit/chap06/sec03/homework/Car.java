package ddit.chap06.sec03.homework;

/*�䱸����1] �ڵ��� Ŭ������ �����Ͻÿ�.
�ڵ��� Ŭ������ ����(gas) �Ӽ��� ������ ������ �ܺο��� ������ �� ����.
����� �ʿ��� �� ������ �� ������ ���� ���Ḧ Ȯ���� �� �ִ� ����� ��ư�� �ִ�.
�ڵ����� ���ᰡ ���� ������ ������ �� �ְ� �����Ҷ����� ������ ���� ������ ���ҵǸ�
���ᰡ �������� ������ ������ �� ����.*/
public class Car {
	// ����, setter, ����� Ȯ���ϴ� �޼���
	Car car = new Car();
	private int gas;

	public void setGas(int gas) {
		this.gas = gas; // �޾ƿͼ� this.gas�� ����
	}

	public void gasQuantity(int gas) {
		car.setGas(10);
		if (gas <= 0) {
			System.out.println("�⸧�� ��� ���� ������ �� �����ϴ�.");
		} else {

			System.out.println("���ϴ�~~");
		}
	}

	public int gasStation() {

		return gas;
	}

}
