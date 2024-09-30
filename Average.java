package report_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> positiveNumbers = new ArrayList<>();
        int sum = 0;

        System.out.print("양의 정수를 입력하세요. -1은 입력 끝>> ");

        while (true) {
            String input = scanner.next();
            
            try {
                double value = Double.parseDouble(input);

                if ((int) value == -1) {
                    break;
                }

                if (value > 0 && value == (int) value) {
                    positiveNumbers.add((int) value);
                    sum += (int) value;
                } else {
                    System.out.println(value + " 제외");
                }
            } catch (NumberFormatException e) {
                System.out.println(input + " 제외");
            }
        }

        if (positiveNumbers.size() > 0) {
            double average = (double) sum / positiveNumbers.size();
            System.out.printf("평균은 %.0f 입니다.\n", average);
        } else {
            System.out.println("입력된 양수가 없습니다.");
        }

        scanner.close();
    }
}