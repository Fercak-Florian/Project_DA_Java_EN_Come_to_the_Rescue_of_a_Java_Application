package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * This class contains necessary methods to analyze an input file and implements
 * the IAnalyticsCounter Interface
 */
public class AnalyticsCounter implements IAnalyticsCounter {

    private String inputFile;
    private String outputFile;

    AnalyticsCounter(String inputFile, String outputFile) {
	this.inputFile = inputFile;
	this.outputFile = outputFile;
    }

    @Override
    public void analyseSymptoms() {

	List<String> list = readFile(inputFile);
	List<String> sortedList = sortList(list);
	Map<String, Integer> map = count(sortedList);
	writeIntoFile(map, outputFile);
    }

    public List<String> readFile(String inputFileName) {
	ISymptomReader readFile = new ReadSymptomDataFromFile(inputFileName);
	return readFile.getSymptoms();
    }

    public List<String> sortList(List<String> list) {
	ISymptomSorter sortedList = new SortDataFromList();
	return sortedList.sortListOfSymptoms(list);
    }

    public Map<String, Integer> count(List<String> symptomList) {
	ISymptomCounter countSymptoms = new CountSymptom();
	return countSymptoms.getNumberOfSymptoms(symptomList);
    }

    void writeIntoFile(Map<String, Integer> map, String outPutFileName) {
	ISymptomWriter writeFile = new WriteSymptomDataToFile();
	writeFile.putSymptoms(map, outPutFileName);
    }
}
