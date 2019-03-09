package com.android.mylviv;

public class Complaint {

    private ComplaintType type;
    private String address;
    private Status status;
    private int pictureId;
    private String company;
    private String description;

    public Complaint(ComplaintType type, String address, Status status, int pictureId,
                     String company,String description) {
        this.type = type;
        this.address = address;
        this.status = status;
        this.pictureId = pictureId;
        this.company = company;
        this.description = description;
    }

    public Complaint(ComplaintType type, String address, Status status, int pictureId) {
        this(type, address, status, pictureId, null, null);
    }

    public Complaint(ComplaintType type, String address, int pictureId) {
        this(type, address, null, pictureId);
    }

    public int getPictureId() {
        return this.pictureId;
    }

    public String getAddress() {
        return this.address;
    }

    public ComplaintType getType() {
        return this.type;
    }

    public Status getStatus() {
        return this.status;
    }

    public String getResponsibleCompany() {
        return this.company;
    }

    public String getDescription() {
        return this.description;
    }

}
