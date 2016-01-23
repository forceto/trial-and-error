package chapter7;

import java.io.File;
import java.util.Scanner;

public class ScannerKeyBoardTest {
	public ScannerKeyBoardTest(){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			System.out.println(sc.nextLine());
		}
	}
}
