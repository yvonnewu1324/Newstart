import java.util.ArrayList;

public class KeywordList {
	private ArrayList<Keyword> lst;

	public KeywordList(){
		this.lst = new ArrayList<Keyword>();
	}

	public void add(Keyword keyword){
		lst.add(keyword);
		System.out.println("Done");
	}

	public void find(String s){
		int maxValue = -1;
		int maxIndex = -1;
		for(int i=0; i<lst.size(); i++){
			int lcs = findLCS(lst.get(i).name, s);
			if(lcs > maxValue){
				maxValue = lcs;
				maxIndex = i;
			}
		}
		System.out.println(lst.get(maxIndex).toString());
	}

	public int findLCS(String x, String y){
		if (x.length() == 0 || y.length() == 0) {
			return 0;
		}
		/*
		      Just extracting what we certainly will need and being explicit
		 */
		String xWithoutFinalCharacter = x.substring(0, x.length() - 1);
		String yWithoutFinalCharacter = y.substring(0, y.length() - 1);

		char xFinalCharacter = x.charAt(x.length() - 1);
		char yFinalCharacter = y.charAt(y.length() - 1);

		if (xFinalCharacter == yFinalCharacter) {

			/*
		        No competition necessary. A match. The answer to THIS subproblem
		        is 1 PLUS the best answer to the subproblem without either of these
		        characters.
			 */

			return 1 + findLCS(xWithoutFinalCharacter, yWithoutFinalCharacter);

		} else {

			/*
		        Character mismatch. Compete subproblems, whoever wins becomes the answer to this
		        subproblem and is hence returned
			 */
			return Math.max(findLCS(x, yWithoutFinalCharacter),
					findLCS(xWithoutFinalCharacter, y));

		}

	}




private void printMatrix(int[][] matrix){
	for(int i=0; i<matrix.length; i++){
		for(int j=0; j<matrix[0].length; j++){
			System.out.print(matrix[i][j] + " ");
			if(j==matrix[0].length-1)System.out.print("\n");
		}
	}
}
}