package com.ringcentral.definitions;


public class ExtensionCreationRequest {
    /**
     * Contact Information
     */
    public ContactInfoCreationRequest contact;
    /**
     * Number of extension
     */
    public String extensionNumber;
    /**
     *
     */
    public CustomFieldInfo[] customFields;
    /**
     * Password for extension. If not specified, the password is auto-generated
     */
    public String password;
    /**
     * List of non-RC internal identifiers assigned to an extension
     */
    public ReferenceInfo[] references;
    /**
     * Extension region data (timezone, home country, language)
     */
    public RegionalSettings regionalSettings;
    /**
     * Additional extension identifier, created by partner application and applied on client side
     */
    public String partnerId;
    /**
     * IVR PIN
     */
    public String ivrPin;
    /**
     * Specifies extension configuration wizard state (web service setup).
     * Default: NotStarted
     * Enum: NotStarted, Incomplete, Completed
     */
    public String setupWizardState;
    /**
     *
     */
    public SiteInfo site;
    /**
     * Extension current state
     * Enum: Enabled, Disabled, NotActivated, Unassigned, Frozen
     */
    public String status;
    /**
     * Status information (reason, comment). For 'Disabled' status only
     */
    public ExtensionStatusInfo statusInfo;
    /**
     * Extension type
     * Enum: User, VirtualUser, DigitalUser, Department, Announcement, Voicemail, SharedLinesGroup, PagingOnly, ParkLocation, Limited
     */
    public String type;
    /**
     * Hides extension from showing in company directory. Supported for extensions of User type only. For unassigned extensions the value is set to 'True' by default. For assigned extensions the value is set to 'False' by default
     */
    public Boolean hidden;

    public ExtensionCreationRequest contact(ContactInfoCreationRequest contact) {
        this.contact = contact;
        return this;
    }

    public ExtensionCreationRequest extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public ExtensionCreationRequest customFields(CustomFieldInfo[] customFields) {
        this.customFields = customFields;
        return this;
    }

    public ExtensionCreationRequest password(String password) {
        this.password = password;
        return this;
    }

    public ExtensionCreationRequest references(ReferenceInfo[] references) {
        this.references = references;
        return this;
    }

    public ExtensionCreationRequest regionalSettings(RegionalSettings regionalSettings) {
        this.regionalSettings = regionalSettings;
        return this;
    }

    public ExtensionCreationRequest partnerId(String partnerId) {
        this.partnerId = partnerId;
        return this;
    }

    public ExtensionCreationRequest ivrPin(String ivrPin) {
        this.ivrPin = ivrPin;
        return this;
    }

    public ExtensionCreationRequest setupWizardState(String setupWizardState) {
        this.setupWizardState = setupWizardState;
        return this;
    }

    public ExtensionCreationRequest site(SiteInfo site) {
        this.site = site;
        return this;
    }

    public ExtensionCreationRequest status(String status) {
        this.status = status;
        return this;
    }

    public ExtensionCreationRequest statusInfo(ExtensionStatusInfo statusInfo) {
        this.statusInfo = statusInfo;
        return this;
    }

    public ExtensionCreationRequest type(String type) {
        this.type = type;
        return this;
    }

    public ExtensionCreationRequest hidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }

}
