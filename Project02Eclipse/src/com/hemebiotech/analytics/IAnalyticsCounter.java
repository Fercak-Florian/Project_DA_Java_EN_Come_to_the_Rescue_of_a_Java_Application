package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * This interface is used to analyze a file
 */
public interface IAnalyticsCounter {
    void analyseSymptoms();

    String chooseFile();

    List<String> readFile(String inputFileName);

    List<String> sortList(List<String> list);

    Map<String, Integer> count(List<String> symptomList);

    String writeIntoFile(Map<String, Integer> map, String outPutFileName);

    void openFile(String outPutFileName);
}
