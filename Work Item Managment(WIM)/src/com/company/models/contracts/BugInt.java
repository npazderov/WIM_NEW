package com.company.models.contracts;

import com.company.classes.Member;
import com.company.common.Priority;
import com.company.common.Severity;
import com.company.common.Status;

import java.util.List;

public interface BugInt extends WorkItemsInt {
    List<String> getStepsToReproduce();
    Priority getPriority();
    Severity getSeverity();
    Member getAssignee();
}
