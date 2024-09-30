package report_2;

import java.util.Random;
import java.util.Scanner;

public class GameBling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("엔터키 입력후 게임시작!");
            scanner.nextLine();

            int[] numbers = new int[3];
            for (int i = 0; i < 3; i++) {
                numbers[i] = random.nextInt(3);
            }

            System.out.println("생성된 숫자: " + numbers[0] + ", " + numbers[1] + ", " + numbers[2]);

            if (numbers[0] == numbers[1] && numbers[0] == numbers[2]) {
                System.out.println("성공! 대박입니다!");
            } else {
                System.out.println("계속하시겠습니까?");
            }
        }
    }
}
