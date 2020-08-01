package com.sportfile4j.parser;

import java.io.File;

public class Parser {

	public static void main(String[] args) throws Exception {

		//String fileName = "C:\\tmp\\garmin.fit";
		// String fileName = "C:\\tmp\\pedalada.tcx";
		 String fileName = "C:\\tmp\\corrida.gpx";
		
		String ext = new File(fileName).getName().toLowerCase();

		if (ext.endsWith(".fit")) {
			FITParser fitParser = new FITParser();
			fitParser.parser(fileName);
		} else if (ext.endsWith(".tcx")) {
			TCXParser tcxParser = new TCXParser();
			tcxParser.parser(fileName);
		} else if (ext.endsWith(".gpx")) {
			GPXParser gpxParser = new GPXParser();
			gpxParser.parser(fileName);
		}else {
			throw new Exception("Not implemented yet!");
		}
	}

}
