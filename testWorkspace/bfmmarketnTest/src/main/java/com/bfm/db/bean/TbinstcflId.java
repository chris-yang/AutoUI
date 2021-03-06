package com.bfm.db.bean;

// Generated 2015-12-8 13:28:50 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;

/**
 * TbinstcflId generated by hbm2java
 */
public class TbinstcflId implements java.io.Serializable {

	private String dealSerialNo;
	private BigDecimal legNo;
	private BigDecimal cflNo;
	private BigDecimal versionNo;

	public TbinstcflId() {
	}

	public TbinstcflId(String dealSerialNo, BigDecimal legNo, BigDecimal cflNo,
			BigDecimal versionNo) {
		this.dealSerialNo = dealSerialNo;
		this.legNo = legNo;
		this.cflNo = cflNo;
		this.versionNo = versionNo;
	}

	public String getDealSerialNo() {
		return this.dealSerialNo;
	}

	public void setDealSerialNo(String dealSerialNo) {
		this.dealSerialNo = dealSerialNo;
	}

	public BigDecimal getLegNo() {
		return this.legNo;
	}

	public void setLegNo(BigDecimal legNo) {
		this.legNo = legNo;
	}

	public BigDecimal getCflNo() {
		return this.cflNo;
	}

	public void setCflNo(BigDecimal cflNo) {
		this.cflNo = cflNo;
	}

	public BigDecimal getVersionNo() {
		return this.versionNo;
	}

	public void setVersionNo(BigDecimal versionNo) {
		this.versionNo = versionNo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TbinstcflId))
			return false;
		TbinstcflId castOther = (TbinstcflId) other;

		return ((this.getDealSerialNo() == castOther.getDealSerialNo()) || (this
				.getDealSerialNo() != null
				&& castOther.getDealSerialNo() != null && this
				.getDealSerialNo().equals(castOther.getDealSerialNo())))
				&& ((this.getLegNo() == castOther.getLegNo()) || (this
						.getLegNo() != null && castOther.getLegNo() != null && this
						.getLegNo().equals(castOther.getLegNo())))
				&& ((this.getCflNo() == castOther.getCflNo()) || (this
						.getCflNo() != null && castOther.getCflNo() != null && this
						.getCflNo().equals(castOther.getCflNo())))
				&& ((this.getVersionNo() == castOther.getVersionNo()) || (this
						.getVersionNo() != null
						&& castOther.getVersionNo() != null && this
						.getVersionNo().equals(castOther.getVersionNo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getDealSerialNo() == null ? 0 : this.getDealSerialNo()
						.hashCode());
		result = 37 * result
				+ (getLegNo() == null ? 0 : this.getLegNo().hashCode());
		result = 37 * result
				+ (getCflNo() == null ? 0 : this.getCflNo().hashCode());
		result = 37 * result
				+ (getVersionNo() == null ? 0 : this.getVersionNo().hashCode());
		return result;
	}

}
