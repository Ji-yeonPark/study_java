package chapter4;

public class Example4_3 {
    public static void main(String[] arg) {

        // 예제 4 - 3
        // 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.

        int sum = 0;
        int max_num = 10;
        for (int i = 1; i <= max_num; i++) {
            sum += i * (max_num - i + 1);

        }

        System.out.println(sum);
    }
}
