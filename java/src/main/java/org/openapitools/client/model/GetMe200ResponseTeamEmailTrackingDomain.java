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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * GetMe200ResponseTeamEmailTrackingDomain
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-24T18:23:43.461571613Z[UTC]", comments = "Generator version: 7.6.0")
public class GetMe200ResponseTeamEmailTrackingDomain {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_TIME_ZONES = "timeZones";
  @SerializedName(SERIALIZED_NAME_TIME_ZONES)
  private List<String> timeZones = new ArrayList<>();

  public GetMe200ResponseTeamEmailTrackingDomain() {
  }

  public GetMe200ResponseTeamEmailTrackingDomain url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nonnull
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public GetMe200ResponseTeamEmailTrackingDomain enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nonnull
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public GetMe200ResponseTeamEmailTrackingDomain timeZones(List<String> timeZones) {
    this.timeZones = timeZones;
    return this;
  }

  public GetMe200ResponseTeamEmailTrackingDomain addTimeZonesItem(String timeZonesItem) {
    if (this.timeZones == null) {
      this.timeZones = new ArrayList<>();
    }
    this.timeZones.add(timeZonesItem);
    return this;
  }

   /**
   * Get timeZones
   * @return timeZones
  **/
  @javax.annotation.Nullable
  public List<String> getTimeZones() {
    return timeZones;
  }

  public void setTimeZones(List<String> timeZones) {
    this.timeZones = timeZones;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMe200ResponseTeamEmailTrackingDomain getMe200ResponseTeamEmailTrackingDomain = (GetMe200ResponseTeamEmailTrackingDomain) o;
    return Objects.equals(this.url, getMe200ResponseTeamEmailTrackingDomain.url) &&
        Objects.equals(this.enabled, getMe200ResponseTeamEmailTrackingDomain.enabled) &&
        Objects.equals(this.timeZones, getMe200ResponseTeamEmailTrackingDomain.timeZones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, enabled, timeZones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMe200ResponseTeamEmailTrackingDomain {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    timeZones: ").append(toIndentedString(timeZones)).append("\n");
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
    openapiFields.add("url");
    openapiFields.add("enabled");
    openapiFields.add("timeZones");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("enabled");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetMe200ResponseTeamEmailTrackingDomain
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetMe200ResponseTeamEmailTrackingDomain.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetMe200ResponseTeamEmailTrackingDomain is not found in the empty JSON string", GetMe200ResponseTeamEmailTrackingDomain.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetMe200ResponseTeamEmailTrackingDomain.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetMe200ResponseTeamEmailTrackingDomain` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetMe200ResponseTeamEmailTrackingDomain.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("timeZones") != null && !jsonObj.get("timeZones").isJsonNull() && !jsonObj.get("timeZones").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeZones` to be an array in the JSON string but got `%s`", jsonObj.get("timeZones").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetMe200ResponseTeamEmailTrackingDomain.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetMe200ResponseTeamEmailTrackingDomain' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetMe200ResponseTeamEmailTrackingDomain> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetMe200ResponseTeamEmailTrackingDomain.class));

       return (TypeAdapter<T>) new TypeAdapter<GetMe200ResponseTeamEmailTrackingDomain>() {
           @Override
           public void write(JsonWriter out, GetMe200ResponseTeamEmailTrackingDomain value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetMe200ResponseTeamEmailTrackingDomain read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetMe200ResponseTeamEmailTrackingDomain given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetMe200ResponseTeamEmailTrackingDomain
  * @throws IOException if the JSON string is invalid with respect to GetMe200ResponseTeamEmailTrackingDomain
  */
  public static GetMe200ResponseTeamEmailTrackingDomain fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetMe200ResponseTeamEmailTrackingDomain.class);
  }

 /**
  * Convert an instance of GetMe200ResponseTeamEmailTrackingDomain to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

