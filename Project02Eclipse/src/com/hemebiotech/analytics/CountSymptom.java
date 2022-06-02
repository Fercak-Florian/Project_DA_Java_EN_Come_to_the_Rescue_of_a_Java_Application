package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * This class is used to count the number of each symptoms
 * 
 * @param an order List of symptoms
 * @return a TreeMap Key/Value containing Symptom/Number of symptoms
 */
public class CountSymptom implements ISymptomCounter {

    public CountSymptom() {

    }

    @Override
    public Map<String, Integer> getNumberOfSymptoms(List<String> symptomList) {

	TreeMap<String, Integer> mapOfSymptoms = new TreeMap<String, Integer>();

	if (symptomList.size() == 0) {

	} else {
	    String currentSymptom = symptomList.get(0);
	    int counter = 0;
	    for (String symptom : symptomList) {
		if (symptom.equals(currentSymptom)) {
		    counter += 1;
		} else {
		    mapOfSymptoms.put(currentSymptom, counter);
		    counter = 1;
		    currentSymptom = symptom;
		}
	    }
	    mapOfSymptoms.put(currentSymptom, counter);
	}
	return mapOfSymptoms;
    }
}
