package a.b;

import java.util.StringTokenizer;

public class StringMethodUse {

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
		
		// 1)
		String str1="abc:de:fff:ggg";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String []str1s = str1.split(":"); // : 를 기준으로 나눔
//		String []str1s = str1.split(""); // 글자 하나 씩 자름
//		String []str1s = str1.split(" "); // 공백을 기준으로 나눔
		System.out.println(str1s.length);
		
		for (int i = 0; i < str1s.length; i++) {
			System.out.println(i+" 번째 데이터" + str1s[i]);
		}
		
		StringTokenizer tokenizer = new StringTokenizer(url,":");
	      int count = tokenizer.countTokens();
	      String [] str1Arr = new String[count];
	      int i =0;
	      while(tokenizer.hasMoreTokens()) {
	         str1Arr[i++] = tokenizer.nextToken();
	      }
	      
	      for( int i2 =0 ; i2<  str1Arr.length  ;  i2++) {
	         System.out.println(i2+"번째 데이터 "+ str1Arr[i2]);
	      }
	}
}
