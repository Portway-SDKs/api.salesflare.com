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
 * PostContactsRequestInnerAddress
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-24T18:23:43.461571613Z[UTC]", comments = "Generator version: 7.6.0")
public class PostContactsRequestInnerAddress {
  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_STATE_REGION = "state_region";
  @SerializedName(SERIALIZED_NAME_STATE_REGION)
  private String stateRegion;

  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  private String street;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ZIP = "zip";
  @SerializedName(SERIALIZED_NAME_ZIP)
  private String zip;

  public PostContactsRequestInnerAddress() {
  }

  public PostContactsRequestInnerAddress city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public PostContactsRequestInnerAddress country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  public PostContactsRequestInnerAddress region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Deprecated property. Use state_region instead.
   * @return region
  **/
  @javax.annotation.Nullable
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }


  public PostContactsRequestInnerAddress stateRegion(String stateRegion) {
    this.stateRegion = stateRegion;
    return this;
  }

   /**
   * Get stateRegion
   * @return stateRegion
  **/
  @javax.annotation.Nullable
  public String getStateRegion() {
    return stateRegion;
  }

  public void setStateRegion(String stateRegion) {
    this.stateRegion = stateRegion;
  }


  public PostContactsRequestInnerAddress street(String street) {
    this.street = street;
    return this;
  }

   /**
   * Get street
   * @return street
  **/
  @javax.annotation.Nullable
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }


  public PostContactsRequestInnerAddress type(String type) {
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


  public PostContactsRequestInnerAddress zip(String zip) {
    this.zip = zip;
    return this;
  }

   /**
   * Get zip
   * @return zip
  **/
  @javax.annotation.Nullable
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostContactsRequestInnerAddress postContactsRequestInnerAddress = (PostContactsRequestInnerAddress) o;
    return Objects.equals(this.city, postContactsRequestInnerAddress.city) &&
        Objects.equals(this.country, postContactsRequestInnerAddress.country) &&
        Objects.equals(this.region, postContactsRequestInnerAddress.region) &&
        Objects.equals(this.stateRegion, postContactsRequestInnerAddress.stateRegion) &&
        Objects.equals(this.street, postContactsRequestInnerAddress.street) &&
        Objects.equals(this.type, postContactsRequestInnerAddress.type) &&
        Objects.equals(this.zip, postContactsRequestInnerAddress.zip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, region, stateRegion, street, type, zip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostContactsRequestInnerAddress {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    stateRegion: ").append(toIndentedString(stateRegion)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
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
    openapiFields.add("city");
    openapiFields.add("country");
    openapiFields.add("region");
    openapiFields.add("state_region");
    openapiFields.add("street");
    openapiFields.add("type");
    openapiFields.add("zip");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PostContactsRequestInnerAddress
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PostContactsRequestInnerAddress.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PostContactsRequestInnerAddress is not found in the empty JSON string", PostContactsRequestInnerAddress.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PostContactsRequestInnerAddress.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PostContactsRequestInnerAddress` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("region") != null && !jsonObj.get("region").isJsonNull()) && !jsonObj.get("region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region").toString()));
      }
      if ((jsonObj.get("state_region") != null && !jsonObj.get("state_region").isJsonNull()) && !jsonObj.get("state_region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state_region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state_region").toString()));
      }
      if ((jsonObj.get("street") != null && !jsonObj.get("street").isJsonNull()) && !jsonObj.get("street").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `street` to be a primitive type in the JSON string but got `%s`", jsonObj.get("street").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("zip") != null && !jsonObj.get("zip").isJsonNull()) && !jsonObj.get("zip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zip").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PostContactsRequestInnerAddress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PostContactsRequestInnerAddress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PostContactsRequestInnerAddress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PostContactsRequestInnerAddress.class));

       return (TypeAdapter<T>) new TypeAdapter<PostContactsRequestInnerAddress>() {
           @Override
           public void write(JsonWriter out, PostContactsRequestInnerAddress value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PostContactsRequestInnerAddress read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PostContactsRequestInnerAddress given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PostContactsRequestInnerAddress
  * @throws IOException if the JSON string is invalid with respect to PostContactsRequestInnerAddress
  */
  public static PostContactsRequestInnerAddress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PostContactsRequestInnerAddress.class);
  }

 /**
  * Convert an instance of PostContactsRequestInnerAddress to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

