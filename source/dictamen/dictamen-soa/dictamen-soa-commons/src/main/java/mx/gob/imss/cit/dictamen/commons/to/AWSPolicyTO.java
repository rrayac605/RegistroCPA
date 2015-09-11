package mx.gob.imss.cit.dictamen.commons.to;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class AWSPolicyTO extends BaseTO{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5350550802990074628L;
		
	
	private String expiration;
	private String bucket;
	private String key;
	private String acl;
	private String successActionStatus;
	private String xAmzMetaTag;
	private String xAmzMetaUuid;
	private String xAmzCredential;
	private String xAmzAlgorithm;
	private String xAmzDate;
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
	 * @return the xAmzMetaUuid
	 */
	public String getxAmzMetaUuid() {
		return xAmzMetaUuid;
	}
	/**
	 * @param xAmzMetaUuid the xAmzMetaUuid to set
	 */
	public void setxAmzMetaUuid(String xAmzMetaUuid) {
		this.xAmzMetaUuid = xAmzMetaUuid;
	}
	/**
	 * @return the xAmzCredential
	 */
	public String getxAmzCredential() {
		return xAmzCredential;
	}
	/**
	 * @param xAmzCredential the xAmzCredential to set
	 */
	public void setxAmzCredential(String xAmzCredential) {
		this.xAmzCredential = xAmzCredential;
	}
	/**
	 * @return the xAmzAlgorithm
	 */
	public String getxAmzAlgorithm() {
		return xAmzAlgorithm;
	}
	/**
	 * @param xAmzAlgorithm the xAmzAlgorithm to set
	 */
	public void setxAmzAlgorithm(String xAmzAlgorithm) {
		this.xAmzAlgorithm = xAmzAlgorithm;
	}
	/**
	 * @return the xAmzDate
	 */
	public String getxAmzDate() {
		return xAmzDate;
	}
	/**
	 * @param xAmzDate the xAmzDate to set
	 */
	public void setxAmzDate(String xAmzDate) {
		this.xAmzDate = xAmzDate;
	}
	/**
	 * @return the xAmzMetaTag
	 */
	public String getxAmzMetaTag() {
		return xAmzMetaTag;
	}
	/**
	 * @param xAmzMetaTag the xAmzMetaTag to set
	 */
	public void setxAmzMetaTag(String xAmzMetaTag) {
		this.xAmzMetaTag = xAmzMetaTag;
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
	
	
}
