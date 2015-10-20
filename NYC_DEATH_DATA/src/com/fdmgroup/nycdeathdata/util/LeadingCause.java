package com.fdmgroup.nycdeathdata.util;

public class LeadingCause {
	private int year;
	private String ethnicity;
	private Sex sex;
	private String causeOfDeath;
	private int count;
	private double percentage;
	
	
	public LeadingCause(int year, String ethnicity, Sex sex,
			String causeOfDeath, int count, double percentage) {
		super();
		this.year = year;
		this.ethnicity = ethnicity;
		this.sex = sex;
		this.causeOfDeath = causeOfDeath;
		this.count = count;
		this.percentage = percentage;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getEthnicity() {
		return ethnicity;
	}

	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public String getCauseOfDeath() {
		return causeOfDeath;
	}

	public void setCauseOfDeath(String causeOfDeath) {
		this.causeOfDeath = causeOfDeath;
	}


	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((causeOfDeath == null) ? 0 : causeOfDeath.hashCode());
		result = prime * result + count;
		result = prime * result
				+ ((ethnicity == null) ? 0 : ethnicity.hashCode());
		long temp;
		temp = Double.doubleToLongBits(percentage);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LeadingCause other = (LeadingCause) obj;
		if (causeOfDeath == null) {
			if (other.causeOfDeath != null)
				return false;
		} else if (!causeOfDeath.equals(other.causeOfDeath))
			return false;
		if (count != other.count)
			return false;
		if (ethnicity == null) {
			if (other.ethnicity != null)
				return false;
		} else if (!ethnicity.equals(other.ethnicity))
			return false;
		if (Double.doubleToLongBits(percentage) != Double
				.doubleToLongBits(other.percentage))
			return false;
		if (sex != other.sex)
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	
	

}
