package ddit.chap06.sec01;

public class StudentVO {
	long stdId;
	String stdName;
	String subject;

	public StudentVO() {
	}

	public StudentVO(long stdId, String stdName, String subject) {
		this.stdId = stdId;
		this.stdName = stdName;
		this.subject = subject;
	}

	public long getStdId() {
		return stdId;
	}

	public void setStdId(long stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", subject=" + subject + "]";
	}
}
