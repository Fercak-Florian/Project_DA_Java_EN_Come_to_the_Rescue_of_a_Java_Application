package com.hemebiotech.analytics;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

/**
 * This class allows users to choose a file to read through a dialog box
 */

public class ChooseAFileToRead implements IChooseAFile {
    private String fileToRead;

    public ChooseAFileToRead() {

    }

    /**
     * This method allows users to choose a file to read through a dialog box
     * 
     * @return a String contains a file path
     */
    public String chooseAFile() {

	JFileChooser choose = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

	int res = choose.showOpenDialog(null);

	if (res == JFileChooser.APPROVE_OPTION) {
	    File file = choose.getSelectedFile();
	    fileToRead = file.getAbsolutePath();
	}
	return fileToRead;
    }
}
