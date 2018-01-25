/*
 * 
 * 
 *
 * 
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Testsuite
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-25T12:07:27.050+05:30")
public class Testsuite {
  @SerializedName("_id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("desc")
  private String desc = null;

  @SerializedName("project")
  private String project = null;

  @SerializedName("createdBy")
  private String createdBy = null;

  @SerializedName("updatedBy")
  private String updatedBy = null;

  public Testsuite id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Test suite ID
   * @return id
  **/
  @ApiModelProperty(value = "Test suite ID")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Testsuite name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Test suite  Name
   * @return name
  **/
  @ApiModelProperty(value = "Test suite  Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Testsuite desc(String desc) {
    this.desc = desc;
    return this;
  }

   /**
   * Test suite  description
   * @return desc
  **/
  @ApiModelProperty(value = "Test suite  description")
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public Testsuite project(String project) {
    this.project = project;
    return this;
  }

   /**
   * Test suite  project id
   * @return project
  **/
  @ApiModelProperty(value = "Test suite  project id")
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public Testsuite createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * User who created test suite
   * @return createdBy
  **/
  @ApiModelProperty(value = "User who created test suite")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public Testsuite updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

   /**
   * User who uodated test suite
   * @return updatedBy
  **/
  @ApiModelProperty(value = "User who uodated test suite")
  public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Testsuite testsuite = (Testsuite) o;
    return Objects.equals(this.id, testsuite.id) &&
        Objects.equals(this.name, testsuite.name) &&
        Objects.equals(this.desc, testsuite.desc) &&
        Objects.equals(this.project, testsuite.project) &&
        Objects.equals(this.createdBy, testsuite.createdBy) &&
        Objects.equals(this.updatedBy, testsuite.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, desc, project, createdBy, updatedBy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Testsuite {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
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

