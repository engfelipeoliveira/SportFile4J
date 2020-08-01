package com.sportfile4j.parser;

import static org.slf4j.LoggerFactory.getLogger;

import org.slf4j.Logger;

import net.studioblueplanet.fitreader.FitReader;
import net.studioblueplanet.fitreader.FitRecordRepository;

public class FITParser {

	private static final Logger LOG = getLogger(FITParser.class);

	public void parser(String fileName) {
		FitRecordRepository fitRecordRepository = FitReader.getInstance().readFile(fileName);
		LOG.info(fitRecordRepository.toString());
	}

}