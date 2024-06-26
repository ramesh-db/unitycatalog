/*
 * Unity Catalog API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.unitycatalog.client.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AwsCredentials
 */
@JsonPropertyOrder({
  AwsCredentials.JSON_PROPERTY_ACCESS_KEY_ID,
  AwsCredentials.JSON_PROPERTY_SECRET_ACCESS_KEY,
  AwsCredentials.JSON_PROPERTY_SESSION_TOKEN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class AwsCredentials {
  public static final String JSON_PROPERTY_ACCESS_KEY_ID = "access_key_id";
  private String accessKeyId;

  public static final String JSON_PROPERTY_SECRET_ACCESS_KEY = "secret_access_key";
  private String secretAccessKey;

  public static final String JSON_PROPERTY_SESSION_TOKEN = "session_token";
  private String sessionToken;

  public AwsCredentials() { 
  }

  public AwsCredentials accessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
    return this;
  }

   /**
   * The access key ID that identifies the temporary credentials.
   * @return accessKeyId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCESS_KEY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccessKeyId() {
    return accessKeyId;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS_KEY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
  }


  public AwsCredentials secretAccessKey(String secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
    return this;
  }

   /**
   * The secret access key that can be used to sign AWS API requests.
   * @return secretAccessKey
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SECRET_ACCESS_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSecretAccessKey() {
    return secretAccessKey;
  }


  @JsonProperty(JSON_PROPERTY_SECRET_ACCESS_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecretAccessKey(String secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
  }


  public AwsCredentials sessionToken(String sessionToken) {
    this.sessionToken = sessionToken;
    return this;
  }

   /**
   * The token that users must pass to AWS API to use the temporary credentials.
   * @return sessionToken
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SESSION_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSessionToken() {
    return sessionToken;
  }


  @JsonProperty(JSON_PROPERTY_SESSION_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSessionToken(String sessionToken) {
    this.sessionToken = sessionToken;
  }


  /**
   * Return true if this AwsCredentials object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsCredentials awsCredentials = (AwsCredentials) o;
    return Objects.equals(this.accessKeyId, awsCredentials.accessKeyId) &&
        Objects.equals(this.secretAccessKey, awsCredentials.secretAccessKey) &&
        Objects.equals(this.sessionToken, awsCredentials.sessionToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeyId, secretAccessKey, sessionToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsCredentials {\n");
    sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
    sb.append("    secretAccessKey: ").append(toIndentedString(secretAccessKey)).append("\n");
    sb.append("    sessionToken: ").append(toIndentedString(sessionToken)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `access_key_id` to the URL query string
    if (getAccessKeyId() != null) {
      joiner.add(String.format("%saccess_key_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAccessKeyId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `secret_access_key` to the URL query string
    if (getSecretAccessKey() != null) {
      joiner.add(String.format("%ssecret_access_key%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSecretAccessKey()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `session_token` to the URL query string
    if (getSessionToken() != null) {
      joiner.add(String.format("%ssession_token%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSessionToken()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

