package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws Exception {

	AnalyticsCounter analyticsCounter = new AnalyticsCounter();

	List<String> listOfSymptoms = analyticsCounter.readFile();
	List<String> sortedList = analyticsCounter.sortList(listOfSymptoms);
	TreeMap<String, Integer> Map = analyticsCounter.count(sortedList);

	analyticsCounter.writeIntoFile(Map);

	// IAnalyticsCounter a = new ISymptomeReader();

    }

}
