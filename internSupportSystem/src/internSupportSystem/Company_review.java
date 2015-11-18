package internSupportSystem;



import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Company_review {
	
	String member; // member or non-member check

	List<String[]> reviewList; // review list array
	int sequence; // review list sequence
	
	Scanner textTemporary; // text temporary
	
	public Company_review() { // Constructor 
		this.textTemporary = new Scanner(System.in);
	}
	
	public void read() { // read me
		System.out.println("1. Write a review.\n2. Update a review\n3. Delete a review.\n4. View a list.\n5. Exit.\nInput number.");
	}
	
	public String getText() {
		return this.textTemporary.next();
	}
	
	private String[] getSearch(String no) {
		for (String[] review : this.reviewList) {
			if (review != null && review[0].equals(no)) {
				return review;			
			}
		}
		return null;
	}
	
	public void viewReview(String no) { // view a review (choose)
		if (no == null || no == "") {
			System.out.println("Invalid value.\n");
			return;
		}
	
		String[] review = this.getSearch(no);
		
		if (review == null) {
			System.out.println("There is no review.\n");
			return;
		}
		
		System.out.println("no: " + review[0]);
		System.out.println("subject: " + review[1]);
		System.out.println("content: " + review[2]);
	}
	
	public void write() { // write a review
			String no = String.valueOf(sequence);
			
			System.out.println("Input subject.");
			String subject = getText();

			System.out.println("Input content.");
			String content = getText();
			
			System.out.println("Input WorkSalary rate. ( 1 ~ 5 )");
			int rateWorkSalary = textTemporary.nextInt();
			
			System.out.println("Input WorkMood rate. ( 1 ~ 5 )");
			int rateWorkMood = textTemporary.nextInt();
			
			System.out.println("Input rateWorkStrength rate. ( 1 ~ 5 )");
			int rateWorkStrength = textTemporary.nextInt();
			
			System.out.println("Input rateWorkEnviron rate. ( 1 ~ 5 )");
			int rateWorkEnviron = textTemporary.nextInt();
			
			System.out.println("Input rateWorkWelfare rate. ( 1 ~ 5 )");
			int rateWorkWelfare = textTemporary.nextInt();
			
			String[] review = new String[3];
			review[0] = no;
			review[1] = subject;
			review[2] = content;
			review[3] = String.valueOf(rateWorkSalary);
			review[4] = String.valueOf(rateWorkMood);
			review[5] = String.valueOf(rateWorkStrength);
			review[6] = String.valueOf(rateWorkEnviron);
			review[7] = String.valueOf(rateWorkWelfare);
			
			this.reviewList.add(review);
			this.sequence++;

			System.out.println("Write Complete.\n");
	} 
	
	public void update(String no) { // update a review
			if (no == null || no == "") {
				System.out.println("Invalid value.\n");
				return;
			}
			
			String[] review = this.getSearch(no);
			
			System.out.println("Input subject.");
			String subject = this.getText();

			System.out.println("Input content");
			String content = this.getText();
			
			System.out.println("Input WorkSalary rate. ( 1 ~ 5 )");
			int rateWorkSalary = textTemporary.nextInt();
			
			System.out.println("Input WorkMood rate. ( 1 ~ 5 )");
			int rateWorkMood = textTemporary.nextInt();
			
			System.out.println("Input rateWorkStrength rate. ( 1 ~ 5 )");
			int rateWorkStrength = textTemporary.nextInt();
			
			System.out.println("Input rateWorkEnviron rate. ( 1 ~ 5 )");
			int rateWorkEnviron = textTemporary.nextInt();
			
			System.out.println("Input rateWorkWelfare rate. ( 1 ~ 5 )");
			int rateWorkWelfare = textTemporary.nextInt();

			review[1] = subject;
			review[2] = content;
			review[3] = String.valueOf(rateWorkSalary);
			review[4] = String.valueOf(rateWorkMood);
			review[5] = String.valueOf(rateWorkStrength);
			review[6] = String.valueOf(rateWorkEnviron);
			review[7] = String.valueOf(rateWorkWelfare);

			System.out.println("Update complete.\n");
	} 
	
	public void delete(String no) { // delete a review
			String[] review = this.getSearch(no);
		
			if (review == null) {
				System.out.println("There is no review.\n");
				return;
			}
			
			this.reviewList.remove(review);
	
			System.out.println("Delete complete.\n");
	}
	
	public void viewReviewList() { // view review list
		for (String[] review : this.reviewList) {
			if (review != null) {
				System.out.println("No : " + review[0]);
				System.out.println("Subject : " + review[1]);
				System.out.println("Content : " + review[2]);
				System.out.println("WorkSalary rate : " + review[3]);
				System.out.println("WorkMood rate : " + review[4]);
				System.out.println("WorkStrength rate : " + review[5]);
				System.out.println("WorkEnviron rate : " + review[6]);
				System.out.println("WorkWelfare rate : " + review[7]);
				System.out.println("Average rate : " + (Integer.parseInt(review[3] + review[4] + review[5] + review[6] + review[7])) / 5);
			}
		}
	}

	public void exit() { // exit
		System.out.println("Exit review.\n");
	}

	public static void main(String[] args) {
		Company_review review = new Company_review(); 

		while ( true ) {
			review.read();		

			String choice = review.getText();

			if ( choice.equals("1") ) {
				review.write();
			} else if ( choice.equals("2") ) {
				System.out.println("Input writing number.");
				review.update(review.getText());
			} else if ( choice.equals("3") ) {
				System.out.println("Input writing number.");
				review.delete(review.getText());
			} else if ( choice.equals("4") ) {
				review.viewReviewList();
			} else if ( choice.equals("5") ) {
				review.exit();
				break;
			} else {
				System.out.println("Invalid value.\nPlease try again.");
			}
	    }   
	  }
}