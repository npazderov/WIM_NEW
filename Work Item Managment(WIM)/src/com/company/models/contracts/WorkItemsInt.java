package com.company.models.contracts;

import com.company.common.Status;

import java.util.List;

public interface WorkItemsInt  {
    int getID();
    String getTitle();
    String getDescription();
    Status getStatus();
    List<String> getComments();
    List<String> getHistory();
    String toString();

}
