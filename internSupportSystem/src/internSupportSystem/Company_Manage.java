package internSupportSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Company_Manage {
	private ArrayList<Company> companyList;

	
	
	
	
	public void recruit_calendar()	{
		
		int listSize = 1000;
		
		String[][] schedule_array = new String[listSize][3];
		
		int count = 0;
		
		for (Company company : companyList) {
			
			if(company.getRecruit_notice() == null)
				continue;
			
			String temp_start_date = company.getRecruit_notice().getStart_date();
			String temp_final_date = company.getRecruit_notice().getFinal_date();
			String temp_company_name = company.getCompany_name();
			
			schedule_array[count][0] = temp_company_name;
			schedule_array[count][1] = temp_start_date;
			schedule_array[count++][2] = "0";
			
			schedule_array[count][0] = temp_company_name;
			schedule_array[count][1] = temp_final_date;
			schedule_array[count++][2] = "1";			
		}
	
		
		// 날짜별로 정렬
		Arrays.sort(schedule_array, new Comparator<String[]>() {
			public int compare(String[] arr1, String[] arr2)	{
				if ( ((Comparable)arr1[1]).compareTo(arr2[1]) < 0 )
					return 1;
				else
					return -1;
			}
		});
		
		
		
	}
	
	
	public ArrayList<Company> recommend_companyLIst()	{
	// 고치기.	
		ArrayList<Company> result=null;
			
		return result;
	}
	
	
	
	// Getter, Setter
	public ArrayList<Company> getCompanyList() {
		return companyList;
	}

	public void setCompanyList(ArrayList<Company> companyList) {
		this.companyList = companyList;
	}
	
	
	
}
