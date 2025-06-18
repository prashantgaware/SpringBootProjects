package com.nt.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.PersonInfo;
import com.nt.service.IPersonService;

@Component
public class PersonRunner implements CommandLineRunner {

	@Autowired
	private IPersonService personService;

	@Override
	public void run(String... args) throws Exception {
		try {
			
			String photoPath = "C:\\Users\\HP\\Downloads\\DSA Roadmap.png";
			String resumePath = "C:\\Users\\HP\\Downloads\\resume_incomplete.txt";

			byte[] photoContent;
			try (InputStream inputStream = new FileInputStream(photoPath)) {
				photoContent = inputStream.readAllBytes();
			}

			char[] resumeContent;
			File resumeFile = new File(resumePath);
			try (Reader reader = new FileReader(resumeFile)) {
				if (resumeFile.length() > Integer.MAX_VALUE) {
				    throw new IOException("File is too large to read into a char array.");
                }
				resumeContent = new char[(int) resumeFile.length()];
				int charsRead = reader.read(resumeContent);
			}
			
			PersonInfo info = new PersonInfo(0, LocalDateTime.now(), true, photoContent, "John", resumeContent);
			try {
				System.out.println("Person is getting is saved: " + info.getPname());
				personService.registerPersonInfo(info);
			} catch (Exception e) {
			}
			
			System.out.println();
			try {
				personService.getAllPersons().forEach(person -> {
					System.out.println(person);
				});
			} catch (Exception e) {
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
