package com.hemebiotech.analytics;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class AnalyticsCounter {

    public List<String> readFile() {

	ISymptomReader readFile = new ReadSymptomDataFromFile(
		"D:\\Dev\\Projet_2\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt");

	List<String> listOfSymptoms = readFile.getSymptoms();
	return listOfSymptoms;
    }

    public List<String> sortList(List<String> list) {
	Collections.sort(list);
	return list;
    }

    HashMap<String, Integer> count(List<String> symptomList) {

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

    void writeIntoFile(HashMap<String, Integer> map) {
	ISymptomWriter writeFile = new WriteSymptomDataToFile();
	writeFile.putSymptoms(map);
    }
}
