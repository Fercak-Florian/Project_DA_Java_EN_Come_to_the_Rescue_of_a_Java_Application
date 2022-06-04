package com.hemebiotech.analytics;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

public class ChooseAFileToRead {
    private String file;

    public ChooseAFileToRead() {

    }

    public String openAFile() {

	JFileChooser choose = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

	int res = choose.showOpenDialog(null);

	if (res == JFileChooser.APPROVE_OPTION) {
	    File file = choose.getSelectedFile();
	    // System.out.println(file.getAbsolutePath());
	    String fileToRead = file.getAbsolutePath();
	    System.out.println(fileToRead);
	}
	return file;
    }
}
