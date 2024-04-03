package classworkdayeleven.mapexample;

import java.util.Random;

public class SSN {
	private Long ssn;

	public SSN() {
		Random r = new Random();
		this.ssn =r.nextLong(100000000000l,999999999999l);
	}

	public Long getSsn() {
		return ssn;
	}

	public void setSsn(Long ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "SSN [ssn=" + ssn + "]";
	}
	
}
