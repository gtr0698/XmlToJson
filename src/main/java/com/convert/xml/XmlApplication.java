package com.convert.xml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class XmlApplication {

	public XmlApplication() throws IOException {
	}

	public static void main(String[] args) {
		SpringApplication.run(XmlApplication.class, args);
	}


}
