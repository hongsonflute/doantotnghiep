package com.tienganhchoem.model;

public class ThanhTichModel extends AbstractModel<ThanhTichModel>{
    private Long userId;
    private Long idBaiTracNghiem;
    private Long tongDiem;
    private Long lessionid;
    private String diemString;
    private Long soLanLam;

    public Long getSoLanLam() {
        return soLanLam;
    }

    public void setSoLanLam(Long soLanLam) {
        this.soLanLam = soLanLam;
    }

    public String getDiemString() {
        return diemString;
    }

    public void setDiemString(String diemString) {
        this.diemString = diemString;
    }

    public Long getLessionid() {
        return lessionid;
    }

    public void setLessionid(Long lessionid) {
        this.lessionid = lessionid;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getIdBaiTracNghiem() {
        return idBaiTracNghiem;
    }

    public void setIdBaiTracNghiem(Long idBaiTracNghiem) {
        this.idBaiTracNghiem = idBaiTracNghiem;
    }

    public Long getTongDiem() {
        return tongDiem;
    }

    public void setTongDiem(Long tongDiem) {
        this.tongDiem = tongDiem;
    }
}
