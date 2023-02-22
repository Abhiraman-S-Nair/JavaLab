package LabExam;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCpy {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader("input.txt");
			
			FileWriter fw= new FileWriter("Output.txt");
			
			String str = "";
			
			int i;
			
			while((i=fr.read())!=-1)
			{
				str+=(char)i;
			}
			
			fw.write(str);
			fr.close();
			fw.close();
			
		}
		catch(IOException e) {
			System.out.println("Exception rasied");
		}

	}
}
