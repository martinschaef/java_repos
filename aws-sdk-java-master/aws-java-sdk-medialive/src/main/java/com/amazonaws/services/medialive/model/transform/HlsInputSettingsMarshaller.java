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
package com.amazonaws.services.medialive.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * HlsInputSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HlsInputSettingsMarshaller {

    private static final MarshallingInfo<Integer> BANDWIDTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bandwidth").build();
    private static final MarshallingInfo<Integer> BUFFERSEGMENTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bufferSegments").build();
    private static final MarshallingInfo<Integer> RETRIES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("retries").build();
    private static final MarshallingInfo<Integer> RETRYINTERVAL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("retryInterval").build();
    private static final MarshallingInfo<String> SCTE35SOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scte35Source").build();

    private static final HlsInputSettingsMarshaller instance = new HlsInputSettingsMarshaller();

    public static HlsInputSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(HlsInputSettings hlsInputSettings, ProtocolMarshaller protocolMarshaller) {

        if (hlsInputSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(hlsInputSettings.getBandwidth(), BANDWIDTH_BINDING);
            protocolMarshaller.marshall(hlsInputSettings.getBufferSegments(), BUFFERSEGMENTS_BINDING);
            protocolMarshaller.marshall(hlsInputSettings.getRetries(), RETRIES_BINDING);
            protocolMarshaller.marshall(hlsInputSettings.getRetryInterval(), RETRYINTERVAL_BINDING);
            protocolMarshaller.marshall(hlsInputSettings.getScte35Source(), SCTE35SOURCE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}