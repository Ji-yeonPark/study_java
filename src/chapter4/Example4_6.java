package chapter4;

public class Example4_6 {
    public static void main(String[] arg) {

        // 예제 4 - 6
        // 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.

        for (int i = 1; i <= 6; i++) {
            if (6-i > 0){
                System.out.printf("%s, %s\n", i, (6 - i));
            }
        }
    }
}
