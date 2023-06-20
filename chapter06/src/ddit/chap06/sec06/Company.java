package ddit.chap06.sec06;

public enum Company {
	SK("에스케이"), LG("엘지"), KT("케이티"), SAMSUNG("삼성"), APPLE("애플");

	private final String values;

	Company(String values) {
		this.values = values;
	}

	public String getValue() {
		return values;
	}
}
