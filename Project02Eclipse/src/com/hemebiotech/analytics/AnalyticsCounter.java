package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnalyticsCounter {

    // Method to read file
    public static List<String> readingFile() {
	// Instance of ReadSymptomDataFromFile class
	ReadSymptomDataFromFile readingFile = new ReadSymptomDataFromFile(
		"D:\\Dev\\Projet_2\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt");

	List<String> listOfSymptoms = readingFile.GetSymptoms();
	return listOfSymptoms;
    }

    // Method to sort list
    public static List<String> sortList(List<String> list) {
	Collections.sort(list);
	return list;
    }

    // Method to count by symptoms
    static HashMap<String, Integer> count(List<String> symptomList) {
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

    // Method to display Map into console
    static void displayMap(HashMap<String, Integer> map) {
	for (Map.Entry<String, Integer> entry : map.entrySet()) {
	    System.out.println(entry.getKey() + " = " + entry.getValue());
	}
    }

    // Method to write into file
    static void writeFile(HashMap<String, Integer> map) {
	try {
	    FileWriter writer = new FileWriter("result.out");

	    for (Map.Entry<String, Integer> entry : map.entrySet()) {
		writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
	    }

	    writer.close();
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    // Entry Point
    public static void main(String args[]) throws Exception {

	// Call Method readingFile and sortList
	List<String> listOfSymptoms = readingFile();
	List<String> sortedList = sortList(listOfSymptoms);
	HashMap<String, Integer> Map = count(sortedList);
	displayMap(Map);
	writeFile(Map);

    }

}
