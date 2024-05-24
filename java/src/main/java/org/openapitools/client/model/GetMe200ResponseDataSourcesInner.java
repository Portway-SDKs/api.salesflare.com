/*
 * Salesflare API
 * # Introduction  ## Getting Started  The Salesflare API allows you to access and build your own applications or integrations that interact with Salesflare.  The Salesflare API provides a RESTful interface with JSON-formatted responses to access most Salesflare resources.  ## Authentication  The Salesflare API uses bearer token based authentication, which means you need to use the key-value pair \"Authorization : Bearer APIKEY\" in the header to authenticate.  You can make an API key in [\"Settings\" > \"API keys\"](https://app.salesflare.com/#/settings/apikeys).  Click on the large orange \"+\" button on the bottom right of the screen to create an API key.  ![Screenshot API Key Settings](https://lib.salesflare.com/api_docs/screenshot_settings_apikeys.png)  ## Requests  All requests must be sent using HTTPS with TLS 1.2 or higher. Please make sure your developer tools support this version of TLS as older versions or SSL are not supported for security reasons.  For PUT or POST requests (e.g. create, update), the payload must be provided as JSON in the request body.  ## Responses  Responses use HTTP status codes, with the most typical ones being:  | Code                   | Meaning               | |------------------------|-----------------------| | Successful Responses                           | | 200                    | OK                    | | Error Responses                                | | 400                    | Bad Request           | | 401                    | Unauthorized          | | 404                    | Not Found             | | 429                    | Too Many Requests     | | 500                    | Internal Server Error |  ## Testing  We recommend testing our API with Postman.  ### Download specification  Our API is documented following the OpenAPI specification. You can download it [here](https://api.salesflare.com/openapi.json)  ### Import in Postman  To import the collection, open Postman and click Import, then select \"Import From Link\"  Copy & Paste the following link and press the \"Import\" button:  > https://api.salesflare.com/openapi.json  ![Screenshot Postman Import](https://lib.salesflare.com/api_docs/screenshot_postman_import.png)  ## Support  For API questions and support, please email support@salesflare.com or click the chat bubble below.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@salesflare.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * GetMe200ResponseDataSourcesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-24T18:23:43.461571613Z[UTC]", comments = "Generator version: 7.6.0")
public class GetMe200ResponseDataSourcesInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private BigDecimal id;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_SYNC_STATUS = "sync_status";
  @SerializedName(SERIALIZED_NAME_SYNC_STATUS)
  private String syncStatus;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ERROR("ERROR"),
    
    RECONNECT("RECONNECT"),
    
    OK("OK");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_STATUS_MESSAGE = "status_message";
  @SerializedName(SERIALIZED_NAME_STATUS_MESSAGE)
  private String statusMessage;

  public GetMe200ResponseDataSourcesInner() {
  }

  public GetMe200ResponseDataSourcesInner id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }


  public GetMe200ResponseDataSourcesInner email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public GetMe200ResponseDataSourcesInner type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public GetMe200ResponseDataSourcesInner syncStatus(String syncStatus) {
    this.syncStatus = syncStatus;
    return this;
  }

   /**
   * Get syncStatus
   * @return syncStatus
  **/
  @javax.annotation.Nullable
  public String getSyncStatus() {
    return syncStatus;
  }

  public void setSyncStatus(String syncStatus) {
    this.syncStatus = syncStatus;
  }


  public GetMe200ResponseDataSourcesInner status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public GetMe200ResponseDataSourcesInner statusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

   /**
   * Get statusMessage
   * @return statusMessage
  **/
  @javax.annotation.Nullable
  public String getStatusMessage() {
    return statusMessage;
  }

  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMe200ResponseDataSourcesInner getMe200ResponseDataSourcesInner = (GetMe200ResponseDataSourcesInner) o;
    return Objects.equals(this.id, getMe200ResponseDataSourcesInner.id) &&
        Objects.equals(this.email, getMe200ResponseDataSourcesInner.email) &&
        Objects.equals(this.type, getMe200ResponseDataSourcesInner.type) &&
        Objects.equals(this.syncStatus, getMe200ResponseDataSourcesInner.syncStatus) &&
        Objects.equals(this.status, getMe200ResponseDataSourcesInner.status) &&
        Objects.equals(this.statusMessage, getMe200ResponseDataSourcesInner.statusMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, type, syncStatus, status, statusMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMe200ResponseDataSourcesInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    syncStatus: ").append(toIndentedString(syncStatus)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("email");
    openapiFields.add("type");
    openapiFields.add("sync_status");
    openapiFields.add("status");
    openapiFields.add("status_message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetMe200ResponseDataSourcesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetMe200ResponseDataSourcesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetMe200ResponseDataSourcesInner is not found in the empty JSON string", GetMe200ResponseDataSourcesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetMe200ResponseDataSourcesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetMe200ResponseDataSourcesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("sync_status") != null && !jsonObj.get("sync_status").isJsonNull()) && !jsonObj.get("sync_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sync_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sync_status").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
      if ((jsonObj.get("status_message") != null && !jsonObj.get("status_message").isJsonNull()) && !jsonObj.get("status_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status_message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetMe200ResponseDataSourcesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetMe200ResponseDataSourcesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetMe200ResponseDataSourcesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetMe200ResponseDataSourcesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetMe200ResponseDataSourcesInner>() {
           @Override
           public void write(JsonWriter out, GetMe200ResponseDataSourcesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetMe200ResponseDataSourcesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetMe200ResponseDataSourcesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetMe200ResponseDataSourcesInner
  * @throws IOException if the JSON string is invalid with respect to GetMe200ResponseDataSourcesInner
  */
  public static GetMe200ResponseDataSourcesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetMe200ResponseDataSourcesInner.class);
  }

 /**
  * Convert an instance of GetMe200ResponseDataSourcesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

