package a.b;

import java.util.StringTokenizer;

public class StringMethodUse5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * - 1) : 을 중심으로 조각 내서 "abc" "df " "rrr" "uuu" String 배열로 받기
		 * - 2) f의 위치가 어디인지 index번호로 알아오기
		 * - 3) f의 뒷부분을 받아서 처리하기 예) 강남구 역삼동 123-1 일 때 구를 제외한 동만 가져와서 쓰는 법
		 * - 4) String str2 = "강남구 역삼동 123-1"; 일 떄 "역삼동"이라는 문자열을 가지고 있는지?
		 * - 5) "<html ~~~~~~" 처음 시작이 < 인지 true / false ?
		 * - 6) "kim" "KIM" "kIM" ⇒ 대소문자 구별하지 않고 동일한 값으로 인식하게 하는 것
		 * - 7) 전부 소문자로 받기
		 */
		
		// 6)
		String str1="kim";
		if (str1.equalsIgnoreCase("kIm")) {
			System.out.println("같은 데이터");
		}else {
			System.out.println("다른 데이터");
		}

		////////
		if (str1.equals("kIm".toLowerCase())) {
			System.out.println("같은 데이터");
		}else {
			System.out.println("다른 데이터");
		}
		
		////////
		if (str1.equals("kIm".toLowerCase())) {
			System.out.println("같은 데이터");
		}else {
			System.out.println("다른 데이터");
		}
		
	}
}
