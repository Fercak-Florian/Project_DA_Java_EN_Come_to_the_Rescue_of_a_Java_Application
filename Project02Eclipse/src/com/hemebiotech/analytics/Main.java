package com.hemebiotech.analytics;

/**
 * Entry point of application
 */
public class Main {
    /**
     * This is the main method. Instantiation of an object and calling its method.
     */
    public static void main(String[] args) throws Exception {

	ChooseAFileToRead fileToRead = new ChooseAFileToRead();
	String f = fileToRead.openAFile();
	System.out.println(f);

	IAnalyticsCounter analyseSymptom = new AnalyticsCounter(f, "results.out");
	analyseSymptom.analyseSymptoms();
    }
}
