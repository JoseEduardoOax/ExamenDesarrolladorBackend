package input;

import java.util.Scanner;

public class InputScanner implements HandleInput{

	private Scanner read;
	
	public InputScanner() {
		read = new Scanner(System.in);
	}
	
	public String inputString() {
		return read.nextLine();
	}

	@Override
	public int inputInt() {
		return Integer.parseInt(read.nextLine());
	}

	@Override
	public float inputFloat() {
		return Float.parseFloat(read.nextLine());
	}
	
	@Override
	public char inputChar() {
		return read.nextLine().charAt(0);
	}
}
