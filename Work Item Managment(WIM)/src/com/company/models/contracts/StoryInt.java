package com.company.models.contracts;

import com.company.classes.Member;
import com.company.common.Priority;
import com.company.common.Severity;
import com.company.common.Size;
import com.company.common.Status;

public interface StoryInt extends WorkItemsInt {
    Size getSize();

    Priority getPriority();
    Severity getSeverity();
    Member getAssignee();

}
