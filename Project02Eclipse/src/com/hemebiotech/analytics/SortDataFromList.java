package com.hemebiotech.analytics;

import java.util.Collections;
/**
 * This class is used to sort string from a List
 */
import java.util.List;

/**
 * This class is used to sort a list of String and implements the ISymptomSort
 * interface
 */
public class SortDataFromList implements ISymptomSort {

    public SortDataFromList() {

    }

    /**
     * This method is used to sort a list of String
     * 
     * @param a List of String
     * @return a sorted list of all Symptoms
     */
    @Override
    public List<String> sortListOfSymptoms(List<String> list) {

	Collections.sort(list);
	return list;
    }
}
