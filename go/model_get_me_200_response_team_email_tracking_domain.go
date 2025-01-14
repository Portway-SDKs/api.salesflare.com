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

// checks if the GetMe200ResponseTeamEmailTrackingDomain type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &GetMe200ResponseTeamEmailTrackingDomain{}

// GetMe200ResponseTeamEmailTrackingDomain struct for GetMe200ResponseTeamEmailTrackingDomain
type GetMe200ResponseTeamEmailTrackingDomain struct {
	Url string `json:"url"`
	Enabled bool `json:"enabled"`
	TimeZones []string `json:"timeZones,omitempty"`
}

type _GetMe200ResponseTeamEmailTrackingDomain GetMe200ResponseTeamEmailTrackingDomain

// NewGetMe200ResponseTeamEmailTrackingDomain instantiates a new GetMe200ResponseTeamEmailTrackingDomain object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetMe200ResponseTeamEmailTrackingDomain(url string, enabled bool) *GetMe200ResponseTeamEmailTrackingDomain {
	this := GetMe200ResponseTeamEmailTrackingDomain{}
	this.Url = url
	this.Enabled = enabled
	return &this
}

// NewGetMe200ResponseTeamEmailTrackingDomainWithDefaults instantiates a new GetMe200ResponseTeamEmailTrackingDomain object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetMe200ResponseTeamEmailTrackingDomainWithDefaults() *GetMe200ResponseTeamEmailTrackingDomain {
	this := GetMe200ResponseTeamEmailTrackingDomain{}
	return &this
}

// GetUrl returns the Url field value
func (o *GetMe200ResponseTeamEmailTrackingDomain) GetUrl() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Url
}

// GetUrlOk returns a tuple with the Url field value
// and a boolean to check if the value has been set.
func (o *GetMe200ResponseTeamEmailTrackingDomain) GetUrlOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Url, true
}

// SetUrl sets field value
func (o *GetMe200ResponseTeamEmailTrackingDomain) SetUrl(v string) {
	o.Url = v
}

// GetEnabled returns the Enabled field value
func (o *GetMe200ResponseTeamEmailTrackingDomain) GetEnabled() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Enabled
}

// GetEnabledOk returns a tuple with the Enabled field value
// and a boolean to check if the value has been set.
func (o *GetMe200ResponseTeamEmailTrackingDomain) GetEnabledOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Enabled, true
}

// SetEnabled sets field value
func (o *GetMe200ResponseTeamEmailTrackingDomain) SetEnabled(v bool) {
	o.Enabled = v
}

// GetTimeZones returns the TimeZones field value if set, zero value otherwise.
func (o *GetMe200ResponseTeamEmailTrackingDomain) GetTimeZones() []string {
	if o == nil || IsNil(o.TimeZones) {
		var ret []string
		return ret
	}
	return o.TimeZones
}

// GetTimeZonesOk returns a tuple with the TimeZones field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetMe200ResponseTeamEmailTrackingDomain) GetTimeZonesOk() ([]string, bool) {
	if o == nil || IsNil(o.TimeZones) {
		return nil, false
	}
	return o.TimeZones, true
}

// HasTimeZones returns a boolean if a field has been set.
func (o *GetMe200ResponseTeamEmailTrackingDomain) HasTimeZones() bool {
	if o != nil && !IsNil(o.TimeZones) {
		return true
	}

	return false
}

// SetTimeZones gets a reference to the given []string and assigns it to the TimeZones field.
func (o *GetMe200ResponseTeamEmailTrackingDomain) SetTimeZones(v []string) {
	o.TimeZones = v
}

func (o GetMe200ResponseTeamEmailTrackingDomain) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o GetMe200ResponseTeamEmailTrackingDomain) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["url"] = o.Url
	toSerialize["enabled"] = o.Enabled
	if !IsNil(o.TimeZones) {
		toSerialize["timeZones"] = o.TimeZones
	}
	return toSerialize, nil
}

func (o *GetMe200ResponseTeamEmailTrackingDomain) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"url",
		"enabled",
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

	varGetMe200ResponseTeamEmailTrackingDomain := _GetMe200ResponseTeamEmailTrackingDomain{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varGetMe200ResponseTeamEmailTrackingDomain)

	if err != nil {
		return err
	}

	*o = GetMe200ResponseTeamEmailTrackingDomain(varGetMe200ResponseTeamEmailTrackingDomain)

	return err
}

type NullableGetMe200ResponseTeamEmailTrackingDomain struct {
	value *GetMe200ResponseTeamEmailTrackingDomain
	isSet bool
}

func (v NullableGetMe200ResponseTeamEmailTrackingDomain) Get() *GetMe200ResponseTeamEmailTrackingDomain {
	return v.value
}

func (v *NullableGetMe200ResponseTeamEmailTrackingDomain) Set(val *GetMe200ResponseTeamEmailTrackingDomain) {
	v.value = val
	v.isSet = true
}

func (v NullableGetMe200ResponseTeamEmailTrackingDomain) IsSet() bool {
	return v.isSet
}

func (v *NullableGetMe200ResponseTeamEmailTrackingDomain) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetMe200ResponseTeamEmailTrackingDomain(val *GetMe200ResponseTeamEmailTrackingDomain) *NullableGetMe200ResponseTeamEmailTrackingDomain {
	return &NullableGetMe200ResponseTeamEmailTrackingDomain{value: val, isSet: true}
}

func (v NullableGetMe200ResponseTeamEmailTrackingDomain) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetMe200ResponseTeamEmailTrackingDomain) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


