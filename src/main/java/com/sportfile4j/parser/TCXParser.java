package com.sportfile4j.parser;

import static org.slf4j.LoggerFactory.getLogger;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.slf4j.Logger;

import com.sportfile4j.xsd.generated.tcx.v2.TrainingCenterDatabaseT;

public class TCXParser {
	
	private static final Logger LOG = getLogger(TCXParser.class);
	
	public static void main(String[] args) {
		TCXParser tcxParser = new TCXParser();
		tcxParser.parser("C:\\tmp\\pedalada.tcx");
	}

	public void parser(String fileName) {
		try {
			JAXBContext jc = JAXBContext.newInstance(TrainingCenterDatabaseT.class);
	        Unmarshaller unmarshaller = jc.createUnmarshaller();
	        
	        File customerXML = new File(fileName);
	        JAXBElement<TrainingCenterDatabaseT> jAXBElement = (JAXBElement<TrainingCenterDatabaseT>) unmarshaller.unmarshal(customerXML);
	        TrainingCenterDatabaseT trainingCenterDatabaseT = jAXBElement.getValue();
	        LOG.info(trainingCenterDatabaseT.toString());

		} catch (JAXBException e) {
			e.printStackTrace();
		}
        
	}
	
}