package com.sportfile4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sportfile4j.parser.TCXParser;

@SpringBootApplication
public class SportFile4JApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SportFile4JApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		TCXParser tcxParser = new TCXParser();
		tcxParser.parser(args[0]);
	}

}
