package tut08;

import java.time.LocalDateTime;

class Borad {
	//필드
	private int num;
	private String subject;
	private String writer;
	private LocalDateTime regist = LocalDateTime.now(); // 지금 시간을 표시하는 방법
	
	//getter setter
	//userid
//	public void setSubject(String subject) {
//		this.subject = subject;
//	}
//	
//	//int num
//	public void setNum(int num) {
//		this.num = num;
//	}
//	
//	public int getNum() {
//		return num;
//	}
	
	//출력 메소드
	@Override
	public String toString() {
		return "게시판 [번호 : " + num + ", 게시글 제목 : " + subject + ", 작성자 : " + writer + ", 작서일 : " + regist + "]";
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public LocalDateTime getRegist() {
		return regist;
	}


}

public class BoardEx {

	public static void main(String[] args) {
		
		//번호 int, 제목 String, 작성자 String, 작성일 LocalDateTime
		
		Borad b1 = new Borad();
		b1.setNum(1);
		b1.setSubject("코리아아카데미");
		b1.setWriter("이태훈");
		
		System.out.println("----------출력----------");
//		System.out.println(b1.getNum());
//		System.out.println(b1.getSubject());
//		System.out.println(b1.getWriter());
//		System.out.println(b1.getRegist());
		System.out.println(b1.toString()); //한번에 출력하는 방법
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
