package com.example.basic;

public class QuizController {
  private Quiz quiz;       // Model 객체
  private QuizView view;   // View 객체

  // 생성자: Model과 View 객체를 받아서 초기화합니다.
  public QuizController(Quiz quiz, QuizView view) {
    this.quiz = quiz;
    this.view = view;
  }

  // 퀴즈를 시작하고 진행하는 메서드
  public void startQuiz() {
    // View를 통해 질문을 출력합니다.
    view.displayQuestion(quiz.getQuestion());

    // View를 통해 사용자의 답변을 받습니다.
    String userAnswer = view.getUserAnswer();

    // 사용자의 답변과 정답을 비교하여 결과를 판단합니다.
    boolean isCorrect = checkAnswer(userAnswer);

    // View를 통해 결과를 출력합니다.
    view.displayResult(isCorrect);
  }

  // 사용자의 답변과 정답을 비교하는 메서드
  private boolean checkAnswer(String userAnswer) {
    // 대소문자 구분 없이 비교하기 위해 equalsIgnoreCase() 메서드를 사용합니다.
    return userAnswer.equalsIgnoreCase(quiz.getAnswer());
  }
}
