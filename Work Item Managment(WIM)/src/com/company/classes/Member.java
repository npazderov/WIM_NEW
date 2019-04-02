package com.company.classes;

import com.company.models.contracts.MemberInt;

import java.util.List;

public class Member extends BoardMemberBase implements MemberInt {
    private final static int MIN_NAME_LENGTH=5;
    private final static int MAX_NAME_LENGTH=10;
    public Member(String name, List<WorkItems> workItemsList, String activityHistory) {
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
