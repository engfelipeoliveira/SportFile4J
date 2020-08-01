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

	public void parser(String fileName) {
		int i =0;
		try {
			JAXBContext jc = JAXBContext.newInstance(TrainingCenterDatabaseT.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();

			File customerXML = new File(fileName);
			JAXBElement<TrainingCenterDatabaseT> jAXBElement = (JAXBElement<TrainingCenterDatabaseT>) unmarshaller
					.unmarshal(customerXML);
			TrainingCenterDatabaseT trainingCenterDatabaseT = jAXBElement.getValue();
			trainingCenterDatabaseT.getActivities().getActivity().stream().forEach(
					activity -> {
						activity.getLap().forEach(
								lap -> {
									System.out.println("Distancia: " + lap.getDistanceMeters() / 1000 + " km");
									
									int minutes = (int) lap.getTotalTimeSeconds() % 3600 / 60;
									int seconds = (int) lap.getTotalTimeSeconds() % 60;
									System.out.println("Tempo "+minutes+":"+seconds);
									
									double ritmo = lap.getTotalTimeSeconds() / (lap.getDistanceMeters() / 1000);
									int minutesRitmo = (int) ritmo % 3600 / 60;
									int secondsRitmo = (int) ritmo % 60;
									System.out.println("Ritmo "+minutesRitmo+":"+secondsRitmo + " /km");
									
									System.out.println("FC " + lap.getAverageHeartRateBpm().getValue() + " bpm");
									
									
									lap.getTrack().forEach(
											track -> {
												double firstAlt = track.getTrackpoint().stream().findFirst().get().getAltitudeMeters();
												double lastAlt = track.getTrackpoint().stream().skip(track.getTrackpoint().stream().count() - 1).findFirst().get().getAltitudeMeters();
												double alt = Math.round(lastAlt - firstAlt);
												System.out.println("Elev. " + (int) alt  + " bpm");
												
												track.getTrackpoint().stream().forEach(
														trackpoint -> {
															System.out.println("LatitudeDegrees " + trackpoint.getPosition().getLatitudeDegrees());
															System.out.println("LongitudeDegrees " + trackpoint.getPosition().getLongitudeDegrees());
															System.out.println("AltitudeMeters " + trackpoint.getAltitudeMeters());
														});
												
											});
									
									System.out.println("-------------------------------------");
								});
					});
			
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

}