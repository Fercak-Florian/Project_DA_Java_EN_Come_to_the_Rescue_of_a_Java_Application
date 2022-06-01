package com.hemebiotech.analytics;

import java.util.Collections;
import java.util.List;

public class SortDataFromList implements ISymptomSorter {

    public SortDataFromList() {
    }

    @Override
    public List<String> sortListOfSymptoms(List<String> list) {

	Collections.sort(list);
	return list;
    }
}
