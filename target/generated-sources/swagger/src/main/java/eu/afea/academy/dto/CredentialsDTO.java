/*
 * Afea Device Manager API
 * Afea Device Manager API
 *
 * OpenAPI spec version: 1.5.0-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package eu.afea.academy.dto;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * credenziali di accesso al dispositivo, disponibili in sola scrittura: non vengono mai restituite da una GET
 */
@ApiModel(description = "credenziali di accesso al dispositivo, disponibili in sola scrittura: non vengono mai restituite da una GET")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-01T15:40:07.215+02:00")
public class CredentialsDTO {
  @JsonProperty("username")
  private String username = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("pin")
  private String pin = null;

  public CredentialsDTO username(String username) {
    this.username = username;
    return this;
  }

   /**
   * username
   * @return username
  **/
  @ApiModelProperty(value = "username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public CredentialsDTO password(String password) {
    this.password = password;
    return this;
  }

   /**
   * password
   * @return password
  **/
  @ApiModelProperty(value = "password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public CredentialsDTO pin(String pin) {
    this.pin = pin;
    return this;
  }

   /**
   * pin
   * @return pin
  **/
  @ApiModelProperty(value = "pin")
  public String getPin() {
    return pin;
  }

  public void setPin(String pin) {
    this.pin = pin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialsDTO credentials = (CredentialsDTO) o;
    return Objects.equals(this.username, credentials.username) &&
        Objects.equals(this.password, credentials.password) &&
        Objects.equals(this.pin, credentials.pin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password, pin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialsDTO {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
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

