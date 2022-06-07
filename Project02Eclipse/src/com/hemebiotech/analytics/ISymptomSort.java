package com.hemebiotech.analytics;

import java.util.List;

/**
 * Any List String will be sorted by alphabetical order
 */
public interface ISymptomSort {
    /**
     * @param a List of String
     * @return a sorted List.
     */
    List<String> sortListOfSymptoms(List<String> list);
}
