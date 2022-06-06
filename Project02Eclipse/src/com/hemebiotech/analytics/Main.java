package com.hemebiotech.analytics;

/**
 * Entry point of application
 */
public class Main {
    /**
     * This is the main method. Instantiation of an object and calling its method.
     */
    public static void main(String[] args) throws Exception {

	ChooseAFileToRead chooseFile = new ChooseAFileToRead();
	String pathFile = chooseFile.openAFile();

	IAnalyticsCounter analyseSymptom = new AnalyticsCounter(pathFile, "results.out");
	analyseSymptom.analyseSymptoms();
    }
}
