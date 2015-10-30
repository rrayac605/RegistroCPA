package mx.gob.imss.cit.de.dictaminacion.integration.api.dto;

import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.base.BaseDTO;

public class AWSPolicyDTO extends BaseDTO{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5350550802998874628L;
		
	
	private String expiration;
	private String awsAccessKeyId;
	private String bucket;
	private String key;
	private String acl;
	private String successActionStatus;
	private String xamzMetaTag;
	private String xamzMetaUuid;
	private String xamzCredential;
	private String xamzAlgorithm;
	private String xamzDate;
	private String policy;
	private String signature;
	private String url;
	private String contentType;
	
	
	/**
	 * @return the expiration
	 */
	public String getExpiration() {
		return expiration;
	}
	/**
	 * @param expiration the expiration to set
	 */
	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}
	/**
	 * @return the bucket
	 */
	public String getBucket() {
		return bucket;
	}
	/**
	 * @param bucket the bucket to set
	 */
	public void setBucket(String bucket) {
		this.bucket = bucket;
	}
	/**
	 * @return the acl
	 */
	public String getAcl() {
		return acl;
	}
	/**
	 * @param acl the acl to set
	 */
	public void setAcl(String acl) {
		this.acl = acl;
	}
	/**
	 * @return the successActionStatus
	 */
	public String getSuccessActionStatus() {
		return successActionStatus;
	}
	/**
	 * @param successActionStatus the successActionStatus to set
	 */
	public void setSuccessActionStatus(String successActionStatus) {
		this.successActionStatus = successActionStatus;
	}

	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}
	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}
	/**
	 * @return the policy
	 */
	public String getPolicy() {
		return policy;
	}
	/**
	 * @param policy the policy to set
	 */
	public void setPolicy(String policy) {
		this.policy = policy;
	}
	/**
	 * @return the signature
	 */
	public String getSignature() {
		return signature;
	}
	/**
	 * @param signature the signature to set
	 */
	public void setSignature(String signature) {
		this.signature = signature;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @return the contentType
	 */
	public String getContentType() {
		return contentType;
	}
	/**
	 * @param contentType the contentType to set
	 */
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	/**
	 * @return the awsAccessKeyId
	 */
	public String getAwsAccessKeyId() {
		return awsAccessKeyId;
	}
	/**
	 * @param awsAccessKeyId the awsAccessKeyId to set
	 */
	public void setAwsAccessKeyId(String awsAccessKeyId) {
		this.awsAccessKeyId = awsAccessKeyId;
	}
	/**
	 * @return the xamzMetaTag
	 */
	public String getXamzMetaTag() {
		return xamzMetaTag;
	}
	/**
	 * @param xamzMetaTag the xamzMetaTag to set
	 */
	public void setXamzMetaTag(String xamzMetaTag) {
		this.xamzMetaTag = xamzMetaTag;
	}
	/**
	 * @return the xamzMetaUuid
	 */
	public String getXamzMetaUuid() {
		return xamzMetaUuid;
	}
	/**
	 * @param xamzMetaUuid the xamzMetaUuid to set
	 */
	public void setXamzMetaUuid(String xamzMetaUuid) {
		this.xamzMetaUuid = xamzMetaUuid;
	}
	/**
	 * @return the xamzCredential
	 */
	public String getXamzCredential() {
		return xamzCredential;
	}
	/**
	 * @param xamzCredential the xamzCredential to set
	 */
	public void setXamzCredential(String xamzCredential) {
		this.xamzCredential = xamzCredential;
	}
	/**
	 * @return the xamzAlgorithm
	 */
	public String getXamzAlgorithm() {
		return xamzAlgorithm;
	}
	/**
	 * @param xamzAlgorithm the xamzAlgorithm to set
	 */
	public void setXamzAlgorithm(String xamzAlgorithm) {
		this.xamzAlgorithm = xamzAlgorithm;
	}
	/**
	 * @return the xamzDate
	 */
	public String getXamzDate() {
		return xamzDate;
	}
	/**
	 * @param xamzDate the xamzDate to set
	 */
	public void setXamzDate(String xamzDate) {
		this.xamzDate = xamzDate;
	}
	
	
}
