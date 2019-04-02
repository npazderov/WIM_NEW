package com.company.classes;

import com.company.models.contracts.BoardInt;

import java.util.List;

public class Board extends BoardMemberBase implements BoardInt {
    private final static int MIN_NAME_LENGTH=5;
    private final static int MAX_NAME_LENGTH=10;
    public Board(String name, List<WorkItems> workItemsList, String activityHistory) {
        super(name, workItemsList, activityHistory);
    }

    @Override
    protected int getMinNameLength() {
        return MIN_NAME_LENGTH;
    }
    @Override
    protected int getMaxNameLength(){
        return MAX_NAME_LENGTH;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
