package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

	// Instance of AnalyticsCounter class created
	AnalyticsCounter analyticsCounter = new AnalyticsCounter();

	List<String> listOfSymptoms = analyticsCounter.readingFile();
	List<String> sortedList = analyticsCounter.sortList(listOfSymptoms);
	HashMap<String, Integer> Map = analyticsCounter.count(sortedList);
	analyticsCounter.writeFile(Map);
    }

}
