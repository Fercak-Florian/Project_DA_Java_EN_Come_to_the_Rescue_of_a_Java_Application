package com.hemebiotech.analytics;

import java.util.Collections;
/**
 * This class is used to sort strings from a List
 */
import java.util.List;

public class SortDataFromList implements ISymptomSorter {
    /**
     * @param a List of String
     * @return a sorted listing of all Symptoms obtained from a data source.
     */

    public SortDataFromList() {

    }

    @Override
    public List<String> sortListOfSymptoms(List<String> list) {

	Collections.sort(list);
	return list;
    }
}
