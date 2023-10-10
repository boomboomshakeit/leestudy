package tut10;

import java.util.Scanner;

public class ArticleEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("게시물 개수 > ");
		int count = sc.nextInt();
		
		Article[] art = new Article[count]; //Article을 불러와 art 안에 넣는 것
		
		//set 입력
		for(int i = 0; i < art.length; i++) {
			art[i] = new Article(); //art라는 배열생성
			art[i].setNum((i+1));
			art[i].setSubject("계시물 테스트" + i);
			art[i].setVisit(art[i].getVisit() + 1);
			
			System.out.println((i + 1) + "번 게시물이 생성합니다.");
		}
		System.out.println(art.length + "게시물 등록이 완료 되었습니다.");
		
		System.out.println("------------------------------------");
		
		//get 출력
		
		for(Article a : art) {
			System.out.println(a.toString());
		}
		
		
		
		
		
		
		
		
		
	}

}
