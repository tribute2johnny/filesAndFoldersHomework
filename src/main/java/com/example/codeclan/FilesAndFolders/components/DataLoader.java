package com.example.codeclan.FilesAndFolders.components;

import com.example.codeclan.FilesAndFolders.models.File;
import com.example.codeclan.FilesAndFolders.models.Folder;
import com.example.codeclan.FilesAndFolders.models.Person;
import com.example.codeclan.FilesAndFolders.repositories.FileRepository;
import com.example.codeclan.FilesAndFolders.repositories.FolderRepository;
import com.example.codeclan.FilesAndFolders.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    PersonRepository personRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        Person person1 = new Person("Bart");

        Folder documents = new Folder("documents",  person1);

        File file1 = new File("project", "java", 100, documents);
    }
}
