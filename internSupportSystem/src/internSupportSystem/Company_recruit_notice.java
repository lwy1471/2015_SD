package internSupportSystem;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Company_recruit_notice {
	
	private String title;
	private String writer;
	private String date;
	
	private String contents;
	private String start_date;
	private String final_date;
	
	
	
	// 생성자
	public Company_recruit_notice() {
		// TODO Auto-generated constructor stub
		
		date = new SimpleDateFormat("yyyy년 MM월 dd일 hh시").format(new Date());
	}
	
	
	// Getter, Setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		start_date = start_date;
	}

	public String getFinal_date() {
		return final_date;
	}

	public void setFinal_date(String final_date) {
		this.final_date = final_date;
	}

	
	
	
}
