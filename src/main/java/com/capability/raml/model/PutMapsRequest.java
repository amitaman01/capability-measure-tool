
package com.capability.raml.model;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * IndustryMap POST Request Schema
 * <p>
 * schema to POST a IndustryMap
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "mapId",
    "versionId",
    "sectorId",
    "archiveInd",
    "createDt",
    "lastUpdateDt",
    "mapDesc",
    "mapLastUpdateDt",
    "mapNm",
    "mapStatus",
    "mapTyp",
    "usrNmLastUpd"
})
public class PutMapsRequest {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mapId")
    @NotNull
    private String mapId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("versionId")
    @NotNull
    private String versionId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sectorId")
    @NotNull
    private String sectorId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("archiveInd")
    @NotNull
    private String archiveInd;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("createDt")
    @NotNull
    private String createDt;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("lastUpdateDt")
    @NotNull
    private String lastUpdateDt;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mapDesc")
    @NotNull
    private String mapDesc;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mapLastUpdateDt")
    @NotNull
    private String mapLastUpdateDt;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mapNm")
    @NotNull
    private String mapNm;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mapStatus")
    @NotNull
    private String mapStatus;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mapTyp")
    @NotNull
    private String mapTyp;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("usrNmLastUpd")
    @NotNull
    private String usrNmLastUpd;

    /**
     * 
     * (Required)
     * 
     * @return
     *     The mapId
     */
    @JsonProperty("mapId")
    public String getMapId() {
        return mapId;
    }

    /**
     * 
     * (Required)
     * 
     * @param mapId
     *     The mapId
     */
    @JsonProperty("mapId")
    public void setMapId(String mapId) {
        this.mapId = mapId;
    }

    public PutMapsRequest withMapId(String mapId) {
        this.mapId = mapId;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The versionId
     */
    @JsonProperty("versionId")
    public String getVersionId() {
        return versionId;
    }

    /**
     * 
     * (Required)
     * 
     * @param versionId
     *     The versionId
     */
    @JsonProperty("versionId")
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public PutMapsRequest withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The sectorId
     */
    @JsonProperty("sectorId")
    public String getSectorId() {
        return sectorId;
    }

    /**
     * 
     * (Required)
     * 
     * @param sectorId
     *     The sectorId
     */
    @JsonProperty("sectorId")
    public void setSectorId(String sectorId) {
        this.sectorId = sectorId;
    }

    public PutMapsRequest withSectorId(String sectorId) {
        this.sectorId = sectorId;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The archiveInd
     */
    @JsonProperty("archiveInd")
    public String getArchiveInd() {
        return archiveInd;
    }

    /**
     * 
     * (Required)
     * 
     * @param archiveInd
     *     The archiveInd
     */
    @JsonProperty("archiveInd")
    public void setArchiveInd(String archiveInd) {
        this.archiveInd = archiveInd;
    }

    public PutMapsRequest withArchiveInd(String archiveInd) {
        this.archiveInd = archiveInd;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The createDt
     */
    @JsonProperty("createDt")
    public String getCreateDt() {
        return createDt;
    }

    /**
     * 
     * (Required)
     * 
     * @param createDt
     *     The createDt
     */
    @JsonProperty("createDt")
    public void setCreateDt(String createDt) {
        this.createDt = createDt;
    }

    public PutMapsRequest withCreateDt(String createDt) {
        this.createDt = createDt;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The lastUpdateDt
     */
    @JsonProperty("lastUpdateDt")
    public String getLastUpdateDt() {
        return lastUpdateDt;
    }

    /**
     * 
     * (Required)
     * 
     * @param lastUpdateDt
     *     The lastUpdateDt
     */
    @JsonProperty("lastUpdateDt")
    public void setLastUpdateDt(String lastUpdateDt) {
        this.lastUpdateDt = lastUpdateDt;
    }

    public PutMapsRequest withLastUpdateDt(String lastUpdateDt) {
        this.lastUpdateDt = lastUpdateDt;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The mapDesc
     */
    @JsonProperty("mapDesc")
    public String getMapDesc() {
        return mapDesc;
    }

    /**
     * 
     * (Required)
     * 
     * @param mapDesc
     *     The mapDesc
     */
    @JsonProperty("mapDesc")
    public void setMapDesc(String mapDesc) {
        this.mapDesc = mapDesc;
    }

    public PutMapsRequest withMapDesc(String mapDesc) {
        this.mapDesc = mapDesc;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The mapLastUpdateDt
     */
    @JsonProperty("mapLastUpdateDt")
    public String getMapLastUpdateDt() {
        return mapLastUpdateDt;
    }

    /**
     * 
     * (Required)
     * 
     * @param mapLastUpdateDt
     *     The mapLastUpdateDt
     */
    @JsonProperty("mapLastUpdateDt")
    public void setMapLastUpdateDt(String mapLastUpdateDt) {
        this.mapLastUpdateDt = mapLastUpdateDt;
    }

    public PutMapsRequest withMapLastUpdateDt(String mapLastUpdateDt) {
        this.mapLastUpdateDt = mapLastUpdateDt;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The mapNm
     */
    @JsonProperty("mapNm")
    public String getMapNm() {
        return mapNm;
    }

    /**
     * 
     * (Required)
     * 
     * @param mapNm
     *     The mapNm
     */
    @JsonProperty("mapNm")
    public void setMapNm(String mapNm) {
        this.mapNm = mapNm;
    }

    public PutMapsRequest withMapNm(String mapNm) {
        this.mapNm = mapNm;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The mapStatus
     */
    @JsonProperty("mapStatus")
    public String getMapStatus() {
        return mapStatus;
    }

    /**
     * 
     * (Required)
     * 
     * @param mapStatus
     *     The mapStatus
     */
    @JsonProperty("mapStatus")
    public void setMapStatus(String mapStatus) {
        this.mapStatus = mapStatus;
    }

    public PutMapsRequest withMapStatus(String mapStatus) {
        this.mapStatus = mapStatus;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The mapTyp
     */
    @JsonProperty("mapTyp")
    public String getMapTyp() {
        return mapTyp;
    }

    /**
     * 
     * (Required)
     * 
     * @param mapTyp
     *     The mapTyp
     */
    @JsonProperty("mapTyp")
    public void setMapTyp(String mapTyp) {
        this.mapTyp = mapTyp;
    }

    public PutMapsRequest withMapTyp(String mapTyp) {
        this.mapTyp = mapTyp;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The usrNmLastUpd
     */
    @JsonProperty("usrNmLastUpd")
    public String getUsrNmLastUpd() {
        return usrNmLastUpd;
    }

    /**
     * 
     * (Required)
     * 
     * @param usrNmLastUpd
     *     The usrNmLastUpd
     */
    @JsonProperty("usrNmLastUpd")
    public void setUsrNmLastUpd(String usrNmLastUpd) {
        this.usrNmLastUpd = usrNmLastUpd;
    }

    public PutMapsRequest withUsrNmLastUpd(String usrNmLastUpd) {
        this.usrNmLastUpd = usrNmLastUpd;
        return this;
    }

}
