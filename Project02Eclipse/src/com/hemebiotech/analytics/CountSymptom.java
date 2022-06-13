package com.hemebiotech.analytics;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * This class is used to count the number of each symptoms and implements the
 * ISymptomCounter interface
 */
public class CountSymptom implements ISymptomCounter {

    public CountSymptom() {

    }

    /**
     * This method is used to count the number of each symptoms
     * 
     * @param an order List of symptoms
     * @return a Map containing symptom : Number of symptoms
     */
    @Override
    public Map<String, Integer> getNumberOfSymptoms(List<String> symptomList) {

	TreeMap<String, Integer> mapOfSymptoms = new TreeMap<String, Integer>();

	for (String symptom : symptomList) {
	    if (mapOfSymptoms.containsKey(symptom)) {

	    } else {
		int number = Collections.frequency(symptomList, symptom);
		mapOfSymptoms.put(symptom, number);
	    }
	}
	return mapOfSymptoms;
    }
}
