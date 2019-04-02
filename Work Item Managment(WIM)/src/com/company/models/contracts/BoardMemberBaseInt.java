package com.company.models.contracts;

import com.company.classes.WorkItems;

import java.util.List;

public interface BoardMemberBaseInt {
    String getName();
    List<WorkItems> getWorkItemsList();
    String getActivityHistory();

    String toString();
}
