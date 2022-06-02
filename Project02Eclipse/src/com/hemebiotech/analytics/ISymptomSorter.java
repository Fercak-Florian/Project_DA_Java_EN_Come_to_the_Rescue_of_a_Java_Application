package com.hemebiotech.analytics;

import java.util.List;

/**
 * Any List string will be sorted by alphabetical order
 */
public interface ISymptomSorter {
    /**
     * @param a List of String
     * @return a sorted listing of all Symptoms obtained from a list.
     */
    List<String> sortListOfSymptoms(List<String> list);
}
