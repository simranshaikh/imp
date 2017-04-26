package Incremental1;

import java.util.Scanner;

public class FlashCardTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		FlashCardData fcd=new FlashCardData();
	for (int i = 0; i < fcd.FC.length; i++) 
	{
	    System.out.println("Enter the Subject");
	   String s=sc.next();
	   fcd.FC[i]=new FlashCard();
	   fcd.FC[i].setSubject(s);
	   System.out.println("Enter the Question");
		String que=sc1.nextLine();
		fcd.FC[i].setQuestion(que);
		System.out.println("Enter the Answer");
		String ans=sc1.nextLine();
		fcd.FC[i].setAnswer(ans);
		
	}
	
		System.out.println("Enter the Subject to Search");
		String st=sc.next();
		fcd.searchCard(st);
	}

}
