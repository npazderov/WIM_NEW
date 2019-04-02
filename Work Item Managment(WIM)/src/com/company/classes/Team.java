package com.company.classes;

import com.company.models.contracts.TeamInt;

public class Team implements TeamInt {
    private String name;
    private Member member;
    private Board board;

    public Team(String name, Member member, Board board) {
        setName(name);
        setMember(member);
        setBoard(board);
    }
    @Override
    public String getName() {
        return name;
    }

    private void setName(String name) {
        if(name==null)
        {
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.name = name;
    }
    @Override
    public Member getMember() {
        return member;
    }

    private void setMember(Member member) {
        this.member = member;
    }
    @Override
    public Board getBoard() {
        return board;
    }

    private void setBoard(Board board) {
        this.board = board;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
