# GetMe200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **float32** |  | [optional] 
**Team** | Pointer to [**GetMe200ResponseTeam**](GetMe200ResponseTeam.md) |  | [optional] 
**Group** | Pointer to **float32** |  | [optional] 
**AmountOfTrialDaysEarned** | Pointer to **float32** |  | [optional] 
**HasReceivedAccountSuggestions** | Pointer to **bool** |  | [optional] 
**HasArchivedContacts** | Pointer to **bool** |  | [optional] 
**NotificationChannelId** | Pointer to **string** |  | [optional] 
**NeedsPassword** | Pointer to **bool** |  | [optional] 
**Disabled** | Pointer to **bool** |  | [optional] 
**CreationDate** | Pointer to **time.Time** |  | [optional] 
**ModificationDate** | Pointer to **time.Time** |  | [optional] 
**Prefix** | Pointer to **string** |  | [optional] 
**Firstname** | Pointer to **string** |  | [optional] 
**Middle** | Pointer to **string** |  | [optional] 
**Lastname** | Pointer to **string** |  | [optional] 
**Suffix** | Pointer to **string** |  | [optional] 
**Name** | Pointer to **string** |  | [optional] 
**Email** | Pointer to **string** |  | [optional] 
**Domain** | Pointer to **string** |  | [optional] 
**Picture** | Pointer to **string** |  | [optional] 
**Type** | Pointer to **string** |  | [optional] 
**IsAdmin** | Pointer to **bool** |  | [optional] 
**CreditUsage** | Pointer to **float32** |  | [optional] 
**IsImporting** | Pointer to **bool** |  | [optional] 
**SyncStatus** | Pointer to **string** |  | [optional] 
**CalendarSyncStatus** | Pointer to **string** |  | [optional] 
**FirstCalendarSyncDone** | Pointer to **bool** |  | [optional] 
**TrialExpired** | Pointer to **bool** |  | [optional] 
**TrialExpiryDate** | Pointer to **time.Time** |  | [optional] 
**TrialExtended** | Pointer to **bool** |  | [optional] 
**Restricted** | Pointer to **bool** |  | [optional] 
**RestrictedReason** | Pointer to **string** |  | [optional] 
**TeamDiscountCode** | Pointer to **string** |  | [optional] 
**ReferralCode** | Pointer to **string** |  | [optional] 
**ReferralReward** | Pointer to **float32** |  | [optional] 
**IsDelinquent** | Pointer to **bool** |  | [optional] 
**SocialProfiles** | Pointer to [**[]GetMe200ResponseSocialProfilesInner**](GetMe200ResponseSocialProfilesInner.md) |  | [optional] 
**PhoneNumbers** | Pointer to [**[]GetMe200ResponsePhoneNumbersInner**](GetMe200ResponsePhoneNumbersInner.md) |  | [optional] 
**Positions** | Pointer to [**[]GetContacts200ResponseInnerPositionsInner**](GetContacts200ResponseInnerPositionsInner.md) |  | [optional] 
**Addresses** | Pointer to **[]map[string]interface{}** |  | [optional] 
**Tags** | Pointer to **[]map[string]interface{}** |  | [optional] 
**IntercomHash** | Pointer to **string** |  | [optional] 
**FirstDayOfWeek** | Pointer to **float32** |  | [optional] 
**AmPmNotation** | Pointer to **bool** |  | [optional] 
**AutoFindEmailLinkedin** | Pointer to **bool** |  | [optional] 
**DataSourcesToReconnect** | Pointer to [**[]GetMe200ResponseDataSourcesToReconnectInner**](GetMe200ResponseDataSourcesToReconnectInner.md) |  | [optional] 
**DataSources** | Pointer to [**[]GetMe200ResponseDataSourcesInner**](GetMe200ResponseDataSourcesInner.md) |  | [optional] 
**PlanFlags** | Pointer to **map[string]interface{}** |  | [optional] 
**Flags** | Pointer to [**[]GetMe200ResponseFlagsInner**](GetMe200ResponseFlagsInner.md) |  | [optional] 
**Role** | Pointer to [**GetMe200ResponseRole**](GetMe200ResponseRole.md) |  | [optional] 
**CallLogSyncDate** | Pointer to **time.Time** |  | [optional] 
**TwoFaEnabled** | Pointer to **bool** |  | [optional] 

## Methods

### NewGetMe200Response

`func NewGetMe200Response() *GetMe200Response`

NewGetMe200Response instantiates a new GetMe200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetMe200ResponseWithDefaults

`func NewGetMe200ResponseWithDefaults() *GetMe200Response`

NewGetMe200ResponseWithDefaults instantiates a new GetMe200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *GetMe200Response) GetId() float32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *GetMe200Response) GetIdOk() (*float32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *GetMe200Response) SetId(v float32)`

SetId sets Id field to given value.

### HasId

`func (o *GetMe200Response) HasId() bool`

HasId returns a boolean if a field has been set.

### GetTeam

`func (o *GetMe200Response) GetTeam() GetMe200ResponseTeam`

GetTeam returns the Team field if non-nil, zero value otherwise.

### GetTeamOk

`func (o *GetMe200Response) GetTeamOk() (*GetMe200ResponseTeam, bool)`

GetTeamOk returns a tuple with the Team field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTeam

`func (o *GetMe200Response) SetTeam(v GetMe200ResponseTeam)`

SetTeam sets Team field to given value.

### HasTeam

`func (o *GetMe200Response) HasTeam() bool`

HasTeam returns a boolean if a field has been set.

### GetGroup

`func (o *GetMe200Response) GetGroup() float32`

GetGroup returns the Group field if non-nil, zero value otherwise.

### GetGroupOk

`func (o *GetMe200Response) GetGroupOk() (*float32, bool)`

GetGroupOk returns a tuple with the Group field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroup

`func (o *GetMe200Response) SetGroup(v float32)`

SetGroup sets Group field to given value.

### HasGroup

`func (o *GetMe200Response) HasGroup() bool`

HasGroup returns a boolean if a field has been set.

### GetAmountOfTrialDaysEarned

`func (o *GetMe200Response) GetAmountOfTrialDaysEarned() float32`

GetAmountOfTrialDaysEarned returns the AmountOfTrialDaysEarned field if non-nil, zero value otherwise.

### GetAmountOfTrialDaysEarnedOk

`func (o *GetMe200Response) GetAmountOfTrialDaysEarnedOk() (*float32, bool)`

GetAmountOfTrialDaysEarnedOk returns a tuple with the AmountOfTrialDaysEarned field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmountOfTrialDaysEarned

`func (o *GetMe200Response) SetAmountOfTrialDaysEarned(v float32)`

SetAmountOfTrialDaysEarned sets AmountOfTrialDaysEarned field to given value.

### HasAmountOfTrialDaysEarned

`func (o *GetMe200Response) HasAmountOfTrialDaysEarned() bool`

HasAmountOfTrialDaysEarned returns a boolean if a field has been set.

### GetHasReceivedAccountSuggestions

`func (o *GetMe200Response) GetHasReceivedAccountSuggestions() bool`

GetHasReceivedAccountSuggestions returns the HasReceivedAccountSuggestions field if non-nil, zero value otherwise.

### GetHasReceivedAccountSuggestionsOk

`func (o *GetMe200Response) GetHasReceivedAccountSuggestionsOk() (*bool, bool)`

GetHasReceivedAccountSuggestionsOk returns a tuple with the HasReceivedAccountSuggestions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasReceivedAccountSuggestions

`func (o *GetMe200Response) SetHasReceivedAccountSuggestions(v bool)`

SetHasReceivedAccountSuggestions sets HasReceivedAccountSuggestions field to given value.

### HasHasReceivedAccountSuggestions

`func (o *GetMe200Response) HasHasReceivedAccountSuggestions() bool`

HasHasReceivedAccountSuggestions returns a boolean if a field has been set.

### GetHasArchivedContacts

`func (o *GetMe200Response) GetHasArchivedContacts() bool`

GetHasArchivedContacts returns the HasArchivedContacts field if non-nil, zero value otherwise.

### GetHasArchivedContactsOk

`func (o *GetMe200Response) GetHasArchivedContactsOk() (*bool, bool)`

GetHasArchivedContactsOk returns a tuple with the HasArchivedContacts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasArchivedContacts

`func (o *GetMe200Response) SetHasArchivedContacts(v bool)`

SetHasArchivedContacts sets HasArchivedContacts field to given value.

### HasHasArchivedContacts

`func (o *GetMe200Response) HasHasArchivedContacts() bool`

HasHasArchivedContacts returns a boolean if a field has been set.

### GetNotificationChannelId

`func (o *GetMe200Response) GetNotificationChannelId() string`

GetNotificationChannelId returns the NotificationChannelId field if non-nil, zero value otherwise.

### GetNotificationChannelIdOk

`func (o *GetMe200Response) GetNotificationChannelIdOk() (*string, bool)`

GetNotificationChannelIdOk returns a tuple with the NotificationChannelId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNotificationChannelId

`func (o *GetMe200Response) SetNotificationChannelId(v string)`

SetNotificationChannelId sets NotificationChannelId field to given value.

### HasNotificationChannelId

`func (o *GetMe200Response) HasNotificationChannelId() bool`

HasNotificationChannelId returns a boolean if a field has been set.

### GetNeedsPassword

`func (o *GetMe200Response) GetNeedsPassword() bool`

GetNeedsPassword returns the NeedsPassword field if non-nil, zero value otherwise.

### GetNeedsPasswordOk

`func (o *GetMe200Response) GetNeedsPasswordOk() (*bool, bool)`

GetNeedsPasswordOk returns a tuple with the NeedsPassword field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNeedsPassword

`func (o *GetMe200Response) SetNeedsPassword(v bool)`

SetNeedsPassword sets NeedsPassword field to given value.

### HasNeedsPassword

`func (o *GetMe200Response) HasNeedsPassword() bool`

HasNeedsPassword returns a boolean if a field has been set.

### GetDisabled

`func (o *GetMe200Response) GetDisabled() bool`

GetDisabled returns the Disabled field if non-nil, zero value otherwise.

### GetDisabledOk

`func (o *GetMe200Response) GetDisabledOk() (*bool, bool)`

GetDisabledOk returns a tuple with the Disabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisabled

`func (o *GetMe200Response) SetDisabled(v bool)`

SetDisabled sets Disabled field to given value.

### HasDisabled

`func (o *GetMe200Response) HasDisabled() bool`

HasDisabled returns a boolean if a field has been set.

### GetCreationDate

`func (o *GetMe200Response) GetCreationDate() time.Time`

GetCreationDate returns the CreationDate field if non-nil, zero value otherwise.

### GetCreationDateOk

`func (o *GetMe200Response) GetCreationDateOk() (*time.Time, bool)`

GetCreationDateOk returns a tuple with the CreationDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreationDate

`func (o *GetMe200Response) SetCreationDate(v time.Time)`

SetCreationDate sets CreationDate field to given value.

### HasCreationDate

`func (o *GetMe200Response) HasCreationDate() bool`

HasCreationDate returns a boolean if a field has been set.

### GetModificationDate

`func (o *GetMe200Response) GetModificationDate() time.Time`

GetModificationDate returns the ModificationDate field if non-nil, zero value otherwise.

### GetModificationDateOk

`func (o *GetMe200Response) GetModificationDateOk() (*time.Time, bool)`

GetModificationDateOk returns a tuple with the ModificationDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModificationDate

`func (o *GetMe200Response) SetModificationDate(v time.Time)`

SetModificationDate sets ModificationDate field to given value.

### HasModificationDate

`func (o *GetMe200Response) HasModificationDate() bool`

HasModificationDate returns a boolean if a field has been set.

### GetPrefix

`func (o *GetMe200Response) GetPrefix() string`

GetPrefix returns the Prefix field if non-nil, zero value otherwise.

### GetPrefixOk

`func (o *GetMe200Response) GetPrefixOk() (*string, bool)`

GetPrefixOk returns a tuple with the Prefix field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrefix

`func (o *GetMe200Response) SetPrefix(v string)`

SetPrefix sets Prefix field to given value.

### HasPrefix

`func (o *GetMe200Response) HasPrefix() bool`

HasPrefix returns a boolean if a field has been set.

### GetFirstname

`func (o *GetMe200Response) GetFirstname() string`

GetFirstname returns the Firstname field if non-nil, zero value otherwise.

### GetFirstnameOk

`func (o *GetMe200Response) GetFirstnameOk() (*string, bool)`

GetFirstnameOk returns a tuple with the Firstname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstname

`func (o *GetMe200Response) SetFirstname(v string)`

SetFirstname sets Firstname field to given value.

### HasFirstname

`func (o *GetMe200Response) HasFirstname() bool`

HasFirstname returns a boolean if a field has been set.

### GetMiddle

`func (o *GetMe200Response) GetMiddle() string`

GetMiddle returns the Middle field if non-nil, zero value otherwise.

### GetMiddleOk

`func (o *GetMe200Response) GetMiddleOk() (*string, bool)`

GetMiddleOk returns a tuple with the Middle field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMiddle

`func (o *GetMe200Response) SetMiddle(v string)`

SetMiddle sets Middle field to given value.

### HasMiddle

`func (o *GetMe200Response) HasMiddle() bool`

HasMiddle returns a boolean if a field has been set.

### GetLastname

`func (o *GetMe200Response) GetLastname() string`

GetLastname returns the Lastname field if non-nil, zero value otherwise.

### GetLastnameOk

`func (o *GetMe200Response) GetLastnameOk() (*string, bool)`

GetLastnameOk returns a tuple with the Lastname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastname

`func (o *GetMe200Response) SetLastname(v string)`

SetLastname sets Lastname field to given value.

### HasLastname

`func (o *GetMe200Response) HasLastname() bool`

HasLastname returns a boolean if a field has been set.

### GetSuffix

`func (o *GetMe200Response) GetSuffix() string`

GetSuffix returns the Suffix field if non-nil, zero value otherwise.

### GetSuffixOk

`func (o *GetMe200Response) GetSuffixOk() (*string, bool)`

GetSuffixOk returns a tuple with the Suffix field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSuffix

`func (o *GetMe200Response) SetSuffix(v string)`

SetSuffix sets Suffix field to given value.

### HasSuffix

`func (o *GetMe200Response) HasSuffix() bool`

HasSuffix returns a boolean if a field has been set.

### GetName

`func (o *GetMe200Response) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *GetMe200Response) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *GetMe200Response) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *GetMe200Response) HasName() bool`

HasName returns a boolean if a field has been set.

### GetEmail

`func (o *GetMe200Response) GetEmail() string`

GetEmail returns the Email field if non-nil, zero value otherwise.

### GetEmailOk

`func (o *GetMe200Response) GetEmailOk() (*string, bool)`

GetEmailOk returns a tuple with the Email field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmail

`func (o *GetMe200Response) SetEmail(v string)`

SetEmail sets Email field to given value.

### HasEmail

`func (o *GetMe200Response) HasEmail() bool`

HasEmail returns a boolean if a field has been set.

### GetDomain

`func (o *GetMe200Response) GetDomain() string`

GetDomain returns the Domain field if non-nil, zero value otherwise.

### GetDomainOk

`func (o *GetMe200Response) GetDomainOk() (*string, bool)`

GetDomainOk returns a tuple with the Domain field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDomain

`func (o *GetMe200Response) SetDomain(v string)`

SetDomain sets Domain field to given value.

### HasDomain

`func (o *GetMe200Response) HasDomain() bool`

HasDomain returns a boolean if a field has been set.

### GetPicture

`func (o *GetMe200Response) GetPicture() string`

GetPicture returns the Picture field if non-nil, zero value otherwise.

### GetPictureOk

`func (o *GetMe200Response) GetPictureOk() (*string, bool)`

GetPictureOk returns a tuple with the Picture field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPicture

`func (o *GetMe200Response) SetPicture(v string)`

SetPicture sets Picture field to given value.

### HasPicture

`func (o *GetMe200Response) HasPicture() bool`

HasPicture returns a boolean if a field has been set.

### GetType

`func (o *GetMe200Response) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *GetMe200Response) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *GetMe200Response) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *GetMe200Response) HasType() bool`

HasType returns a boolean if a field has been set.

### GetIsAdmin

`func (o *GetMe200Response) GetIsAdmin() bool`

GetIsAdmin returns the IsAdmin field if non-nil, zero value otherwise.

### GetIsAdminOk

`func (o *GetMe200Response) GetIsAdminOk() (*bool, bool)`

GetIsAdminOk returns a tuple with the IsAdmin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsAdmin

`func (o *GetMe200Response) SetIsAdmin(v bool)`

SetIsAdmin sets IsAdmin field to given value.

### HasIsAdmin

`func (o *GetMe200Response) HasIsAdmin() bool`

HasIsAdmin returns a boolean if a field has been set.

### GetCreditUsage

`func (o *GetMe200Response) GetCreditUsage() float32`

GetCreditUsage returns the CreditUsage field if non-nil, zero value otherwise.

### GetCreditUsageOk

`func (o *GetMe200Response) GetCreditUsageOk() (*float32, bool)`

GetCreditUsageOk returns a tuple with the CreditUsage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreditUsage

`func (o *GetMe200Response) SetCreditUsage(v float32)`

SetCreditUsage sets CreditUsage field to given value.

### HasCreditUsage

`func (o *GetMe200Response) HasCreditUsage() bool`

HasCreditUsage returns a boolean if a field has been set.

### GetIsImporting

`func (o *GetMe200Response) GetIsImporting() bool`

GetIsImporting returns the IsImporting field if non-nil, zero value otherwise.

### GetIsImportingOk

`func (o *GetMe200Response) GetIsImportingOk() (*bool, bool)`

GetIsImportingOk returns a tuple with the IsImporting field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsImporting

`func (o *GetMe200Response) SetIsImporting(v bool)`

SetIsImporting sets IsImporting field to given value.

### HasIsImporting

`func (o *GetMe200Response) HasIsImporting() bool`

HasIsImporting returns a boolean if a field has been set.

### GetSyncStatus

`func (o *GetMe200Response) GetSyncStatus() string`

GetSyncStatus returns the SyncStatus field if non-nil, zero value otherwise.

### GetSyncStatusOk

`func (o *GetMe200Response) GetSyncStatusOk() (*string, bool)`

GetSyncStatusOk returns a tuple with the SyncStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSyncStatus

`func (o *GetMe200Response) SetSyncStatus(v string)`

SetSyncStatus sets SyncStatus field to given value.

### HasSyncStatus

`func (o *GetMe200Response) HasSyncStatus() bool`

HasSyncStatus returns a boolean if a field has been set.

### GetCalendarSyncStatus

`func (o *GetMe200Response) GetCalendarSyncStatus() string`

GetCalendarSyncStatus returns the CalendarSyncStatus field if non-nil, zero value otherwise.

### GetCalendarSyncStatusOk

`func (o *GetMe200Response) GetCalendarSyncStatusOk() (*string, bool)`

GetCalendarSyncStatusOk returns a tuple with the CalendarSyncStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCalendarSyncStatus

`func (o *GetMe200Response) SetCalendarSyncStatus(v string)`

SetCalendarSyncStatus sets CalendarSyncStatus field to given value.

### HasCalendarSyncStatus

`func (o *GetMe200Response) HasCalendarSyncStatus() bool`

HasCalendarSyncStatus returns a boolean if a field has been set.

### GetFirstCalendarSyncDone

`func (o *GetMe200Response) GetFirstCalendarSyncDone() bool`

GetFirstCalendarSyncDone returns the FirstCalendarSyncDone field if non-nil, zero value otherwise.

### GetFirstCalendarSyncDoneOk

`func (o *GetMe200Response) GetFirstCalendarSyncDoneOk() (*bool, bool)`

GetFirstCalendarSyncDoneOk returns a tuple with the FirstCalendarSyncDone field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstCalendarSyncDone

`func (o *GetMe200Response) SetFirstCalendarSyncDone(v bool)`

SetFirstCalendarSyncDone sets FirstCalendarSyncDone field to given value.

### HasFirstCalendarSyncDone

`func (o *GetMe200Response) HasFirstCalendarSyncDone() bool`

HasFirstCalendarSyncDone returns a boolean if a field has been set.

### GetTrialExpired

`func (o *GetMe200Response) GetTrialExpired() bool`

GetTrialExpired returns the TrialExpired field if non-nil, zero value otherwise.

### GetTrialExpiredOk

`func (o *GetMe200Response) GetTrialExpiredOk() (*bool, bool)`

GetTrialExpiredOk returns a tuple with the TrialExpired field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrialExpired

`func (o *GetMe200Response) SetTrialExpired(v bool)`

SetTrialExpired sets TrialExpired field to given value.

### HasTrialExpired

`func (o *GetMe200Response) HasTrialExpired() bool`

HasTrialExpired returns a boolean if a field has been set.

### GetTrialExpiryDate

`func (o *GetMe200Response) GetTrialExpiryDate() time.Time`

GetTrialExpiryDate returns the TrialExpiryDate field if non-nil, zero value otherwise.

### GetTrialExpiryDateOk

`func (o *GetMe200Response) GetTrialExpiryDateOk() (*time.Time, bool)`

GetTrialExpiryDateOk returns a tuple with the TrialExpiryDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrialExpiryDate

`func (o *GetMe200Response) SetTrialExpiryDate(v time.Time)`

SetTrialExpiryDate sets TrialExpiryDate field to given value.

### HasTrialExpiryDate

`func (o *GetMe200Response) HasTrialExpiryDate() bool`

HasTrialExpiryDate returns a boolean if a field has been set.

### GetTrialExtended

`func (o *GetMe200Response) GetTrialExtended() bool`

GetTrialExtended returns the TrialExtended field if non-nil, zero value otherwise.

### GetTrialExtendedOk

`func (o *GetMe200Response) GetTrialExtendedOk() (*bool, bool)`

GetTrialExtendedOk returns a tuple with the TrialExtended field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrialExtended

`func (o *GetMe200Response) SetTrialExtended(v bool)`

SetTrialExtended sets TrialExtended field to given value.

### HasTrialExtended

`func (o *GetMe200Response) HasTrialExtended() bool`

HasTrialExtended returns a boolean if a field has been set.

### GetRestricted

`func (o *GetMe200Response) GetRestricted() bool`

GetRestricted returns the Restricted field if non-nil, zero value otherwise.

### GetRestrictedOk

`func (o *GetMe200Response) GetRestrictedOk() (*bool, bool)`

GetRestrictedOk returns a tuple with the Restricted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRestricted

`func (o *GetMe200Response) SetRestricted(v bool)`

SetRestricted sets Restricted field to given value.

### HasRestricted

`func (o *GetMe200Response) HasRestricted() bool`

HasRestricted returns a boolean if a field has been set.

### GetRestrictedReason

`func (o *GetMe200Response) GetRestrictedReason() string`

GetRestrictedReason returns the RestrictedReason field if non-nil, zero value otherwise.

### GetRestrictedReasonOk

`func (o *GetMe200Response) GetRestrictedReasonOk() (*string, bool)`

GetRestrictedReasonOk returns a tuple with the RestrictedReason field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRestrictedReason

`func (o *GetMe200Response) SetRestrictedReason(v string)`

SetRestrictedReason sets RestrictedReason field to given value.

### HasRestrictedReason

`func (o *GetMe200Response) HasRestrictedReason() bool`

HasRestrictedReason returns a boolean if a field has been set.

### GetTeamDiscountCode

`func (o *GetMe200Response) GetTeamDiscountCode() string`

GetTeamDiscountCode returns the TeamDiscountCode field if non-nil, zero value otherwise.

### GetTeamDiscountCodeOk

`func (o *GetMe200Response) GetTeamDiscountCodeOk() (*string, bool)`

GetTeamDiscountCodeOk returns a tuple with the TeamDiscountCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTeamDiscountCode

`func (o *GetMe200Response) SetTeamDiscountCode(v string)`

SetTeamDiscountCode sets TeamDiscountCode field to given value.

### HasTeamDiscountCode

`func (o *GetMe200Response) HasTeamDiscountCode() bool`

HasTeamDiscountCode returns a boolean if a field has been set.

### GetReferralCode

`func (o *GetMe200Response) GetReferralCode() string`

GetReferralCode returns the ReferralCode field if non-nil, zero value otherwise.

### GetReferralCodeOk

`func (o *GetMe200Response) GetReferralCodeOk() (*string, bool)`

GetReferralCodeOk returns a tuple with the ReferralCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReferralCode

`func (o *GetMe200Response) SetReferralCode(v string)`

SetReferralCode sets ReferralCode field to given value.

### HasReferralCode

`func (o *GetMe200Response) HasReferralCode() bool`

HasReferralCode returns a boolean if a field has been set.

### GetReferralReward

`func (o *GetMe200Response) GetReferralReward() float32`

GetReferralReward returns the ReferralReward field if non-nil, zero value otherwise.

### GetReferralRewardOk

`func (o *GetMe200Response) GetReferralRewardOk() (*float32, bool)`

GetReferralRewardOk returns a tuple with the ReferralReward field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReferralReward

`func (o *GetMe200Response) SetReferralReward(v float32)`

SetReferralReward sets ReferralReward field to given value.

### HasReferralReward

`func (o *GetMe200Response) HasReferralReward() bool`

HasReferralReward returns a boolean if a field has been set.

### GetIsDelinquent

`func (o *GetMe200Response) GetIsDelinquent() bool`

GetIsDelinquent returns the IsDelinquent field if non-nil, zero value otherwise.

### GetIsDelinquentOk

`func (o *GetMe200Response) GetIsDelinquentOk() (*bool, bool)`

GetIsDelinquentOk returns a tuple with the IsDelinquent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsDelinquent

`func (o *GetMe200Response) SetIsDelinquent(v bool)`

SetIsDelinquent sets IsDelinquent field to given value.

### HasIsDelinquent

`func (o *GetMe200Response) HasIsDelinquent() bool`

HasIsDelinquent returns a boolean if a field has been set.

### GetSocialProfiles

`func (o *GetMe200Response) GetSocialProfiles() []GetMe200ResponseSocialProfilesInner`

GetSocialProfiles returns the SocialProfiles field if non-nil, zero value otherwise.

### GetSocialProfilesOk

`func (o *GetMe200Response) GetSocialProfilesOk() (*[]GetMe200ResponseSocialProfilesInner, bool)`

GetSocialProfilesOk returns a tuple with the SocialProfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSocialProfiles

`func (o *GetMe200Response) SetSocialProfiles(v []GetMe200ResponseSocialProfilesInner)`

SetSocialProfiles sets SocialProfiles field to given value.

### HasSocialProfiles

`func (o *GetMe200Response) HasSocialProfiles() bool`

HasSocialProfiles returns a boolean if a field has been set.

### GetPhoneNumbers

`func (o *GetMe200Response) GetPhoneNumbers() []GetMe200ResponsePhoneNumbersInner`

GetPhoneNumbers returns the PhoneNumbers field if non-nil, zero value otherwise.

### GetPhoneNumbersOk

`func (o *GetMe200Response) GetPhoneNumbersOk() (*[]GetMe200ResponsePhoneNumbersInner, bool)`

GetPhoneNumbersOk returns a tuple with the PhoneNumbers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPhoneNumbers

`func (o *GetMe200Response) SetPhoneNumbers(v []GetMe200ResponsePhoneNumbersInner)`

SetPhoneNumbers sets PhoneNumbers field to given value.

### HasPhoneNumbers

`func (o *GetMe200Response) HasPhoneNumbers() bool`

HasPhoneNumbers returns a boolean if a field has been set.

### GetPositions

`func (o *GetMe200Response) GetPositions() []GetContacts200ResponseInnerPositionsInner`

GetPositions returns the Positions field if non-nil, zero value otherwise.

### GetPositionsOk

`func (o *GetMe200Response) GetPositionsOk() (*[]GetContacts200ResponseInnerPositionsInner, bool)`

GetPositionsOk returns a tuple with the Positions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPositions

`func (o *GetMe200Response) SetPositions(v []GetContacts200ResponseInnerPositionsInner)`

SetPositions sets Positions field to given value.

### HasPositions

`func (o *GetMe200Response) HasPositions() bool`

HasPositions returns a boolean if a field has been set.

### GetAddresses

`func (o *GetMe200Response) GetAddresses() []map[string]interface{}`

GetAddresses returns the Addresses field if non-nil, zero value otherwise.

### GetAddressesOk

`func (o *GetMe200Response) GetAddressesOk() (*[]map[string]interface{}, bool)`

GetAddressesOk returns a tuple with the Addresses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddresses

`func (o *GetMe200Response) SetAddresses(v []map[string]interface{})`

SetAddresses sets Addresses field to given value.

### HasAddresses

`func (o *GetMe200Response) HasAddresses() bool`

HasAddresses returns a boolean if a field has been set.

### GetTags

`func (o *GetMe200Response) GetTags() []map[string]interface{}`

GetTags returns the Tags field if non-nil, zero value otherwise.

### GetTagsOk

`func (o *GetMe200Response) GetTagsOk() (*[]map[string]interface{}, bool)`

GetTagsOk returns a tuple with the Tags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTags

`func (o *GetMe200Response) SetTags(v []map[string]interface{})`

SetTags sets Tags field to given value.

### HasTags

`func (o *GetMe200Response) HasTags() bool`

HasTags returns a boolean if a field has been set.

### GetIntercomHash

`func (o *GetMe200Response) GetIntercomHash() string`

GetIntercomHash returns the IntercomHash field if non-nil, zero value otherwise.

### GetIntercomHashOk

`func (o *GetMe200Response) GetIntercomHashOk() (*string, bool)`

GetIntercomHashOk returns a tuple with the IntercomHash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntercomHash

`func (o *GetMe200Response) SetIntercomHash(v string)`

SetIntercomHash sets IntercomHash field to given value.

### HasIntercomHash

`func (o *GetMe200Response) HasIntercomHash() bool`

HasIntercomHash returns a boolean if a field has been set.

### GetFirstDayOfWeek

`func (o *GetMe200Response) GetFirstDayOfWeek() float32`

GetFirstDayOfWeek returns the FirstDayOfWeek field if non-nil, zero value otherwise.

### GetFirstDayOfWeekOk

`func (o *GetMe200Response) GetFirstDayOfWeekOk() (*float32, bool)`

GetFirstDayOfWeekOk returns a tuple with the FirstDayOfWeek field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstDayOfWeek

`func (o *GetMe200Response) SetFirstDayOfWeek(v float32)`

SetFirstDayOfWeek sets FirstDayOfWeek field to given value.

### HasFirstDayOfWeek

`func (o *GetMe200Response) HasFirstDayOfWeek() bool`

HasFirstDayOfWeek returns a boolean if a field has been set.

### GetAmPmNotation

`func (o *GetMe200Response) GetAmPmNotation() bool`

GetAmPmNotation returns the AmPmNotation field if non-nil, zero value otherwise.

### GetAmPmNotationOk

`func (o *GetMe200Response) GetAmPmNotationOk() (*bool, bool)`

GetAmPmNotationOk returns a tuple with the AmPmNotation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmPmNotation

`func (o *GetMe200Response) SetAmPmNotation(v bool)`

SetAmPmNotation sets AmPmNotation field to given value.

### HasAmPmNotation

`func (o *GetMe200Response) HasAmPmNotation() bool`

HasAmPmNotation returns a boolean if a field has been set.

### GetAutoFindEmailLinkedin

`func (o *GetMe200Response) GetAutoFindEmailLinkedin() bool`

GetAutoFindEmailLinkedin returns the AutoFindEmailLinkedin field if non-nil, zero value otherwise.

### GetAutoFindEmailLinkedinOk

`func (o *GetMe200Response) GetAutoFindEmailLinkedinOk() (*bool, bool)`

GetAutoFindEmailLinkedinOk returns a tuple with the AutoFindEmailLinkedin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAutoFindEmailLinkedin

`func (o *GetMe200Response) SetAutoFindEmailLinkedin(v bool)`

SetAutoFindEmailLinkedin sets AutoFindEmailLinkedin field to given value.

### HasAutoFindEmailLinkedin

`func (o *GetMe200Response) HasAutoFindEmailLinkedin() bool`

HasAutoFindEmailLinkedin returns a boolean if a field has been set.

### GetDataSourcesToReconnect

`func (o *GetMe200Response) GetDataSourcesToReconnect() []GetMe200ResponseDataSourcesToReconnectInner`

GetDataSourcesToReconnect returns the DataSourcesToReconnect field if non-nil, zero value otherwise.

### GetDataSourcesToReconnectOk

`func (o *GetMe200Response) GetDataSourcesToReconnectOk() (*[]GetMe200ResponseDataSourcesToReconnectInner, bool)`

GetDataSourcesToReconnectOk returns a tuple with the DataSourcesToReconnect field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDataSourcesToReconnect

`func (o *GetMe200Response) SetDataSourcesToReconnect(v []GetMe200ResponseDataSourcesToReconnectInner)`

SetDataSourcesToReconnect sets DataSourcesToReconnect field to given value.

### HasDataSourcesToReconnect

`func (o *GetMe200Response) HasDataSourcesToReconnect() bool`

HasDataSourcesToReconnect returns a boolean if a field has been set.

### GetDataSources

`func (o *GetMe200Response) GetDataSources() []GetMe200ResponseDataSourcesInner`

GetDataSources returns the DataSources field if non-nil, zero value otherwise.

### GetDataSourcesOk

`func (o *GetMe200Response) GetDataSourcesOk() (*[]GetMe200ResponseDataSourcesInner, bool)`

GetDataSourcesOk returns a tuple with the DataSources field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDataSources

`func (o *GetMe200Response) SetDataSources(v []GetMe200ResponseDataSourcesInner)`

SetDataSources sets DataSources field to given value.

### HasDataSources

`func (o *GetMe200Response) HasDataSources() bool`

HasDataSources returns a boolean if a field has been set.

### GetPlanFlags

`func (o *GetMe200Response) GetPlanFlags() map[string]interface{}`

GetPlanFlags returns the PlanFlags field if non-nil, zero value otherwise.

### GetPlanFlagsOk

`func (o *GetMe200Response) GetPlanFlagsOk() (*map[string]interface{}, bool)`

GetPlanFlagsOk returns a tuple with the PlanFlags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlanFlags

`func (o *GetMe200Response) SetPlanFlags(v map[string]interface{})`

SetPlanFlags sets PlanFlags field to given value.

### HasPlanFlags

`func (o *GetMe200Response) HasPlanFlags() bool`

HasPlanFlags returns a boolean if a field has been set.

### GetFlags

`func (o *GetMe200Response) GetFlags() []GetMe200ResponseFlagsInner`

GetFlags returns the Flags field if non-nil, zero value otherwise.

### GetFlagsOk

`func (o *GetMe200Response) GetFlagsOk() (*[]GetMe200ResponseFlagsInner, bool)`

GetFlagsOk returns a tuple with the Flags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFlags

`func (o *GetMe200Response) SetFlags(v []GetMe200ResponseFlagsInner)`

SetFlags sets Flags field to given value.

### HasFlags

`func (o *GetMe200Response) HasFlags() bool`

HasFlags returns a boolean if a field has been set.

### GetRole

`func (o *GetMe200Response) GetRole() GetMe200ResponseRole`

GetRole returns the Role field if non-nil, zero value otherwise.

### GetRoleOk

`func (o *GetMe200Response) GetRoleOk() (*GetMe200ResponseRole, bool)`

GetRoleOk returns a tuple with the Role field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRole

`func (o *GetMe200Response) SetRole(v GetMe200ResponseRole)`

SetRole sets Role field to given value.

### HasRole

`func (o *GetMe200Response) HasRole() bool`

HasRole returns a boolean if a field has been set.

### GetCallLogSyncDate

`func (o *GetMe200Response) GetCallLogSyncDate() time.Time`

GetCallLogSyncDate returns the CallLogSyncDate field if non-nil, zero value otherwise.

### GetCallLogSyncDateOk

`func (o *GetMe200Response) GetCallLogSyncDateOk() (*time.Time, bool)`

GetCallLogSyncDateOk returns a tuple with the CallLogSyncDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCallLogSyncDate

`func (o *GetMe200Response) SetCallLogSyncDate(v time.Time)`

SetCallLogSyncDate sets CallLogSyncDate field to given value.

### HasCallLogSyncDate

`func (o *GetMe200Response) HasCallLogSyncDate() bool`

HasCallLogSyncDate returns a boolean if a field has been set.

### GetTwoFaEnabled

`func (o *GetMe200Response) GetTwoFaEnabled() bool`

GetTwoFaEnabled returns the TwoFaEnabled field if non-nil, zero value otherwise.

### GetTwoFaEnabledOk

`func (o *GetMe200Response) GetTwoFaEnabledOk() (*bool, bool)`

GetTwoFaEnabledOk returns a tuple with the TwoFaEnabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTwoFaEnabled

`func (o *GetMe200Response) SetTwoFaEnabled(v bool)`

SetTwoFaEnabled sets TwoFaEnabled field to given value.

### HasTwoFaEnabled

`func (o *GetMe200Response) HasTwoFaEnabled() bool`

HasTwoFaEnabled returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


