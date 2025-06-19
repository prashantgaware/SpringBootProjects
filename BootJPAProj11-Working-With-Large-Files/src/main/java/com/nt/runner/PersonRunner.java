package com.nt.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
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
				System.out.println("Getting all persons : ");
				personService.getAllPersons().forEach(person -> {
					System.out.println(person);
				});
			} catch (Exception e) {
			}

			System.out.println();
			try {
				System.out.println("Getting person with id: ");
				PersonInfo person = personService.getPersonById(1);
				if (person != null) {
					System.out.println("Person with ID: " + person.getPid() + " and Name: " + person.getPname()
							+ " and DOB:" + person.getDob());
					byte[] phtContent = person.getPhoto();
					OutputStream os = new FileOutputStream("Dsa.png");
					os.write(phtContent);
					os.flush();
					os.close();
					System.out.println("Photo content retrieved from DB.");

					char[] resChar = person.getResume();
					Writer wr = new FileWriter("Res1.txt");
					wr.write(resChar);
					wr.flush();
					wr.close();
					System.out.println("Resume retrived from DB..");
				}

			} catch (Exception e) {
			}
			
			System.out.println("Get count of records:" + personService.getCount());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
