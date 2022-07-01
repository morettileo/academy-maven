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
import eu.afea.academy.dto.SessionDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Collection of user sessions
 */
@ApiModel(description = "Collection of user sessions")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-01T15:40:07.215+02:00")
public class SessionCollectionDTO {
  @JsonProperty("sessions")
  private List<SessionDTO> sessions = null;

  public SessionCollectionDTO sessions(List<SessionDTO> sessions) {
    this.sessions = sessions;
    return this;
  }

  public SessionCollectionDTO addSessionsItem(SessionDTO sessionsItem) {
    if (this.sessions == null) {
      this.sessions = new ArrayList<SessionDTO>();
    }
    this.sessions.add(sessionsItem);
    return this;
  }

   /**
   * Elenco delle sessioni
   * @return sessions
  **/
  @ApiModelProperty(value = "Elenco delle sessioni")
  public List<SessionDTO> getSessions() {
    return sessions;
  }

  public void setSessions(List<SessionDTO> sessions) {
    this.sessions = sessions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionCollectionDTO sessionCollection = (SessionCollectionDTO) o;
    return Objects.equals(this.sessions, sessionCollection.sessions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionCollectionDTO {\n");
    
    sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
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

