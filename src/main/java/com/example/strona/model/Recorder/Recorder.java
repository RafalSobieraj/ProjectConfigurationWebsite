package com.example.strona.model.Recorder;

import javax.persistence.*;

@Entity
@Table(name="recorders")
public class Recorder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true, name = "recorder_model")
    private  String RecorderModel;

    @Column(nullable = false, name = "recorder_type")
    private String RecorderType;

    @Column(nullable = false, name = "canal_numbers")
    private int CanalNumbers;

    @Column(nullable = false, name = "disk_count")
    private int DiskCount;

    @Column(nullable = false, name = "storage_limit")
    private int StorageLimit;

    @Column(nullable = false, name = "bandwidth")
    private int Bandwidth;

    @Column(nullable = true)
    private String Image;

    private boolean Enabled;

    public Recorder(boolean enabled ,Integer id, String recorderModel, String recorderType, int canalNumbers, int diskCount, int storageLimit, int bandwidth, String image) {
        this.id = id;
        RecorderModel = recorderModel;
        RecorderType = recorderType;
        CanalNumbers = canalNumbers;
        DiskCount = diskCount;
        StorageLimit = storageLimit;
        Bandwidth = bandwidth;
        Image = image;
        setEnabled(enabled);
    }

    public boolean isEnabled() {
        return Enabled;
    }

    public void setEnabled(boolean enabled) {
        this.Enabled = enabled;
    }

    public Recorder() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRecorderModel() {
        return RecorderModel;
    }

    public void setRecorderModel(String recorderModel) {
        RecorderModel = recorderModel;
    }

    public String getRecorderType() {
        return RecorderType;
    }

    public void setRecorderType(String recorderType) {
        RecorderType = recorderType;
    }

    public int getCanalNumbers() {
        return CanalNumbers;
    }

    public void setCanalNumbers(int canalNumbers) {
        CanalNumbers = canalNumbers;
    }

    public int getDiskCount() {
        return DiskCount;
    }

    public void setDiskCount(int diskCount) {
        DiskCount = diskCount;
    }

    public int getStorageLimit() {
        return StorageLimit;
    }

    public void setStorageLimit(int storageLimit) {
        StorageLimit = storageLimit;
    }

    public int getBandwidth() {
        return Bandwidth;
    }

    public void setBandwidth(int bandwidth) {
        Bandwidth = bandwidth;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    @Transient
    public String getImagePath(){
        if(Image == null || id == null) return null;

        return "/images/" + "recorders/" + id + "/" + Image;
    }

    @Override
    public String toString() {
        return "Recorder [Bandwidth=" + Bandwidth + ", CanalNumbers=" + CanalNumbers + ", DiskCount=" + DiskCount
                + ", Enabled=" + Enabled + ", Image=" + Image + ", RecorderModel=" + RecorderModel + ", RecorderType="
                + RecorderType + ", StorageLimit=" + StorageLimit + ", id=" + id + "]";
    }
}