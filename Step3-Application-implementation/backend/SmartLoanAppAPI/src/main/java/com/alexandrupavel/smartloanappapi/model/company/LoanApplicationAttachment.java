package com.alexandrupavel.smartloanappapi.model.company;

import com.alexandrupavel.smartloanappapi.model.loan.GreenLoanApplication;
import jakarta.persistence.*;

@Entity
@Table(name = "loan_application_attachments")
public class LoanApplicationAttachment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fileName;

    private String fileType;

    private String fileUrl;

    @ManyToOne
    @JoinColumn(name = "application_id")
    private GreenLoanApplication greenLoanApplication;

    public LoanApplicationAttachment() {}

    public LoanApplicationAttachment(Long id, String fileName, String fileType, String fileUrl, GreenLoanApplication greenLoanApplication) {
        this.id = id;
        this.fileName = fileName;
        this.fileType = fileType;
        this.fileUrl = fileUrl;
        this.greenLoanApplication = greenLoanApplication;
    }

    // Getters & Setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getFileName() { return fileName; }

    public void setFileName(String fileName) { this.fileName = fileName; }

    public String getFileType() { return fileType; }

    public void setFileType(String fileType) { this.fileType = fileType; }

    public String getFileUrl() { return fileUrl; }

    public void setFileUrl(String fileUrl) { this.fileUrl = fileUrl; }

    public GreenLoanApplication getGreenLoanApplication() { return greenLoanApplication; }

    public void setGreenLoanApplication(GreenLoanApplication greenLoanApplication) { this.greenLoanApplication = greenLoanApplication; }
}
