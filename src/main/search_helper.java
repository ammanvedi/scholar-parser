package main;

import java.io.IOException;

public class search_helper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			parser p = new parser("http://scholar.google.co.uk/scholar?hl=en&q=quantum+computing");
		} catch (IOException e) {
			System.out.println("FAILED");
			e.printStackTrace();
		}

	}

}
