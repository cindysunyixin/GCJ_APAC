import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;

class MinimumScalarProduct {
	public static void main(String[] args) throws  IOException {
		/**
		Input and write to a file
		**/
	FileInputStream fstream = new FileInputStream("/Users/yixinsun/Desktop/A-small-practice.in");
	BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
	PrintWriter pw = new PrintWriter(new FileWriter("outfile1.txt"));
	String line = null;
	while ((line = br.readLine()) != null) {
		String[] num = line.split(" ");
		System.out.println(num[0]);
		pw.write(line);
	}


	br.close();
    pw.close();


}



}
