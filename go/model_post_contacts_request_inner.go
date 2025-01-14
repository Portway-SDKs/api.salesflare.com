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
	"time"
)

// checks if the PostContactsRequestInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &PostContactsRequestInner{}

// PostContactsRequestInner struct for PostContactsRequestInner
type PostContactsRequestInner struct {
	Owner *float32 `json:"owner,omitempty"`
	Email *string `json:"email,omitempty"`
	Prefix *string `json:"prefix,omitempty"`
	Firstname *string `json:"firstname,omitempty"`
	Middle *string `json:"middle,omitempty"`
	Lastname *string `json:"lastname,omitempty"`
	Suffix *string `json:"suffix,omitempty"`
	Name *string `json:"name,omitempty"`
	Picture *string `json:"picture,omitempty"`
	// Any existing account will be removed from the contact when specifically passing `null`!
	Account *float32 `json:"account,omitempty"`
	BirthDate *time.Time `json:"birth_date,omitempty"`
	OptOut *bool `json:"opt-out,omitempty"`
	OptOutDate *time.Time `json:"opt-out_date,omitempty"`
	OptOutCampaign *string `json:"opt-out_campaign,omitempty"`
	Bounced *bool `json:"bounced,omitempty"`
	BouncedDate *time.Time `json:"bounced_date,omitempty"`
	Files []map[string]interface{} `json:"files,omitempty"`
	Tags []string `json:"tags,omitempty"`
	Address *PostContactsRequestInnerAddress `json:"address,omitempty"`
	Addresses []PostContactsRequestInnerAddress `json:"addresses,omitempty"`
	PhoneNumber *string `json:"phone_number,omitempty"`
	MobilePhoneNumber *string `json:"mobile_phone_number,omitempty"`
	HomePhoneNumber *string `json:"home_phone_number,omitempty"`
	FaxNumber *string `json:"fax_number,omitempty"`
	PhoneNumbers []PostContactsRequestInnerPhoneNumbersInner `json:"phone_numbers,omitempty"`
	Position *PostContactsRequestInnerPosition `json:"position,omitempty"`
	Positions []PostContactsRequestInnerPosition `json:"positions,omitempty"`
	SocialProfiles []string `json:"social_profiles,omitempty"`
	Custom map[string]interface{} `json:"custom,omitempty"`
}

// NewPostContactsRequestInner instantiates a new PostContactsRequestInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewPostContactsRequestInner() *PostContactsRequestInner {
	this := PostContactsRequestInner{}
	return &this
}

// NewPostContactsRequestInnerWithDefaults instantiates a new PostContactsRequestInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewPostContactsRequestInnerWithDefaults() *PostContactsRequestInner {
	this := PostContactsRequestInner{}
	return &this
}

// GetOwner returns the Owner field value if set, zero value otherwise.
func (o *PostContactsRequestInner) GetOwner() float32 {
	if o == nil || IsNil(o.Owner) {
		var ret float32
		return ret
	}
	return *o.Owner
}

// GetOwnerOk returns a tuple with the Owner field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PostContactsRequestInner) GetOwnerOk() (*float32, bool) {
	if o == nil || IsNil(o.Owner) {
		return nil, false
	}
	return o.Owner, true
}

// HasOwner returns a boolean if a field has been set.
func (o *PostContactsRequestInner) HasOwner() bool {
	if o != nil && !IsNil(o.Owner) {
		return true
	}

	return false
}

// SetOwner gets a reference to the given float32 and assigns it to the Owner field.
func (o *PostContactsRequestInner) SetOwner(v float32) {
	o.Owner = &v
}

// GetEmail returns the Email field value if set, zero value otherwise.
func (o *PostContactsRequestInner) GetEmail() string {
	if o == nil || IsNil(o.Email) {
		var ret string
		return ret
	}
	return *o.Email
}

// GetEmailOk returns a tuple with the Email field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PostContactsRequestInner) GetEmailOk() (*string, bool) {
	if o == nil || IsNil(o.Email) {
		return nil, false
	}
	return o.Email, true
}

// HasEmail returns a boolean if a field has been set.
func (o *PostContactsRequestInner) HasEmail() bool {
	if o != nil && !IsNil(o.Email) {
		return true
	}

	return false
}

// SetEmail gets a reference to the given string and assigns it to the Email field.
func (o *PostContactsRequestInner) SetEmail(v string) {
	o.Email = &v
}

// GetPrefix returns the Prefix field value if set, zero value otherwise.
func (o *PostContactsRequestInner) GetPrefix() string {
	if o == nil || IsNil(o.Prefix) {
		var ret string
		return ret
	}
	return *o.Prefix
}

// GetPrefixOk returns a tuple with the Prefix field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PostContactsRequestInner) GetPrefixOk() (*string, bool) {
	if o == nil || IsNil(o.Prefix) {
		return nil, false
	}
	return o.Prefix, true
}

// HasPrefix returns a boolean if a field has been set.
func (o *PostContactsRequestInner) HasPrefix() bool {
	if o != nil && !IsNil(o.Prefix) {
		return true
	}

	return false
}

// SetPrefix gets a reference to the given string and assigns it to the Prefix field.
func (o *PostContactsRequestInner) SetPrefix(v string) {
	o.Prefix = &v
}

// GetFirstname returns the Firstname field value if set, zero value otherwise.
func (o *PostContactsRequestInner) GetFirstname() string {
	if o == nil || IsNil(o.Firstname) {
		var ret string
		return ret
	}
	return *o.Firstname
}

// GetFirstnameOk returns a tuple with the Firstname field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PostContactsRequestInner) GetFirstnameOk() (*string, bool) {
	if o == nil || IsNil(o.Firstname) {
		return nil, false
	}
	return o.Firstname, true
}

// HasFirstname returns a boolean if a field has been set.
func (o *PostContactsRequestInner) HasFirstname() bool {
	if o != nil && !IsNil(o.Firstname) {
		return true
	}

	return false
}

// SetFirstname gets a reference to the given string and assigns it to the Firstname field.
func (o *PostContactsRequestInner) SetFirstname(v string) {
	o.Firstname = &v
}

// GetMiddle returns the Middle field value if set, zero value otherwise.
func (o *PostContactsRequestInner) GetMiddle() string {
	if o == nil || IsNil(o.Middle) {
		var ret string
		return ret
	}
	return *o.Middle
}

// GetMiddleOk returns a tuple with the Middle field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PostContactsRequestInner) GetMiddleOk() (*string, bool) {
	if o == nil || IsNil(o.Middle) {
		return nil, false
	}
	return o.Middle, true
}

// HasMiddle returns a boolean if a field has been set.
func (o *PostContactsRequestInner) HasMiddle() bool {
	if o != nil && !IsNil(o.Middle) {
		return true
	}

	return false
}

// SetMiddle gets a reference to the given string and assigns it to the Middle field.
func (o *PostContactsRequestInner) SetMiddle(v string) {
	o.Middle = &v
}

// GetLastname returns the Lastname field value if set, zero value otherwise.
func (o *PostContactsRequestInner) GetLastname() string {
	if o == nil || IsNil(o.Lastname) {
		var ret string
		return ret
	}
	return *o.Lastname
}

// GetLastnameOk returns a tuple with the Lastname field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PostContactsRequestInner) GetLastnameOk() (*string, bool) {
	if o == nil || IsNil(o.Lastname) {
		return nil, false
	}
	return o.Lastname, true
}

// HasLastname returns a boolean if a field has been set.
func (o *PostContactsRequestInner) HasLastname() bool {
	if o != nil && !IsNil(o.Lastname) {
		return true
	}

	return false
}

// SetLastname gets a reference to the given string and assigns it to the Lastname field.
func (o *PostContactsRequestInner) SetLastname(v string) {
	o.Lastname = &v
}

// GetSuffix returns the Suffix field value if set, zero value otherwise.
func (o *PostContactsRequestInner) GetSuffix() string {
	if o == nil || IsNil(o.Suffix) {
		var ret string
		return ret
	}
	return *o.Suffix
}

// GetSuffixOk returns a tuple with the Suffix field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PostContactsRequestInner) GetSuffixOk() (*string, bool) {
	if o == nil || IsNil(o.Suffix) {
		return nil, false
	}
	return o.Suffix, true
}

// HasSuffix returns a boolean if a field has been set.
func (o *PostContactsRequestInner) HasSuffix() bool {
	if o != nil && !IsNil(o.Suffix) {
		return true
	}

	return false
}

// SetSuffix gets a reference to the given string and assigns it to the Suffix field.
func (o *PostContactsRequestInner) SetSuffix(v string) {
	o.Suffix = &v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *PostContactsRequestInner) GetName() string {
	if o == nil || IsNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PostContactsRequestInner) GetNameOk() (*string, bool) {
	if o == nil || IsNil(o.Name) {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *PostContactsRequestInner) HasName() bool {
	if o != nil && !IsNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *PostContactsRequestInner) SetName(v string) {
	o.Name = &v
}

// GetPicture returns the Picture field value if set, zero value otherwise.
func (o *PostContactsRequestInner) GetPicture() string {
	if o == nil || IsNil(o.Picture) {
		var ret string
		return ret
	}
	return *o.Picture
}

// GetPictureOk returns a tuple with the Picture field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PostContactsRequestInner) GetPictureOk() (*string, bool) {
	if o == nil || IsNil(o.Picture) {
		return nil, false
	}
	return o.Picture, true
}

// HasPicture returns a boolean if a field has been set.
func (o *PostContactsRequestInner) HasPicture() bool {
	if o != nil && !IsNil(o.Picture) {
		return true
	}

	return false
}

// SetPicture gets a reference to the given string and assigns it to the Picture field.
func (o *PostContactsRequestInner) SetPicture(v string) {
	o.Picture = &v
}

// GetAccount returns the Account field value if set, zero value otherwise.
func (o *PostContactsRequestInner) GetAccount() float32 {
	if o == nil || IsNil(o.Account) {
		var ret float32
		return ret
	}
	return *o.Account
}

// GetAccountOk returns a tuple with the Account field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PostContactsRequestInner) GetAccountOk() (*float32, bool) {
	if o == nil || IsNil(o.Account) {
		return nil, false
	}
	return o.Account, true
}

// HasAccount returns a boolean if a field has been set.
func (o *PostContactsRequestInner) HasAccount() bool {
	if o != nil && !IsNil(o.Account) {
		return true
	}

	return false
}

// SetAccount gets a reference to the given float32 and assigns it to the Account field.
func (o *PostContactsRequestInner) SetAccount(v float32) {
	o.Account = &v
}

// GetBirthDate returns the BirthDate field value if set, zero value otherwise.
func (o *PostContactsRequestInner) GetBirthDate() time.Time {
	if o == nil || IsNil(o.BirthDate) {
		var ret time.Time
		return ret
	}
	return *o.BirthDate
}

// GetBirthDateOk returns a tuple with the BirthDate field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PostContactsRequestInner) GetBirthDateOk() (*time.Time, bool) {
	if o == nil || IsNil(o.BirthDate) {
		return nil, false
	}
	return o.BirthDate, true
}

// HasBirthDate returns a boolean if a field has been set.
func (o *PostContactsRequestInner) HasBirthDate() bool {
	if o != nil && !IsNil(o.BirthDate) {
		return true
	}

	return false
}

// SetBirthDate gets a reference to the given time.Time and assigns it to the BirthDate field.
func (o *PostContactsRequestInner) SetBirthDate(v time.Time) {
	o.BirthDate = &v
}

// GetOptOut returns the OptOut field value if set, zero value otherwise.
func (o *PostContactsRequestInner) GetOptOut() bool {
	if o == nil || IsNil(o.OptOut) {
		var ret bool
		return ret
	}
	return *o.OptOut
}

// GetOptOutOk returns a tuple with the OptOut field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PostContactsRequestInner) GetOptOutOk() (*bool, bool) {
	if o == nil || IsNil(o.OptOut) {
		return nil, false
	}
	return o.OptOut, true
}

// HasOptOut returns a boolean if a field has been set.
func (o *PostContactsRequestInner) HasOptOut() bool {
	if o != nil && !IsNil(o.OptOut) {
		return true
	}

	return false
}

// SetOptOut gets a reference to the given bool and assigns it to the OptOut field.
func (o *PostContactsRequestInner) SetOptOut(v bool) {
	o.OptOut = &v
}

// GetOptOutDate returns the OptOutDate field value if set, zero value otherwise.
func (o *PostContactsRequestInner) GetOptOutDate() time.Time {
	if o == nil || IsNil(o.OptOutDate) {
		var ret time.Time
		return ret
	}
	return *o.OptOutDate
}

// GetOptOutDateOk returns a tuple with the OptOutDate field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PostContactsRequestInner) GetOptOutDateOk() (*time.Time, bool) {
	if o == nil || IsNil(o.OptOutDate) {
		return nil, false
	}
	return o.OptOutDate, true
}

// HasOptOutDate returns a boolean if a field has been set.
func (o *PostContactsRequestInner) HasOptOutDate() bool {
	if o != nil && !IsNil(o.OptOutDate) {
		return true
	}

	return false
}

// SetOptOutDate gets a reference to the given time.Time and assigns it to the OptOutDate field.
func (o *PostContactsRequestInner) SetOptOutDate(v time.Time) {
	o.OptOutDate = &v
}

// GetOptOutCampaign returns the OptOutCampaign field value if set, zero value otherwise.
func (o *PostContactsRequestInner) GetOptOutCampaign() string {
	if o == nil || IsNil(o.OptOutCampaign) {
		var ret string
		return ret
	}
	return *o.OptOutCampaign
}

// GetOptOutCampaignOk returns a tuple with the OptOutCampaign field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PostContactsRequestInner) GetOptOutCampaignOk() (*string, bool) {
	if o == nil || IsNil(o.OptOutCampaign) {
		return nil, false
	}
	return o.OptOutCampaign, true
}

// HasOptOutCampaign returns a boolean if a field has been set.
func (o *PostContactsRequestInner) HasOptOutCampaign() bool {
	if o != nil && !IsNil(o.OptOutCampaign) {
		return true
	}

	return false
}

// SetOptOutCampaign gets a reference to the given string and assigns it to the OptOutCampaign field.
func (o *PostContactsRequestInner) SetOptOutCampaign(v string) {
	o.OptOutCampaign = &v
}

// GetBounced returns the Bounced field value if set, zero value otherwise.
func (o *PostContactsRequestInner) GetBounced() bool {
	if o == nil || IsNil(o.Bounced) {
		var ret bool
		return ret
	}
	return *o.Bounced
}

// GetBouncedOk returns a tuple with the Bounced field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PostContactsRequestInner) GetBouncedOk() (*bool, bool) {
	if o == nil || IsNil(o.Bounced) {
		return nil, false
	}
	return o.Bounced, true
}

// HasBounced returns a boolean if a field has been set.
func (o *PostContactsRequestInner) HasBounced() bool {
	if o != nil && !IsNil(o.Bounced) {
		return true
	}

	return false
}

// SetBounced gets a reference to the given bool and assigns it to the Bounced field.
func (o *PostContactsRequestInner) SetBounced(v bool) {
	o.Bounced = &v
}

// GetBouncedDate returns the BouncedDate field value if set, zero value otherwise.
func (o *PostContactsRequestInner) GetBouncedDate() time.Time {
	if o == nil || IsNil(o.BouncedDate) {
		var ret time.Time
		return ret
	}
	return *o.BouncedDate
}

// GetBouncedDateOk returns a tuple with the BouncedDate field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PostContactsRequestInner) GetBouncedDateOk() (*time.Time, bool) {
	if o == nil || IsNil(o.BouncedDate) {
		return nil, false
	}
	return o.BouncedDate, true
}

// HasBouncedDate returns a boolean if a field has been set.
func (o *PostContactsRequestInner) HasBouncedDate() bool {
	if o != nil && !IsNil(o.BouncedDate) {
		return true
	}

	return false
}

// SetBouncedDate gets a reference to the given time.Time and assigns it to the BouncedDate field.
func (o *PostContactsRequestInner) SetBouncedDate(v time.Time) {
	o.BouncedDate = &v
}

// GetFiles returns the Files field value if set, zero value otherwise.
func (o *PostContactsRequestInner) GetFiles() []map[string]interface{} {
	if o == nil || IsNil(o.Files) {
		var ret []map[string]interface{}
		return ret
	}
	return o.Files
}

// GetFilesOk returns a tuple with the Files field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PostContactsRequestInner) GetFilesOk() ([]map[string]interface{}, bool) {
	if o == nil || IsNil(o.Files) {
		return nil, false
	}
	return o.Files, true
}

// HasFiles returns a boolean if a field has been set.
func (o *PostContactsRequestInner) HasFiles() bool {
	if o != nil && !IsNil(o.Files) {
		return true
	}

	return false
}

// SetFiles gets a reference to the given []map[string]interface{} and assigns it to the Files field.
func (o *PostContactsRequestInner) SetFiles(v []map[string]interface{}) {
	o.Files = v
}

// GetTags returns the Tags field value if set, zero value otherwise.
func (o *PostContactsRequestInner) GetTags() []string {
	if o == nil || IsNil(o.Tags) {
		var ret []string
		return ret
	}
	return o.Tags
}

// GetTagsOk returns a tuple with the Tags field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PostContactsRequestInner) GetTagsOk() ([]string, bool) {
	if o == nil || IsNil(o.Tags) {
		return nil, false
	}
	return o.Tags, true
}

// HasTags returns a boolean if a field has been set.
func (o *PostContactsRequestInner) HasTags() bool {
	if o != nil && !IsNil(o.Tags) {
		return true
	}

	return false
}

// SetTags gets a reference to the given []string and assigns it to the Tags field.
func (o *PostContactsRequestInner) SetTags(v []string) {
	o.Tags = v
}

// GetAddress returns the Address field value if set, zero value otherwise.
func (o *PostContactsRequestInner) GetAddress() PostContactsRequestInnerAddress {
	if o == nil || IsNil(o.Address) {
		var ret PostContactsRequestInnerAddress
		return ret
	}
	return *o.Address
}

// GetAddressOk returns a tuple with the Address field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PostContactsRequestInner) GetAddressOk() (*PostContactsRequestInnerAddress, bool) {
	if o == nil || IsNil(o.Address) {
		return nil, false
	}
	return o.Address, true
}

// HasAddress returns a boolean if a field has been set.
func (o *PostContactsRequestInner) HasAddress() bool {
	if o != nil && !IsNil(o.Address) {
		return true
	}

	return false
}

// SetAddress gets a reference to the given PostContactsRequestInnerAddress and assigns it to the Address field.
func (o *PostContactsRequestInner) SetAddress(v PostContactsRequestInnerAddress) {
	o.Address = &v
}

// GetAddresses returns the Addresses field value if set, zero value otherwise.
func (o *PostContactsRequestInner) GetAddresses() []PostContactsRequestInnerAddress {
	if o == nil || IsNil(o.Addresses) {
		var ret []PostContactsRequestInnerAddress
		return ret
	}
	return o.Addresses
}

// GetAddressesOk returns a tuple with the Addresses field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PostContactsRequestInner) GetAddressesOk() ([]PostContactsRequestInnerAddress, bool) {
	if o == nil || IsNil(o.Addresses) {
		return nil, false
	}
	return o.Addresses, true
}

// HasAddresses returns a boolean if a field has been set.
func (o *PostContactsRequestInner) HasAddresses() bool {
	if o != nil && !IsNil(o.Addresses) {
		return true
	}

	return false
}

// SetAddresses gets a reference to the given []PostContactsRequestInnerAddress and assigns it to the Addresses field.
func (o *PostContactsRequestInner) SetAddresses(v []PostContactsRequestInnerAddress) {
	o.Addresses = v
}

// GetPhoneNumber returns the PhoneNumber field value if set, zero value otherwise.
func (o *PostContactsRequestInner) GetPhoneNumber() string {
	if o == nil || IsNil(o.PhoneNumber) {
		var ret string
		return ret
	}
	return *o.PhoneNumber
}

// GetPhoneNumberOk returns a tuple with the PhoneNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PostContactsRequestInner) GetPhoneNumberOk() (*string, bool) {
	if o == nil || IsNil(o.PhoneNumber) {
		return nil, false
	}
	return o.PhoneNumber, true
}

// HasPhoneNumber returns a boolean if a field has been set.
func (o *PostContactsRequestInner) HasPhoneNumber() bool {
	if o != nil && !IsNil(o.PhoneNumber) {
		return true
	}

	return false
}

// SetPhoneNumber gets a reference to the given string and assigns it to the PhoneNumber field.
func (o *PostContactsRequestInner) SetPhoneNumber(v string) {
	o.PhoneNumber = &v
}

// GetMobilePhoneNumber returns the MobilePhoneNumber field value if set, zero value otherwise.
func (o *PostContactsRequestInner) GetMobilePhoneNumber() string {
	if o == nil || IsNil(o.MobilePhoneNumber) {
		var ret string
		return ret
	}
	return *o.MobilePhoneNumber
}

// GetMobilePhoneNumberOk returns a tuple with the MobilePhoneNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PostContactsRequestInner) GetMobilePhoneNumberOk() (*string, bool) {
	if o == nil || IsNil(o.MobilePhoneNumber) {
		return nil, false
	}
	return o.MobilePhoneNumber, true
}

// HasMobilePhoneNumber returns a boolean if a field has been set.
func (o *PostContactsRequestInner) HasMobilePhoneNumber() bool {
	if o != nil && !IsNil(o.MobilePhoneNumber) {
		return true
	}

	return false
}

// SetMobilePhoneNumber gets a reference to the given string and assigns it to the MobilePhoneNumber field.
func (o *PostContactsRequestInner) SetMobilePhoneNumber(v string) {
	o.MobilePhoneNumber = &v
}

// GetHomePhoneNumber returns the HomePhoneNumber field value if set, zero value otherwise.
func (o *PostContactsRequestInner) GetHomePhoneNumber() string {
	if o == nil || IsNil(o.HomePhoneNumber) {
		var ret string
		return ret
	}
	return *o.HomePhoneNumber
}

// GetHomePhoneNumberOk returns a tuple with the HomePhoneNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PostContactsRequestInner) GetHomePhoneNumberOk() (*string, bool) {
	if o == nil || IsNil(o.HomePhoneNumber) {
		return nil, false
	}
	return o.HomePhoneNumber, true
}

// HasHomePhoneNumber returns a boolean if a field has been set.
func (o *PostContactsRequestInner) HasHomePhoneNumber() bool {
	if o != nil && !IsNil(o.HomePhoneNumber) {
		return true
	}

	return false
}

// SetHomePhoneNumber gets a reference to the given string and assigns it to the HomePhoneNumber field.
func (o *PostContactsRequestInner) SetHomePhoneNumber(v string) {
	o.HomePhoneNumber = &v
}

// GetFaxNumber returns the FaxNumber field value if set, zero value otherwise.
func (o *PostContactsRequestInner) GetFaxNumber() string {
	if o == nil || IsNil(o.FaxNumber) {
		var ret string
		return ret
	}
	return *o.FaxNumber
}

// GetFaxNumberOk returns a tuple with the FaxNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PostContactsRequestInner) GetFaxNumberOk() (*string, bool) {
	if o == nil || IsNil(o.FaxNumber) {
		return nil, false
	}
	return o.FaxNumber, true
}

// HasFaxNumber returns a boolean if a field has been set.
func (o *PostContactsRequestInner) HasFaxNumber() bool {
	if o != nil && !IsNil(o.FaxNumber) {
		return true
	}

	return false
}

// SetFaxNumber gets a reference to the given string and assigns it to the FaxNumber field.
func (o *PostContactsRequestInner) SetFaxNumber(v string) {
	o.FaxNumber = &v
}

// GetPhoneNumbers returns the PhoneNumbers field value if set, zero value otherwise.
func (o *PostContactsRequestInner) GetPhoneNumbers() []PostContactsRequestInnerPhoneNumbersInner {
	if o == nil || IsNil(o.PhoneNumbers) {
		var ret []PostContactsRequestInnerPhoneNumbersInner
		return ret
	}
	return o.PhoneNumbers
}

// GetPhoneNumbersOk returns a tuple with the PhoneNumbers field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PostContactsRequestInner) GetPhoneNumbersOk() ([]PostContactsRequestInnerPhoneNumbersInner, bool) {
	if o == nil || IsNil(o.PhoneNumbers) {
		return nil, false
	}
	return o.PhoneNumbers, true
}

// HasPhoneNumbers returns a boolean if a field has been set.
func (o *PostContactsRequestInner) HasPhoneNumbers() bool {
	if o != nil && !IsNil(o.PhoneNumbers) {
		return true
	}

	return false
}

// SetPhoneNumbers gets a reference to the given []PostContactsRequestInnerPhoneNumbersInner and assigns it to the PhoneNumbers field.
func (o *PostContactsRequestInner) SetPhoneNumbers(v []PostContactsRequestInnerPhoneNumbersInner) {
	o.PhoneNumbers = v
}

// GetPosition returns the Position field value if set, zero value otherwise.
func (o *PostContactsRequestInner) GetPosition() PostContactsRequestInnerPosition {
	if o == nil || IsNil(o.Position) {
		var ret PostContactsRequestInnerPosition
		return ret
	}
	return *o.Position
}

// GetPositionOk returns a tuple with the Position field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PostContactsRequestInner) GetPositionOk() (*PostContactsRequestInnerPosition, bool) {
	if o == nil || IsNil(o.Position) {
		return nil, false
	}
	return o.Position, true
}

// HasPosition returns a boolean if a field has been set.
func (o *PostContactsRequestInner) HasPosition() bool {
	if o != nil && !IsNil(o.Position) {
		return true
	}

	return false
}

// SetPosition gets a reference to the given PostContactsRequestInnerPosition and assigns it to the Position field.
func (o *PostContactsRequestInner) SetPosition(v PostContactsRequestInnerPosition) {
	o.Position = &v
}

// GetPositions returns the Positions field value if set, zero value otherwise.
func (o *PostContactsRequestInner) GetPositions() []PostContactsRequestInnerPosition {
	if o == nil || IsNil(o.Positions) {
		var ret []PostContactsRequestInnerPosition
		return ret
	}
	return o.Positions
}

// GetPositionsOk returns a tuple with the Positions field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PostContactsRequestInner) GetPositionsOk() ([]PostContactsRequestInnerPosition, bool) {
	if o == nil || IsNil(o.Positions) {
		return nil, false
	}
	return o.Positions, true
}

// HasPositions returns a boolean if a field has been set.
func (o *PostContactsRequestInner) HasPositions() bool {
	if o != nil && !IsNil(o.Positions) {
		return true
	}

	return false
}

// SetPositions gets a reference to the given []PostContactsRequestInnerPosition and assigns it to the Positions field.
func (o *PostContactsRequestInner) SetPositions(v []PostContactsRequestInnerPosition) {
	o.Positions = v
}

// GetSocialProfiles returns the SocialProfiles field value if set, zero value otherwise.
func (o *PostContactsRequestInner) GetSocialProfiles() []string {
	if o == nil || IsNil(o.SocialProfiles) {
		var ret []string
		return ret
	}
	return o.SocialProfiles
}

// GetSocialProfilesOk returns a tuple with the SocialProfiles field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PostContactsRequestInner) GetSocialProfilesOk() ([]string, bool) {
	if o == nil || IsNil(o.SocialProfiles) {
		return nil, false
	}
	return o.SocialProfiles, true
}

// HasSocialProfiles returns a boolean if a field has been set.
func (o *PostContactsRequestInner) HasSocialProfiles() bool {
	if o != nil && !IsNil(o.SocialProfiles) {
		return true
	}

	return false
}

// SetSocialProfiles gets a reference to the given []string and assigns it to the SocialProfiles field.
func (o *PostContactsRequestInner) SetSocialProfiles(v []string) {
	o.SocialProfiles = v
}

// GetCustom returns the Custom field value if set, zero value otherwise.
func (o *PostContactsRequestInner) GetCustom() map[string]interface{} {
	if o == nil || IsNil(o.Custom) {
		var ret map[string]interface{}
		return ret
	}
	return o.Custom
}

// GetCustomOk returns a tuple with the Custom field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PostContactsRequestInner) GetCustomOk() (map[string]interface{}, bool) {
	if o == nil || IsNil(o.Custom) {
		return map[string]interface{}{}, false
	}
	return o.Custom, true
}

// HasCustom returns a boolean if a field has been set.
func (o *PostContactsRequestInner) HasCustom() bool {
	if o != nil && !IsNil(o.Custom) {
		return true
	}

	return false
}

// SetCustom gets a reference to the given map[string]interface{} and assigns it to the Custom field.
func (o *PostContactsRequestInner) SetCustom(v map[string]interface{}) {
	o.Custom = v
}

func (o PostContactsRequestInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o PostContactsRequestInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Owner) {
		toSerialize["owner"] = o.Owner
	}
	if !IsNil(o.Email) {
		toSerialize["email"] = o.Email
	}
	if !IsNil(o.Prefix) {
		toSerialize["prefix"] = o.Prefix
	}
	if !IsNil(o.Firstname) {
		toSerialize["firstname"] = o.Firstname
	}
	if !IsNil(o.Middle) {
		toSerialize["middle"] = o.Middle
	}
	if !IsNil(o.Lastname) {
		toSerialize["lastname"] = o.Lastname
	}
	if !IsNil(o.Suffix) {
		toSerialize["suffix"] = o.Suffix
	}
	if !IsNil(o.Name) {
		toSerialize["name"] = o.Name
	}
	if !IsNil(o.Picture) {
		toSerialize["picture"] = o.Picture
	}
	if !IsNil(o.Account) {
		toSerialize["account"] = o.Account
	}
	if !IsNil(o.BirthDate) {
		toSerialize["birth_date"] = o.BirthDate
	}
	if !IsNil(o.OptOut) {
		toSerialize["opt-out"] = o.OptOut
	}
	if !IsNil(o.OptOutDate) {
		toSerialize["opt-out_date"] = o.OptOutDate
	}
	if !IsNil(o.OptOutCampaign) {
		toSerialize["opt-out_campaign"] = o.OptOutCampaign
	}
	if !IsNil(o.Bounced) {
		toSerialize["bounced"] = o.Bounced
	}
	if !IsNil(o.BouncedDate) {
		toSerialize["bounced_date"] = o.BouncedDate
	}
	if !IsNil(o.Files) {
		toSerialize["files"] = o.Files
	}
	if !IsNil(o.Tags) {
		toSerialize["tags"] = o.Tags
	}
	if !IsNil(o.Address) {
		toSerialize["address"] = o.Address
	}
	if !IsNil(o.Addresses) {
		toSerialize["addresses"] = o.Addresses
	}
	if !IsNil(o.PhoneNumber) {
		toSerialize["phone_number"] = o.PhoneNumber
	}
	if !IsNil(o.MobilePhoneNumber) {
		toSerialize["mobile_phone_number"] = o.MobilePhoneNumber
	}
	if !IsNil(o.HomePhoneNumber) {
		toSerialize["home_phone_number"] = o.HomePhoneNumber
	}
	if !IsNil(o.FaxNumber) {
		toSerialize["fax_number"] = o.FaxNumber
	}
	if !IsNil(o.PhoneNumbers) {
		toSerialize["phone_numbers"] = o.PhoneNumbers
	}
	if !IsNil(o.Position) {
		toSerialize["position"] = o.Position
	}
	if !IsNil(o.Positions) {
		toSerialize["positions"] = o.Positions
	}
	if !IsNil(o.SocialProfiles) {
		toSerialize["social_profiles"] = o.SocialProfiles
	}
	if !IsNil(o.Custom) {
		toSerialize["custom"] = o.Custom
	}
	return toSerialize, nil
}

type NullablePostContactsRequestInner struct {
	value *PostContactsRequestInner
	isSet bool
}

func (v NullablePostContactsRequestInner) Get() *PostContactsRequestInner {
	return v.value
}

func (v *NullablePostContactsRequestInner) Set(val *PostContactsRequestInner) {
	v.value = val
	v.isSet = true
}

func (v NullablePostContactsRequestInner) IsSet() bool {
	return v.isSet
}

func (v *NullablePostContactsRequestInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePostContactsRequestInner(val *PostContactsRequestInner) *NullablePostContactsRequestInner {
	return &NullablePostContactsRequestInner{value: val, isSet: true}
}

func (v NullablePostContactsRequestInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePostContactsRequestInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


