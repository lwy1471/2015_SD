package internSupportSystem;

public class Company {
	
	//rlaudrl tlqkf
	private String company_name; // 기업명
	private String occupation; // 직종
	private String company_introduction;// 회사소개
	private String website; // 홈페이지 주소
	private double funds; // 자금
	
	//0,1,2,3,4 각각 정함
	// 0: 전공, 1: 학점, 2: 어학, 3: 자격증, 4: 관심분야 
	private String[] model_Employee;
	
	private double score; // 별점
	// private arraylist 관심학생리스트 //관심 학생 리스트

	private Company_recruit_notice recruit_notice;

	
	
	
	public Company_recruit_notice getRecruit_notice() {
		return recruit_notice;
	}

	public void setRecruit_notice(Company_recruit_notice recruit_notice) {
		this.recruit_notice = recruit_notice;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getCompany_introduction() {
		return company_introduction;
	}

	public void setCompany_introduction(String company_introduction) {
		this.company_introduction = company_introduction;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public double getFunds() {
		return funds;
	}

	public void setFunds(double funds) {
		this.funds = funds;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
}
