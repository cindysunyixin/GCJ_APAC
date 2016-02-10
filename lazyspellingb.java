import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;
import java.lang.*;

class lazyspellingb {
	public static void main(String[] args) throws IOException {
		/**
		Input and write to a file
		**/
	FileInputStream fstream = new FileInputStream("/Users/yixinsun/Desktop/A-small-attempt4.in");
	BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
	PrintWriter pw = new PrintWriter(new FileWriter("outfile1.txt"));
	String line = " ";
    int j = 0;
	while ( (line = br.readLine()) != null) {
		int ol = line.length();
		String[] letter = new String[ol];
		int result = 1;
		for (int i = 0; i < ol; i++) {
			if (i != 0 && i != ol) {
				if (letter[i] != letter[i+1]) {
				result *= 3;
			}
			}
		}
		int reresult = result %  1000000007;
        System.out.println("Case #" +j +": " + reresult);
		j += 1;

	}




	br.close();
    pw.close();


}



}
