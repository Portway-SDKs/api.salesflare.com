/*
Salesflare API

# Introduction  ## Getting Started  The Salesflare API allows you to access and build your own applications or integrations that interact with Salesflare.  The Salesflare API provides a RESTful interface with JSON-formatted responses to access most Salesflare resources.  ## Authentication  The Salesflare API uses bearer token based authentication, which means you need to use the key-value pair \"Authorization : Bearer APIKEY\" in the header to authenticate.  You can make an API key in [\"Settings\" > \"API keys\"](https://app.salesflare.com/#/settings/apikeys).  Click on the large orange \"+\" button on the bottom right of the screen to create an API key.  ![Screenshot API Key Settings](https://lib.salesflare.com/api_docs/screenshot_settings_apikeys.png)  ## Requests  All requests must be sent using HTTPS with TLS 1.2 or higher. Please make sure your developer tools support this version of TLS as older versions or SSL are not supported for security reasons.  For PUT or POST requests (e.g. create, update), the payload must be provided as JSON in the request body.  ## Responses  Responses use HTTP status codes, with the most typical ones being:  | Code                   | Meaning               | |------------------------|-----------------------| | Successful Responses                           | | 200                    | OK                    | | Error Responses                                | | 400                    | Bad Request           | | 401                    | Unauthorized          | | 404                    | Not Found             | | 429                    | Too Many Requests     | | 500                    | Internal Server Error |  ## Testing  We recommend testing our API with Postman.  ### Download specification  Our API is documented following the OpenAPI specification. You can download it [here](https://api.salesflare.com/openapi.json)  ### Import in Postman  To import the collection, open Postman and click Import, then select \"Import From Link\"  Copy & Paste the following link and press the \"Import\" button:  > https://api.salesflare.com/openapi.json  ![Screenshot Postman Import](https://lib.salesflare.com/api_docs/screenshot_postman_import.png)  ## Support  For API questions and support, please email support@salesflare.com or click the chat bubble below.

API version: 1.0.0
Contact: support@salesflare.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package salesflare

import (
	"encoding/json"
	"bytes"
	"fmt"
)

// checks if the GetContacts200ResponseInnerSocialProfilesInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &GetContacts200ResponseInnerSocialProfilesInner{}

// GetContacts200ResponseInnerSocialProfilesInner struct for GetContacts200ResponseInnerSocialProfilesInner
type GetContacts200ResponseInnerSocialProfilesInner struct {
	Id float32 `json:"id"`
	Type *string `json:"type,omitempty"`
	Url *string `json:"url,omitempty"`
	Username *string `json:"username,omitempty"`
}

type _GetContacts200ResponseInnerSocialProfilesInner GetContacts200ResponseInnerSocialProfilesInner

// NewGetContacts200ResponseInnerSocialProfilesInner instantiates a new GetContacts200ResponseInnerSocialProfilesInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetContacts200ResponseInnerSocialProfilesInner(id float32) *GetContacts200ResponseInnerSocialProfilesInner {
	this := GetContacts200ResponseInnerSocialProfilesInner{}
	this.Id = id
	return &this
}

// NewGetContacts200ResponseInnerSocialProfilesInnerWithDefaults instantiates a new GetContacts200ResponseInnerSocialProfilesInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetContacts200ResponseInnerSocialProfilesInnerWithDefaults() *GetContacts200ResponseInnerSocialProfilesInner {
	this := GetContacts200ResponseInnerSocialProfilesInner{}
	return &this
}

// GetId returns the Id field value
func (o *GetContacts200ResponseInnerSocialProfilesInner) GetId() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *GetContacts200ResponseInnerSocialProfilesInner) GetIdOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *GetContacts200ResponseInnerSocialProfilesInner) SetId(v float32) {
	o.Id = v
}

// GetType returns the Type field value if set, zero value otherwise.
func (o *GetContacts200ResponseInnerSocialProfilesInner) GetType() string {
	if o == nil || IsNil(o.Type) {
		var ret string
		return ret
	}
	return *o.Type
}

// GetTypeOk returns a tuple with the Type field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetContacts200ResponseInnerSocialProfilesInner) GetTypeOk() (*string, bool) {
	if o == nil || IsNil(o.Type) {
		return nil, false
	}
	return o.Type, true
}

// HasType returns a boolean if a field has been set.
func (o *GetContacts200ResponseInnerSocialProfilesInner) HasType() bool {
	if o != nil && !IsNil(o.Type) {
		return true
	}

	return false
}

// SetType gets a reference to the given string and assigns it to the Type field.
func (o *GetContacts200ResponseInnerSocialProfilesInner) SetType(v string) {
	o.Type = &v
}

// GetUrl returns the Url field value if set, zero value otherwise.
func (o *GetContacts200ResponseInnerSocialProfilesInner) GetUrl() string {
	if o == nil || IsNil(o.Url) {
		var ret string
		return ret
	}
	return *o.Url
}

// GetUrlOk returns a tuple with the Url field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetContacts200ResponseInnerSocialProfilesInner) GetUrlOk() (*string, bool) {
	if o == nil || IsNil(o.Url) {
		return nil, false
	}
	return o.Url, true
}

// HasUrl returns a boolean if a field has been set.
func (o *GetContacts200ResponseInnerSocialProfilesInner) HasUrl() bool {
	if o != nil && !IsNil(o.Url) {
		return true
	}

	return false
}

// SetUrl gets a reference to the given string and assigns it to the Url field.
func (o *GetContacts200ResponseInnerSocialProfilesInner) SetUrl(v string) {
	o.Url = &v
}

// GetUsername returns the Username field value if set, zero value otherwise.
func (o *GetContacts200ResponseInnerSocialProfilesInner) GetUsername() string {
	if o == nil || IsNil(o.Username) {
		var ret string
		return ret
	}
	return *o.Username
}

// GetUsernameOk returns a tuple with the Username field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetContacts200ResponseInnerSocialProfilesInner) GetUsernameOk() (*string, bool) {
	if o == nil || IsNil(o.Username) {
		return nil, false
	}
	return o.Username, true
}

// HasUsername returns a boolean if a field has been set.
func (o *GetContacts200ResponseInnerSocialProfilesInner) HasUsername() bool {
	if o != nil && !IsNil(o.Username) {
		return true
	}

	return false
}

// SetUsername gets a reference to the given string and assigns it to the Username field.
func (o *GetContacts200ResponseInnerSocialProfilesInner) SetUsername(v string) {
	o.Username = &v
}

func (o GetContacts200ResponseInnerSocialProfilesInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o GetContacts200ResponseInnerSocialProfilesInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["id"] = o.Id
	if !IsNil(o.Type) {
		toSerialize["type"] = o.Type
	}
	if !IsNil(o.Url) {
		toSerialize["url"] = o.Url
	}
	if !IsNil(o.Username) {
		toSerialize["username"] = o.Username
	}
	return toSerialize, nil
}

func (o *GetContacts200ResponseInnerSocialProfilesInner) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"id",
	}

	allProperties := make(map[string]interface{})

	err = json.Unmarshal(data, &allProperties)

	if err != nil {
		return err;
	}

	for _, requiredProperty := range(requiredProperties) {
		if _, exists := allProperties[requiredProperty]; !exists {
			return fmt.Errorf("no value given for required property %v", requiredProperty)
		}
	}

	varGetContacts200ResponseInnerSocialProfilesInner := _GetContacts200ResponseInnerSocialProfilesInner{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varGetContacts200ResponseInnerSocialProfilesInner)

	if err != nil {
		return err
	}

	*o = GetContacts200ResponseInnerSocialProfilesInner(varGetContacts200ResponseInnerSocialProfilesInner)

	return err
}

type NullableGetContacts200ResponseInnerSocialProfilesInner struct {
	value *GetContacts200ResponseInnerSocialProfilesInner
	isSet bool
}

func (v NullableGetContacts200ResponseInnerSocialProfilesInner) Get() *GetContacts200ResponseInnerSocialProfilesInner {
	return v.value
}

func (v *NullableGetContacts200ResponseInnerSocialProfilesInner) Set(val *GetContacts200ResponseInnerSocialProfilesInner) {
	v.value = val
	v.isSet = true
}

func (v NullableGetContacts200ResponseInnerSocialProfilesInner) IsSet() bool {
	return v.isSet
}

func (v *NullableGetContacts200ResponseInnerSocialProfilesInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetContacts200ResponseInnerSocialProfilesInner(val *GetContacts200ResponseInnerSocialProfilesInner) *NullableGetContacts200ResponseInnerSocialProfilesInner {
	return &NullableGetContacts200ResponseInnerSocialProfilesInner{value: val, isSet: true}
}

func (v NullableGetContacts200ResponseInnerSocialProfilesInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetContacts200ResponseInnerSocialProfilesInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


