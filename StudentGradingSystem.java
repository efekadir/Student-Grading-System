public class StudentGradingSystem {
	public static void main(String[] args) {
		char[][][] studentsAnswers = {{{'A', 'A', 'A', 'E', 'A'}, {'A', 'B', 'D', 'E', 'A'}},
				{{'A', 'C', 'E', 'E', 'A'}, {'C', 'C', 'D', 'B', 'A'}},
				{{'A', 'A', 'A', 'A', 'A'}, {'A', 'C', 'E', 'E', 'A'}},
				{{'C', 'C', 'D', 'B', 'A'}, {'C', 'C', 'C', 'C', 'C'}}
		};
		grades(studentsAnswers);
	}
	static void grades(char[][][] studentsAnswers){
		int[][] grades = new int[studentsAnswers.length][studentsAnswers[0].length];
		char[][] key = {
				{'A', 'B', 'A', 'E', 'A'},
				{'C', 'D', 'A', 'B', 'E'}
			};
		for (int i = 0; i < studentsAnswers.length; i++) {
			for(int j = 0; j < studentsAnswers[i].length; j++) {
				for(int k = 0; k < studentsAnswers[i][j].length; k++) {
					if (studentsAnswers[i][j][k] == key[j][k]) {
						grades[i][j] += 20;
					}
				}
			}
		}
		for(int i = 0; i < grades.length; i++) {
            System.out.print("Student " + (i + 1) + " -> ");
            for(int j = 0; j < grades[i].length; j++) {
                System.out.print("Test " + (j + 1) + ": " + grades[i][j] + "   ");
            }
            System.out.println("");
        }
	}
}
