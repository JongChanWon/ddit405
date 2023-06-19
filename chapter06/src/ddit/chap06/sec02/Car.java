package ddit.chap06.sec02;

public class Car {
	private String company;
	private boolean isAuto;

	Car() {
		// ������ �־ �⺻�����ڰ� �ȴ�
		// �⺻�������� ������ �迭������ �ٸ��� �Ű������� ������ �ٸ��� �Ű����� Ÿ���� �ٸ��� overloading�� ��
		// overload = �پ��� �����͸� ����ϱ� ���� ���
		// this���� �ڹٿ��� �����ϴ� Ư���� ��������

		// this() -> ������ �޼����� ù��° ���� �̾�� �Ѵ�. �ٸ� ������ �޼��带 ȣ���Ҷ� ����
		// �ڵ��� �ߺ��� ���� �� �ִ�.
		company = "����";
		isAuto = false;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setAuto(boolean isAuto) {
		this.isAuto = isAuto;
	}

	public void carInfo() {
		System.out.println("����ȸ��: " + company);
		System.out.print("���Ÿ��: ");

		if (isAuto) {
			System.out.println("Autometic");
		} else {
			System.out.println("manual");
		}
	}

} // �� ���� �ѱ�GM(������) ����ũ �������Դϴ�. �������� ��� �ھҰ��, �����ϴٰ� ���㿡�ٰ� �ܾ �ð��, �����ϴٰ� ��� ������
	// �Ĺھұ���, �� �����ϴٰ� ���� ���� �� ��¦ ���� �޾Ҿ��.
// ���ݱ��� ���� ������� �����ô뿴���ϴ�.
