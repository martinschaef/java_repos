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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDomainRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Amazon OpenSearch Service domain you're creating. Domain names are unique across the domains
     * owned by an account within an AWS region. Domain names must start with a lowercase letter and can contain the
     * following characters: a-z (lowercase), 0-9, and - (hyphen).
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * String of format Elasticsearch_X.Y or OpenSearch_X.Y to specify the engine version for the Amazon OpenSearch
     * Service domain. For example, "OpenSearch_1.0" or "Elasticsearch_7.9". For more information, see <a href=
     * "http://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomains"
     * target="_blank">Creating and managing Amazon OpenSearch Service domains </a>.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * Configuration options for a domain. Specifies the instance type and number of instances in the domain.
     * </p>
     */
    private ClusterConfig clusterConfig;
    /**
     * <p>
     * Options to enable, disable, and specify the type and size of EBS storage volumes.
     * </p>
     */
    private EBSOptions eBSOptions;
    /**
     * <p>
     * IAM access policy as a JSON-formatted string.
     * </p>
     */
    private String accessPolicies;
    /**
     * <p>
     * Option to set time, in UTC format, of the daily automated snapshot. Default value is 0 hours.
     * </p>
     */
    private SnapshotOptions snapshotOptions;
    /**
     * <p>
     * Options to specify the subnets and security groups for a VPC endpoint. For more information, see <a
     * href="http://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html" target="_blank">Launching
     * your Amazon OpenSearch Service domains using a VPC </a>.
     * </p>
     */
    private VPCOptions vPCOptions;
    /**
     * <p>
     * Options to specify the Cognito user and identity pools for OpenSearch Dashboards authentication. For more
     * information, see <a href="http://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html"
     * target="_blank">Configuring Amazon Cognito authentication for OpenSearch Dashboards</a>.
     * </p>
     */
    private CognitoOptions cognitoOptions;
    /**
     * <p>
     * Options for encryption of data at rest.
     * </p>
     */
    private EncryptionAtRestOptions encryptionAtRestOptions;
    /**
     * <p>
     * Node-to-node encryption options.
     * </p>
     */
    private NodeToNodeEncryptionOptions nodeToNodeEncryptionOptions;
    /**
     * <p>
     * Option to allow references to indices in an HTTP request body. Must be <code>false</code> when configuring access
     * to individual sub-resources. By default, the value is <code>true</code>. See <a href=
     * "http://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options"
     * target="_blank">Advanced cluster parameters </a> for more information.
     * </p>
     */
    private java.util.Map<String, String> advancedOptions;
    /**
     * <p>
     * Map of <code>LogType</code> and <code>LogPublishingOption</code>, each containing options to publish a given type
     * of OpenSearch log.
     * </p>
     */
    private java.util.Map<String, LogPublishingOption> logPublishingOptions;
    /**
     * <p>
     * Options to specify configurations that will be applied to the domain endpoint.
     * </p>
     */
    private DomainEndpointOptions domainEndpointOptions;
    /**
     * <p>
     * Specifies advanced security options.
     * </p>
     */
    private AdvancedSecurityOptionsInput advancedSecurityOptions;
    /**
     * <p>
     * A list of <code>Tag</code> added during domain creation.
     * </p>
     */
    private java.util.List<Tag> tagList;
    /**
     * <p>
     * Specifies Auto-Tune options.
     * </p>
     */
    private AutoTuneOptionsInput autoTuneOptions;

    /**
     * <p>
     * The name of the Amazon OpenSearch Service domain you're creating. Domain names are unique across the domains
     * owned by an account within an AWS region. Domain names must start with a lowercase letter and can contain the
     * following characters: a-z (lowercase), 0-9, and - (hyphen).
     * </p>
     * 
     * @param domainName
     *        The name of the Amazon OpenSearch Service domain you're creating. Domain names are unique across the
     *        domains owned by an account within an AWS region. Domain names must start with a lowercase letter and can
     *        contain the following characters: a-z (lowercase), 0-9, and - (hyphen).
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the Amazon OpenSearch Service domain you're creating. Domain names are unique across the domains
     * owned by an account within an AWS region. Domain names must start with a lowercase letter and can contain the
     * following characters: a-z (lowercase), 0-9, and - (hyphen).
     * </p>
     * 
     * @return The name of the Amazon OpenSearch Service domain you're creating. Domain names are unique across the
     *         domains owned by an account within an AWS region. Domain names must start with a lowercase letter and can
     *         contain the following characters: a-z (lowercase), 0-9, and - (hyphen).
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the Amazon OpenSearch Service domain you're creating. Domain names are unique across the domains
     * owned by an account within an AWS region. Domain names must start with a lowercase letter and can contain the
     * following characters: a-z (lowercase), 0-9, and - (hyphen).
     * </p>
     * 
     * @param domainName
     *        The name of the Amazon OpenSearch Service domain you're creating. Domain names are unique across the
     *        domains owned by an account within an AWS region. Domain names must start with a lowercase letter and can
     *        contain the following characters: a-z (lowercase), 0-9, and - (hyphen).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * String of format Elasticsearch_X.Y or OpenSearch_X.Y to specify the engine version for the Amazon OpenSearch
     * Service domain. For example, "OpenSearch_1.0" or "Elasticsearch_7.9". For more information, see <a href=
     * "http://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomains"
     * target="_blank">Creating and managing Amazon OpenSearch Service domains </a>.
     * </p>
     * 
     * @param engineVersion
     *        String of format Elasticsearch_X.Y or OpenSearch_X.Y to specify the engine version for the Amazon
     *        OpenSearch Service domain. For example, "OpenSearch_1.0" or "Elasticsearch_7.9". For more information, see
     *        <a href=
     *        "http://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomains"
     *        target="_blank">Creating and managing Amazon OpenSearch Service domains </a>.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * String of format Elasticsearch_X.Y or OpenSearch_X.Y to specify the engine version for the Amazon OpenSearch
     * Service domain. For example, "OpenSearch_1.0" or "Elasticsearch_7.9". For more information, see <a href=
     * "http://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomains"
     * target="_blank">Creating and managing Amazon OpenSearch Service domains </a>.
     * </p>
     * 
     * @return String of format Elasticsearch_X.Y or OpenSearch_X.Y to specify the engine version for the Amazon
     *         OpenSearch Service domain. For example, "OpenSearch_1.0" or "Elasticsearch_7.9". For more information,
     *         see <a href=
     *         "http://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomains"
     *         target="_blank">Creating and managing Amazon OpenSearch Service domains </a>.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * String of format Elasticsearch_X.Y or OpenSearch_X.Y to specify the engine version for the Amazon OpenSearch
     * Service domain. For example, "OpenSearch_1.0" or "Elasticsearch_7.9". For more information, see <a href=
     * "http://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomains"
     * target="_blank">Creating and managing Amazon OpenSearch Service domains </a>.
     * </p>
     * 
     * @param engineVersion
     *        String of format Elasticsearch_X.Y or OpenSearch_X.Y to specify the engine version for the Amazon
     *        OpenSearch Service domain. For example, "OpenSearch_1.0" or "Elasticsearch_7.9". For more information, see
     *        <a href=
     *        "http://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomains"
     *        target="_blank">Creating and managing Amazon OpenSearch Service domains </a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * Configuration options for a domain. Specifies the instance type and number of instances in the domain.
     * </p>
     * 
     * @param clusterConfig
     *        Configuration options for a domain. Specifies the instance type and number of instances in the domain.
     */

    public void setClusterConfig(ClusterConfig clusterConfig) {
        this.clusterConfig = clusterConfig;
    }

    /**
     * <p>
     * Configuration options for a domain. Specifies the instance type and number of instances in the domain.
     * </p>
     * 
     * @return Configuration options for a domain. Specifies the instance type and number of instances in the domain.
     */

    public ClusterConfig getClusterConfig() {
        return this.clusterConfig;
    }

    /**
     * <p>
     * Configuration options for a domain. Specifies the instance type and number of instances in the domain.
     * </p>
     * 
     * @param clusterConfig
     *        Configuration options for a domain. Specifies the instance type and number of instances in the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withClusterConfig(ClusterConfig clusterConfig) {
        setClusterConfig(clusterConfig);
        return this;
    }

    /**
     * <p>
     * Options to enable, disable, and specify the type and size of EBS storage volumes.
     * </p>
     * 
     * @param eBSOptions
     *        Options to enable, disable, and specify the type and size of EBS storage volumes.
     */

    public void setEBSOptions(EBSOptions eBSOptions) {
        this.eBSOptions = eBSOptions;
    }

    /**
     * <p>
     * Options to enable, disable, and specify the type and size of EBS storage volumes.
     * </p>
     * 
     * @return Options to enable, disable, and specify the type and size of EBS storage volumes.
     */

    public EBSOptions getEBSOptions() {
        return this.eBSOptions;
    }

    /**
     * <p>
     * Options to enable, disable, and specify the type and size of EBS storage volumes.
     * </p>
     * 
     * @param eBSOptions
     *        Options to enable, disable, and specify the type and size of EBS storage volumes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withEBSOptions(EBSOptions eBSOptions) {
        setEBSOptions(eBSOptions);
        return this;
    }

    /**
     * <p>
     * IAM access policy as a JSON-formatted string.
     * </p>
     * 
     * @param accessPolicies
     *        IAM access policy as a JSON-formatted string.
     */

    public void setAccessPolicies(String accessPolicies) {
        this.accessPolicies = accessPolicies;
    }

    /**
     * <p>
     * IAM access policy as a JSON-formatted string.
     * </p>
     * 
     * @return IAM access policy as a JSON-formatted string.
     */

    public String getAccessPolicies() {
        return this.accessPolicies;
    }

    /**
     * <p>
     * IAM access policy as a JSON-formatted string.
     * </p>
     * 
     * @param accessPolicies
     *        IAM access policy as a JSON-formatted string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withAccessPolicies(String accessPolicies) {
        setAccessPolicies(accessPolicies);
        return this;
    }

    /**
     * <p>
     * Option to set time, in UTC format, of the daily automated snapshot. Default value is 0 hours.
     * </p>
     * 
     * @param snapshotOptions
     *        Option to set time, in UTC format, of the daily automated snapshot. Default value is 0 hours.
     */

    public void setSnapshotOptions(SnapshotOptions snapshotOptions) {
        this.snapshotOptions = snapshotOptions;
    }

    /**
     * <p>
     * Option to set time, in UTC format, of the daily automated snapshot. Default value is 0 hours.
     * </p>
     * 
     * @return Option to set time, in UTC format, of the daily automated snapshot. Default value is 0 hours.
     */

    public SnapshotOptions getSnapshotOptions() {
        return this.snapshotOptions;
    }

    /**
     * <p>
     * Option to set time, in UTC format, of the daily automated snapshot. Default value is 0 hours.
     * </p>
     * 
     * @param snapshotOptions
     *        Option to set time, in UTC format, of the daily automated snapshot. Default value is 0 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withSnapshotOptions(SnapshotOptions snapshotOptions) {
        setSnapshotOptions(snapshotOptions);
        return this;
    }

    /**
     * <p>
     * Options to specify the subnets and security groups for a VPC endpoint. For more information, see <a
     * href="http://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html" target="_blank">Launching
     * your Amazon OpenSearch Service domains using a VPC </a>.
     * </p>
     * 
     * @param vPCOptions
     *        Options to specify the subnets and security groups for a VPC endpoint. For more information, see <a
     *        href="http://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html"
     *        target="_blank">Launching your Amazon OpenSearch Service domains using a VPC </a>.
     */

    public void setVPCOptions(VPCOptions vPCOptions) {
        this.vPCOptions = vPCOptions;
    }

    /**
     * <p>
     * Options to specify the subnets and security groups for a VPC endpoint. For more information, see <a
     * href="http://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html" target="_blank">Launching
     * your Amazon OpenSearch Service domains using a VPC </a>.
     * </p>
     * 
     * @return Options to specify the subnets and security groups for a VPC endpoint. For more information, see <a
     *         href="http://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html"
     *         target="_blank">Launching your Amazon OpenSearch Service domains using a VPC </a>.
     */

    public VPCOptions getVPCOptions() {
        return this.vPCOptions;
    }

    /**
     * <p>
     * Options to specify the subnets and security groups for a VPC endpoint. For more information, see <a
     * href="http://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html" target="_blank">Launching
     * your Amazon OpenSearch Service domains using a VPC </a>.
     * </p>
     * 
     * @param vPCOptions
     *        Options to specify the subnets and security groups for a VPC endpoint. For more information, see <a
     *        href="http://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html"
     *        target="_blank">Launching your Amazon OpenSearch Service domains using a VPC </a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withVPCOptions(VPCOptions vPCOptions) {
        setVPCOptions(vPCOptions);
        return this;
    }

    /**
     * <p>
     * Options to specify the Cognito user and identity pools for OpenSearch Dashboards authentication. For more
     * information, see <a href="http://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html"
     * target="_blank">Configuring Amazon Cognito authentication for OpenSearch Dashboards</a>.
     * </p>
     * 
     * @param cognitoOptions
     *        Options to specify the Cognito user and identity pools for OpenSearch Dashboards authentication. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html"
     *        target="_blank">Configuring Amazon Cognito authentication for OpenSearch Dashboards</a>.
     */

    public void setCognitoOptions(CognitoOptions cognitoOptions) {
        this.cognitoOptions = cognitoOptions;
    }

    /**
     * <p>
     * Options to specify the Cognito user and identity pools for OpenSearch Dashboards authentication. For more
     * information, see <a href="http://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html"
     * target="_blank">Configuring Amazon Cognito authentication for OpenSearch Dashboards</a>.
     * </p>
     * 
     * @return Options to specify the Cognito user and identity pools for OpenSearch Dashboards authentication. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html"
     *         target="_blank">Configuring Amazon Cognito authentication for OpenSearch Dashboards</a>.
     */

    public CognitoOptions getCognitoOptions() {
        return this.cognitoOptions;
    }

    /**
     * <p>
     * Options to specify the Cognito user and identity pools for OpenSearch Dashboards authentication. For more
     * information, see <a href="http://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html"
     * target="_blank">Configuring Amazon Cognito authentication for OpenSearch Dashboards</a>.
     * </p>
     * 
     * @param cognitoOptions
     *        Options to specify the Cognito user and identity pools for OpenSearch Dashboards authentication. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html"
     *        target="_blank">Configuring Amazon Cognito authentication for OpenSearch Dashboards</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withCognitoOptions(CognitoOptions cognitoOptions) {
        setCognitoOptions(cognitoOptions);
        return this;
    }

    /**
     * <p>
     * Options for encryption of data at rest.
     * </p>
     * 
     * @param encryptionAtRestOptions
     *        Options for encryption of data at rest.
     */

    public void setEncryptionAtRestOptions(EncryptionAtRestOptions encryptionAtRestOptions) {
        this.encryptionAtRestOptions = encryptionAtRestOptions;
    }

    /**
     * <p>
     * Options for encryption of data at rest.
     * </p>
     * 
     * @return Options for encryption of data at rest.
     */

    public EncryptionAtRestOptions getEncryptionAtRestOptions() {
        return this.encryptionAtRestOptions;
    }

    /**
     * <p>
     * Options for encryption of data at rest.
     * </p>
     * 
     * @param encryptionAtRestOptions
     *        Options for encryption of data at rest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withEncryptionAtRestOptions(EncryptionAtRestOptions encryptionAtRestOptions) {
        setEncryptionAtRestOptions(encryptionAtRestOptions);
        return this;
    }

    /**
     * <p>
     * Node-to-node encryption options.
     * </p>
     * 
     * @param nodeToNodeEncryptionOptions
     *        Node-to-node encryption options.
     */

    public void setNodeToNodeEncryptionOptions(NodeToNodeEncryptionOptions nodeToNodeEncryptionOptions) {
        this.nodeToNodeEncryptionOptions = nodeToNodeEncryptionOptions;
    }

    /**
     * <p>
     * Node-to-node encryption options.
     * </p>
     * 
     * @return Node-to-node encryption options.
     */

    public NodeToNodeEncryptionOptions getNodeToNodeEncryptionOptions() {
        return this.nodeToNodeEncryptionOptions;
    }

    /**
     * <p>
     * Node-to-node encryption options.
     * </p>
     * 
     * @param nodeToNodeEncryptionOptions
     *        Node-to-node encryption options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withNodeToNodeEncryptionOptions(NodeToNodeEncryptionOptions nodeToNodeEncryptionOptions) {
        setNodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions);
        return this;
    }

    /**
     * <p>
     * Option to allow references to indices in an HTTP request body. Must be <code>false</code> when configuring access
     * to individual sub-resources. By default, the value is <code>true</code>. See <a href=
     * "http://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options"
     * target="_blank">Advanced cluster parameters </a> for more information.
     * </p>
     * 
     * @return Option to allow references to indices in an HTTP request body. Must be <code>false</code> when
     *         configuring access to individual sub-resources. By default, the value is <code>true</code>. See <a href=
     *         "http://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options"
     *         target="_blank">Advanced cluster parameters </a> for more information.
     */

    public java.util.Map<String, String> getAdvancedOptions() {
        return advancedOptions;
    }

    /**
     * <p>
     * Option to allow references to indices in an HTTP request body. Must be <code>false</code> when configuring access
     * to individual sub-resources. By default, the value is <code>true</code>. See <a href=
     * "http://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options"
     * target="_blank">Advanced cluster parameters </a> for more information.
     * </p>
     * 
     * @param advancedOptions
     *        Option to allow references to indices in an HTTP request body. Must be <code>false</code> when configuring
     *        access to individual sub-resources. By default, the value is <code>true</code>. See <a href=
     *        "http://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options"
     *        target="_blank">Advanced cluster parameters </a> for more information.
     */

    public void setAdvancedOptions(java.util.Map<String, String> advancedOptions) {
        this.advancedOptions = advancedOptions;
    }

    /**
     * <p>
     * Option to allow references to indices in an HTTP request body. Must be <code>false</code> when configuring access
     * to individual sub-resources. By default, the value is <code>true</code>. See <a href=
     * "http://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options"
     * target="_blank">Advanced cluster parameters </a> for more information.
     * </p>
     * 
     * @param advancedOptions
     *        Option to allow references to indices in an HTTP request body. Must be <code>false</code> when configuring
     *        access to individual sub-resources. By default, the value is <code>true</code>. See <a href=
     *        "http://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options"
     *        target="_blank">Advanced cluster parameters </a> for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withAdvancedOptions(java.util.Map<String, String> advancedOptions) {
        setAdvancedOptions(advancedOptions);
        return this;
    }

    /**
     * Add a single AdvancedOptions entry
     *
     * @see CreateDomainRequest#withAdvancedOptions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest addAdvancedOptionsEntry(String key, String value) {
        if (null == this.advancedOptions) {
            this.advancedOptions = new java.util.HashMap<String, String>();
        }
        if (this.advancedOptions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.advancedOptions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AdvancedOptions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest clearAdvancedOptionsEntries() {
        this.advancedOptions = null;
        return this;
    }

    /**
     * <p>
     * Map of <code>LogType</code> and <code>LogPublishingOption</code>, each containing options to publish a given type
     * of OpenSearch log.
     * </p>
     * 
     * @return Map of <code>LogType</code> and <code>LogPublishingOption</code>, each containing options to publish a
     *         given type of OpenSearch log.
     */

    public java.util.Map<String, LogPublishingOption> getLogPublishingOptions() {
        return logPublishingOptions;
    }

    /**
     * <p>
     * Map of <code>LogType</code> and <code>LogPublishingOption</code>, each containing options to publish a given type
     * of OpenSearch log.
     * </p>
     * 
     * @param logPublishingOptions
     *        Map of <code>LogType</code> and <code>LogPublishingOption</code>, each containing options to publish a
     *        given type of OpenSearch log.
     */

    public void setLogPublishingOptions(java.util.Map<String, LogPublishingOption> logPublishingOptions) {
        this.logPublishingOptions = logPublishingOptions;
    }

    /**
     * <p>
     * Map of <code>LogType</code> and <code>LogPublishingOption</code>, each containing options to publish a given type
     * of OpenSearch log.
     * </p>
     * 
     * @param logPublishingOptions
     *        Map of <code>LogType</code> and <code>LogPublishingOption</code>, each containing options to publish a
     *        given type of OpenSearch log.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withLogPublishingOptions(java.util.Map<String, LogPublishingOption> logPublishingOptions) {
        setLogPublishingOptions(logPublishingOptions);
        return this;
    }

    /**
     * Add a single LogPublishingOptions entry
     *
     * @see CreateDomainRequest#withLogPublishingOptions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest addLogPublishingOptionsEntry(String key, LogPublishingOption value) {
        if (null == this.logPublishingOptions) {
            this.logPublishingOptions = new java.util.HashMap<String, LogPublishingOption>();
        }
        if (this.logPublishingOptions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.logPublishingOptions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into LogPublishingOptions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest clearLogPublishingOptionsEntries() {
        this.logPublishingOptions = null;
        return this;
    }

    /**
     * <p>
     * Options to specify configurations that will be applied to the domain endpoint.
     * </p>
     * 
     * @param domainEndpointOptions
     *        Options to specify configurations that will be applied to the domain endpoint.
     */

    public void setDomainEndpointOptions(DomainEndpointOptions domainEndpointOptions) {
        this.domainEndpointOptions = domainEndpointOptions;
    }

    /**
     * <p>
     * Options to specify configurations that will be applied to the domain endpoint.
     * </p>
     * 
     * @return Options to specify configurations that will be applied to the domain endpoint.
     */

    public DomainEndpointOptions getDomainEndpointOptions() {
        return this.domainEndpointOptions;
    }

    /**
     * <p>
     * Options to specify configurations that will be applied to the domain endpoint.
     * </p>
     * 
     * @param domainEndpointOptions
     *        Options to specify configurations that will be applied to the domain endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withDomainEndpointOptions(DomainEndpointOptions domainEndpointOptions) {
        setDomainEndpointOptions(domainEndpointOptions);
        return this;
    }

    /**
     * <p>
     * Specifies advanced security options.
     * </p>
     * 
     * @param advancedSecurityOptions
     *        Specifies advanced security options.
     */

    public void setAdvancedSecurityOptions(AdvancedSecurityOptionsInput advancedSecurityOptions) {
        this.advancedSecurityOptions = advancedSecurityOptions;
    }

    /**
     * <p>
     * Specifies advanced security options.
     * </p>
     * 
     * @return Specifies advanced security options.
     */

    public AdvancedSecurityOptionsInput getAdvancedSecurityOptions() {
        return this.advancedSecurityOptions;
    }

    /**
     * <p>
     * Specifies advanced security options.
     * </p>
     * 
     * @param advancedSecurityOptions
     *        Specifies advanced security options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withAdvancedSecurityOptions(AdvancedSecurityOptionsInput advancedSecurityOptions) {
        setAdvancedSecurityOptions(advancedSecurityOptions);
        return this;
    }

    /**
     * <p>
     * A list of <code>Tag</code> added during domain creation.
     * </p>
     * 
     * @return A list of <code>Tag</code> added during domain creation.
     */

    public java.util.List<Tag> getTagList() {
        return tagList;
    }

    /**
     * <p>
     * A list of <code>Tag</code> added during domain creation.
     * </p>
     * 
     * @param tagList
     *        A list of <code>Tag</code> added during domain creation.
     */

    public void setTagList(java.util.Collection<Tag> tagList) {
        if (tagList == null) {
            this.tagList = null;
            return;
        }

        this.tagList = new java.util.ArrayList<Tag>(tagList);
    }

    /**
     * <p>
     * A list of <code>Tag</code> added during domain creation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagList(java.util.Collection)} or {@link #withTagList(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagList
     *        A list of <code>Tag</code> added during domain creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withTagList(Tag... tagList) {
        if (this.tagList == null) {
            setTagList(new java.util.ArrayList<Tag>(tagList.length));
        }
        for (Tag ele : tagList) {
            this.tagList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>Tag</code> added during domain creation.
     * </p>
     * 
     * @param tagList
     *        A list of <code>Tag</code> added during domain creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withTagList(java.util.Collection<Tag> tagList) {
        setTagList(tagList);
        return this;
    }

    /**
     * <p>
     * Specifies Auto-Tune options.
     * </p>
     * 
     * @param autoTuneOptions
     *        Specifies Auto-Tune options.
     */

    public void setAutoTuneOptions(AutoTuneOptionsInput autoTuneOptions) {
        this.autoTuneOptions = autoTuneOptions;
    }

    /**
     * <p>
     * Specifies Auto-Tune options.
     * </p>
     * 
     * @return Specifies Auto-Tune options.
     */

    public AutoTuneOptionsInput getAutoTuneOptions() {
        return this.autoTuneOptions;
    }

    /**
     * <p>
     * Specifies Auto-Tune options.
     * </p>
     * 
     * @param autoTuneOptions
     *        Specifies Auto-Tune options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withAutoTuneOptions(AutoTuneOptionsInput autoTuneOptions) {
        setAutoTuneOptions(autoTuneOptions);
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getClusterConfig() != null)
            sb.append("ClusterConfig: ").append(getClusterConfig()).append(",");
        if (getEBSOptions() != null)
            sb.append("EBSOptions: ").append(getEBSOptions()).append(",");
        if (getAccessPolicies() != null)
            sb.append("AccessPolicies: ").append(getAccessPolicies()).append(",");
        if (getSnapshotOptions() != null)
            sb.append("SnapshotOptions: ").append(getSnapshotOptions()).append(",");
        if (getVPCOptions() != null)
            sb.append("VPCOptions: ").append(getVPCOptions()).append(",");
        if (getCognitoOptions() != null)
            sb.append("CognitoOptions: ").append(getCognitoOptions()).append(",");
        if (getEncryptionAtRestOptions() != null)
            sb.append("EncryptionAtRestOptions: ").append(getEncryptionAtRestOptions()).append(",");
        if (getNodeToNodeEncryptionOptions() != null)
            sb.append("NodeToNodeEncryptionOptions: ").append(getNodeToNodeEncryptionOptions()).append(",");
        if (getAdvancedOptions() != null)
            sb.append("AdvancedOptions: ").append(getAdvancedOptions()).append(",");
        if (getLogPublishingOptions() != null)
            sb.append("LogPublishingOptions: ").append(getLogPublishingOptions()).append(",");
        if (getDomainEndpointOptions() != null)
            sb.append("DomainEndpointOptions: ").append(getDomainEndpointOptions()).append(",");
        if (getAdvancedSecurityOptions() != null)
            sb.append("AdvancedSecurityOptions: ").append(getAdvancedSecurityOptions()).append(",");
        if (getTagList() != null)
            sb.append("TagList: ").append(getTagList()).append(",");
        if (getAutoTuneOptions() != null)
            sb.append("AutoTuneOptions: ").append(getAutoTuneOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDomainRequest == false)
            return false;
        CreateDomainRequest other = (CreateDomainRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getClusterConfig() == null ^ this.getClusterConfig() == null)
            return false;
        if (other.getClusterConfig() != null && other.getClusterConfig().equals(this.getClusterConfig()) == false)
            return false;
        if (other.getEBSOptions() == null ^ this.getEBSOptions() == null)
            return false;
        if (other.getEBSOptions() != null && other.getEBSOptions().equals(this.getEBSOptions()) == false)
            return false;
        if (other.getAccessPolicies() == null ^ this.getAccessPolicies() == null)
            return false;
        if (other.getAccessPolicies() != null && other.getAccessPolicies().equals(this.getAccessPolicies()) == false)
            return false;
        if (other.getSnapshotOptions() == null ^ this.getSnapshotOptions() == null)
            return false;
        if (other.getSnapshotOptions() != null && other.getSnapshotOptions().equals(this.getSnapshotOptions()) == false)
            return false;
        if (other.getVPCOptions() == null ^ this.getVPCOptions() == null)
            return false;
        if (other.getVPCOptions() != null && other.getVPCOptions().equals(this.getVPCOptions()) == false)
            return false;
        if (other.getCognitoOptions() == null ^ this.getCognitoOptions() == null)
            return false;
        if (other.getCognitoOptions() != null && other.getCognitoOptions().equals(this.getCognitoOptions()) == false)
            return false;
        if (other.getEncryptionAtRestOptions() == null ^ this.getEncryptionAtRestOptions() == null)
            return false;
        if (other.getEncryptionAtRestOptions() != null && other.getEncryptionAtRestOptions().equals(this.getEncryptionAtRestOptions()) == false)
            return false;
        if (other.getNodeToNodeEncryptionOptions() == null ^ this.getNodeToNodeEncryptionOptions() == null)
            return false;
        if (other.getNodeToNodeEncryptionOptions() != null && other.getNodeToNodeEncryptionOptions().equals(this.getNodeToNodeEncryptionOptions()) == false)
            return false;
        if (other.getAdvancedOptions() == null ^ this.getAdvancedOptions() == null)
            return false;
        if (other.getAdvancedOptions() != null && other.getAdvancedOptions().equals(this.getAdvancedOptions()) == false)
            return false;
        if (other.getLogPublishingOptions() == null ^ this.getLogPublishingOptions() == null)
            return false;
        if (other.getLogPublishingOptions() != null && other.getLogPublishingOptions().equals(this.getLogPublishingOptions()) == false)
            return false;
        if (other.getDomainEndpointOptions() == null ^ this.getDomainEndpointOptions() == null)
            return false;
        if (other.getDomainEndpointOptions() != null && other.getDomainEndpointOptions().equals(this.getDomainEndpointOptions()) == false)
            return false;
        if (other.getAdvancedSecurityOptions() == null ^ this.getAdvancedSecurityOptions() == null)
            return false;
        if (other.getAdvancedSecurityOptions() != null && other.getAdvancedSecurityOptions().equals(this.getAdvancedSecurityOptions()) == false)
            return false;
        if (other.getTagList() == null ^ this.getTagList() == null)
            return false;
        if (other.getTagList() != null && other.getTagList().equals(this.getTagList()) == false)
            return false;
        if (other.getAutoTuneOptions() == null ^ this.getAutoTuneOptions() == null)
            return false;
        if (other.getAutoTuneOptions() != null && other.getAutoTuneOptions().equals(this.getAutoTuneOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getClusterConfig() == null) ? 0 : getClusterConfig().hashCode());
        hashCode = prime * hashCode + ((getEBSOptions() == null) ? 0 : getEBSOptions().hashCode());
        hashCode = prime * hashCode + ((getAccessPolicies() == null) ? 0 : getAccessPolicies().hashCode());
        hashCode = prime * hashCode + ((getSnapshotOptions() == null) ? 0 : getSnapshotOptions().hashCode());
        hashCode = prime * hashCode + ((getVPCOptions() == null) ? 0 : getVPCOptions().hashCode());
        hashCode = prime * hashCode + ((getCognitoOptions() == null) ? 0 : getCognitoOptions().hashCode());
        hashCode = prime * hashCode + ((getEncryptionAtRestOptions() == null) ? 0 : getEncryptionAtRestOptions().hashCode());
        hashCode = prime * hashCode + ((getNodeToNodeEncryptionOptions() == null) ? 0 : getNodeToNodeEncryptionOptions().hashCode());
        hashCode = prime * hashCode + ((getAdvancedOptions() == null) ? 0 : getAdvancedOptions().hashCode());
        hashCode = prime * hashCode + ((getLogPublishingOptions() == null) ? 0 : getLogPublishingOptions().hashCode());
        hashCode = prime * hashCode + ((getDomainEndpointOptions() == null) ? 0 : getDomainEndpointOptions().hashCode());
        hashCode = prime * hashCode + ((getAdvancedSecurityOptions() == null) ? 0 : getAdvancedSecurityOptions().hashCode());
        hashCode = prime * hashCode + ((getTagList() == null) ? 0 : getTagList().hashCode());
        hashCode = prime * hashCode + ((getAutoTuneOptions() == null) ? 0 : getAutoTuneOptions().hashCode());
        return hashCode;
    }

    @Override
    public CreateDomainRequest clone() {
        return (CreateDomainRequest) super.clone();
    }

}