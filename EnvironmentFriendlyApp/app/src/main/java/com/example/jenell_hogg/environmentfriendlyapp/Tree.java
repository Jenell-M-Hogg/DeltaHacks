package com.example.jenell_hogg.environmentfriendlyapp;

import java.util.Date;

/**
 * Created by Alex on 28/01/17.
 */

public class Tree {
    //Tree Info
    private double latitude;
    private double longitude;
    private int treeNumber;
    private String commonName;
    private String scientificName;
    private double trunkDiameter;
    private double treeHeight;
    private double canopyHeight;
    private Date datePlanted;
    private Date dateRemoved;
    private int deadOrBrokenBranch;
    private int speciesID;
    private int trunkScars;
    private int weakOrYellowFoliage;

    //Tree stewardship log
    private String[] treeStewardshipLog;

    //Planting Site
    private double plantingSiteWidth;
    private double plantingSiteLength;
    private String address;
    private String city;
    private String postalCode;
    private String customID;
    private String block;
    private int houseNumber;
    private Date inventoryDate;
    private String location;
    private String ownership;
    private double percentHardSurface;
    private int plantingSiteNumber;
    private String status;
    private String streetCode;


    //Site stewardship log
    private String[] plantingSiteStewardshipLog;

    //Yearly Ecosystem Serivces
    private double co2StoredToDate;
    private double co2StoredToDateDollars;
    private double energyConserved;
    private double energyConservedDollars;
    private double co2Removed;
    private double co2RemovedDollars;
    private double airQualityImproved;
    private double airQualityImprovedDollars;
    private double stormwaterFiltered;
    private double stormWaterFilteredDollars;


    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public int getTreeNumber() {
        return treeNumber;
    }

    public void setTreeNumber(int treeNumber) {
        this.treeNumber = treeNumber;
    }
    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public double getTrunkDiameter() {
        return trunkDiameter;
    }

    public void setTrunkDiameter(double trunkDiameter) {
        this.trunkDiameter = trunkDiameter;
    }

    public double getTreeHeight() {
        return treeHeight;
    }

    public void setTreeHeight(double treeHeight) {
        this.treeHeight = treeHeight;
    }

    public double getCanopyHeight() {
        return canopyHeight;
    }

    public void setCanopyHeight(double canopyHeight) {
        this.canopyHeight = canopyHeight;
    }

    public Date getDatePlanted() {
        return datePlanted;
    }

    public void setDatePlanted(Date datePlanted) {
        this.datePlanted = datePlanted;
    }

    public Date getDateRemoved() {
        return dateRemoved;
    }

    public void setDateRemoved(Date dateRemoved) {
        this.dateRemoved = dateRemoved;
    }

    public int getDeadOrBrokenBranch() {
        return deadOrBrokenBranch;
    }

    public void setDeadOrBrokenBranch(int deadOrBrokenBranch) {
        this.deadOrBrokenBranch = deadOrBrokenBranch;
    }

    public int getSpeciesID() {
        return speciesID;
    }

    public void setSpeciesID(int speciesID) {
        this.speciesID = speciesID;
    }

    public int getTrunkScars() {
        return trunkScars;
    }

    public void setTrunkScars(int trunkScars) {
        this.trunkScars = trunkScars;
    }

    public int getWeakOrYellowFoliage() {
        return weakOrYellowFoliage;
    }

    public void setWeakOrYellowFoliage(int weakOrYellowFoliage) {
        this.weakOrYellowFoliage = weakOrYellowFoliage;
    }

    public String[] getTreeStewardshipLog() {
        return treeStewardshipLog;
    }

    public void setTreeStewardshipLog(String[] treeStewardshipLog) {
        this.treeStewardshipLog = treeStewardshipLog;
    }

    public double getPlantingSiteWidth() {
        return plantingSiteWidth;
    }

    public void setPlantingSiteWidth(double plantingSiteWidth) {
        this.plantingSiteWidth = plantingSiteWidth;
    }

    public double getPlantingSiteLength() {
        return plantingSiteLength;
    }

    public void setPlantingSiteLength(double plantingSiteLength) {
        this.plantingSiteLength = plantingSiteLength;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCustomID() {
        return customID;
    }

    public void setCustomID(String customID) {
        this.customID = customID;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public Date getInventoryDate() {
        return inventoryDate;
    }

    public void setInventoryDate(Date inventoryDate) {
        this.inventoryDate = inventoryDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public double getPercentHardSurface() {
        return percentHardSurface;
    }

    public void setPercentHardSurface(double percentHardSurface) {
        this.percentHardSurface = percentHardSurface;
    }

    public int getPlantingSiteNumber() {
        return plantingSiteNumber;
    }

    public void setPlantingSiteNumber(int plantingSiteNumber) {
        this.plantingSiteNumber = plantingSiteNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStreetCode() {
        return streetCode;
    }

    public void setStreetCode(String streetCode) {
        this.streetCode = streetCode;
    }

    public String[] getPlantingSiteStewardshipLog() {
        return plantingSiteStewardshipLog;
    }

    public void setPlantingSiteStewardshipLog(String[] plantingSiteStewardshipLog) {
        this.plantingSiteStewardshipLog = plantingSiteStewardshipLog;
    }

    public double getCo2StoredToDate() {
        return co2StoredToDate;
    }

    public void setCo2StoredToDate(double co2StoredToDate) {
        this.co2StoredToDate = co2StoredToDate;
    }

    public double getCo2StoredToDateDollars() {
        return co2StoredToDateDollars;
    }

    public void setCo2StoredToDateDollars(double co2StoredToDateDollars) {
        this.co2StoredToDateDollars = co2StoredToDateDollars;
    }

    public double getEnergyConserved() {
        return energyConserved;
    }

    public void setEnergyConserved(double energyConserved) {
        this.energyConserved = energyConserved;
    }

    public double getEnergyConservedDollars() {
        return energyConservedDollars;
    }

    public void setEnergyConservedDollars(double energyConservedDollars) {
        this.energyConservedDollars = energyConservedDollars;
    }

    public double getCo2Removed() {
        return co2Removed;
    }

    public void setCo2Removed(double co2Removed) {
        this.co2Removed = co2Removed;
    }

    public double getCo2RemovedDollars() {
        return co2RemovedDollars;
    }

    public void setCo2RemovedDollars(double co2RemovedDollars) {
        this.co2RemovedDollars = co2RemovedDollars;
    }

    public double getAirQualityImproved() {
        return airQualityImproved;
    }

    public void setAirQualityImproved(double airQualityImproved) {
        this.airQualityImproved = airQualityImproved;
    }

    public double getAirQualityImprovedDollars() {
        return airQualityImprovedDollars;
    }

    public void setAirQualityImprovedDollars(double airQualityImprovedDollars) {
        this.airQualityImprovedDollars = airQualityImprovedDollars;
    }

    public double getStormwaterFiltered() {
        return stormwaterFiltered;
    }

    public void setStormwaterFiltered(double stormwaterFiltered) {
        this.stormwaterFiltered = stormwaterFiltered;
    }

    public double getStormWaterFilteredDollars() {
        return stormWaterFilteredDollars;
    }

    public void setStormWaterFilteredDollars(double stormWaterFilteredDollars) {
        this.stormWaterFilteredDollars = stormWaterFilteredDollars;
    }

}
