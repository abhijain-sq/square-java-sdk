
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * This is a model class for Merchant type.
 */
public class Merchant {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String id;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String businessName;
    private final String country;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String languageCode;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String currency;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String status;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String mainLocationId;

    /**
     * Initialization constructor.
     * @param  country  String value for country.
     * @param  id  String value for id.
     * @param  businessName  String value for businessName.
     * @param  languageCode  String value for languageCode.
     * @param  currency  String value for currency.
     * @param  status  String value for status.
     * @param  mainLocationId  String value for mainLocationId.
     */
    @JsonCreator
    public Merchant(
            @JsonProperty("country") String country,
            @JsonProperty("id") String id,
            @JsonProperty("business_name") String businessName,
            @JsonProperty("language_code") String languageCode,
            @JsonProperty("currency") String currency,
            @JsonProperty("status") String status,
            @JsonProperty("main_location_id") String mainLocationId) {
        this.id = id;
        this.businessName = businessName;
        this.country = country;
        this.languageCode = languageCode;
        this.currency = currency;
        this.status = status;
        this.mainLocationId = mainLocationId;
    }

    /**
     * Getter for Id.
     * The Square-issued ID of the merchant.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Getter for BusinessName.
     * The business name of the merchant.
     * @return Returns the String
     */
    @JsonGetter("business_name")
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Getter for Country.
     * Indicates the country associated with another entity, such as a business. Values are in [ISO
     * 3166-1-alpha-2 format](http://www.iso.org/iso/home/standards/country_codes.htm).
     * @return Returns the String
     */
    @JsonGetter("country")
    public String getCountry() {
        return country;
    }

    /**
     * Getter for LanguageCode.
     * The language code associated with the merchant account, in BCP 47 format.
     * @return Returns the String
     */
    @JsonGetter("language_code")
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Getter for Currency.
     * Indicates the associated currency for an amount of money. Values correspond to [ISO
     * 4217](https://wikipedia.org/wiki/ISO_4217).
     * @return Returns the String
     */
    @JsonGetter("currency")
    public String getCurrency() {
        return currency;
    }

    /**
     * Getter for Status.
     * @return Returns the String
     */
    @JsonGetter("status")
    public String getStatus() {
        return status;
    }

    /**
     * Getter for MainLocationId.
     * The ID of the main `Location` for this merchant.
     * @return Returns the String
     */
    @JsonGetter("main_location_id")
    public String getMainLocationId() {
        return mainLocationId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, businessName, country, languageCode, currency, status,
                mainLocationId);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Merchant)) {
            return false;
        }
        Merchant other = (Merchant) obj;
        return Objects.equals(id, other.id)
            && Objects.equals(businessName, other.businessName)
            && Objects.equals(country, other.country)
            && Objects.equals(languageCode, other.languageCode)
            && Objects.equals(currency, other.currency)
            && Objects.equals(status, other.status)
            && Objects.equals(mainLocationId, other.mainLocationId);
    }

    /**
     * Converts this Merchant into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Merchant [" + "country=" + country + ", id=" + id + ", businessName=" + businessName
                + ", languageCode=" + languageCode + ", currency=" + currency + ", status=" + status
                + ", mainLocationId=" + mainLocationId + "]";
    }

    /**
     * Builds a new {@link Merchant.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Merchant.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(country)
                .id(getId())
                .businessName(getBusinessName())
                .languageCode(getLanguageCode())
                .currency(getCurrency())
                .status(getStatus())
                .mainLocationId(getMainLocationId());
        return builder;
    }

    /**
     * Class to build instances of {@link Merchant}.
     */
    public static class Builder {
        private String country;
        private String id;
        private String businessName;
        private String languageCode;
        private String currency;
        private String status;
        private String mainLocationId;

        /**
         * Initialization constructor.
         * @param  country  String value for country.
         */
        public Builder(String country) {
            this.country = country;
        }

        /**
         * Setter for country.
         * @param  country  String value for country.
         * @return Builder
         */
        public Builder country(String country) {
            this.country = country;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for businessName.
         * @param  businessName  String value for businessName.
         * @return Builder
         */
        public Builder businessName(String businessName) {
            this.businessName = businessName;
            return this;
        }

        /**
         * Setter for languageCode.
         * @param  languageCode  String value for languageCode.
         * @return Builder
         */
        public Builder languageCode(String languageCode) {
            this.languageCode = languageCode;
            return this;
        }

        /**
         * Setter for currency.
         * @param  currency  String value for currency.
         * @return Builder
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for mainLocationId.
         * @param  mainLocationId  String value for mainLocationId.
         * @return Builder
         */
        public Builder mainLocationId(String mainLocationId) {
            this.mainLocationId = mainLocationId;
            return this;
        }

        /**
         * Builds a new {@link Merchant} object using the set fields.
         * @return {@link Merchant}
         */
        public Merchant build() {
            return new Merchant(country, id, businessName, languageCode, currency, status,
                    mainLocationId);
        }
    }
}
