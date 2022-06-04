package com.hemebiotech.analytics;

import java.util.Collections;
/**
 * This class is used to sort strings from a List
 */
import java.util.List;

/**
 * This class is used to sort a list of Strings and implements the
 * ISymptomSorter interface
 */
public class SortDataFromList implements ISymptomSorter {

    public SortDataFromList() {

    }

    /**
     * @param a List of Strings
     * @return a sorted listing of all Symptoms
     */
    @Override
    public List<String> sortListOfSymptoms(List<String> list) {

	Collections.sort(list);
	return list;
    }
}
