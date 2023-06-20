package ddit.chap06.sec06;

public class EnumExample {
	public static void main(String[] args) {
		for (Company company : Company.values()) {
			System.out.print(company.getValue());
		}

		System.out.println();
		System.out.println(Company.APPLE.getValue());
		System.out.println(Company.APPLE.ordinal());
		System.out.println(Company.values());

	}
}
