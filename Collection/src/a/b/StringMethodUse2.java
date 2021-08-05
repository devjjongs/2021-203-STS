package a.b;

import java.util.StringTokenizer;

public class StringMethodUse2 {

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
		
		// 2), 3)
		String str1="abc:de:fff:ggg";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		int index = url.indexOf('@'); //'@'가 있는 자리의 위치 번호 -> 17
		System.out.println(index);
		
		//@ 다음 부터 문자를 리턴
		int urlLength = url.length();
		String returnNewString = url.substring(index+1, url.length()-3);
		// index부터 출력하므로, @ 다음부터 문자를 출력하고 싶다면 +1을 하면 됨	
		// , 뒤에 url.길이-3을 해줬으므로, 뒤에서부터 3자리를 제외하고 출력
		System.out.println(returnNewString);
		
	}
}
