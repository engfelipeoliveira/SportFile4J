package com.sportfile4j.parser;

import static org.slf4j.LoggerFactory.getLogger;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.slf4j.Logger;

import com.sportfile4j.xsd.generated.gpx.v1.GpxType;

public class GPXParser {

	private static final Logger LOG = getLogger(GPXParser.class);

	public void parser(String fileName) {
		try {
			JAXBContext jc = JAXBContext.newInstance(GpxType.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();

			File customerXML = new File(fileName);
			JAXBElement<GpxType> jAXBElement = (JAXBElement<GpxType>) unmarshaller.unmarshal(customerXML);
			GpxType gpxType = jAXBElement.getValue();
			
			LOG.info(gpxType.toString());

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

}