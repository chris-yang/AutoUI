package com.bfm.db.bean;

// Generated 2015-12-8 13:28:50 by Hibernate Tools 3.4.0.CR1

/**
 * TbinstructionstockId generated by hbm2java
 */
public class TbinstructionstockId implements java.io.Serializable {

	private String dailyInstructionNo;
	private int indexDailyModify;

	public TbinstructionstockId() {
	}

	public TbinstructionstockId(String dailyInstructionNo,
			int indexDailyModify) {
		this.dailyInstructionNo = dailyInstructionNo;
		this.indexDailyModify = indexDailyModify;
	}

	public String getDailyInstructionNo() {
		return this.dailyInstructionNo;
	}

	public void setDailyInstructionNo(String dailyInstructionNo) {
		this.dailyInstructionNo = dailyInstructionNo;
	}

	public int getIndexDailyModify() {
		return this.indexDailyModify;
	}

	public void setIndexDailyModify(int indexDailyModify) {
		this.indexDailyModify = indexDailyModify;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TbinstructionstockId))
			return false;
		TbinstructionstockId castOther = (TbinstructionstockId) other;

		return ((this.getDailyInstructionNo() == castOther
				.getDailyInstructionNo()) || (this.getDailyInstructionNo() != null
				&& castOther.getDailyInstructionNo() != null && this
				.getDailyInstructionNo().equals(
						castOther.getDailyInstructionNo())))
				&& ((this.getIndexDailyModify() == castOther
						.getIndexDailyModify()) || (this.getIndexDailyModify() != 0
						&& castOther.getIndexDailyModify() != 0 && this
						.getIndexDailyModify() == castOther.getIndexDailyModify()));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getDailyInstructionNo() == null ? 0 : this
						.getDailyInstructionNo().hashCode());
		result = 37
				* result
				+ (getIndexDailyModify() == 0 ? 0 : this.getIndexDailyModify());
		return result;
	}

}