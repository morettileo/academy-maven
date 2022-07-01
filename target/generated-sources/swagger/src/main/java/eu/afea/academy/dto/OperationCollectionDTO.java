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
import eu.afea.academy.dto.OperationDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Collection of operations
 */
@ApiModel(description = "Collection of operations")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-01T15:40:07.215+02:00")
public class OperationCollectionDTO {
  @JsonProperty("operations")
  private List<OperationDTO> operations = null;

  public OperationCollectionDTO operations(List<OperationDTO> operations) {
    this.operations = operations;
    return this;
  }

  public OperationCollectionDTO addOperationsItem(OperationDTO operationsItem) {
    if (this.operations == null) {
      this.operations = new ArrayList<OperationDTO>();
    }
    this.operations.add(operationsItem);
    return this;
  }

   /**
   * Elenco delle operazioni
   * @return operations
  **/
  @ApiModelProperty(value = "Elenco delle operazioni")
  public List<OperationDTO> getOperations() {
    return operations;
  }

  public void setOperations(List<OperationDTO> operations) {
    this.operations = operations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationCollectionDTO operationCollection = (OperationCollectionDTO) o;
    return Objects.equals(this.operations, operationCollection.operations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationCollectionDTO {\n");
    
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
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

