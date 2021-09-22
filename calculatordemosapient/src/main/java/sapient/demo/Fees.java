package sapient.demo;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Fees {

	@Id
	@Column
	private long national_id;

	@Column
	private long fees;

	public long getNational_id() {
		return national_id;
	}

	public void setNational_id(long natinal_id) {
		this.national_id = natinal_id;
	}

	public long getFees() {
		return fees;
	}

	public void setFees(long fees) {
		this.fees = fees;
	}

}
