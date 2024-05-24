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
 * GetContacts200ResponseInnerTagsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-24T18:23:43.461571613Z[UTC]", comments = "Generator version: 7.6.0")
public class GetContacts200ResponseInnerTagsInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private BigDecimal id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public GetContacts200ResponseInnerTagsInner() {
  }

  public GetContacts200ResponseInnerTagsInner id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }


  public GetContacts200ResponseInnerTagsInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetContacts200ResponseInnerTagsInner getContacts200ResponseInnerTagsInner = (GetContacts200ResponseInnerTagsInner) o;
    return Objects.equals(this.id, getContacts200ResponseInnerTagsInner.id) &&
        Objects.equals(this.name, getContacts200ResponseInnerTagsInner.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetContacts200ResponseInnerTagsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetContacts200ResponseInnerTagsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetContacts200ResponseInnerTagsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetContacts200ResponseInnerTagsInner is not found in the empty JSON string", GetContacts200ResponseInnerTagsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetContacts200ResponseInnerTagsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetContacts200ResponseInnerTagsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetContacts200ResponseInnerTagsInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetContacts200ResponseInnerTagsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetContacts200ResponseInnerTagsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetContacts200ResponseInnerTagsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetContacts200ResponseInnerTagsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetContacts200ResponseInnerTagsInner>() {
           @Override
           public void write(JsonWriter out, GetContacts200ResponseInnerTagsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetContacts200ResponseInnerTagsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetContacts200ResponseInnerTagsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetContacts200ResponseInnerTagsInner
  * @throws IOException if the JSON string is invalid with respect to GetContacts200ResponseInnerTagsInner
  */
  public static GetContacts200ResponseInnerTagsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetContacts200ResponseInnerTagsInner.class);
  }

 /**
  * Convert an instance of GetContacts200ResponseInnerTagsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

