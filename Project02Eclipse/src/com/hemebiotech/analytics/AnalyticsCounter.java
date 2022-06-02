package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter implements IAnalyticsCounter {

    AnalyticsCounter() {

    }

    @Override
    public void analyseSymptoms(String entryFileName, String outPutFileName) {

	List<String> list = readFile(entryFileName);
	List<String> sortedList = sortList(list);
	Map<String, Integer> map = count(sortedList);
	writeIntoFile(map, outPutFileName);
    }

    // Method to read symptoms
    public List<String> readFile(String inputFileName) {

	ISymptomReader readFile = new ReadSymptomDataFromFile(inputFileName);
	List<String> listOfSymptoms = readFile.getSymptoms();
	return listOfSymptoms;
    }

    // Method to sort symptoms
    public List<String> sortList(List<String> list) {
	ISymptomSorter sortedList = new SortDataFromList();
	return sortedList.sortListOfSymptoms(list);
    }

    // Method to count symptoms
    public Map<String, Integer> count(List<String> symptomList) {
	ISymptomCounter countSymptoms = new CountSymptom();
	return countSymptoms.getNumberOfSymptoms(symptomList);
    }

    // Method to write file
    void writeIntoFile(Map<String, Integer> map, String outPutFileName) {
	ISymptomWriter writeFile = new WriteSymptomDataToFile();
	writeFile.putSymptoms(map, outPutFileName);
    }
}
