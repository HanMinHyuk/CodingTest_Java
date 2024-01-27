public class Solution_04 {
    public static int[] solution(String myString) {
        // 내 풀이
        String[] arrMyStr = myString.split("x", myString.length()); // split(a,b) -> a를 기준으로 문자열을 분리해줌. b는 제한을 거는 것인데 안쓰면 제한 없이 가는 것이고
        int[] answer = new int[arrMyStr.length];                          // b가 만약에 2이면 2번째부터 분리안하고 쭉 나열함. 맨 마지막꺼도 하고 싶다면 숫자를 크게 하면 됌.

        for (int i=0; i<arrMyStr.length; i++) {
            answer[i] = arrMyStr[i].length();
        }

        /*
        // 다른 사람의 풀이
        return Arrays.stream(myString.split("x", myString.length()))
                     .mapToInt(x -> x.length())
                     .toArray();

        // 자바 스트림 : https://wakestand.tistory.com/419
        */



        return answer;
    }
}
