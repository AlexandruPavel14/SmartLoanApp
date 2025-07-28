package com.alexandrupavel.smartloanappapi.repository.file;

import com.alexandrupavel.smartloanappapi.model.file.FileExtension;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileExtensionRepository extends JpaRepository<FileExtension, Long> {
}
