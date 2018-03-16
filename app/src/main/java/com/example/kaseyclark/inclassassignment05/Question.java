package com.example.kaseyclark.inclassassignment05;

/**
 * Created by kaseyclark on 2/19/18.
 */

public class Question {
    private String statement;
   private boolean isStatementTrue;

    public String getStatement() {
        return statement;
    }

    public boolean isStatementTrue(){
        return isStatementTrue;
    }

    public Question(String statement, boolean isStatementTrue) {
        this.statement = statement;
        this.isStatementTrue = isStatementTrue;

    }

}

