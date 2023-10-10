package tut0926;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class StreamEx03 {

	public static void main(String[] args) throws IOException {
		
		//k o r e a i t    -1 return
		String filename = "/Users/lth069389/Desktop/leetae/sorce/tut0926/koreait.txt";
		InputStream is = new FileInputStream(filename); //파일 내용을 읽어
		
		//is.read();  1byte 씩 읽어오는 것, 실제 처리는 4byte
		/*
		while(true) {
			int result = is.read(); //글자를 byte로 읽어오지만 정수로 처리
			if(result == -1) //더 이상 출력할 글자가 없으면 -1 return
				break;
			System.out.println((char)result);
			System.out.println("남은 byte(s)는 : " + is.available() + "입니다.");
		}
		*/
		
		int data = 0;
		while((data = is.read()) != -1) {
			System.out.print(data + " > ");
			System.out.println((char)data);
		}
		is.close();
		
	}

}
