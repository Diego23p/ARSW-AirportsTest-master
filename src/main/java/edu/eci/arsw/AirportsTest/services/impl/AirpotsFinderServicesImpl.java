package edu.eci.arsw.AirportsTest.services.impl;

import java.io.IOException;

import edu.eci.arsw.AirportsTest.services.AirpotsFinderServices;

import edu.eci.arsw.AirportsTest.cache.AirportsFinderCache;
import edu.eci.arsw.AirportsTest.services.AirpotsFinderServices;
import edu.eci.arsw.AirportsTest.services.HttpConnectionService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import static org.springframework.http.converter.json.Jackson2ObjectMapperBuilder.json;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("AirpotsFinderServicesImpl")
public class AirpotsFinderServicesImpl implements AirpotsFinderServices {

	 @Autowired
	 @Qualifier("HttpConnectionServiceImpl")
	 HttpConnectionService hcs;
	 
	 
	 @Autowired
	 @Qualifier("AirpotsFinderCacheImpl")
	 AirportsFinderCache afc;
	    
	 @Override
	 public String getAirpotsByName(String name) throws IOException{
		 if(!afc.isSave(name)){
			 afc.save(name, hcs.airpotsByName(name));
		 }
		 else {
			 if(!afc.isAlive(name)){
				 afc.save(name, hcs.airpotsByName(name));
			 }
		 }
		 return afc.load(name);
	 }

}
