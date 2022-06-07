package sample10;

import java.util.Arrays;

public class work3 {
	public static void main(String[] args) {

		// 다음 암호표로 문자열을 암호화하고 다시 복호화한 결과를 출력하라.

		// 암호표
		// 알파벳
		char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '|', '[',
				']', '{', '}', ';', ':', ',', '.', '/' };
		// 숫자
		char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };

		String src = "abc123";
		String result = ""; // = `~!qwe

		// 암호화 코드
		for (int i = 0; i < src.length(); i++) {
			int asc = (int) src.charAt(i);

			// 숫자인 경우
			if (asc >= 48 && asc <= 57) {
				result += numCode[asc - 48];
			} else if (asc >= 97 && asc <= 122) { // 알파벳인 경우
				result += abcCode[asc - 97];
			}
		}
		System.out.println(result);

		// 복호화
		String baseCode = "";

		// 복호화 코드
		for (int i = 0; i < result.length(); i++) {
			int dec = (int) result.charAt(i);
			char c = result.charAt(i);
//			int idx = Arrays.asList(result).indexOf(c);
			int idx = 0;

			// 알파벳 -> 숫자 복호화
			if (dec >= 97 && dec <= 122) {
				for(int j=0;j<numCode.length;j++) {
					if(numCode[j]==c) {
						baseCode+=j+"";
					}
				}
			} else { // 특수부호 -> 영어복호화
				for(int j=0;j<abcCode.length;j++) {
					if(abcCode[j]==c) {
						baseCode+=(char)(j+97);
					}
				}
			}

		}
		System.out.println(baseCode);

	}

}
