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
import eu.afea.academy.dto.PrinterBaseDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Collection of Printer
 */
@ApiModel(description = "Collection of Printer")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-01T15:40:07.215+02:00")
public class PrinterCollectionPrinterBaseDTO {
  @JsonProperty("printers")
  private List<PrinterBaseDTO> printers = null;

  public PrinterCollectionPrinterBaseDTO printers(List<PrinterBaseDTO> printers) {
    this.printers = printers;
    return this;
  }

  public PrinterCollectionPrinterBaseDTO addPrintersItem(PrinterBaseDTO printersItem) {
    if (this.printers == null) {
      this.printers = new ArrayList<PrinterBaseDTO>();
    }
    this.printers.add(printersItem);
    return this;
  }

   /**
   * Elenco delle stampanti
   * @return printers
  **/
  @ApiModelProperty(value = "Elenco delle stampanti")
  public List<PrinterBaseDTO> getPrinters() {
    return printers;
  }

  public void setPrinters(List<PrinterBaseDTO> printers) {
    this.printers = printers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrinterCollectionPrinterBaseDTO printerCollectionPrinterBase = (PrinterCollectionPrinterBaseDTO) o;
    return Objects.equals(this.printers, printerCollectionPrinterBase.printers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(printers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrinterCollectionPrinterBaseDTO {\n");
    
    sb.append("    printers: ").append(toIndentedString(printers)).append("\n");
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

