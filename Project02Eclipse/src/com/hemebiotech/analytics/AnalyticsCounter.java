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

    /**
     * This method contains necessary methods to analyze an input file and open a
     * results file on desktop
     */
    @Override
    public void analyseSymptoms() {
	String path = chooseFile();
	List<String> list = readFile(path);
	List<String> sortedList = sortList(list);
	Map<String, Integer> map = count(sortedList);
	String exitFile = writeIntoFile(map, outputFile);
	openFile(exitFile);
    }

    /**
     * This method allows users to choose a file to read through a dialog box
     * 
     * @return a file path
     */
    @Override
    public String chooseFile() {
	ChooseAFileToRead chooseFile = new ChooseAFileToRead();
	return chooseFile.chooseAFile();
    }

    /**
     * This method is used to read lines from a file
     * 
     * @param an input file name
     * @return an ArrayList containing all the String from file
     */
    @Override
    public List<String> readFile(String inputFileName) {
	ISymptomReader readFile = new ReadSymptomDataFromFile(inputFileName);
	return readFile.getSymptoms();
    }

    /**
     * This method is used sort a file
     * 
     * @param a List of String
     * @return a sorted list of all Symptoms
     */
    @Override
    public List<String> sortList(List<String> list) {
	ISymptomSort sortedList = new SortDataFromList();
	return sortedList.sortListOfSymptoms(list);
    }

    /**
     * This method is used to count the number of each symptoms
     * 
     * @param an order List of symptoms
     * @return a Map containing symptom : Number of symptoms
     */
    @Override
    public Map<String, Integer> count(List<String> symptomList) {
	ISymptomCounter countSymptoms = new CountSymptom();
	return countSymptoms.getNumberOfSymptoms(symptomList);
    }

    /**
     * This method is used to create an output file containing each symptom with
     * their occurrences
     * 
     * @param a Map of symptoms and a output file name
     * @return a output file name
     */
    @Override
    public String writeIntoFile(Map<String, Integer> map, String outPutFileName) {
	ISymptomWriter writeFile = new WriteSymptomDataToFile();
	return writeFile.putSymptoms(map, outPutFileName);
    }

    /**
     * This method is used to open file on Desktop
     * 
     * @param an output file name
     */
    @Override
    public void openFile(String outPutFileName) {
	OpenResultsFile openResults = new OpenResultsFile();
	openResults.openFile(outPutFileName);
    }
}
