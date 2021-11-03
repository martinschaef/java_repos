/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A list of response headers policies.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ResponseHeadersPolicyList"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResponseHeadersPolicyList implements Serializable, Cloneable {

    /**
     * <p>
     * If there are more items in the list than are in this response, this element is present. It contains the value
     * that you should use in the <code>Marker</code> field of a subsequent request to continue listing response headers
     * policies where you left off.
     * </p>
     */
    private String nextMarker;
    /**
     * <p>
     * The maximum number of response headers policies requested.
     * </p>
     */
    private Integer maxItems;
    /**
     * <p>
     * The number of response headers policies returned.
     * </p>
     */
    private Integer quantity;
    /**
     * <p>
     * The response headers policies in the list.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ResponseHeadersPolicySummary> items;

    /**
     * <p>
     * If there are more items in the list than are in this response, this element is present. It contains the value
     * that you should use in the <code>Marker</code> field of a subsequent request to continue listing response headers
     * policies where you left off.
     * </p>
     * 
     * @param nextMarker
     *        If there are more items in the list than are in this response, this element is present. It contains the
     *        value that you should use in the <code>Marker</code> field of a subsequent request to continue listing
     *        response headers policies where you left off.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * If there are more items in the list than are in this response, this element is present. It contains the value
     * that you should use in the <code>Marker</code> field of a subsequent request to continue listing response headers
     * policies where you left off.
     * </p>
     * 
     * @return If there are more items in the list than are in this response, this element is present. It contains the
     *         value that you should use in the <code>Marker</code> field of a subsequent request to continue listing
     *         response headers policies where you left off.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * If there are more items in the list than are in this response, this element is present. It contains the value
     * that you should use in the <code>Marker</code> field of a subsequent request to continue listing response headers
     * policies where you left off.
     * </p>
     * 
     * @param nextMarker
     *        If there are more items in the list than are in this response, this element is present. It contains the
     *        value that you should use in the <code>Marker</code> field of a subsequent request to continue listing
     *        response headers policies where you left off.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicyList withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
        return this;
    }

    /**
     * <p>
     * The maximum number of response headers policies requested.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of response headers policies requested.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of response headers policies requested.
     * </p>
     * 
     * @return The maximum number of response headers policies requested.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The maximum number of response headers policies requested.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of response headers policies requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicyList withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    /**
     * <p>
     * The number of response headers policies returned.
     * </p>
     * 
     * @param quantity
     *        The number of response headers policies returned.
     */

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The number of response headers policies returned.
     * </p>
     * 
     * @return The number of response headers policies returned.
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * <p>
     * The number of response headers policies returned.
     * </p>
     * 
     * @param quantity
     *        The number of response headers policies returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicyList withQuantity(Integer quantity) {
        setQuantity(quantity);
        return this;
    }

    /**
     * <p>
     * The response headers policies in the list.
     * </p>
     * 
     * @return The response headers policies in the list.
     */

    public java.util.List<ResponseHeadersPolicySummary> getItems() {
        if (items == null) {
            items = new com.amazonaws.internal.SdkInternalList<ResponseHeadersPolicySummary>();
        }
        return items;
    }

    /**
     * <p>
     * The response headers policies in the list.
     * </p>
     * 
     * @param items
     *        The response headers policies in the list.
     */

    public void setItems(java.util.Collection<ResponseHeadersPolicySummary> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new com.amazonaws.internal.SdkInternalList<ResponseHeadersPolicySummary>(items);
    }

    /**
     * <p>
     * The response headers policies in the list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        The response headers policies in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicyList withItems(ResponseHeadersPolicySummary... items) {
        if (this.items == null) {
            setItems(new com.amazonaws.internal.SdkInternalList<ResponseHeadersPolicySummary>(items.length));
        }
        for (ResponseHeadersPolicySummary ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The response headers policies in the list.
     * </p>
     * 
     * @param items
     *        The response headers policies in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicyList withItems(java.util.Collection<ResponseHeadersPolicySummary> items) {
        setItems(items);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getNextMarker() != null)
            sb.append("NextMarker: ").append(getNextMarker()).append(",");
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems()).append(",");
        if (getQuantity() != null)
            sb.append("Quantity: ").append(getQuantity()).append(",");
        if (getItems() != null)
            sb.append("Items: ").append(getItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResponseHeadersPolicyList == false)
            return false;
        ResponseHeadersPolicyList other = (ResponseHeadersPolicyList) obj;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        if (other.getQuantity() == null ^ this.getQuantity() == null)
            return false;
        if (other.getQuantity() != null && other.getQuantity().equals(this.getQuantity()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        hashCode = prime * hashCode + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        return hashCode;
    }

    @Override
    public ResponseHeadersPolicyList clone() {
        try {
            return (ResponseHeadersPolicyList) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}