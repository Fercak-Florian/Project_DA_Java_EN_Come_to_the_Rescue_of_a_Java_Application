package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * This class contains necessary methods to analyze an input file and implements
 * the IAnalyticsCounter Interface
 */
public class AnalyticsCounter implements IAnalyticsCounter {

    private String outputFile;

    AnalyticsCounter(String outputFile) {
	this.outputFile = outputFile;
    }

    @Override
    public void analyseSymptoms() {
	String path = chooseFile();
	List<String> list = readFile(path);
	List<String> sortedList = sortList(list);
	Map<String, Integer> map = count(sortedList);
	String exitFile = writeIntoFile(map, outputFile);
	openFile(exitFile);
    }

    public String chooseFile() {
	ChooseAFileToRead chooseFile = new ChooseAFileToRead();
	return chooseFile.chooseAFile();
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

    String writeIntoFile(Map<String, Integer> map, String outPutFileName) {
	ISymptomWriter writeFile = new WriteSymptomDataToFile();
	return writeFile.putSymptoms(map, outPutFileName);
    }

    public void openFile(String outPutFileName) {
	OpenResultsFile openResults = new OpenResultsFile();
	openResults.openFile(outPutFileName);
    }
}
