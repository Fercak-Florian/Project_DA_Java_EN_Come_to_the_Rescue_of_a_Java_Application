package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class AnalyticsCounter implements IAnalyticsCounter {

    AnalyticsCounter() {

    }

    @Override
    public void analyseSymptoms() {
	// TODO Auto-generated method stub
    }

    // Method to read symptoms
    public List<String> readFile() {

	ISymptomReader readFile = new ReadSymptomDataFromFile("Project02Eclipse\\symptoms.txt");
	List<String> listOfSymptoms = readFile.getSymptoms();
	return listOfSymptoms;
    }

    // Method to sort symptoms
    public List<String> sortList(List<String> list) {
	ISymptomSorter sortedList = new SortDataFromList();
	return sortedList.sortListOfSymptoms(list);
    }

    // Method to count symptoms
    TreeMap<String, Integer> count(List<String> symptomList) {
	ISymptomCounter countSymptoms = new CountSymptom();
	return countSymptoms.getNumberOfSymptoms(symptomList);
    }

    // Method to write file
    void writeIntoFile(TreeMap<String, Integer> map) {
	ISymptomWriter writeFile = new WriteSymptomDataToFile();
	writeFile.putSymptoms(map);
    }
}
