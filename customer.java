package nucleus;

import java.time.LocalDate;

public class customer
{
    private String customercode;
    private  String customerName;
    private String Address1;
    private String Address2;
    private String pincode;
    private String E_mail;
    private String contactNo;
    private String primarycontactperson;
    private String recordStatus;
    private String active_inactive;
    private String createddate;
    private String createdby;
    private String modifiedDate;
    private String modifiedby;
    private String Autherizeddate;
    private String Authorizedby;
    public String getCustomercode() {
        return customercode;
    }

    public void setCustomercode(String customercode) {
        this.customercode = customercode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress1() {
        return Address1;
    }

    public void setAddress1(String address1) {
        Address1 = address1;
    }

    public String getAddress2() {
        return Address2;
    }

    public void setAddress2(String address2) {
        Address2 = address2;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getE_mail() {
        return E_mail;
    }

    public void setE_mail(String e_mail) {
        E_mail = e_mail;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getPrimarycontactperson() {
        return primarycontactperson;
    }

    public void setPrimarycontactperson(String primarycontactperson) {
        this.primarycontactperson = primarycontactperson;
    }

    public String getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
    }

    public String getActive_inactive() {
        return active_inactive;
    }

    public void setActive_inactive(String active_inactive) {
        this.active_inactive = active_inactive;
    }

    public String getCreateddate() {
        return createddate;
    }

    public void setCreateddate(String createddate) {
        this.createddate = createddate;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(String modifiedby) {
        this.modifiedby = modifiedby;
    }

    public String getAutherizeddate() {
        return Autherizeddate;
    }

    public void setAutherizeddate(String autherizeddate) {
        Autherizeddate = autherizeddate;
    }

    public String getAuthorizedby() {
        return Authorizedby;
    }

    public void setAuthorizedby(String authorizedby) {
        Authorizedby = authorizedby;
    }

    @Override
    public String toString() {
        return "customer{" +
                "customercode='" + customercode + '\'' +
                ", customerName='" + customerName + '\'' +
                ", Address1='" + Address1 + '\'' +
                ", Address2='" + Address2 + '\'' +
                ", pincode='" + pincode + '\'' +
                ", E_mail='" + E_mail + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", primarycontactperson='" + primarycontactperson + '\'' +
                ", recordStatus='" + recordStatus + '\'' +
                ", active_inactive='" + active_inactive + '\'' +
                ", createddate='" + createddate + '\'' +
                ", createdby='" + createdby + '\'' +
                ", modifiedDate='" + modifiedDate + '\'' +
                ", modifiedby='" + modifiedby + '\'' +
                ", Autherizeddate='" + Autherizeddate + '\'' +
                ", Authorizedby='" + Authorizedby + '\'' +
                '}';
    }
}
