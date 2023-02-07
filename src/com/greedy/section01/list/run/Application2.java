package com.greedy.section01.list.run;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.greedy.section01.list.comparator.AsendingPrice;
import com.greedy.section01.list.dto.BookDTO;

public class Application2 {

	public static void main(String[] args) {

		List<BookDTO> bookList = new ArrayList<>();
		
		bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
		bookList.add(new BookDTO(2, "목민심서", "정약용", 30000));
		bookList.add(new BookDTO(3, "동의보감", "허준", 40000));
		bookList.add(new BookDTO(4, "삼국사기", "김부식", 46000));
		bookList.add(new BookDTO(5, "삼국유사", "일연", 58000));
		
//		for(int i = 0; i < bookList.size(); i++) {
//			System.out.println(bookList.get(i));
//		}
//		for(BookDTO book : bookList) {
//			System.out.println(book);
//		}
		
		bookList.sort(new AsendingPrice());
		System.out.println("가격 오름차순 정렬===================");
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
		
		/* 익명클래스는 {}를 만들어서 마치 comparator 인터페이스를 상속 받은 클래스를 작성하는 것과 같이 사용 */
		bookList.sort(new Comparator<BookDTO>() {
			
			@Override
			public int compare(BookDTO o1, BookDTO o2){
				return o1.getPrice() >= o2.getPrice()? -1:1;
				
		
		    }
		});
		System.out.println("가격 순 내림차순 정렬=================");
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
		
		/* 제목 순 오름차순 정렬 */
		
		bookList.sort(new Comparator<BookDTO>() {

			@Override
			public int compare(BookDTO o1, BookDTO o2) {
				/* compareTo() : 앞의 값이 더 작은 경우 음수 반환,
				 * 같으면 0 반환, 앞의 값이 더 큰 경우 양수 반환 */
				return o1.getTitle().compareTo(o2.getTitle());
			}
		});
		
		System.out.println("제목 순 오름차순 정렬=======================");
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
		
		/* 제목 순 내림차순 정렬 */
		bookList.sort(new Comparator<BookDTO>() {

			@Override
			public int compare(BookDTO o1, BookDTO o2) {
				return o1.getTitle().compareTo(o2.getTitle()) * -1;
				
			}
		});
			
		System.out.println("제목 순 내림차순 정렬======================");
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
