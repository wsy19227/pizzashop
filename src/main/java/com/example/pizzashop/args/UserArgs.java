package com.example.pizzashop.args;

public class UserArgs {
    private String customerAccount;
    private String customerName;
    private String customerPwd;
    private String customerTelephone;
    private String customerAddress;
    private Integer memberAge;
    private String memberSex;

    public String getCustomerAccount() {
        return customerAccount;
    }

    public void setCustomerAccount(String customerAccount) {
        this.customerAccount = customerAccount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPwd() {
        return customerPwd;
    }

    public void setCustomerPwd(String customerPwd) {
        this.customerPwd = customerPwd;
    }

    public String getCustomerTelephone() {
        return customerTelephone;
    }

    public void setCustomerTelephone(String customerTelephone) {
        this.customerTelephone = customerTelephone;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Integer getMemberAge() {
        return memberAge;
    }

    public void setMemberAge(Integer memberAge) {
        this.memberAge = memberAge;
    }

    public String getMemberSex() {
        return memberSex;
    }

    public void setMemberSex(String memberSex) {
        this.memberSex = memberSex;
    }

    public UserArgs(String customerAccount, String customerName, String customerPwd, String customerTelephone, String customerAddress, Integer memberAge, String memberSex) {
        this.customerAccount = customerAccount;
        this.customerName = customerName;
        this.customerPwd = customerPwd;
        this.customerTelephone = customerTelephone;
        this.customerAddress = customerAddress;
        this.memberAge = memberAge;
        this.memberSex = memberSex;
    }

    @Override
    public String toString() {
        return "UserArgs{" +
                "customerAccount='" + customerAccount + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerPwd='" + customerPwd + '\'' +
                ", customerTelephone='" + customerTelephone + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", memberAge=" + memberAge +
                ", memberSex='" + memberSex + '\'' +
                '}';
    }
}
