package org.simpleflatmapper.beans;

import com.datastax.driver.mapping.annotations.Column;
import com.datastax.driver.mapping.annotations.PartitionKey;
import com.datastax.driver.mapping.annotations.Table;

@Table(keyspace = "testsfm", name = "test_table_16")
 public class Object16Fields {
	@PartitionKey
	private long id;

	@Column(name = "year_started")
	private int yearStarted;
	private String name;
	private String email;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public int getYearStarted() {
		return yearStarted;
	}
	public void setYearStarted(int yearStarted) {
		this.yearStarted = yearStarted;
	}


	private int field5;
	private int field6;
	private long field7;
	private float field8;
	private double field9;

	private int field10;
	private int field11;
	private long field12;
	private float field13;
	private double field14;

	private int field15;
	private int field16;


	public int getField5() {
		return field5;
	}

	public void setField5(int field5) {
		this.field5 = field5;
	}

	public int getField6() {
		return field6;
	}

	public void setField6(int field6) {
		this.field6 = field6;
	}

	public long getField7() {
		return field7;
	}

	public void setField7(long field7) {
		this.field7 = field7;
	}

	public float getField8() {
		return field8;
	}

	public void setField8(float field8) {
		this.field8 = field8;
	}

	public double getField9() {
		return field9;
	}

	public void setField9(double field9) {
		this.field9 = field9;
	}

	public int getField10() {
		return field10;
	}

	public void setField10(int field10) {
		this.field10 = field10;
	}

	public int getField11() {
		return field11;
	}

	public void setField11(int field11) {
		this.field11 = field11;
	}

	public long getField12() {
		return field12;
	}

	public void setField12(long field12) {
		this.field12 = field12;
	}

	public float getField13() {
		return field13;
	}

	public void setField13(float field13) {
		this.field13 = field13;
	}

	public double getField14() {
		return field14;
	}

	public void setField14(double field14) {
		this.field14 = field14;
	}

	public int getField15() {
		return field15;
	}

	public void setField15(int field15) {
		this.field15 = field15;
	}

	public int getField16() {
		return field16;
	}

	public void setField16(int field16) {
		this.field16 = field16;
	}

	@Override
	public String toString() {
		return "Object16Fields{" +
				"id=" + id +
				", yearStarted=" + yearStarted +
				", name='" + name + '\'' +
				", email='" + email + '\'' +
				", field5=" + field5 +
				", field6=" + field6 +
				", field7=" + field7 +
				", field8=" + field8 +
				", field9=" + field9 +
				", field10=" + field10 +
				", field11=" + field11 +
				", field12=" + field12 +
				", field13=" + field13 +
				", field14=" + field14 +
				", field15=" + field15 +
				", field16=" + field16 +
				'}';
	}
}
