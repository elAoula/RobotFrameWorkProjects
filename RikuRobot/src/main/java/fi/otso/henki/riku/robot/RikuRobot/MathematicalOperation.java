package fi.otso.henki.riku.robot.RikuRobot;

public class MathematicalOperation {
	
	
	public int squareroot(int x) {
		return x*x;
	}
	
	public int numberOfCharachtersInAString(String word) {
		int count =0;
		for(int i=0; i< word.length(); i ++) {
			if(word.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println("Word is: " + word + "The total count is: " + count);
		return count;
	}

}
