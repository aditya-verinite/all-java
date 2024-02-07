package com.example.demo.userDTO;


import java.time.LocalDate;

public class userDTO {

    private Long contactNo;
    private String accountNo;
    private String userName;
    private String debitCardNo;
    private String accountType;
    private LocalDate expiryDate;

    public userDTO(Long contactNo, String accountNo, String userName, String debitCardNo, String accountType,
                   LocalDate expiryDate) {
        this.contactNo = contactNo;
        this.accountNo = accountNo;
        this.userName = userName;
        this.debitCardNo = debitCardNo;
        this.accountType = accountType;
        this.expiryDate = expiryDate;
    }

    public Long getContactNo() {
        return contactNo;
    }

    public void setContactNo(Long contactNo) {
        this.contactNo = contactNo;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDebitCardNo() {
        return debitCardNo;
    }

    public void setDebitCardNo(String debitCardNo) {
        this.debitCardNo = debitCardNo;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }
}