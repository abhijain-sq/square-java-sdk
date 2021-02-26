
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * This is a model class for V1ListEmployeeRolesRequest type.
 */
public class V1ListEmployeeRolesRequest {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String order;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final Integer limit;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String batchToken;

    /**
     * Initialization constructor.
     * @param  order  String value for order.
     * @param  limit  Integer value for limit.
     * @param  batchToken  String value for batchToken.
     */
    @JsonCreator
    public V1ListEmployeeRolesRequest(
            @JsonProperty("order") String order,
            @JsonProperty("limit") Integer limit,
            @JsonProperty("batch_token") String batchToken) {
        this.order = order;
        this.limit = limit;
        this.batchToken = batchToken;
    }

    /**
     * Getter for Order.
     * The order (e.g., chronological or alphabetical) in which results from a request are returned.
     * @return Returns the String
     */
    @JsonGetter("order")
    public String getOrder() {
        return order;
    }

    /**
     * Getter for Limit.
     * The maximum integer number of employee entities to return in a single response. Default 100,
     * maximum 200.
     * @return Returns the Integer
     */
    @JsonGetter("limit")
    public Integer getLimit() {
        return limit;
    }

    /**
     * Getter for BatchToken.
     * A pagination cursor to retrieve the next set of results for your original query to the
     * endpoint.
     * @return Returns the String
     */
    @JsonGetter("batch_token")
    public String getBatchToken() {
        return batchToken;
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, limit, batchToken);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V1ListEmployeeRolesRequest)) {
            return false;
        }
        V1ListEmployeeRolesRequest other = (V1ListEmployeeRolesRequest) obj;
        return Objects.equals(order, other.order)
            && Objects.equals(limit, other.limit)
            && Objects.equals(batchToken, other.batchToken);
    }

    /**
     * Converts this V1ListEmployeeRolesRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "V1ListEmployeeRolesRequest [" + "order=" + order + ", limit=" + limit
                + ", batchToken=" + batchToken + "]";
    }

    /**
     * Builds a new {@link V1ListEmployeeRolesRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link V1ListEmployeeRolesRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .order(getOrder())
                .limit(getLimit())
                .batchToken(getBatchToken());
        return builder;
    }

    /**
     * Class to build instances of {@link V1ListEmployeeRolesRequest}.
     */
    public static class Builder {
        private String order;
        private Integer limit;
        private String batchToken;



        /**
         * Setter for order.
         * @param  order  String value for order.
         * @return Builder
         */
        public Builder order(String order) {
            this.order = order;
            return this;
        }

        /**
         * Setter for limit.
         * @param  limit  Integer value for limit.
         * @return Builder
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Setter for batchToken.
         * @param  batchToken  String value for batchToken.
         * @return Builder
         */
        public Builder batchToken(String batchToken) {
            this.batchToken = batchToken;
            return this;
        }

        /**
         * Builds a new {@link V1ListEmployeeRolesRequest} object using the set fields.
         * @return {@link V1ListEmployeeRolesRequest}
         */
        public V1ListEmployeeRolesRequest build() {
            return new V1ListEmployeeRolesRequest(order, limit, batchToken);
        }
    }
}
