package com.alexandrupavel.smartloanappapi.dto.loan;

public class LoanApplicationAttachmentDTO {

    private Long id;
    private String fileName;
    private String fileType;
    private String fileUrl;
    private Long greenLoanApplicationId;

    // Getters & Setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getFileName() { return fileName; }

    public void setFileName(String fileName) { this.fileName = fileName; }

    public String getFileType() { return fileType; }

    public void setFileType(String fileType) { this.fileType = fileType; }

    public String getFileUrl() { return fileUrl; }

    public void setFileUrl(String fileUrl) { this.fileUrl = fileUrl; }

    public Long getGreenLoanApplicationId() { return greenLoanApplicationId; }

    public void setGreenLoanApplicationId(Long greenLoanApplicationId) { this.greenLoanApplicationId = greenLoanApplicationId; }
}
