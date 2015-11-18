package internSupportSystem;
import java.util.ArrayList;

public class Company_notice {

	private ArrayList<Company_notice_data> notice_list;
	
	public void notice_write(String date, String contents, String title, String writer)
	{
		Company_notice_data temp = new Company_notice_data();
		
		temp.setContents(contents);
		temp.setDate(date);
		temp.setTitle(title);
		temp.setWriter(writer);
		notice_list.add(temp);
	}
	public void notice_update(String date, String contents, String title, String writer, int num)
	{
		notice_list.get(num).setContents(contents);
		notice_list.get(num).setDate(date);
		notice_list.get(num).setTitle(title);
		notice_list.get(num).setWriter(writer);
	}
	public void notice_delete(int remove_num)
	{
		notice_list.remove(remove_num);
	}
	public ArrayList<Company_notice_data> list_view(int start_num, int count)
	{
		ArrayList<Company_notice_data> temp;
		
		temp = (ArrayList<Company_notice_data>) notice_list.subList(start_num,start_num+count);
		return temp;
	}
	public Company_notice_data notice_view(int num)
	{
		return notice_list.get(num);
	}	
}
