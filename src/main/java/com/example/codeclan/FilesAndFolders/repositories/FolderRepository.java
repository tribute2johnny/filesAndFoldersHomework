package com.example.codeclan.FilesAndFolders.repositories;

import com.example.codeclan.FilesAndFolders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
