package com.yi.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ProjectVO {
	private int no;
	private String name;
	private String content;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date regDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date endDate;
	private String progress;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) throws ParseException {

		this.regDate = new SimpleDateFormat("yyy-MM-dd").parse(regDate);
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) throws ParseException {
		this.endDate = new SimpleDateFormat("yyy-MM-dd").parse(endDate);
	}

	public String getProgress() {
		return progress;
	}

	public void setProgress(String progress) {
		this.progress = progress;
	}

	@Override
	public String toString() {
		return "ProjectVO [no=" + no + ", name=" + name + ", content=" + content + ", regDate=" + regDate + ", endDate="
				+ endDate + ", progress=" + progress + "]";
	}

}
