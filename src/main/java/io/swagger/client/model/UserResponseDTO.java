/*
 * OpenAPI definition
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * UserResponseDTO
 */


public class UserResponseDTO {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("userIdAd")
  private String userIdAd = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("mail")
  private String mail = null;

  @SerializedName("phone")
  private String phone = null;

  public UserResponseDTO id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public UserResponseDTO userIdAd(String userIdAd) {
    this.userIdAd = userIdAd;
    return this;
  }

   /**
   * Get userIdAd
   * @return userIdAd
  **/
  @Schema(description = "")
  public String getUserIdAd() {
    return userIdAd;
  }

  public void setUserIdAd(String userIdAd) {
    this.userIdAd = userIdAd;
  }

  public UserResponseDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserResponseDTO mail(String mail) {
    this.mail = mail;
    return this;
  }

   /**
   * Get mail
   * @return mail
  **/
  @Schema(description = "")
  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public UserResponseDTO phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @Schema(description = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserResponseDTO userResponseDTO = (UserResponseDTO) o;
    return Objects.equals(this.id, userResponseDTO.id) &&
        Objects.equals(this.userIdAd, userResponseDTO.userIdAd) &&
        Objects.equals(this.name, userResponseDTO.name) &&
        Objects.equals(this.mail, userResponseDTO.mail) &&
        Objects.equals(this.phone, userResponseDTO.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userIdAd, name, mail, phone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserResponseDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userIdAd: ").append(toIndentedString(userIdAd)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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