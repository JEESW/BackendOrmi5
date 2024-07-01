package com.example.basic;

public class Quiz {
    private String question;  // 퀴즈의 질문을 저장하는 변수
    private String answer;    // 퀴즈의 정답을 저장하는 변수

    // 생성자: 질문과 정답을 받아서 초기화합니다.
    public Quiz(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    // 질문을 반환하는 getter 메서드
    public String getQuestion() {
        return question;
    }

    // 정답을 반환하는 getter 메서드
    public String getAnswer() {
        return answer;
    }
}