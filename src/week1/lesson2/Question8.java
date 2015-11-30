package week1.lesson2;

public class Question8 {
	public static void main(String[] args) {
		char[][] studentsScoreCards = {
				{ 'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D' },
				{ 'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D' },
				{ 'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D' },
				{ 'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' } };
		char[] correctAns = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };
		
		int studentIndex = 0;
		for (char[] stdScores :studentsScoreCards ){
			int individualStdtScore=0;
			for (int i= 0 ; i < stdScores.length ; i++){
				if(stdScores[i]==correctAns[i]) individualStdtScore++;
			}
			System.out.printf("\nScore for Student %d is :%d",studentIndex,individualStdtScore);
			studentIndex++;
		}
	}
}
