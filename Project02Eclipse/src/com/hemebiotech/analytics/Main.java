package com.hemebiotech.analytics;

/**
 * Entry point of application
 */
public class Main {
    /**
     * This is the main method. Instantiation of an object and calling its method.
     */
    public static void main(String[] args) throws Exception {

	IAnalyticsCounter analyseSymptom = new AnalyticsCounter("results.out");
	analyseSymptom.analyseSymptoms();
    }
}
