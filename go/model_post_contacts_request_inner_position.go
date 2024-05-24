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
)

// checks if the PostContactsRequestInnerPosition type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &PostContactsRequestInnerPosition{}

// PostContactsRequestInnerPosition struct for PostContactsRequestInnerPosition
type PostContactsRequestInnerPosition struct {
	Organisation *string `json:"organisation,omitempty"`
	Role *string `json:"role,omitempty"`
}

// NewPostContactsRequestInnerPosition instantiates a new PostContactsRequestInnerPosition object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewPostContactsRequestInnerPosition() *PostContactsRequestInnerPosition {
	this := PostContactsRequestInnerPosition{}
	return &this
}

// NewPostContactsRequestInnerPositionWithDefaults instantiates a new PostContactsRequestInnerPosition object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewPostContactsRequestInnerPositionWithDefaults() *PostContactsRequestInnerPosition {
	this := PostContactsRequestInnerPosition{}
	return &this
}

// GetOrganisation returns the Organisation field value if set, zero value otherwise.
func (o *PostContactsRequestInnerPosition) GetOrganisation() string {
	if o == nil || IsNil(o.Organisation) {
		var ret string
		return ret
	}
	return *o.Organisation
}

// GetOrganisationOk returns a tuple with the Organisation field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PostContactsRequestInnerPosition) GetOrganisationOk() (*string, bool) {
	if o == nil || IsNil(o.Organisation) {
		return nil, false
	}
	return o.Organisation, true
}

// HasOrganisation returns a boolean if a field has been set.
func (o *PostContactsRequestInnerPosition) HasOrganisation() bool {
	if o != nil && !IsNil(o.Organisation) {
		return true
	}

	return false
}

// SetOrganisation gets a reference to the given string and assigns it to the Organisation field.
func (o *PostContactsRequestInnerPosition) SetOrganisation(v string) {
	o.Organisation = &v
}

// GetRole returns the Role field value if set, zero value otherwise.
func (o *PostContactsRequestInnerPosition) GetRole() string {
	if o == nil || IsNil(o.Role) {
		var ret string
		return ret
	}
	return *o.Role
}

// GetRoleOk returns a tuple with the Role field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PostContactsRequestInnerPosition) GetRoleOk() (*string, bool) {
	if o == nil || IsNil(o.Role) {
		return nil, false
	}
	return o.Role, true
}

// HasRole returns a boolean if a field has been set.
func (o *PostContactsRequestInnerPosition) HasRole() bool {
	if o != nil && !IsNil(o.Role) {
		return true
	}

	return false
}

// SetRole gets a reference to the given string and assigns it to the Role field.
func (o *PostContactsRequestInnerPosition) SetRole(v string) {
	o.Role = &v
}

func (o PostContactsRequestInnerPosition) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o PostContactsRequestInnerPosition) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Organisation) {
		toSerialize["organisation"] = o.Organisation
	}
	if !IsNil(o.Role) {
		toSerialize["role"] = o.Role
	}
	return toSerialize, nil
}

type NullablePostContactsRequestInnerPosition struct {
	value *PostContactsRequestInnerPosition
	isSet bool
}

func (v NullablePostContactsRequestInnerPosition) Get() *PostContactsRequestInnerPosition {
	return v.value
}

func (v *NullablePostContactsRequestInnerPosition) Set(val *PostContactsRequestInnerPosition) {
	v.value = val
	v.isSet = true
}

func (v NullablePostContactsRequestInnerPosition) IsSet() bool {
	return v.isSet
}

func (v *NullablePostContactsRequestInnerPosition) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePostContactsRequestInnerPosition(val *PostContactsRequestInnerPosition) *NullablePostContactsRequestInnerPosition {
	return &NullablePostContactsRequestInnerPosition{value: val, isSet: true}
}

func (v NullablePostContactsRequestInnerPosition) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePostContactsRequestInnerPosition) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


