package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;

public class CountSymptom implements ISymptomCounter {

    public CountSymptom() {

    }

    @Override
    public HashMap<String, Integer> getNumberOfSymptoms(List<String> symptomList) {

	HashMap<String, Integer> mapOfSymptoms = new HashMap<String, Integer>();

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
