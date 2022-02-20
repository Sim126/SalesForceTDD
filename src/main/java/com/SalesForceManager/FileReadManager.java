package com.SalesForceManager;

import com.SalesForceConfigFileReader.ConfigFileReader;

public class FileReadManager {
	
	private FileReadManager () {
		
	}
private static FileReadManager fileReadManager= new FileReadManager();

public static FileReadManager getInstance() {
	return fileReadManager;	
}
ConfigFileReader confogFileReader;
public ConfigFileReader getConfigReader() {
	return (confogFileReader==null)? new ConfigFileReader():confogFileReader;
	
}
}
