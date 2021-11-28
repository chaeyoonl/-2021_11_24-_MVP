package com.example.mvp_test;

public class MainModel {
    MainConstants.Presenter presenter;
    public MainModel(MainConstants.Presenter presenter) {
        this.presenter = presenter;
    }
    //Presenter에서 데이터 저장시 호출
    //자세한 저장로직 생략
    public void saveData(String data) {

        //Todo..Savecata
    }
}
