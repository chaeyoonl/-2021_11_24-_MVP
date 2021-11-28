package com.example.mvp_test;

public class MainPresenter implements MainConstants.Presenter{
    MainConstants.View mainView;
    MainModel mainModel;
    public MainPresenter(MainConstants.View view) {
        mainView = view;
        mainModel = new MainModel(this);
    }
    @Override
    public void addNums(String input1, String input2) {
        mainView.showResult(Integer.parseInt(input1) + Integer.parseInt(input2));
    }
    @Override
    public void saveData(int data) {
        mainModel.saveData(data);
    }
}
