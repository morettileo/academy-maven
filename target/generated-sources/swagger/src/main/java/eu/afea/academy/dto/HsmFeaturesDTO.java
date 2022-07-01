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
 * Feature del dispositivo di firma
 */
@ApiModel(description = "Feature del dispositivo di firma")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-01T15:40:07.215+02:00")
public class HsmFeaturesDTO {
  @JsonProperty("keyList")
  private Boolean keyList = null;

  @JsonProperty("logout")
  private Boolean logout = null;

   /**
   * Indica se l&#39;HSM supporta la restituzione dell&#39;elenco delle chiavi di cifratura disponibili o meno. Se keyList è false, l&#39;attributo keys restituirà sempre un elenco vuoto.
   * @return keyList
  **/
  @ApiModelProperty(value = "Indica se l'HSM supporta la restituzione dell'elenco delle chiavi di cifratura disponibili o meno. Se keyList è false, l'attributo keys restituirà sempre un elenco vuoto.")
  public Boolean isKeyList() {
    return keyList;
  }

   /**
   * Indica se l&#39;HSM supporta l&#39;operazione di logout.
   * @return logout
  **/
  @ApiModelProperty(value = "Indica se l'HSM supporta l'operazione di logout.")
  public Boolean isLogout() {
    return logout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HsmFeaturesDTO hsmFeatures = (HsmFeaturesDTO) o;
    return Objects.equals(this.keyList, hsmFeatures.keyList) &&
        Objects.equals(this.logout, hsmFeatures.logout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyList, logout);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HsmFeaturesDTO {\n");
    
    sb.append("    keyList: ").append(toIndentedString(keyList)).append("\n");
    sb.append("    logout: ").append(toIndentedString(logout)).append("\n");
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

