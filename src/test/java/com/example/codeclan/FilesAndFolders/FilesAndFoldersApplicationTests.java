package com.example.codeclan.FilesAndFolders;

import com.example.codeclan.FilesAndFolders.models.File;
import com.example.codeclan.FilesAndFolders.models.Folder;
import com.example.codeclan.FilesAndFolders.models.Person;
import com.example.codeclan.FilesAndFolders.repositories.FileRepository;
import com.example.codeclan.FilesAndFolders.repositories.FolderRepository;
import com.example.codeclan.FilesAndFolders.repositories.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FilesAndFoldersApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	PersonRepository personRepository;

	@Autowired
	FolderRepository folderRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createPersonAndFolderThenSave() {
		Person person1 = new Person("Tom");
		personRepository.save(person1);
		Folder folder1 = new Folder("Downloads", person1);
		folderRepository.save(folder1);
	}

	@Test
	public void createFilesAndFoldersThenSave() {
		Person person1 = new Person("Sally");
		personRepository.save(person1);
		Folder folder1 = new Folder("CourseWork", person1);
		folderRepository.save(folder1);
		File file1 = new File("HomeWork", "java", 45, folder1);
		fileRepository.save(file1);
	}

}
