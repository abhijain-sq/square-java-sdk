
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * This is a model class for InventoryAdjustment type.
 */
public class InventoryAdjustment {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String id;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String referenceId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String fromState;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String toState;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String locationId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String catalogObjectId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String catalogObjectType;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String quantity;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final Money totalPriceMoney;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String occurredAt;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String createdAt;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final SourceApplication source;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String employeeId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String transactionId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String refundId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String purchaseOrderId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String goodsReceiptId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final InventoryAdjustmentGroup adjustmentGroup;

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  referenceId  String value for referenceId.
     * @param  fromState  String value for fromState.
     * @param  toState  String value for toState.
     * @param  locationId  String value for locationId.
     * @param  catalogObjectId  String value for catalogObjectId.
     * @param  catalogObjectType  String value for catalogObjectType.
     * @param  quantity  String value for quantity.
     * @param  totalPriceMoney  Money value for totalPriceMoney.
     * @param  occurredAt  String value for occurredAt.
     * @param  createdAt  String value for createdAt.
     * @param  source  SourceApplication value for source.
     * @param  employeeId  String value for employeeId.
     * @param  transactionId  String value for transactionId.
     * @param  refundId  String value for refundId.
     * @param  purchaseOrderId  String value for purchaseOrderId.
     * @param  goodsReceiptId  String value for goodsReceiptId.
     * @param  adjustmentGroup  InventoryAdjustmentGroup value for adjustmentGroup.
     */
    @JsonCreator
    public InventoryAdjustment(
            @JsonProperty("id") String id,
            @JsonProperty("reference_id") String referenceId,
            @JsonProperty("from_state") String fromState,
            @JsonProperty("to_state") String toState,
            @JsonProperty("location_id") String locationId,
            @JsonProperty("catalog_object_id") String catalogObjectId,
            @JsonProperty("catalog_object_type") String catalogObjectType,
            @JsonProperty("quantity") String quantity,
            @JsonProperty("total_price_money") Money totalPriceMoney,
            @JsonProperty("occurred_at") String occurredAt,
            @JsonProperty("created_at") String createdAt,
            @JsonProperty("source") SourceApplication source,
            @JsonProperty("employee_id") String employeeId,
            @JsonProperty("transaction_id") String transactionId,
            @JsonProperty("refund_id") String refundId,
            @JsonProperty("purchase_order_id") String purchaseOrderId,
            @JsonProperty("goods_receipt_id") String goodsReceiptId,
            @JsonProperty("adjustment_group") InventoryAdjustmentGroup adjustmentGroup) {
        this.id = id;
        this.referenceId = referenceId;
        this.fromState = fromState;
        this.toState = toState;
        this.locationId = locationId;
        this.catalogObjectId = catalogObjectId;
        this.catalogObjectType = catalogObjectType;
        this.quantity = quantity;
        this.totalPriceMoney = totalPriceMoney;
        this.occurredAt = occurredAt;
        this.createdAt = createdAt;
        this.source = source;
        this.employeeId = employeeId;
        this.transactionId = transactionId;
        this.refundId = refundId;
        this.purchaseOrderId = purchaseOrderId;
        this.goodsReceiptId = goodsReceiptId;
        this.adjustmentGroup = adjustmentGroup;
    }

    /**
     * Getter for Id.
     * A unique ID generated by Square for the `InventoryAdjustment`.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Getter for ReferenceId.
     * An optional ID provided by the application to tie the `InventoryAdjustment` to an external
     * system.
     * @return Returns the String
     */
    @JsonGetter("reference_id")
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Getter for FromState.
     * Indicates the state of a tracked item quantity in the lifecycle of goods.
     * @return Returns the String
     */
    @JsonGetter("from_state")
    public String getFromState() {
        return fromState;
    }

    /**
     * Getter for ToState.
     * Indicates the state of a tracked item quantity in the lifecycle of goods.
     * @return Returns the String
     */
    @JsonGetter("to_state")
    public String getToState() {
        return toState;
    }

    /**
     * Getter for LocationId.
     * The Square-generated ID of the [Location]($m/Location) where the related quantity of items is
     * being tracked.
     * @return Returns the String
     */
    @JsonGetter("location_id")
    public String getLocationId() {
        return locationId;
    }

    /**
     * Getter for CatalogObjectId.
     * The Square-generated ID of the [CatalogObject]($m/CatalogObject) being tracked.
     * @return Returns the String
     */
    @JsonGetter("catalog_object_id")
    public String getCatalogObjectId() {
        return catalogObjectId;
    }

    /**
     * Getter for CatalogObjectType.
     * The [type]($m/CatalogObjectType) of the [CatalogObject]($m/CatalogObject) being tracked.
     * Tracking is only supported for the `ITEM_VARIATION` type.
     * @return Returns the String
     */
    @JsonGetter("catalog_object_type")
    public String getCatalogObjectType() {
        return catalogObjectType;
    }

    /**
     * Getter for Quantity.
     * The number of items affected by the adjustment as a decimal string. Can support up to 5
     * digits after the decimal point.
     * @return Returns the String
     */
    @JsonGetter("quantity")
    public String getQuantity() {
        return quantity;
    }

    /**
     * Getter for TotalPriceMoney.
     * Represents an amount of money. `Money` fields can be signed or unsigned. Fields that do not
     * explicitly define whether they are signed or unsigned are considered unsigned and can only
     * hold positive amounts. For signed fields, the sign of the value indicates the purpose of the
     * money transfer. See [Working with Monetary
     * Amounts](https://developer.squareup.com/docs/build-basics/working-with-monetary-amounts) for
     * more information.
     * @return Returns the Money
     */
    @JsonGetter("total_price_money")
    public Money getTotalPriceMoney() {
        return totalPriceMoney;
    }

    /**
     * Getter for OccurredAt.
     * A client-generated RFC 3339-formatted timestamp that indicates when the inventory adjustment
     * took place. For inventory adjustment updates, the `occurred_at` timestamp cannot be older
     * than 24 hours or in the future relative to the time of the request.
     * @return Returns the String
     */
    @JsonGetter("occurred_at")
    public String getOccurredAt() {
        return occurredAt;
    }

    /**
     * Getter for CreatedAt.
     * An RFC 3339-formatted timestamp that indicates when the inventory adjustment is received.
     * @return Returns the String
     */
    @JsonGetter("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Getter for Source.
     * Provides information about the application used to generate a change.
     * @return Returns the SourceApplication
     */
    @JsonGetter("source")
    public SourceApplication getSource() {
        return source;
    }

    /**
     * Getter for EmployeeId.
     * The Square-generated ID of the [Employee]($m/Employee) responsible for the inventory
     * adjustment.
     * @return Returns the String
     */
    @JsonGetter("employee_id")
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * Getter for TransactionId.
     * The Square-generated ID of the [Transaction][#type-transaction] that caused the adjustment.
     * Only relevant for payment-related state transitions.
     * @return Returns the String
     */
    @JsonGetter("transaction_id")
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Getter for RefundId.
     * The Square-generated ID of the [Refund][#type-refund] that caused the adjustment. Only
     * relevant for refund-related state transitions.
     * @return Returns the String
     */
    @JsonGetter("refund_id")
    public String getRefundId() {
        return refundId;
    }

    /**
     * Getter for PurchaseOrderId.
     * The Square-generated ID of the purchase order that caused the adjustment. Only relevant for
     * state transitions from the Square for Retail app.
     * @return Returns the String
     */
    @JsonGetter("purchase_order_id")
    public String getPurchaseOrderId() {
        return purchaseOrderId;
    }

    /**
     * Getter for GoodsReceiptId.
     * The Square-generated ID of the goods receipt that caused the adjustment. Only relevant for
     * state transitions from the Square for Retail app.
     * @return Returns the String
     */
    @JsonGetter("goods_receipt_id")
    public String getGoodsReceiptId() {
        return goodsReceiptId;
    }

    /**
     * Getter for AdjustmentGroup.
     * @return Returns the InventoryAdjustmentGroup
     */
    @JsonGetter("adjustment_group")
    public InventoryAdjustmentGroup getAdjustmentGroup() {
        return adjustmentGroup;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, referenceId, fromState, toState, locationId, catalogObjectId,
                catalogObjectType, quantity, totalPriceMoney, occurredAt, createdAt, source,
                employeeId, transactionId, refundId, purchaseOrderId, goodsReceiptId,
                adjustmentGroup);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InventoryAdjustment)) {
            return false;
        }
        InventoryAdjustment other = (InventoryAdjustment) obj;
        return Objects.equals(id, other.id)
            && Objects.equals(referenceId, other.referenceId)
            && Objects.equals(fromState, other.fromState)
            && Objects.equals(toState, other.toState)
            && Objects.equals(locationId, other.locationId)
            && Objects.equals(catalogObjectId, other.catalogObjectId)
            && Objects.equals(catalogObjectType, other.catalogObjectType)
            && Objects.equals(quantity, other.quantity)
            && Objects.equals(totalPriceMoney, other.totalPriceMoney)
            && Objects.equals(occurredAt, other.occurredAt)
            && Objects.equals(createdAt, other.createdAt)
            && Objects.equals(source, other.source)
            && Objects.equals(employeeId, other.employeeId)
            && Objects.equals(transactionId, other.transactionId)
            && Objects.equals(refundId, other.refundId)
            && Objects.equals(purchaseOrderId, other.purchaseOrderId)
            && Objects.equals(goodsReceiptId, other.goodsReceiptId)
            && Objects.equals(adjustmentGroup, other.adjustmentGroup);
    }

    /**
     * Converts this InventoryAdjustment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InventoryAdjustment [" + "id=" + id + ", referenceId=" + referenceId
                + ", fromState=" + fromState + ", toState=" + toState + ", locationId=" + locationId
                + ", catalogObjectId=" + catalogObjectId + ", catalogObjectType="
                + catalogObjectType + ", quantity=" + quantity + ", totalPriceMoney="
                + totalPriceMoney + ", occurredAt=" + occurredAt + ", createdAt=" + createdAt
                + ", source=" + source + ", employeeId=" + employeeId + ", transactionId="
                + transactionId + ", refundId=" + refundId + ", purchaseOrderId=" + purchaseOrderId
                + ", goodsReceiptId=" + goodsReceiptId + ", adjustmentGroup=" + adjustmentGroup
                + "]";
    }

    /**
     * Builds a new {@link InventoryAdjustment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InventoryAdjustment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .referenceId(getReferenceId())
                .fromState(getFromState())
                .toState(getToState())
                .locationId(getLocationId())
                .catalogObjectId(getCatalogObjectId())
                .catalogObjectType(getCatalogObjectType())
                .quantity(getQuantity())
                .totalPriceMoney(getTotalPriceMoney())
                .occurredAt(getOccurredAt())
                .createdAt(getCreatedAt())
                .source(getSource())
                .employeeId(getEmployeeId())
                .transactionId(getTransactionId())
                .refundId(getRefundId())
                .purchaseOrderId(getPurchaseOrderId())
                .goodsReceiptId(getGoodsReceiptId())
                .adjustmentGroup(getAdjustmentGroup());
        return builder;
    }

    /**
     * Class to build instances of {@link InventoryAdjustment}.
     */
    public static class Builder {
        private String id;
        private String referenceId;
        private String fromState;
        private String toState;
        private String locationId;
        private String catalogObjectId;
        private String catalogObjectType;
        private String quantity;
        private Money totalPriceMoney;
        private String occurredAt;
        private String createdAt;
        private SourceApplication source;
        private String employeeId;
        private String transactionId;
        private String refundId;
        private String purchaseOrderId;
        private String goodsReceiptId;
        private InventoryAdjustmentGroup adjustmentGroup;



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
         * Setter for referenceId.
         * @param  referenceId  String value for referenceId.
         * @return Builder
         */
        public Builder referenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }

        /**
         * Setter for fromState.
         * @param  fromState  String value for fromState.
         * @return Builder
         */
        public Builder fromState(String fromState) {
            this.fromState = fromState;
            return this;
        }

        /**
         * Setter for toState.
         * @param  toState  String value for toState.
         * @return Builder
         */
        public Builder toState(String toState) {
            this.toState = toState;
            return this;
        }

        /**
         * Setter for locationId.
         * @param  locationId  String value for locationId.
         * @return Builder
         */
        public Builder locationId(String locationId) {
            this.locationId = locationId;
            return this;
        }

        /**
         * Setter for catalogObjectId.
         * @param  catalogObjectId  String value for catalogObjectId.
         * @return Builder
         */
        public Builder catalogObjectId(String catalogObjectId) {
            this.catalogObjectId = catalogObjectId;
            return this;
        }

        /**
         * Setter for catalogObjectType.
         * @param  catalogObjectType  String value for catalogObjectType.
         * @return Builder
         */
        public Builder catalogObjectType(String catalogObjectType) {
            this.catalogObjectType = catalogObjectType;
            return this;
        }

        /**
         * Setter for quantity.
         * @param  quantity  String value for quantity.
         * @return Builder
         */
        public Builder quantity(String quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * Setter for totalPriceMoney.
         * @param  totalPriceMoney  Money value for totalPriceMoney.
         * @return Builder
         */
        public Builder totalPriceMoney(Money totalPriceMoney) {
            this.totalPriceMoney = totalPriceMoney;
            return this;
        }

        /**
         * Setter for occurredAt.
         * @param  occurredAt  String value for occurredAt.
         * @return Builder
         */
        public Builder occurredAt(String occurredAt) {
            this.occurredAt = occurredAt;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  String value for createdAt.
         * @return Builder
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for source.
         * @param  source  SourceApplication value for source.
         * @return Builder
         */
        public Builder source(SourceApplication source) {
            this.source = source;
            return this;
        }

        /**
         * Setter for employeeId.
         * @param  employeeId  String value for employeeId.
         * @return Builder
         */
        public Builder employeeId(String employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        /**
         * Setter for transactionId.
         * @param  transactionId  String value for transactionId.
         * @return Builder
         */
        public Builder transactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }

        /**
         * Setter for refundId.
         * @param  refundId  String value for refundId.
         * @return Builder
         */
        public Builder refundId(String refundId) {
            this.refundId = refundId;
            return this;
        }

        /**
         * Setter for purchaseOrderId.
         * @param  purchaseOrderId  String value for purchaseOrderId.
         * @return Builder
         */
        public Builder purchaseOrderId(String purchaseOrderId) {
            this.purchaseOrderId = purchaseOrderId;
            return this;
        }

        /**
         * Setter for goodsReceiptId.
         * @param  goodsReceiptId  String value for goodsReceiptId.
         * @return Builder
         */
        public Builder goodsReceiptId(String goodsReceiptId) {
            this.goodsReceiptId = goodsReceiptId;
            return this;
        }

        /**
         * Setter for adjustmentGroup.
         * @param  adjustmentGroup  InventoryAdjustmentGroup value for adjustmentGroup.
         * @return Builder
         */
        public Builder adjustmentGroup(InventoryAdjustmentGroup adjustmentGroup) {
            this.adjustmentGroup = adjustmentGroup;
            return this;
        }

        /**
         * Builds a new {@link InventoryAdjustment} object using the set fields.
         * @return {@link InventoryAdjustment}
         */
        public InventoryAdjustment build() {
            return new InventoryAdjustment(id, referenceId, fromState, toState, locationId,
                    catalogObjectId, catalogObjectType, quantity, totalPriceMoney, occurredAt,
                    createdAt, source, employeeId, transactionId, refundId, purchaseOrderId,
                    goodsReceiptId, adjustmentGroup);
        }
    }
}
