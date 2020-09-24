package com.ringcentral.definitions;


public class UpdateNetworkRequest {
    /**
     *
     */
    public String name;
    /**
     *
     */
    public AutomaticLocationUpdatesSiteInfo site;
    /**
     *
     */
    public PublicIpRangeInfo[] publicIpRanges;
    /**
     *
     */
    public PrivateIpRangeInfoRequest[] privateIpRanges;
    /**
     * Emergency response location information
     */
    public ERLLocationInfo emergencyLocation;

    public UpdateNetworkRequest name(String name) {
        this.name = name;
        return this;
    }

    public UpdateNetworkRequest site(AutomaticLocationUpdatesSiteInfo site) {
        this.site = site;
        return this;
    }

    public UpdateNetworkRequest publicIpRanges(PublicIpRangeInfo[] publicIpRanges) {
        this.publicIpRanges = publicIpRanges;
        return this;
    }

    public UpdateNetworkRequest privateIpRanges(PrivateIpRangeInfoRequest[] privateIpRanges) {
        this.privateIpRanges = privateIpRanges;
        return this;
    }

    public UpdateNetworkRequest emergencyLocation(ERLLocationInfo emergencyLocation) {
        this.emergencyLocation = emergencyLocation;
        return this;
    }

}
