package com.callor.score.mdel;

public class ScoreVO {
	
	private String num;
	private String mame;
	private String grade;
	private String dept;
	private String address;
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getMame() {
		return mame;
	}
	public void setMame(String mame) {
		this.mame = mame;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "ScoreVO [학번=" + num + ", 이름=" + mame + ", 학년=" + grade + ", 학과=" + dept + ", 주소=" + address
				+ "]";
	}
	
	

}
