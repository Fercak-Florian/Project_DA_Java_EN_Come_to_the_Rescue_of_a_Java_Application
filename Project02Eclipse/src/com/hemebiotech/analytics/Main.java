package com.hemebiotech.analytics;

public class Main {

    public static void main(String[] args) throws Exception {

	// AnalyticsCounter analyticsCounter = new AnalyticsCounter();
	IAnalyticsCounter analyseSymptom = new AnalyticsCounter();
	analyseSymptom.analyseSymptoms("Project02Eclipse\\symptoms.txt", "result.out");
    }

}
