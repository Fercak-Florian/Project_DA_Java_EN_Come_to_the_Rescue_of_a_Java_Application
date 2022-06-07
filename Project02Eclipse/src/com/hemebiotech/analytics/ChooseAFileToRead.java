package com.hemebiotech.analytics;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

/**
 * this class allows the user to choose a file
 */

public class ChooseAFileToRead {
    private String fileToRead;

    public ChooseAFileToRead() {

    }

    /**
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
