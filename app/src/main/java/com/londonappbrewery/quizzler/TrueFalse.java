package com.londonappbrewery.quizzler;

public class TrueFalse {
    public int getnQuestionID() {
        return nQuestionID;
    }

    public void setnQuestionID(int nQuestionID) {
        this.nQuestionID = nQuestionID;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }

    private int nQuestionID;
    private boolean mAnswer;

    public TrueFalse(int questionResourceID, boolean trueOrFalse) {
        nQuestionID = questionResourceID;
        mAnswer = trueOrFalse;


    }







}
