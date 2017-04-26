package Incremental1;

public class FlashCardData implements CardSearchable {

	FlashCard[] FC=new FlashCard[3];
	
	@Override
	public Card searchCard(String sub) {
		for (int i = 0; i < FC.length; i++)
		if (FC[i].getSubject().equals(sub))
		{
			System.out.println("FlashCard [subject=" + FC[i].getSubject() + ", question=" + FC[i].getQuestion()
					+ ", answer=" + FC[i].getAnswer() + "]");
		}
		return null;
	}

}
