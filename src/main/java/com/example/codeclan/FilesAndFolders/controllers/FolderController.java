package com.example.codeclan.FilesAndFolders.controllers;

import com.example.codeclan.FilesAndFolders.models.Folder;
import com.example.codeclan.FilesAndFolders.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FolderController {

    @Autowired
    FolderRepository folderRepository;

    @GetMapping(value="/folder")
    public ResponseEntity<List<Folder>> getAllFolders() {
        return new ResponseEntity<>(folderRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/folder/{id}")
    public ResponseEntity getFolder(@PathVariable Long id) {
        return new ResponseEntity(folderRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value="/folder")
    public ResponseEntity<Folder> postFolder(@RequestBody Folder folder){
        folderRepository.save(folder);
        return new ResponseEntity<>(folder, HttpStatus.CREATED);
    }
}
