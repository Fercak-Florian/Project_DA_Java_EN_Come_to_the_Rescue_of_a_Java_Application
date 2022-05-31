package com.hemebiotech.analytics;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class AnalyticsCounter {

    // Method to read file
    public List<String> readingFile() {
	// Instance of ReadSymptomDataFromFile class
	ReadSymptomDataFromFile readingFile = new ReadSymptomDataFromFile(
		"D:\\Dev\\Projet_2\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt");

	List<String> listOfSymptoms = readingFile.GetSymptoms();
	return listOfSymptoms;
    }

    // Method to sort list
    public List<String> sortList(List<String> list) {
	Collections.sort(list);
	return list;
    }

    // Method to count by symptoms
    HashMap<String, Integer> count(List<String> symptomList) {
	// Creating a Map to stock number of each symptom
	HashMap<String, Integer> mapOfSymptoms = new HashMap<String, Integer>();

	if (symptomList.size() == 0) {

	} else {
	    String currentSymptom = symptomList.get(0);
	    int counter = 0;
	    for (String symptom : symptomList) {
		if (symptom.equals(currentSymptom)) {
		    counter += 1;
		} else {
		    // A ranger dans map
		    mapOfSymptoms.put(currentSymptom, counter);
		    // System.out.println(currentSymptom + counter);
		    counter = 1;
		    currentSymptom = symptom;
		}
	    }
	    // Ranger le dernier symptom dans map
	    mapOfSymptoms.put(currentSymptom, counter);
	    // System.out.println(currentSymptom + counter);
	}

	return mapOfSymptoms;
    }

    // Method to write into file
    void writingFile(HashMap<String, Integer> map) {
	WriteSymptomDataToFile writingFile = new WriteSymptomDataToFile();
	writingFile.PutSymptoms(map);

    }

}
