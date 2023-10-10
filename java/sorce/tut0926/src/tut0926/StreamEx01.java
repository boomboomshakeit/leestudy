package tut0926;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class StreamEx01 {

	public static void main(String[] args) throws IOException {
		
		/*
		 입출력
		 1. (1)byte : 텍스트, 파일, 이미지
		 	(1) OutputStream/InputStream
		 			쓰기			읽기
		 2. char : 텍스트 전용
		 
		 버퍼, 캐시 메모리(L1) => 속도 향상
		 
		 자료
		 버퍼 비움(flush)
		 close
		 
		 */
		
		//파일생성
		String filename = "koreait.txt";
		File f = new File("/Users/lth069389/Desktop/leetae/sorce/tut0926/" + filename); //준비
		
		//파일글쓰기 : OutputStream = FileOutputStream
		/*
		 * write();
		 * flush();
		 * close();
		 */
		OutputStream os = new FileOutputStream(f);
		os.write('k');
		os.write('o');
		os.write('r');
		os.write('e');
		os.write('a');
		os.write('i');
		os.write('t');
		os.flush();
		os.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
