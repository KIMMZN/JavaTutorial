package _Test_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("단어를 입력하시오");
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			
			
			System.out.println(str);
			System.out.println("숫자를 입력하시오");
			int intnum = Integer.parseInt(br.readLine());
			System.out.println(intnum);
			
		}catch(Exception e) {
			e.getStackTrace();
		}
		
		/*
		try {
			File file = new File("Output.txt");
			FileWriter writer = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			bufferedWriter.write(" i love you \n i like you");
			bufferedWriter.write(" my test");
			bufferedWriter.flush();
			bufferedWriter.close();
		} catch (Exception e) {
	            e.getStackTrace();
		}
		*/
	}

}
