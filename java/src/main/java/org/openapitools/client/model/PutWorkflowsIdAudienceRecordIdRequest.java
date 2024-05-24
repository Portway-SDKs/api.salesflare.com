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
 * PutWorkflowsIdAudienceRecordIdRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-24T18:23:43.461571613Z[UTC]", comments = "Generator version: 7.6.0")
public class PutWorkflowsIdAudienceRecordIdRequest {
  public static final String SERIALIZED_NAME_EXITED = "exited";
  @SerializedName(SERIALIZED_NAME_EXITED)
  private Boolean exited;

  public static final String SERIALIZED_NAME_MET_GOAL = "met_goal";
  @SerializedName(SERIALIZED_NAME_MET_GOAL)
  private Boolean metGoal;

  public PutWorkflowsIdAudienceRecordIdRequest() {
  }

  public PutWorkflowsIdAudienceRecordIdRequest exited(Boolean exited) {
    this.exited = exited;
    return this;
  }

   /**
   * Setting &#x60;exited&#x60; to &#x60;true&#x60; will exit the entity from the workflow. Setting &#x60;exited&#x60; to &#x60;false&#x60; will re-enter the entity into the workflow.
   * @return exited
  **/
  @javax.annotation.Nullable
  public Boolean getExited() {
    return exited;
  }

  public void setExited(Boolean exited) {
    this.exited = exited;
  }


  public PutWorkflowsIdAudienceRecordIdRequest metGoal(Boolean metGoal) {
    this.metGoal = metGoal;
    return this;
  }

   /**
   * Setting &#x60;met_goal&#x60; of a workflow record to &#x60;false&#x60; is currently not possible.
   * @return metGoal
  **/
  @javax.annotation.Nullable
  public Boolean getMetGoal() {
    return metGoal;
  }

  public void setMetGoal(Boolean metGoal) {
    this.metGoal = metGoal;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutWorkflowsIdAudienceRecordIdRequest putWorkflowsIdAudienceRecordIdRequest = (PutWorkflowsIdAudienceRecordIdRequest) o;
    return Objects.equals(this.exited, putWorkflowsIdAudienceRecordIdRequest.exited) &&
        Objects.equals(this.metGoal, putWorkflowsIdAudienceRecordIdRequest.metGoal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exited, metGoal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutWorkflowsIdAudienceRecordIdRequest {\n");
    sb.append("    exited: ").append(toIndentedString(exited)).append("\n");
    sb.append("    metGoal: ").append(toIndentedString(metGoal)).append("\n");
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
    openapiFields.add("exited");
    openapiFields.add("met_goal");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PutWorkflowsIdAudienceRecordIdRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PutWorkflowsIdAudienceRecordIdRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PutWorkflowsIdAudienceRecordIdRequest is not found in the empty JSON string", PutWorkflowsIdAudienceRecordIdRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PutWorkflowsIdAudienceRecordIdRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PutWorkflowsIdAudienceRecordIdRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PutWorkflowsIdAudienceRecordIdRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PutWorkflowsIdAudienceRecordIdRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PutWorkflowsIdAudienceRecordIdRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PutWorkflowsIdAudienceRecordIdRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PutWorkflowsIdAudienceRecordIdRequest>() {
           @Override
           public void write(JsonWriter out, PutWorkflowsIdAudienceRecordIdRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PutWorkflowsIdAudienceRecordIdRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PutWorkflowsIdAudienceRecordIdRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PutWorkflowsIdAudienceRecordIdRequest
  * @throws IOException if the JSON string is invalid with respect to PutWorkflowsIdAudienceRecordIdRequest
  */
  public static PutWorkflowsIdAudienceRecordIdRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PutWorkflowsIdAudienceRecordIdRequest.class);
  }

 /**
  * Convert an instance of PutWorkflowsIdAudienceRecordIdRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
