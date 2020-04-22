package com.squareup.square.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonGetter;


/**
 * This is a model class for CustomerGroup type.
 */
public class CustomerGroup {

    /**
     * Initialization constructor.
     * @param name
     * @param id
     * @param createdAt
     * @param updatedAt
     */
    @JsonCreator
    public CustomerGroup(
            @JsonProperty("name") String name,
            @JsonProperty("id") String id,
            @JsonProperty("created_at") String createdAt,
            @JsonProperty("updated_at") String updatedAt) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    private final String id;
    private final String name;
    private final String createdAt;
    private final String updatedAt;
    /**
     * Getter for Id.
     * Unique Square-generated ID for the customer group.
     */
    @JsonGetter("id")
    public String getId() {
        return this.id;
    }

    /**
     * Getter for Name.
     * Name of the customer group.
     */
    @JsonGetter("name")
    public String getName() {
        return this.name;
    }

    /**
     * Getter for CreatedAt.
     * The timestamp when the customer group was created, in RFC 3339 format.
     */
    @JsonGetter("created_at")
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Getter for UpdatedAt.
     * The timesamp when the customer group was last updated, in RFC 3339 format.
     */
    @JsonGetter("updated_at")
    public String getUpdatedAt() {
        return this.updatedAt;
    }

 
    @Override
    public int hashCode() {
        return Objects.hash(id, name, createdAt, updatedAt);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if(!(obj instanceof CustomerGroup)) {
            return false;
        }
        CustomerGroup customerGroup = (CustomerGroup) obj;
        return Objects.equals(id, customerGroup.id) &&
            Objects.equals(name, customerGroup.name) &&
            Objects.equals(createdAt, customerGroup.createdAt) &&
            Objects.equals(updatedAt, customerGroup.updatedAt);
    }

    /**
     * Builds a new {@link CustomerGroup.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CustomerGroup.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name)
            .id(getId())
            .createdAt(getCreatedAt())
            .updatedAt(getUpdatedAt());
            return builder;
    }

    /**
     * Class to build instances of {@link CustomerGroup}
     */
    public static class Builder {
        private String name;
        private String id;
        private String createdAt;
        private String updatedAt;

        /**
         * Initialization constructor
         */
        public Builder(String name) {
            this.name = name;
        }

        /**
         * Setter for name
         * @param name
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        /**
         * Setter for id
         * @param id
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }
        /**
         * Setter for createdAt
         * @param createdAt
         * @return Builder
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        /**
         * Setter for updatedAt
         * @param updatedAt
         * @return Builder
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Builds a new {@link CustomerGroup} object using the set fields.
         * @return {@link CustomerGroup}
         */
        public CustomerGroup build() {
            return new CustomerGroup(name,
                id,
                createdAt,
                updatedAt);
        }
    }
}
