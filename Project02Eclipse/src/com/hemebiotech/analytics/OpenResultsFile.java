package com.hemebiotech.analytics;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
 * This class is used to open file on Desktop
 */
public class OpenResultsFile implements IOpenResults {

    public OpenResultsFile() {

    }

    /**
     * @param outputFile name
     */
    public void openFile(String outputFile) {

	File file = new File(outputFile);

	if (!Desktop.isDesktopSupported()) {
	    System.out.println("Desktop n'est pas prise en charge");
	    return;
	}

	Desktop d = Desktop.getDesktop();
	if (file.exists())
	    try {
		d.open(file);
	    } catch (IOException e) {
		e.printStackTrace();
	    }
    }
}
