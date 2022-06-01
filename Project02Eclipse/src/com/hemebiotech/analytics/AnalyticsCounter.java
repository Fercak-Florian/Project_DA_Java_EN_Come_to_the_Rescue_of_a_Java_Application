package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;

public class AnalyticsCounter {

    // Method to read symptoms
    public List<String> readFile() {

	ISymptomReader readFile = new ReadSymptomDataFromFile(
		"D:\\Dev\\Projet_2\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt");

	List<String> listOfSymptoms = readFile.getSymptoms();
	return listOfSymptoms;
    }

    // Method to sort symptoms
    public List<String> sortList(List<String> list) {
	ISymptomSorter sortedList = new SortDataFromList();
	return sortedList.sortListOfSymptoms(list);
    }

    // Method to count symptoms
    HashMap<String, Integer> count(List<String> symptomList) {
	ISymptomCounter countSymptoms = new CountSymptom();
	return countSymptoms.getNumberOfSymptoms(symptomList);
    }

    // Method to write file
    void writeIntoFile(HashMap<String, Integer> map) {
	ISymptomWriter writeFile = new WriteSymptomDataToFile();
	writeFile.putSymptoms(map);
    }

}
