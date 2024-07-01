package com.example.basic;

import java.util.Scanner;

public class QuizView {
  // 질문을 출력하는 메서드
  public void displayQuestion(String question) {
    System.out.println("문제: " + question);
  }

  // 사용자로부터 답변을 입력받는 메서드
  public String getUserAnswer() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("답변: ");
    String answer = scanner.nextLine();
    scanner.close();
    return answer;
  }

  // 퀴즈 결과를 출력하는 메서드
  public void displayResult(boolean isCorrect) {
    if (isCorrect) {
      System.out.println("정답입니다!");
    } else {
      System.out.println("오답입니다.");
    }
  }
}
