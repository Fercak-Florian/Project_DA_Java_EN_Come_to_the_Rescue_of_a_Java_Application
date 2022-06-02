package com.hemebiotech.analytics;

/**
 * Entry point of application
 */
public class Main {
    /**
     * This is the main class. Instantiation of one object and calling its method.
     */
    public static void main(String[] args) throws Exception {
	IAnalyticsCounter analyseSymptom = new AnalyticsCounter();
	analyseSymptom.analyseSymptoms("Project02Eclipse\\symptoms.txt", "results.out");
    }

}
