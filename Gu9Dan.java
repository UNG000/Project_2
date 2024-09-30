package report_2;

import java.util.Random;
import java.util.Scanner;

public class Gu9Dan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int wrongAnswers = 0;

        while (wrongAnswers < 3) {
            int num1 = random.nextInt(9) + 1;
            int num2 = random.nextInt(9) + 1;
            int correctAnswer = num1 * num2;

            System.out.printf("%d * %d = ?\n", num1, num2);

            System.out.print("답을 입력하세요: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("정답입니다. 잘했어요~");
            } else {
                System.out.println("틀렸습니다. 정답은 " + correctAnswer + "입니다.");
                wrongAnswers++;
            }

            if (wrongAnswers >= 3) {
                System.out.println("3번 틀렸습니다. 퀴즈를 종료합니다.");
                break;
            }
        }

        scanner.close();
    }
}
