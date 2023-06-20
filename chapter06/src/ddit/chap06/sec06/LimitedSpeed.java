package ddit.chap06.sec06;

public enum LimitedSpeed {
	SchoolZone(30), DownTown(50), CountrySide(60);

	private final int value;

	LimitedSpeed(int value) {
		this.value = value;
	}

	public int getValues() {

		return value;
	}
}
