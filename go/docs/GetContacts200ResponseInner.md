# GetContacts200ResponseInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Account** | Pointer to [**GetContacts200ResponseInnerAccount**](GetContacts200ResponseInnerAccount.md) |  | [optional] 
**Id** | **float32** |  | 
**Prefix** | Pointer to **string** |  | [optional] 
**Firstname** | Pointer to **string** |  | [optional] 
**Middle** | Pointer to **string** |  | [optional] 
**Lastname** | Pointer to **string** |  | [optional] 
**Suffix** | Pointer to **string** |  | [optional] 
**Name** | Pointer to **string** |  | [optional] 
**Email** | Pointer to **string** |  | [optional] 
**Domain** | Pointer to **string** |  | [optional] 
**BirthDate** | Pointer to **string** |  | [optional] 
**OptOut** | Pointer to **bool** |  | [optional] 
**OptOutDate** | Pointer to **time.Time** |  | [optional] 
**OptOutCampaign** | Pointer to **string** |  | [optional] 
**Bounced** | Pointer to **bool** |  | [optional] 
**BouncedDate** | Pointer to **time.Time** |  | [optional] 
**Files** | Pointer to **[]map[string]interface{}** |  | [optional] 
**Owner** | Pointer to [**GetContacts200ResponseInnerOwner**](GetContacts200ResponseInnerOwner.md) |  | [optional] 
**Picture** | Pointer to **string** |  | [optional] 
**Archived** | Pointer to **bool** |  | [optional] 
**NotViewed** | Pointer to **bool** |  | [optional] 
**CanEdit** | Pointer to **bool** |  | [optional] 
**CreationDate** | Pointer to **time.Time** |  | [optional] 
**ModificationDate** | Pointer to **time.Time** |  | [optional] 
**Type** | Pointer to **string** |  | [optional] 
**Tags** | Pointer to [**[]GetContacts200ResponseInnerTagsInner**](GetContacts200ResponseInnerTagsInner.md) |  | [optional] 
**Addresses** | Pointer to [**[]GetContacts200ResponseInnerAddressesInner**](GetContacts200ResponseInnerAddressesInner.md) |  | [optional] 
**PhoneNumber** | Pointer to **string** |  | [optional] 
**MobilePhoneNumber** | Pointer to **string** |  | [optional] 
**HomePhoneNumber** | Pointer to **string** |  | [optional] 
**FaxNumber** | Pointer to **string** |  | [optional] 
**PhoneNumbers** | Pointer to [**[]GetContacts200ResponseInnerPhoneNumbersInner**](GetContacts200ResponseInnerPhoneNumbersInner.md) |  | [optional] 
**Positions** | Pointer to [**[]GetContacts200ResponseInnerPositionsInner**](GetContacts200ResponseInnerPositionsInner.md) |  | [optional] 
**SocialProfiles** | Pointer to [**[]GetContacts200ResponseInnerSocialProfilesInner**](GetContacts200ResponseInnerSocialProfilesInner.md) |  | [optional] 
**Organisation** | Pointer to **string** |  | [optional] 
**Role** | Pointer to **string** |  | [optional] 
**Custom** | Pointer to **map[string]interface{}** |  | [optional] 
**LastEmailDate** | Pointer to **time.Time** |  | [optional] 
**LastMeetingDate** | Pointer to **time.Time** |  | [optional] 

## Methods

### NewGetContacts200ResponseInner

`func NewGetContacts200ResponseInner(id float32, ) *GetContacts200ResponseInner`

NewGetContacts200ResponseInner instantiates a new GetContacts200ResponseInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetContacts200ResponseInnerWithDefaults

`func NewGetContacts200ResponseInnerWithDefaults() *GetContacts200ResponseInner`

NewGetContacts200ResponseInnerWithDefaults instantiates a new GetContacts200ResponseInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAccount

`func (o *GetContacts200ResponseInner) GetAccount() GetContacts200ResponseInnerAccount`

GetAccount returns the Account field if non-nil, zero value otherwise.

### GetAccountOk

`func (o *GetContacts200ResponseInner) GetAccountOk() (*GetContacts200ResponseInnerAccount, bool)`

GetAccountOk returns a tuple with the Account field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccount

`func (o *GetContacts200ResponseInner) SetAccount(v GetContacts200ResponseInnerAccount)`

SetAccount sets Account field to given value.

### HasAccount

`func (o *GetContacts200ResponseInner) HasAccount() bool`

HasAccount returns a boolean if a field has been set.

### GetId

`func (o *GetContacts200ResponseInner) GetId() float32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *GetContacts200ResponseInner) GetIdOk() (*float32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *GetContacts200ResponseInner) SetId(v float32)`

SetId sets Id field to given value.


### GetPrefix

`func (o *GetContacts200ResponseInner) GetPrefix() string`

GetPrefix returns the Prefix field if non-nil, zero value otherwise.

### GetPrefixOk

`func (o *GetContacts200ResponseInner) GetPrefixOk() (*string, bool)`

GetPrefixOk returns a tuple with the Prefix field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrefix

`func (o *GetContacts200ResponseInner) SetPrefix(v string)`

SetPrefix sets Prefix field to given value.

### HasPrefix

`func (o *GetContacts200ResponseInner) HasPrefix() bool`

HasPrefix returns a boolean if a field has been set.

### GetFirstname

`func (o *GetContacts200ResponseInner) GetFirstname() string`

GetFirstname returns the Firstname field if non-nil, zero value otherwise.

### GetFirstnameOk

`func (o *GetContacts200ResponseInner) GetFirstnameOk() (*string, bool)`

GetFirstnameOk returns a tuple with the Firstname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstname

`func (o *GetContacts200ResponseInner) SetFirstname(v string)`

SetFirstname sets Firstname field to given value.

### HasFirstname

`func (o *GetContacts200ResponseInner) HasFirstname() bool`

HasFirstname returns a boolean if a field has been set.

### GetMiddle

`func (o *GetContacts200ResponseInner) GetMiddle() string`

GetMiddle returns the Middle field if non-nil, zero value otherwise.

### GetMiddleOk

`func (o *GetContacts200ResponseInner) GetMiddleOk() (*string, bool)`

GetMiddleOk returns a tuple with the Middle field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMiddle

`func (o *GetContacts200ResponseInner) SetMiddle(v string)`

SetMiddle sets Middle field to given value.

### HasMiddle

`func (o *GetContacts200ResponseInner) HasMiddle() bool`

HasMiddle returns a boolean if a field has been set.

### GetLastname

`func (o *GetContacts200ResponseInner) GetLastname() string`

GetLastname returns the Lastname field if non-nil, zero value otherwise.

### GetLastnameOk

`func (o *GetContacts200ResponseInner) GetLastnameOk() (*string, bool)`

GetLastnameOk returns a tuple with the Lastname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastname

`func (o *GetContacts200ResponseInner) SetLastname(v string)`

SetLastname sets Lastname field to given value.

### HasLastname

`func (o *GetContacts200ResponseInner) HasLastname() bool`

HasLastname returns a boolean if a field has been set.

### GetSuffix

`func (o *GetContacts200ResponseInner) GetSuffix() string`

GetSuffix returns the Suffix field if non-nil, zero value otherwise.

### GetSuffixOk

`func (o *GetContacts200ResponseInner) GetSuffixOk() (*string, bool)`

GetSuffixOk returns a tuple with the Suffix field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSuffix

`func (o *GetContacts200ResponseInner) SetSuffix(v string)`

SetSuffix sets Suffix field to given value.

### HasSuffix

`func (o *GetContacts200ResponseInner) HasSuffix() bool`

HasSuffix returns a boolean if a field has been set.

### GetName

`func (o *GetContacts200ResponseInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *GetContacts200ResponseInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *GetContacts200ResponseInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *GetContacts200ResponseInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetEmail

`func (o *GetContacts200ResponseInner) GetEmail() string`

GetEmail returns the Email field if non-nil, zero value otherwise.

### GetEmailOk

`func (o *GetContacts200ResponseInner) GetEmailOk() (*string, bool)`

GetEmailOk returns a tuple with the Email field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmail

`func (o *GetContacts200ResponseInner) SetEmail(v string)`

SetEmail sets Email field to given value.

### HasEmail

`func (o *GetContacts200ResponseInner) HasEmail() bool`

HasEmail returns a boolean if a field has been set.

### GetDomain

`func (o *GetContacts200ResponseInner) GetDomain() string`

GetDomain returns the Domain field if non-nil, zero value otherwise.

### GetDomainOk

`func (o *GetContacts200ResponseInner) GetDomainOk() (*string, bool)`

GetDomainOk returns a tuple with the Domain field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDomain

`func (o *GetContacts200ResponseInner) SetDomain(v string)`

SetDomain sets Domain field to given value.

### HasDomain

`func (o *GetContacts200ResponseInner) HasDomain() bool`

HasDomain returns a boolean if a field has been set.

### GetBirthDate

`func (o *GetContacts200ResponseInner) GetBirthDate() string`

GetBirthDate returns the BirthDate field if non-nil, zero value otherwise.

### GetBirthDateOk

`func (o *GetContacts200ResponseInner) GetBirthDateOk() (*string, bool)`

GetBirthDateOk returns a tuple with the BirthDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBirthDate

`func (o *GetContacts200ResponseInner) SetBirthDate(v string)`

SetBirthDate sets BirthDate field to given value.

### HasBirthDate

`func (o *GetContacts200ResponseInner) HasBirthDate() bool`

HasBirthDate returns a boolean if a field has been set.

### GetOptOut

`func (o *GetContacts200ResponseInner) GetOptOut() bool`

GetOptOut returns the OptOut field if non-nil, zero value otherwise.

### GetOptOutOk

`func (o *GetContacts200ResponseInner) GetOptOutOk() (*bool, bool)`

GetOptOutOk returns a tuple with the OptOut field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptOut

`func (o *GetContacts200ResponseInner) SetOptOut(v bool)`

SetOptOut sets OptOut field to given value.

### HasOptOut

`func (o *GetContacts200ResponseInner) HasOptOut() bool`

HasOptOut returns a boolean if a field has been set.

### GetOptOutDate

`func (o *GetContacts200ResponseInner) GetOptOutDate() time.Time`

GetOptOutDate returns the OptOutDate field if non-nil, zero value otherwise.

### GetOptOutDateOk

`func (o *GetContacts200ResponseInner) GetOptOutDateOk() (*time.Time, bool)`

GetOptOutDateOk returns a tuple with the OptOutDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptOutDate

`func (o *GetContacts200ResponseInner) SetOptOutDate(v time.Time)`

SetOptOutDate sets OptOutDate field to given value.

### HasOptOutDate

`func (o *GetContacts200ResponseInner) HasOptOutDate() bool`

HasOptOutDate returns a boolean if a field has been set.

### GetOptOutCampaign

`func (o *GetContacts200ResponseInner) GetOptOutCampaign() string`

GetOptOutCampaign returns the OptOutCampaign field if non-nil, zero value otherwise.

### GetOptOutCampaignOk

`func (o *GetContacts200ResponseInner) GetOptOutCampaignOk() (*string, bool)`

GetOptOutCampaignOk returns a tuple with the OptOutCampaign field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptOutCampaign

`func (o *GetContacts200ResponseInner) SetOptOutCampaign(v string)`

SetOptOutCampaign sets OptOutCampaign field to given value.

### HasOptOutCampaign

`func (o *GetContacts200ResponseInner) HasOptOutCampaign() bool`

HasOptOutCampaign returns a boolean if a field has been set.

### GetBounced

`func (o *GetContacts200ResponseInner) GetBounced() bool`

GetBounced returns the Bounced field if non-nil, zero value otherwise.

### GetBouncedOk

`func (o *GetContacts200ResponseInner) GetBouncedOk() (*bool, bool)`

GetBouncedOk returns a tuple with the Bounced field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBounced

`func (o *GetContacts200ResponseInner) SetBounced(v bool)`

SetBounced sets Bounced field to given value.

### HasBounced

`func (o *GetContacts200ResponseInner) HasBounced() bool`

HasBounced returns a boolean if a field has been set.

### GetBouncedDate

`func (o *GetContacts200ResponseInner) GetBouncedDate() time.Time`

GetBouncedDate returns the BouncedDate field if non-nil, zero value otherwise.

### GetBouncedDateOk

`func (o *GetContacts200ResponseInner) GetBouncedDateOk() (*time.Time, bool)`

GetBouncedDateOk returns a tuple with the BouncedDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBouncedDate

`func (o *GetContacts200ResponseInner) SetBouncedDate(v time.Time)`

SetBouncedDate sets BouncedDate field to given value.

### HasBouncedDate

`func (o *GetContacts200ResponseInner) HasBouncedDate() bool`

HasBouncedDate returns a boolean if a field has been set.

### GetFiles

`func (o *GetContacts200ResponseInner) GetFiles() []map[string]interface{}`

GetFiles returns the Files field if non-nil, zero value otherwise.

### GetFilesOk

`func (o *GetContacts200ResponseInner) GetFilesOk() (*[]map[string]interface{}, bool)`

GetFilesOk returns a tuple with the Files field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFiles

`func (o *GetContacts200ResponseInner) SetFiles(v []map[string]interface{})`

SetFiles sets Files field to given value.

### HasFiles

`func (o *GetContacts200ResponseInner) HasFiles() bool`

HasFiles returns a boolean if a field has been set.

### GetOwner

`func (o *GetContacts200ResponseInner) GetOwner() GetContacts200ResponseInnerOwner`

GetOwner returns the Owner field if non-nil, zero value otherwise.

### GetOwnerOk

`func (o *GetContacts200ResponseInner) GetOwnerOk() (*GetContacts200ResponseInnerOwner, bool)`

GetOwnerOk returns a tuple with the Owner field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOwner

`func (o *GetContacts200ResponseInner) SetOwner(v GetContacts200ResponseInnerOwner)`

SetOwner sets Owner field to given value.

### HasOwner

`func (o *GetContacts200ResponseInner) HasOwner() bool`

HasOwner returns a boolean if a field has been set.

### GetPicture

`func (o *GetContacts200ResponseInner) GetPicture() string`

GetPicture returns the Picture field if non-nil, zero value otherwise.

### GetPictureOk

`func (o *GetContacts200ResponseInner) GetPictureOk() (*string, bool)`

GetPictureOk returns a tuple with the Picture field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPicture

`func (o *GetContacts200ResponseInner) SetPicture(v string)`

SetPicture sets Picture field to given value.

### HasPicture

`func (o *GetContacts200ResponseInner) HasPicture() bool`

HasPicture returns a boolean if a field has been set.

### GetArchived

`func (o *GetContacts200ResponseInner) GetArchived() bool`

GetArchived returns the Archived field if non-nil, zero value otherwise.

### GetArchivedOk

`func (o *GetContacts200ResponseInner) GetArchivedOk() (*bool, bool)`

GetArchivedOk returns a tuple with the Archived field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetArchived

`func (o *GetContacts200ResponseInner) SetArchived(v bool)`

SetArchived sets Archived field to given value.

### HasArchived

`func (o *GetContacts200ResponseInner) HasArchived() bool`

HasArchived returns a boolean if a field has been set.

### GetNotViewed

`func (o *GetContacts200ResponseInner) GetNotViewed() bool`

GetNotViewed returns the NotViewed field if non-nil, zero value otherwise.

### GetNotViewedOk

`func (o *GetContacts200ResponseInner) GetNotViewedOk() (*bool, bool)`

GetNotViewedOk returns a tuple with the NotViewed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNotViewed

`func (o *GetContacts200ResponseInner) SetNotViewed(v bool)`

SetNotViewed sets NotViewed field to given value.

### HasNotViewed

`func (o *GetContacts200ResponseInner) HasNotViewed() bool`

HasNotViewed returns a boolean if a field has been set.

### GetCanEdit

`func (o *GetContacts200ResponseInner) GetCanEdit() bool`

GetCanEdit returns the CanEdit field if non-nil, zero value otherwise.

### GetCanEditOk

`func (o *GetContacts200ResponseInner) GetCanEditOk() (*bool, bool)`

GetCanEditOk returns a tuple with the CanEdit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanEdit

`func (o *GetContacts200ResponseInner) SetCanEdit(v bool)`

SetCanEdit sets CanEdit field to given value.

### HasCanEdit

`func (o *GetContacts200ResponseInner) HasCanEdit() bool`

HasCanEdit returns a boolean if a field has been set.

### GetCreationDate

`func (o *GetContacts200ResponseInner) GetCreationDate() time.Time`

GetCreationDate returns the CreationDate field if non-nil, zero value otherwise.

### GetCreationDateOk

`func (o *GetContacts200ResponseInner) GetCreationDateOk() (*time.Time, bool)`

GetCreationDateOk returns a tuple with the CreationDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreationDate

`func (o *GetContacts200ResponseInner) SetCreationDate(v time.Time)`

SetCreationDate sets CreationDate field to given value.

### HasCreationDate

`func (o *GetContacts200ResponseInner) HasCreationDate() bool`

HasCreationDate returns a boolean if a field has been set.

### GetModificationDate

`func (o *GetContacts200ResponseInner) GetModificationDate() time.Time`

GetModificationDate returns the ModificationDate field if non-nil, zero value otherwise.

### GetModificationDateOk

`func (o *GetContacts200ResponseInner) GetModificationDateOk() (*time.Time, bool)`

GetModificationDateOk returns a tuple with the ModificationDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModificationDate

`func (o *GetContacts200ResponseInner) SetModificationDate(v time.Time)`

SetModificationDate sets ModificationDate field to given value.

### HasModificationDate

`func (o *GetContacts200ResponseInner) HasModificationDate() bool`

HasModificationDate returns a boolean if a field has been set.

### GetType

`func (o *GetContacts200ResponseInner) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *GetContacts200ResponseInner) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *GetContacts200ResponseInner) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *GetContacts200ResponseInner) HasType() bool`

HasType returns a boolean if a field has been set.

### GetTags

`func (o *GetContacts200ResponseInner) GetTags() []GetContacts200ResponseInnerTagsInner`

GetTags returns the Tags field if non-nil, zero value otherwise.

### GetTagsOk

`func (o *GetContacts200ResponseInner) GetTagsOk() (*[]GetContacts200ResponseInnerTagsInner, bool)`

GetTagsOk returns a tuple with the Tags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTags

`func (o *GetContacts200ResponseInner) SetTags(v []GetContacts200ResponseInnerTagsInner)`

SetTags sets Tags field to given value.

### HasTags

`func (o *GetContacts200ResponseInner) HasTags() bool`

HasTags returns a boolean if a field has been set.

### GetAddresses

`func (o *GetContacts200ResponseInner) GetAddresses() []GetContacts200ResponseInnerAddressesInner`

GetAddresses returns the Addresses field if non-nil, zero value otherwise.

### GetAddressesOk

`func (o *GetContacts200ResponseInner) GetAddressesOk() (*[]GetContacts200ResponseInnerAddressesInner, bool)`

GetAddressesOk returns a tuple with the Addresses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddresses

`func (o *GetContacts200ResponseInner) SetAddresses(v []GetContacts200ResponseInnerAddressesInner)`

SetAddresses sets Addresses field to given value.

### HasAddresses

`func (o *GetContacts200ResponseInner) HasAddresses() bool`

HasAddresses returns a boolean if a field has been set.

### GetPhoneNumber

`func (o *GetContacts200ResponseInner) GetPhoneNumber() string`

GetPhoneNumber returns the PhoneNumber field if non-nil, zero value otherwise.

### GetPhoneNumberOk

`func (o *GetContacts200ResponseInner) GetPhoneNumberOk() (*string, bool)`

GetPhoneNumberOk returns a tuple with the PhoneNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPhoneNumber

`func (o *GetContacts200ResponseInner) SetPhoneNumber(v string)`

SetPhoneNumber sets PhoneNumber field to given value.

### HasPhoneNumber

`func (o *GetContacts200ResponseInner) HasPhoneNumber() bool`

HasPhoneNumber returns a boolean if a field has been set.

### GetMobilePhoneNumber

`func (o *GetContacts200ResponseInner) GetMobilePhoneNumber() string`

GetMobilePhoneNumber returns the MobilePhoneNumber field if non-nil, zero value otherwise.

### GetMobilePhoneNumberOk

`func (o *GetContacts200ResponseInner) GetMobilePhoneNumberOk() (*string, bool)`

GetMobilePhoneNumberOk returns a tuple with the MobilePhoneNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMobilePhoneNumber

`func (o *GetContacts200ResponseInner) SetMobilePhoneNumber(v string)`

SetMobilePhoneNumber sets MobilePhoneNumber field to given value.

### HasMobilePhoneNumber

`func (o *GetContacts200ResponseInner) HasMobilePhoneNumber() bool`

HasMobilePhoneNumber returns a boolean if a field has been set.

### GetHomePhoneNumber

`func (o *GetContacts200ResponseInner) GetHomePhoneNumber() string`

GetHomePhoneNumber returns the HomePhoneNumber field if non-nil, zero value otherwise.

### GetHomePhoneNumberOk

`func (o *GetContacts200ResponseInner) GetHomePhoneNumberOk() (*string, bool)`

GetHomePhoneNumberOk returns a tuple with the HomePhoneNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHomePhoneNumber

`func (o *GetContacts200ResponseInner) SetHomePhoneNumber(v string)`

SetHomePhoneNumber sets HomePhoneNumber field to given value.

### HasHomePhoneNumber

`func (o *GetContacts200ResponseInner) HasHomePhoneNumber() bool`

HasHomePhoneNumber returns a boolean if a field has been set.

### GetFaxNumber

`func (o *GetContacts200ResponseInner) GetFaxNumber() string`

GetFaxNumber returns the FaxNumber field if non-nil, zero value otherwise.

### GetFaxNumberOk

`func (o *GetContacts200ResponseInner) GetFaxNumberOk() (*string, bool)`

GetFaxNumberOk returns a tuple with the FaxNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFaxNumber

`func (o *GetContacts200ResponseInner) SetFaxNumber(v string)`

SetFaxNumber sets FaxNumber field to given value.

### HasFaxNumber

`func (o *GetContacts200ResponseInner) HasFaxNumber() bool`

HasFaxNumber returns a boolean if a field has been set.

### GetPhoneNumbers

`func (o *GetContacts200ResponseInner) GetPhoneNumbers() []GetContacts200ResponseInnerPhoneNumbersInner`

GetPhoneNumbers returns the PhoneNumbers field if non-nil, zero value otherwise.

### GetPhoneNumbersOk

`func (o *GetContacts200ResponseInner) GetPhoneNumbersOk() (*[]GetContacts200ResponseInnerPhoneNumbersInner, bool)`

GetPhoneNumbersOk returns a tuple with the PhoneNumbers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPhoneNumbers

`func (o *GetContacts200ResponseInner) SetPhoneNumbers(v []GetContacts200ResponseInnerPhoneNumbersInner)`

SetPhoneNumbers sets PhoneNumbers field to given value.

### HasPhoneNumbers

`func (o *GetContacts200ResponseInner) HasPhoneNumbers() bool`

HasPhoneNumbers returns a boolean if a field has been set.

### GetPositions

`func (o *GetContacts200ResponseInner) GetPositions() []GetContacts200ResponseInnerPositionsInner`

GetPositions returns the Positions field if non-nil, zero value otherwise.

### GetPositionsOk

`func (o *GetContacts200ResponseInner) GetPositionsOk() (*[]GetContacts200ResponseInnerPositionsInner, bool)`

GetPositionsOk returns a tuple with the Positions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPositions

`func (o *GetContacts200ResponseInner) SetPositions(v []GetContacts200ResponseInnerPositionsInner)`

SetPositions sets Positions field to given value.

### HasPositions

`func (o *GetContacts200ResponseInner) HasPositions() bool`

HasPositions returns a boolean if a field has been set.

### GetSocialProfiles

`func (o *GetContacts200ResponseInner) GetSocialProfiles() []GetContacts200ResponseInnerSocialProfilesInner`

GetSocialProfiles returns the SocialProfiles field if non-nil, zero value otherwise.

### GetSocialProfilesOk

`func (o *GetContacts200ResponseInner) GetSocialProfilesOk() (*[]GetContacts200ResponseInnerSocialProfilesInner, bool)`

GetSocialProfilesOk returns a tuple with the SocialProfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSocialProfiles

`func (o *GetContacts200ResponseInner) SetSocialProfiles(v []GetContacts200ResponseInnerSocialProfilesInner)`

SetSocialProfiles sets SocialProfiles field to given value.

### HasSocialProfiles

`func (o *GetContacts200ResponseInner) HasSocialProfiles() bool`

HasSocialProfiles returns a boolean if a field has been set.

### GetOrganisation

`func (o *GetContacts200ResponseInner) GetOrganisation() string`

GetOrganisation returns the Organisation field if non-nil, zero value otherwise.

### GetOrganisationOk

`func (o *GetContacts200ResponseInner) GetOrganisationOk() (*string, bool)`

GetOrganisationOk returns a tuple with the Organisation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrganisation

`func (o *GetContacts200ResponseInner) SetOrganisation(v string)`

SetOrganisation sets Organisation field to given value.

### HasOrganisation

`func (o *GetContacts200ResponseInner) HasOrganisation() bool`

HasOrganisation returns a boolean if a field has been set.

### GetRole

`func (o *GetContacts200ResponseInner) GetRole() string`

GetRole returns the Role field if non-nil, zero value otherwise.

### GetRoleOk

`func (o *GetContacts200ResponseInner) GetRoleOk() (*string, bool)`

GetRoleOk returns a tuple with the Role field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRole

`func (o *GetContacts200ResponseInner) SetRole(v string)`

SetRole sets Role field to given value.

### HasRole

`func (o *GetContacts200ResponseInner) HasRole() bool`

HasRole returns a boolean if a field has been set.

### GetCustom

`func (o *GetContacts200ResponseInner) GetCustom() map[string]interface{}`

GetCustom returns the Custom field if non-nil, zero value otherwise.

### GetCustomOk

`func (o *GetContacts200ResponseInner) GetCustomOk() (*map[string]interface{}, bool)`

GetCustomOk returns a tuple with the Custom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustom

`func (o *GetContacts200ResponseInner) SetCustom(v map[string]interface{})`

SetCustom sets Custom field to given value.

### HasCustom

`func (o *GetContacts200ResponseInner) HasCustom() bool`

HasCustom returns a boolean if a field has been set.

### GetLastEmailDate

`func (o *GetContacts200ResponseInner) GetLastEmailDate() time.Time`

GetLastEmailDate returns the LastEmailDate field if non-nil, zero value otherwise.

### GetLastEmailDateOk

`func (o *GetContacts200ResponseInner) GetLastEmailDateOk() (*time.Time, bool)`

GetLastEmailDateOk returns a tuple with the LastEmailDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastEmailDate

`func (o *GetContacts200ResponseInner) SetLastEmailDate(v time.Time)`

SetLastEmailDate sets LastEmailDate field to given value.

### HasLastEmailDate

`func (o *GetContacts200ResponseInner) HasLastEmailDate() bool`

HasLastEmailDate returns a boolean if a field has been set.

### GetLastMeetingDate

`func (o *GetContacts200ResponseInner) GetLastMeetingDate() time.Time`

GetLastMeetingDate returns the LastMeetingDate field if non-nil, zero value otherwise.

### GetLastMeetingDateOk

`func (o *GetContacts200ResponseInner) GetLastMeetingDateOk() (*time.Time, bool)`

GetLastMeetingDateOk returns a tuple with the LastMeetingDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastMeetingDate

`func (o *GetContacts200ResponseInner) SetLastMeetingDate(v time.Time)`

SetLastMeetingDate sets LastMeetingDate field to given value.

### HasLastMeetingDate

`func (o *GetContacts200ResponseInner) HasLastMeetingDate() bool`

HasLastMeetingDate returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


