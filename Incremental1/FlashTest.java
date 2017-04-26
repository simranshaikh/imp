package Incremental1;

import java.util.*;

public class FlashTest {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
Scanner sc1=new Scanner(System.in);
FlashCard[] FC=new FlashCard[3];
for (int i = 0; i < FC.length; i++) 
{
	System.out.println("Enter the Subject Name");
	String name=sc.next();
	FC[i]=new FlashCard();
	FC[i].setSubject(name);
	System.out.println("Enter the Question");
	String que=sc1.nextLine();
	FC[i].setQuestion(que);
	System.out.println("Enter the Answer");
	String ans=sc1.nextLine();
	FC[i].setAnswer(ans);
	System.out.println(FC[i].toString());
	
}

for (int i = 0; i < FC.length; i++) 
{
	Arrays.sort(FC);
System.out.println(FC[i].toString());
}

}
}
