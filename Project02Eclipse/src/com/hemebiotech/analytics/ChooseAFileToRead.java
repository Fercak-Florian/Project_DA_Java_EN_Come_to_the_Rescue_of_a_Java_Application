package com.hemebiotech.analytics;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

public class ChooseAFileToRead {
    private String fileToRead;

    public ChooseAFileToRead() {

    }

    public String openAFile() {

	JFileChooser choose = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

	int res = choose.showOpenDialog(null);

	if (res == JFileChooser.APPROVE_OPTION) {
	    File file = choose.getSelectedFile();
	    fileToRead = file.getAbsolutePath();
	}
	return fileToRead;
    }
}
