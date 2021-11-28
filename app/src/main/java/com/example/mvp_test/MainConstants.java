package com.example.mvp_test;

public class MainConstants {
    interface View {
        void showResult(int result);    //View에 계산한 결과를 표시
    }

    interface Presenter {
        void addNums(String input1, String input2);   //View에서 입력한 두 수에 대한 덧셈

        void saveData(String data);    //데이터 저장
    }
}
