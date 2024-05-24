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

// checks if the GetContacts200ResponseInnerOwner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &GetContacts200ResponseInnerOwner{}

// GetContacts200ResponseInnerOwner struct for GetContacts200ResponseInnerOwner
type GetContacts200ResponseInnerOwner struct {
	Id float32 `json:"id"`
	Name *string `json:"name,omitempty"`
	Email *string `json:"email,omitempty"`
	Picture *string `json:"picture,omitempty"`
}

type _GetContacts200ResponseInnerOwner GetContacts200ResponseInnerOwner

// NewGetContacts200ResponseInnerOwner instantiates a new GetContacts200ResponseInnerOwner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetContacts200ResponseInnerOwner(id float32) *GetContacts200ResponseInnerOwner {
	this := GetContacts200ResponseInnerOwner{}
	this.Id = id
	return &this
}

// NewGetContacts200ResponseInnerOwnerWithDefaults instantiates a new GetContacts200ResponseInnerOwner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetContacts200ResponseInnerOwnerWithDefaults() *GetContacts200ResponseInnerOwner {
	this := GetContacts200ResponseInnerOwner{}
	return &this
}

// GetId returns the Id field value
func (o *GetContacts200ResponseInnerOwner) GetId() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *GetContacts200ResponseInnerOwner) GetIdOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *GetContacts200ResponseInnerOwner) SetId(v float32) {
	o.Id = v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *GetContacts200ResponseInnerOwner) GetName() string {
	if o == nil || IsNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetContacts200ResponseInnerOwner) GetNameOk() (*string, bool) {
	if o == nil || IsNil(o.Name) {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *GetContacts200ResponseInnerOwner) HasName() bool {
	if o != nil && !IsNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *GetContacts200ResponseInnerOwner) SetName(v string) {
	o.Name = &v
}

// GetEmail returns the Email field value if set, zero value otherwise.
func (o *GetContacts200ResponseInnerOwner) GetEmail() string {
	if o == nil || IsNil(o.Email) {
		var ret string
		return ret
	}
	return *o.Email
}

// GetEmailOk returns a tuple with the Email field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetContacts200ResponseInnerOwner) GetEmailOk() (*string, bool) {
	if o == nil || IsNil(o.Email) {
		return nil, false
	}
	return o.Email, true
}

// HasEmail returns a boolean if a field has been set.
func (o *GetContacts200ResponseInnerOwner) HasEmail() bool {
	if o != nil && !IsNil(o.Email) {
		return true
	}

	return false
}

// SetEmail gets a reference to the given string and assigns it to the Email field.
func (o *GetContacts200ResponseInnerOwner) SetEmail(v string) {
	o.Email = &v
}

// GetPicture returns the Picture field value if set, zero value otherwise.
func (o *GetContacts200ResponseInnerOwner) GetPicture() string {
	if o == nil || IsNil(o.Picture) {
		var ret string
		return ret
	}
	return *o.Picture
}

// GetPictureOk returns a tuple with the Picture field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetContacts200ResponseInnerOwner) GetPictureOk() (*string, bool) {
	if o == nil || IsNil(o.Picture) {
		return nil, false
	}
	return o.Picture, true
}

// HasPicture returns a boolean if a field has been set.
func (o *GetContacts200ResponseInnerOwner) HasPicture() bool {
	if o != nil && !IsNil(o.Picture) {
		return true
	}

	return false
}

// SetPicture gets a reference to the given string and assigns it to the Picture field.
func (o *GetContacts200ResponseInnerOwner) SetPicture(v string) {
	o.Picture = &v
}

func (o GetContacts200ResponseInnerOwner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o GetContacts200ResponseInnerOwner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["id"] = o.Id
	if !IsNil(o.Name) {
		toSerialize["name"] = o.Name
	}
	if !IsNil(o.Email) {
		toSerialize["email"] = o.Email
	}
	if !IsNil(o.Picture) {
		toSerialize["picture"] = o.Picture
	}
	return toSerialize, nil
}

func (o *GetContacts200ResponseInnerOwner) UnmarshalJSON(data []byte) (err error) {
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

	varGetContacts200ResponseInnerOwner := _GetContacts200ResponseInnerOwner{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varGetContacts200ResponseInnerOwner)

	if err != nil {
		return err
	}

	*o = GetContacts200ResponseInnerOwner(varGetContacts200ResponseInnerOwner)

	return err
}

type NullableGetContacts200ResponseInnerOwner struct {
	value *GetContacts200ResponseInnerOwner
	isSet bool
}

func (v NullableGetContacts200ResponseInnerOwner) Get() *GetContacts200ResponseInnerOwner {
	return v.value
}

func (v *NullableGetContacts200ResponseInnerOwner) Set(val *GetContacts200ResponseInnerOwner) {
	v.value = val
	v.isSet = true
}

func (v NullableGetContacts200ResponseInnerOwner) IsSet() bool {
	return v.isSet
}

func (v *NullableGetContacts200ResponseInnerOwner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetContacts200ResponseInnerOwner(val *GetContacts200ResponseInnerOwner) *NullableGetContacts200ResponseInnerOwner {
	return &NullableGetContacts200ResponseInnerOwner{value: val, isSet: true}
}

func (v NullableGetContacts200ResponseInnerOwner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetContacts200ResponseInnerOwner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

