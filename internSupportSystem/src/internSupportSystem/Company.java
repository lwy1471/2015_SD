package internSupportSystem;

public class Company {
	
	//rlaudrl tlqkf
	private String company_name; // �����
	private String occupation; // ����
	private String company_introduction;// ȸ��Ұ�
	private String website; // Ȩ������ �ּ�
	private double funds; // �ڱ�
	
	//0,1,2,3,4 ���� ����
	// 0: ����, 1: ����, 2: ����, 3: �ڰ���, 4: ���ɺо� 
	private String[] model_Employee;
	
	private double score; // ����
	// private arraylist �����л�����Ʈ //���� �л� ����Ʈ

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
