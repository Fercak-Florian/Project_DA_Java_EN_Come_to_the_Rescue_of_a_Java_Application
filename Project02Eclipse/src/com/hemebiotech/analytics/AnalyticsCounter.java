package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class AnalyticsCounter {
    public static int headacheCount = 0;
    public static int rashCount = 0;
    public static int pupilCount = 0;

    // Entry Point
    public static void main(String args[]) throws Exception {

	// Trying to instance ReadSymptomDataFromFile object
	/*
	 * ReadSymptomDataFromFile a = new ReadSymptomDataFromFile(); a.GetSymptoms();
	 */

	// first get input
	BufferedReader reader = new BufferedReader(new FileReader(
		"D:\\Dev\\Projet_2\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt"));

	String line = reader.readLine();

	while (line != null) {

	    System.out.println("symptom from file: " + line);
	    if (line.equals("headache")) {
		headacheCount += 1;
		System.out.println("number of headaches: " + headacheCount);
	    } else if (line.equals("rash")) {
		rashCount += 1;
		System.out.println("number of rashes: " + rashCount);
	    } else if (line.contains("pupils")) {
		pupilCount += 1;
		System.out.println("number of pupils: " + pupilCount);
	    }

	    line = reader.readLine(); // get another symptom
	}

	reader.close();

	// next generate output
	FileWriter writer = new FileWriter("result.out");
	writer.write("headache: " + headacheCount + "\n");
	writer.write("rash: " + rashCount + "\n");
	writer.write("dialated pupils: " + pupilCount + "\n");
	writer.close();
    }
}
