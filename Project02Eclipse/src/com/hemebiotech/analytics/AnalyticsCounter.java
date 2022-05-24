package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class AnalyticsCounter {
    private static int headacheCount = 0;
    private static int rashCount = 0;
    private static int pupilCount = 0;

    public static void main(String args[]) throws Exception {
	// first get input
	BufferedReader reader = new BufferedReader(new FileReader(
		"D:\\Dev\\Projet_2\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt"));
	String line = reader.readLine();

	int i = 0;
	int headachesCount = 0;

	while (line != null) {
	    i += 1;
	    System.out.println("symptom from file: " + line);
	    if (line.equals("headache")) {
		headachesCount += 1;
		System.out.println("number of headaches: " + headachesCount);
	    } else if (line.equals("rush")) {
		rashCount += 1;
	    } else if (line.contains("pupils")) {
		pupilCount += 1;
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
