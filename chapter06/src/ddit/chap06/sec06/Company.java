package ddit.chap06.sec06;

public enum Company {
	SK("��������"), LG("����"), KT("����Ƽ"), SAMSUNG("�Ｚ"), APPLE("����");

	private final String values;

	Company(String values) {
		this.values = values;
	}

	public String getValue() {
		return values;
	}
}
