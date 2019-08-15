/*
 * Square Connect API
 * Client library for accessing the Square Connect APIs
 *
 * OpenAPI spec version: 2.0
 * Contact: developers@squareup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.squareup.connect.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 *
 */
@ApiModel(description = "")

public class V1ListEmployeeRolesRequest {
  @JsonProperty("order")
  private String order = null;

  @JsonProperty("limit")
  private Integer limit = null;

  @JsonProperty("batch_token")
  private String batchToken = null;

  public V1ListEmployeeRolesRequest order(String order) {
    this.order = order;
    return this;
  }

   /**
   * The order in which employees are listed in the response, based on their created_at field.Default value: ASC See [SortOrder](#type-sortorder) for possible values
   * @return order
  **/
  @ApiModelProperty(value = "The order in which employees are listed in the response, based on their created_at field.Default value: ASC See [SortOrder](#type-sortorder) for possible values")
  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }

  public V1ListEmployeeRolesRequest limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * The maximum integer number of employee entities to return in a single response. Default 100, maximum 200.
   * @return limit
  **/
  @ApiModelProperty(value = "The maximum integer number of employee entities to return in a single response. Default 100, maximum 200.")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public V1ListEmployeeRolesRequest batchToken(String batchToken) {
    this.batchToken = batchToken;
    return this;
  }

   /**
   * A pagination cursor to retrieve the next set of results for your original query to the endpoint.
   * @return batchToken
  **/
  @ApiModelProperty(value = "A pagination cursor to retrieve the next set of results for your original query to the endpoint.")
  public String getBatchToken() {
    return batchToken;
  }

  public void setBatchToken(String batchToken) {
    this.batchToken = batchToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ListEmployeeRolesRequest v1ListEmployeeRolesRequest = (V1ListEmployeeRolesRequest) o;
    return Objects.equals(this.order, v1ListEmployeeRolesRequest.order) &&
        Objects.equals(this.limit, v1ListEmployeeRolesRequest.limit) &&
        Objects.equals(this.batchToken, v1ListEmployeeRolesRequest.batchToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, limit, batchToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ListEmployeeRolesRequest {\n");

    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    batchToken: ").append(toIndentedString(batchToken)).append("\n");
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
