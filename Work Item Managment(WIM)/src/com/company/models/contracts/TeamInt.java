package com.company.models.contracts;

import com.company.classes.Board;
import com.company.classes.Member;

public interface TeamInt {
    String getName();
    Member getMember();
    Board getBoard();
    String toString();

}
