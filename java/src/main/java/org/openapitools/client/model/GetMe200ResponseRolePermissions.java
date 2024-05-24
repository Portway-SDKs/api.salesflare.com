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
 * GetMe200ResponseRolePermissions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-24T18:23:43.461571613Z[UTC]", comments = "Generator version: 7.6.0")
public class GetMe200ResponseRolePermissions {
  /**
   * Gets or Sets view
   */
  @JsonAdapter(ViewEnum.Adapter.class)
  public enum ViewEnum {
    CED("CED"),
    
    VIEW("VIEW");

    private String value;

    ViewEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ViewEnum fromValue(String value) {
      for (ViewEnum b : ViewEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ViewEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ViewEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ViewEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ViewEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ViewEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_VIEW = "view";
  @SerializedName(SERIALIZED_NAME_VIEW)
  private ViewEnum view;

  /**
   * Gets or Sets ced
   */
  @JsonAdapter(CedEnum.Adapter.class)
  public enum CedEnum {
    CED("CED"),
    
    VIEW("VIEW");

    private String value;

    CedEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CedEnum fromValue(String value) {
      for (CedEnum b : CedEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CedEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CedEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CedEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CedEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      CedEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CED = "ced";
  @SerializedName(SERIALIZED_NAME_CED)
  private CedEnum ced;

  public GetMe200ResponseRolePermissions() {
  }

  public GetMe200ResponseRolePermissions view(ViewEnum view) {
    this.view = view;
    return this;
  }

   /**
   * Get view
   * @return view
  **/
  @javax.annotation.Nullable
  public ViewEnum getView() {
    return view;
  }

  public void setView(ViewEnum view) {
    this.view = view;
  }


  public GetMe200ResponseRolePermissions ced(CedEnum ced) {
    this.ced = ced;
    return this;
  }

   /**
   * Get ced
   * @return ced
  **/
  @javax.annotation.Nullable
  public CedEnum getCed() {
    return ced;
  }

  public void setCed(CedEnum ced) {
    this.ced = ced;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMe200ResponseRolePermissions getMe200ResponseRolePermissions = (GetMe200ResponseRolePermissions) o;
    return Objects.equals(this.view, getMe200ResponseRolePermissions.view) &&
        Objects.equals(this.ced, getMe200ResponseRolePermissions.ced);
  }

  @Override
  public int hashCode() {
    return Objects.hash(view, ced);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMe200ResponseRolePermissions {\n");
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
    sb.append("    ced: ").append(toIndentedString(ced)).append("\n");
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
    openapiFields.add("view");
    openapiFields.add("ced");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetMe200ResponseRolePermissions
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetMe200ResponseRolePermissions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetMe200ResponseRolePermissions is not found in the empty JSON string", GetMe200ResponseRolePermissions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetMe200ResponseRolePermissions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetMe200ResponseRolePermissions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("view") != null && !jsonObj.get("view").isJsonNull()) && !jsonObj.get("view").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `view` to be a primitive type in the JSON string but got `%s`", jsonObj.get("view").toString()));
      }
      // validate the optional field `view`
      if (jsonObj.get("view") != null && !jsonObj.get("view").isJsonNull()) {
        ViewEnum.validateJsonElement(jsonObj.get("view"));
      }
      if ((jsonObj.get("ced") != null && !jsonObj.get("ced").isJsonNull()) && !jsonObj.get("ced").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ced` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ced").toString()));
      }
      // validate the optional field `ced`
      if (jsonObj.get("ced") != null && !jsonObj.get("ced").isJsonNull()) {
        CedEnum.validateJsonElement(jsonObj.get("ced"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetMe200ResponseRolePermissions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetMe200ResponseRolePermissions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetMe200ResponseRolePermissions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetMe200ResponseRolePermissions.class));

       return (TypeAdapter<T>) new TypeAdapter<GetMe200ResponseRolePermissions>() {
           @Override
           public void write(JsonWriter out, GetMe200ResponseRolePermissions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetMe200ResponseRolePermissions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetMe200ResponseRolePermissions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetMe200ResponseRolePermissions
  * @throws IOException if the JSON string is invalid with respect to GetMe200ResponseRolePermissions
  */
  public static GetMe200ResponseRolePermissions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetMe200ResponseRolePermissions.class);
  }

 /**
  * Convert an instance of GetMe200ResponseRolePermissions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
