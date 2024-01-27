public class Solution_01 {
    public static String solution(String myString, String pat) {
        String answer = "";

        // 나의 풀이
        int patLength = pat.length();
        int myStringLength = myString.length();

        for (int i=myStringLength-1; i>=0; i--) {
            String substr = myString.substring(0, i+1); // substring(int beginIndex, int endIndex) -> beginIndex 위치에서 endIndex 전 위치까지 값 리턴
            if (substr.endsWith(pat)) { // boolean endsWith(String suffix) -> 어떤 문자열이 suffix라는 문자열로 끝나는지를 확인 -> 맞다면 true
                answer = substr;
            }
        }

        /*
        // 다른 사람의 풀이
        int idx = myString.lastIndexOf(pat); // lastIndexOf() -> 파라미터로 전달받은 문자열을 원본 문자열의 뒤에서부터 탐색하여, 처음으로 파라미터의 문자열이 나오는 index를 리턴
        answer = myString.substring(0, idx) + pat;
        */


        return answer;
    }
}
