package com.chainsys.sample;

import java.io.FileWriter;
import java.nio.file.Files;
import java.util.Scanner;

public class files {

	public static void main(String[] args)throws Exception {
//		Files file = new Files();
//		file.createFile(null, null)
		FileWriter w = new FileWriter("D:\\demo1.txt", true);
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		for(int i=0; i<5; i+=1)
		{
			w.write(i);
			
		}
		System.out.println("Completed");
		w.close();
		
	}
}
