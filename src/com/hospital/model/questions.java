package com.hospital.model;

public class questions {
	
	private int queID;
	private String que;
	private String ans1;
	private String ans2;
	private String ans3;
	private String ans4;
	private String ans5;
	public questions(int queID, String que, String ans1, String ans2, String ans3, String ans4, String ans5) {
		super();
		this.queID = queID;
		this.que = que;
		this.ans1 = ans1;
		this.ans2 = ans2;
		this.ans3 = ans3;
		this.ans4 = ans4;
		this.ans5 = ans5;
	}
	public int getQueID() {
		return queID;
	}
	public String getQue() {
		return que;
	}
	public String getAns1() {
		return ans1;
	}
	public String getAns2() {
		return ans2;
	}
	public String getAns3() {
		return ans3;
	}
	public String getAns4() {
		return ans4;
	}
	public String getAns5() {
		return ans5;
	}
	public void setQueID(int queID) {
		this.queID = queID;
	}
	public void setQue(String que) {
		this.que = que;
	}
	public void setAns1(String ans1) {
		this.ans1 = ans1;
	}
	public void setAns2(String ans2) {
		this.ans2 = ans2;
	}
	public void setAns3(String ans3) {
		this.ans3 = ans3;
	}
	public void setAns4(String ans4) {
		this.ans4 = ans4;
	}
	public void setAns5(String ans5) {
		this.ans5 = ans5;
	}
}
