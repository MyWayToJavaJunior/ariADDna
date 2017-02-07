/*
 * ariADDna API
 * #### This document contains the API description for ariADDna project. Using this API one can manage all available cloud services (DropBox, GDrive, Yandex.Disk etc.) from single point. 
 *
 * OpenAPI spec version: 1.0
 * Contact: ariaddna.support@stnetix.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CloudSet;

/**
 * This page-object shall be used for visual representation of a list (which is inside a CloudSet) of user&#39;s external cloud accounts.
 */
@ApiModel(description = "This page-object shall be used for visual representation of a list (which is inside a CloudSet) of user's external cloud accounts.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-02-07T13:22:44.504Z")
public class CloudSetPages   {
  @JsonProperty("offset")
  private Integer offset = null;

  @JsonProperty("limit")
  private Integer limit = null;

  @JsonProperty("entries")
  private CloudSet entries = null;

  public CloudSetPages offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Offset of the first entry.
   * @return offset
  **/
  @JsonProperty("offset")
  @ApiModelProperty(value = "Offset of the first entry.")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public CloudSetPages limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Quantity of entries to show.
   * @return limit
  **/
  @JsonProperty("limit")
  @ApiModelProperty(value = "Quantity of entries to show.")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public CloudSetPages entries(CloudSet entries) {
    this.entries = entries;
    return this;
  }

   /**
   * Get entries
   * @return entries
  **/
  @JsonProperty("entries")
  @ApiModelProperty(value = "")
  public CloudSet getEntries() {
    return entries;
  }

  public void setEntries(CloudSet entries) {
    this.entries = entries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudSetPages cloudSetPages = (CloudSetPages) o;
    return Objects.equals(this.offset, cloudSetPages.offset) &&
        Objects.equals(this.limit, cloudSetPages.limit) &&
        Objects.equals(this.entries, cloudSetPages.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offset, limit, entries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudSetPages {\n");
    
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

