# PostContactsRequestInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Owner** | Pointer to **float32** |  | [optional] 
**Email** | Pointer to **string** |  | [optional] 
**Prefix** | Pointer to **string** |  | [optional] 
**Firstname** | Pointer to **string** |  | [optional] 
**Middle** | Pointer to **string** |  | [optional] 
**Lastname** | Pointer to **string** |  | [optional] 
**Suffix** | Pointer to **string** |  | [optional] 
**Name** | Pointer to **string** |  | [optional] 
**Picture** | Pointer to **string** |  | [optional] 
**Account** | Pointer to **float32** | Any existing account will be removed from the contact when specifically passing &#x60;null&#x60;! | [optional] 
**BirthDate** | Pointer to **time.Time** |  | [optional] 
**OptOut** | Pointer to **bool** |  | [optional] 
**OptOutDate** | Pointer to **time.Time** |  | [optional] 
**OptOutCampaign** | Pointer to **string** |  | [optional] 
**Bounced** | Pointer to **bool** |  | [optional] 
**BouncedDate** | Pointer to **time.Time** |  | [optional] 
**Files** | Pointer to **[]map[string]interface{}** |  | [optional] 
**Tags** | Pointer to **[]string** |  | [optional] 
**Address** | Pointer to [**PostContactsRequestInnerAddress**](PostContactsRequestInnerAddress.md) |  | [optional] 
**Addresses** | Pointer to [**[]PostContactsRequestInnerAddress**](PostContactsRequestInnerAddress.md) |  | [optional] 
**PhoneNumber** | Pointer to **string** |  | [optional] 
**MobilePhoneNumber** | Pointer to **string** |  | [optional] 
**HomePhoneNumber** | Pointer to **string** |  | [optional] 
**FaxNumber** | Pointer to **string** |  | [optional] 
**PhoneNumbers** | Pointer to [**[]PostContactsRequestInnerPhoneNumbersInner**](PostContactsRequestInnerPhoneNumbersInner.md) |  | [optional] 
**Position** | Pointer to [**PostContactsRequestInnerPosition**](PostContactsRequestInnerPosition.md) |  | [optional] 
**Positions** | Pointer to [**[]PostContactsRequestInnerPosition**](PostContactsRequestInnerPosition.md) |  | [optional] 
**SocialProfiles** | Pointer to **[]string** |  | [optional] 
**Custom** | Pointer to **map[string]interface{}** |  | [optional] 

## Methods

### NewPostContactsRequestInner

`func NewPostContactsRequestInner() *PostContactsRequestInner`

NewPostContactsRequestInner instantiates a new PostContactsRequestInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPostContactsRequestInnerWithDefaults

`func NewPostContactsRequestInnerWithDefaults() *PostContactsRequestInner`

NewPostContactsRequestInnerWithDefaults instantiates a new PostContactsRequestInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOwner

`func (o *PostContactsRequestInner) GetOwner() float32`

GetOwner returns the Owner field if non-nil, zero value otherwise.

### GetOwnerOk

`func (o *PostContactsRequestInner) GetOwnerOk() (*float32, bool)`

GetOwnerOk returns a tuple with the Owner field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOwner

`func (o *PostContactsRequestInner) SetOwner(v float32)`

SetOwner sets Owner field to given value.

### HasOwner

`func (o *PostContactsRequestInner) HasOwner() bool`

HasOwner returns a boolean if a field has been set.

### GetEmail

`func (o *PostContactsRequestInner) GetEmail() string`

GetEmail returns the Email field if non-nil, zero value otherwise.

### GetEmailOk

`func (o *PostContactsRequestInner) GetEmailOk() (*string, bool)`

GetEmailOk returns a tuple with the Email field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmail

`func (o *PostContactsRequestInner) SetEmail(v string)`

SetEmail sets Email field to given value.

### HasEmail

`func (o *PostContactsRequestInner) HasEmail() bool`

HasEmail returns a boolean if a field has been set.

### GetPrefix

`func (o *PostContactsRequestInner) GetPrefix() string`

GetPrefix returns the Prefix field if non-nil, zero value otherwise.

### GetPrefixOk

`func (o *PostContactsRequestInner) GetPrefixOk() (*string, bool)`

GetPrefixOk returns a tuple with the Prefix field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrefix

`func (o *PostContactsRequestInner) SetPrefix(v string)`

SetPrefix sets Prefix field to given value.

### HasPrefix

`func (o *PostContactsRequestInner) HasPrefix() bool`

HasPrefix returns a boolean if a field has been set.

### GetFirstname

`func (o *PostContactsRequestInner) GetFirstname() string`

GetFirstname returns the Firstname field if non-nil, zero value otherwise.

### GetFirstnameOk

`func (o *PostContactsRequestInner) GetFirstnameOk() (*string, bool)`

GetFirstnameOk returns a tuple with the Firstname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstname

`func (o *PostContactsRequestInner) SetFirstname(v string)`

SetFirstname sets Firstname field to given value.

### HasFirstname

`func (o *PostContactsRequestInner) HasFirstname() bool`

HasFirstname returns a boolean if a field has been set.

### GetMiddle

`func (o *PostContactsRequestInner) GetMiddle() string`

GetMiddle returns the Middle field if non-nil, zero value otherwise.

### GetMiddleOk

`func (o *PostContactsRequestInner) GetMiddleOk() (*string, bool)`

GetMiddleOk returns a tuple with the Middle field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMiddle

`func (o *PostContactsRequestInner) SetMiddle(v string)`

SetMiddle sets Middle field to given value.

### HasMiddle

`func (o *PostContactsRequestInner) HasMiddle() bool`

HasMiddle returns a boolean if a field has been set.

### GetLastname

`func (o *PostContactsRequestInner) GetLastname() string`

GetLastname returns the Lastname field if non-nil, zero value otherwise.

### GetLastnameOk

`func (o *PostContactsRequestInner) GetLastnameOk() (*string, bool)`

GetLastnameOk returns a tuple with the Lastname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastname

`func (o *PostContactsRequestInner) SetLastname(v string)`

SetLastname sets Lastname field to given value.

### HasLastname

`func (o *PostContactsRequestInner) HasLastname() bool`

HasLastname returns a boolean if a field has been set.

### GetSuffix

`func (o *PostContactsRequestInner) GetSuffix() string`

GetSuffix returns the Suffix field if non-nil, zero value otherwise.

### GetSuffixOk

`func (o *PostContactsRequestInner) GetSuffixOk() (*string, bool)`

GetSuffixOk returns a tuple with the Suffix field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSuffix

`func (o *PostContactsRequestInner) SetSuffix(v string)`

SetSuffix sets Suffix field to given value.

### HasSuffix

`func (o *PostContactsRequestInner) HasSuffix() bool`

HasSuffix returns a boolean if a field has been set.

### GetName

`func (o *PostContactsRequestInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *PostContactsRequestInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *PostContactsRequestInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *PostContactsRequestInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetPicture

`func (o *PostContactsRequestInner) GetPicture() string`

GetPicture returns the Picture field if non-nil, zero value otherwise.

### GetPictureOk

`func (o *PostContactsRequestInner) GetPictureOk() (*string, bool)`

GetPictureOk returns a tuple with the Picture field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPicture

`func (o *PostContactsRequestInner) SetPicture(v string)`

SetPicture sets Picture field to given value.

### HasPicture

`func (o *PostContactsRequestInner) HasPicture() bool`

HasPicture returns a boolean if a field has been set.

### GetAccount

`func (o *PostContactsRequestInner) GetAccount() float32`

GetAccount returns the Account field if non-nil, zero value otherwise.

### GetAccountOk

`func (o *PostContactsRequestInner) GetAccountOk() (*float32, bool)`

GetAccountOk returns a tuple with the Account field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccount

`func (o *PostContactsRequestInner) SetAccount(v float32)`

SetAccount sets Account field to given value.

### HasAccount

`func (o *PostContactsRequestInner) HasAccount() bool`

HasAccount returns a boolean if a field has been set.

### GetBirthDate

`func (o *PostContactsRequestInner) GetBirthDate() time.Time`

GetBirthDate returns the BirthDate field if non-nil, zero value otherwise.

### GetBirthDateOk

`func (o *PostContactsRequestInner) GetBirthDateOk() (*time.Time, bool)`

GetBirthDateOk returns a tuple with the BirthDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBirthDate

`func (o *PostContactsRequestInner) SetBirthDate(v time.Time)`

SetBirthDate sets BirthDate field to given value.

### HasBirthDate

`func (o *PostContactsRequestInner) HasBirthDate() bool`

HasBirthDate returns a boolean if a field has been set.

### GetOptOut

`func (o *PostContactsRequestInner) GetOptOut() bool`

GetOptOut returns the OptOut field if non-nil, zero value otherwise.

### GetOptOutOk

`func (o *PostContactsRequestInner) GetOptOutOk() (*bool, bool)`

GetOptOutOk returns a tuple with the OptOut field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptOut

`func (o *PostContactsRequestInner) SetOptOut(v bool)`

SetOptOut sets OptOut field to given value.

### HasOptOut

`func (o *PostContactsRequestInner) HasOptOut() bool`

HasOptOut returns a boolean if a field has been set.

### GetOptOutDate

`func (o *PostContactsRequestInner) GetOptOutDate() time.Time`

GetOptOutDate returns the OptOutDate field if non-nil, zero value otherwise.

### GetOptOutDateOk

`func (o *PostContactsRequestInner) GetOptOutDateOk() (*time.Time, bool)`

GetOptOutDateOk returns a tuple with the OptOutDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptOutDate

`func (o *PostContactsRequestInner) SetOptOutDate(v time.Time)`

SetOptOutDate sets OptOutDate field to given value.

### HasOptOutDate

`func (o *PostContactsRequestInner) HasOptOutDate() bool`

HasOptOutDate returns a boolean if a field has been set.

### GetOptOutCampaign

`func (o *PostContactsRequestInner) GetOptOutCampaign() string`

GetOptOutCampaign returns the OptOutCampaign field if non-nil, zero value otherwise.

### GetOptOutCampaignOk

`func (o *PostContactsRequestInner) GetOptOutCampaignOk() (*string, bool)`

GetOptOutCampaignOk returns a tuple with the OptOutCampaign field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptOutCampaign

`func (o *PostContactsRequestInner) SetOptOutCampaign(v string)`

SetOptOutCampaign sets OptOutCampaign field to given value.

### HasOptOutCampaign

`func (o *PostContactsRequestInner) HasOptOutCampaign() bool`

HasOptOutCampaign returns a boolean if a field has been set.

### GetBounced

`func (o *PostContactsRequestInner) GetBounced() bool`

GetBounced returns the Bounced field if non-nil, zero value otherwise.

### GetBouncedOk

`func (o *PostContactsRequestInner) GetBouncedOk() (*bool, bool)`

GetBouncedOk returns a tuple with the Bounced field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBounced

`func (o *PostContactsRequestInner) SetBounced(v bool)`

SetBounced sets Bounced field to given value.

### HasBounced

`func (o *PostContactsRequestInner) HasBounced() bool`

HasBounced returns a boolean if a field has been set.

### GetBouncedDate

`func (o *PostContactsRequestInner) GetBouncedDate() time.Time`

GetBouncedDate returns the BouncedDate field if non-nil, zero value otherwise.

### GetBouncedDateOk

`func (o *PostContactsRequestInner) GetBouncedDateOk() (*time.Time, bool)`

GetBouncedDateOk returns a tuple with the BouncedDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBouncedDate

`func (o *PostContactsRequestInner) SetBouncedDate(v time.Time)`

SetBouncedDate sets BouncedDate field to given value.

### HasBouncedDate

`func (o *PostContactsRequestInner) HasBouncedDate() bool`

HasBouncedDate returns a boolean if a field has been set.

### GetFiles

`func (o *PostContactsRequestInner) GetFiles() []map[string]interface{}`

GetFiles returns the Files field if non-nil, zero value otherwise.

### GetFilesOk

`func (o *PostContactsRequestInner) GetFilesOk() (*[]map[string]interface{}, bool)`

GetFilesOk returns a tuple with the Files field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFiles

`func (o *PostContactsRequestInner) SetFiles(v []map[string]interface{})`

SetFiles sets Files field to given value.

### HasFiles

`func (o *PostContactsRequestInner) HasFiles() bool`

HasFiles returns a boolean if a field has been set.

### GetTags

`func (o *PostContactsRequestInner) GetTags() []string`

GetTags returns the Tags field if non-nil, zero value otherwise.

### GetTagsOk

`func (o *PostContactsRequestInner) GetTagsOk() (*[]string, bool)`

GetTagsOk returns a tuple with the Tags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTags

`func (o *PostContactsRequestInner) SetTags(v []string)`

SetTags sets Tags field to given value.

### HasTags

`func (o *PostContactsRequestInner) HasTags() bool`

HasTags returns a boolean if a field has been set.

### GetAddress

`func (o *PostContactsRequestInner) GetAddress() PostContactsRequestInnerAddress`

GetAddress returns the Address field if non-nil, zero value otherwise.

### GetAddressOk

`func (o *PostContactsRequestInner) GetAddressOk() (*PostContactsRequestInnerAddress, bool)`

GetAddressOk returns a tuple with the Address field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddress

`func (o *PostContactsRequestInner) SetAddress(v PostContactsRequestInnerAddress)`

SetAddress sets Address field to given value.

### HasAddress

`func (o *PostContactsRequestInner) HasAddress() bool`

HasAddress returns a boolean if a field has been set.

### GetAddresses

`func (o *PostContactsRequestInner) GetAddresses() []PostContactsRequestInnerAddress`

GetAddresses returns the Addresses field if non-nil, zero value otherwise.

### GetAddressesOk

`func (o *PostContactsRequestInner) GetAddressesOk() (*[]PostContactsRequestInnerAddress, bool)`

GetAddressesOk returns a tuple with the Addresses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddresses

`func (o *PostContactsRequestInner) SetAddresses(v []PostContactsRequestInnerAddress)`

SetAddresses sets Addresses field to given value.

### HasAddresses

`func (o *PostContactsRequestInner) HasAddresses() bool`

HasAddresses returns a boolean if a field has been set.

### GetPhoneNumber

`func (o *PostContactsRequestInner) GetPhoneNumber() string`

GetPhoneNumber returns the PhoneNumber field if non-nil, zero value otherwise.

### GetPhoneNumberOk

`func (o *PostContactsRequestInner) GetPhoneNumberOk() (*string, bool)`

GetPhoneNumberOk returns a tuple with the PhoneNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPhoneNumber

`func (o *PostContactsRequestInner) SetPhoneNumber(v string)`

SetPhoneNumber sets PhoneNumber field to given value.

### HasPhoneNumber

`func (o *PostContactsRequestInner) HasPhoneNumber() bool`

HasPhoneNumber returns a boolean if a field has been set.

### GetMobilePhoneNumber

`func (o *PostContactsRequestInner) GetMobilePhoneNumber() string`

GetMobilePhoneNumber returns the MobilePhoneNumber field if non-nil, zero value otherwise.

### GetMobilePhoneNumberOk

`func (o *PostContactsRequestInner) GetMobilePhoneNumberOk() (*string, bool)`

GetMobilePhoneNumberOk returns a tuple with the MobilePhoneNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMobilePhoneNumber

`func (o *PostContactsRequestInner) SetMobilePhoneNumber(v string)`

SetMobilePhoneNumber sets MobilePhoneNumber field to given value.

### HasMobilePhoneNumber

`func (o *PostContactsRequestInner) HasMobilePhoneNumber() bool`

HasMobilePhoneNumber returns a boolean if a field has been set.

### GetHomePhoneNumber

`func (o *PostContactsRequestInner) GetHomePhoneNumber() string`

GetHomePhoneNumber returns the HomePhoneNumber field if non-nil, zero value otherwise.

### GetHomePhoneNumberOk

`func (o *PostContactsRequestInner) GetHomePhoneNumberOk() (*string, bool)`

GetHomePhoneNumberOk returns a tuple with the HomePhoneNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHomePhoneNumber

`func (o *PostContactsRequestInner) SetHomePhoneNumber(v string)`

SetHomePhoneNumber sets HomePhoneNumber field to given value.

### HasHomePhoneNumber

`func (o *PostContactsRequestInner) HasHomePhoneNumber() bool`

HasHomePhoneNumber returns a boolean if a field has been set.

### GetFaxNumber

`func (o *PostContactsRequestInner) GetFaxNumber() string`

GetFaxNumber returns the FaxNumber field if non-nil, zero value otherwise.

### GetFaxNumberOk

`func (o *PostContactsRequestInner) GetFaxNumberOk() (*string, bool)`

GetFaxNumberOk returns a tuple with the FaxNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFaxNumber

`func (o *PostContactsRequestInner) SetFaxNumber(v string)`

SetFaxNumber sets FaxNumber field to given value.

### HasFaxNumber

`func (o *PostContactsRequestInner) HasFaxNumber() bool`

HasFaxNumber returns a boolean if a field has been set.

### GetPhoneNumbers

`func (o *PostContactsRequestInner) GetPhoneNumbers() []PostContactsRequestInnerPhoneNumbersInner`

GetPhoneNumbers returns the PhoneNumbers field if non-nil, zero value otherwise.

### GetPhoneNumbersOk

`func (o *PostContactsRequestInner) GetPhoneNumbersOk() (*[]PostContactsRequestInnerPhoneNumbersInner, bool)`

GetPhoneNumbersOk returns a tuple with the PhoneNumbers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPhoneNumbers

`func (o *PostContactsRequestInner) SetPhoneNumbers(v []PostContactsRequestInnerPhoneNumbersInner)`

SetPhoneNumbers sets PhoneNumbers field to given value.

### HasPhoneNumbers

`func (o *PostContactsRequestInner) HasPhoneNumbers() bool`

HasPhoneNumbers returns a boolean if a field has been set.

### GetPosition

`func (o *PostContactsRequestInner) GetPosition() PostContactsRequestInnerPosition`

GetPosition returns the Position field if non-nil, zero value otherwise.

### GetPositionOk

`func (o *PostContactsRequestInner) GetPositionOk() (*PostContactsRequestInnerPosition, bool)`

GetPositionOk returns a tuple with the Position field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPosition

`func (o *PostContactsRequestInner) SetPosition(v PostContactsRequestInnerPosition)`

SetPosition sets Position field to given value.

### HasPosition

`func (o *PostContactsRequestInner) HasPosition() bool`

HasPosition returns a boolean if a field has been set.

### GetPositions

`func (o *PostContactsRequestInner) GetPositions() []PostContactsRequestInnerPosition`

GetPositions returns the Positions field if non-nil, zero value otherwise.

### GetPositionsOk

`func (o *PostContactsRequestInner) GetPositionsOk() (*[]PostContactsRequestInnerPosition, bool)`

GetPositionsOk returns a tuple with the Positions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPositions

`func (o *PostContactsRequestInner) SetPositions(v []PostContactsRequestInnerPosition)`

SetPositions sets Positions field to given value.

### HasPositions

`func (o *PostContactsRequestInner) HasPositions() bool`

HasPositions returns a boolean if a field has been set.

### GetSocialProfiles

`func (o *PostContactsRequestInner) GetSocialProfiles() []string`

GetSocialProfiles returns the SocialProfiles field if non-nil, zero value otherwise.

### GetSocialProfilesOk

`func (o *PostContactsRequestInner) GetSocialProfilesOk() (*[]string, bool)`

GetSocialProfilesOk returns a tuple with the SocialProfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSocialProfiles

`func (o *PostContactsRequestInner) SetSocialProfiles(v []string)`

SetSocialProfiles sets SocialProfiles field to given value.

### HasSocialProfiles

`func (o *PostContactsRequestInner) HasSocialProfiles() bool`

HasSocialProfiles returns a boolean if a field has been set.

### GetCustom

`func (o *PostContactsRequestInner) GetCustom() map[string]interface{}`

GetCustom returns the Custom field if non-nil, zero value otherwise.

### GetCustomOk

`func (o *PostContactsRequestInner) GetCustomOk() (*map[string]interface{}, bool)`

GetCustomOk returns a tuple with the Custom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustom

`func (o *PostContactsRequestInner) SetCustom(v map[string]interface{})`

SetCustom sets Custom field to given value.

### HasCustom

`func (o *PostContactsRequestInner) HasCustom() bool`

HasCustom returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


