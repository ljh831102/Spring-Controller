package cn.ljh.controller.po;

public class Region {
    private Integer regionId;

    private String regionProvinceCode;

    private String regionCityCode;

    private String regionCountyCode;

    private String regionKind;

    private String regionName;

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public String getRegionProvinceCode() {
        return regionProvinceCode;
    }

    public void setRegionProvinceCode(String regionProvinceCode) {
        this.regionProvinceCode = regionProvinceCode == null ? null : regionProvinceCode.trim();
    }

    public String getRegionCityCode() {
        return regionCityCode;
    }

    public void setRegionCityCode(String regionCityCode) {
        this.regionCityCode = regionCityCode == null ? null : regionCityCode.trim();
    }

    public String getRegionCountyCode() {
        return regionCountyCode;
    }

    public void setRegionCountyCode(String regionCountyCode) {
        this.regionCountyCode = regionCountyCode == null ? null : regionCountyCode.trim();
    }

    public String getRegionKind() {
        return regionKind;
    }

    public void setRegionKind(String regionKind) {
        this.regionKind = regionKind == null ? null : regionKind.trim();
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName == null ? null : regionName.trim();
    }
}