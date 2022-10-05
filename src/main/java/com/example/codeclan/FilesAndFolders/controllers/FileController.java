package com.example.codeclan.FilesAndFolders.controllers;


import com.example.codeclan.FilesAndFolders.models.File;
import com.example.codeclan.FilesAndFolders.models.Folder;
import com.example.codeclan.FilesAndFolders.repositories.FileRepository;
import com.example.codeclan.FilesAndFolders.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FileController {

    @Autowired
    FileRepository fileRepository;

    @GetMapping(value="/file")
    public ResponseEntity<List<File>> getAllFiles() {
        return new ResponseEntity<>(fileRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/file/{id}")
    public ResponseEntity getFile(@PathVariable Long id) {
        return new ResponseEntity(fileRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value="/file")
    public ResponseEntity<File> postFile(@RequestBody File file){
        fileRepository.save(file);
        return new ResponseEntity<>(file, HttpStatus.CREATED);
    }
}
