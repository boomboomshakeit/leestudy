package tut0926;

import java.io.File;

public class IOEx01 {

	public static void main(String[] args) {
		/*
		//사원가입(이미지), 게시판(이미지, 첨부파일) : 오늘 첨부파일
		//입사일 : 년월일 폴더
		
		try {
			//구현 코드
			String file = "/Users/lth069389/Desktop/leetae/sorce/tut0926/koreait.txt";
			File makeFile = new File(file);
			makeFile.createNewFile();
			
		}catch(Exception e) {// 여러 개 작성 가능
			e.printStackTrace();
			System.out.println("파일 생성에 예외가 발생했습니다.");
		}finally {//생략가능
			
		}
		
		//파일 생성
		String file = "/Users/lth069389/Desktop/leetae/sorce/tut0926/koreait.txt";
		File makeFile = new File(file);
		*/
		
		
		//파일이 존재하는지 확인 후
		//파일을 생성하였습니다. or 존재합니다. => exists() - boolean
		
		try {
			//String filename = "/Users/lth069389/Desktop/leetae/sorce/tut0926/koreait.txt";
			
			String filename = "/Users/lth069389/Desktop/leetae/sorce/tut0926/koreait.txt";
			File file = new File("/Users" + File.separator + "lth069389" + File.separator + "Desktop/leetae/sorce/tut0926/koreait.txt"); // 만들준비 - 이렇게도 사용가능
			//File file = new File(file); 이렇게 사용
			
			//File.separator - 운영체제에 맞춰 자동으로 맞춰주는 것
			if(!file.exists()) {
				//만드는 코드
				boolean result = file.createNewFile();
				if(result)
					System.out.println("파일이 생성되었습니다.");
			}else {
				System.out.println("파일이 이미 존재합니다.");
			}
			System.out.println(file.getAbsolutePath()); //파일의 절대경로 가져오기
			
			//작업(이클립스) 위치 출력
			System.out.println(System.getProperty("user.dir"));
			
		}catch(Exception e) { //최사위 예외 Exception
			//e.printStackTrace(); 빨간색 글자 띄우는 방법
			System.out.println("파일생성에 오류가 있습니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
