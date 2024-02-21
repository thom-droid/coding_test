package ps.programmers.skillcheck;

/**
 * 문제 설명
대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요. \
'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.

예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.

제한사항
문자열 s의 길이 : 50 이하의 자연수
문자열 s는 알파벳으로만 이루어져 있습니다.
 * 
 * @author ps.programmers
 *
 */
public class Test1 {

	static boolean solution(String s) {
		
		//1 먼저 받은 스트링을 upper든 lower로 변경
		String loweredStr = s.toLowerCase();
		
		//2 p와 y를 각각 추출하여 값을 담음
		int pCount = 0;
		int yCount = 0;
		int len = loweredStr.length();
		int i = 0;
		
		boolean answer = true;
		
		while(i<len) {
			if(loweredStr.charAt(i)=='p') {
				pCount++;
			}
			if(loweredStr.charAt(i)=='y') {
				yCount++;
			}
			i++;
		}
		
		if(pCount!=yCount) {
			answer = false;
			return answer;
		} 
		
		return answer;
		
	}
}
