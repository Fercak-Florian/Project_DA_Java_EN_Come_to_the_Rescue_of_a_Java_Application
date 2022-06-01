package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

	AnalyticsCounter analyticsCounter = new AnalyticsCounter();

	List<String> listOfSymptoms = analyticsCounter.readFile();
	List<String> sortedList = analyticsCounter.sortList(listOfSymptoms);
	HashMap<String, Integer> Map = analyticsCounter.count(sortedList);

	analyticsCounter.writeIntoFile(Map);

    }

}
