# GetMe200ResponseTeam

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **float32** |  | [optional] 
**Name** | Pointer to **string** |  | [optional] 
**TrackingToken** | Pointer to **string** |  | [optional] 
**DaysUntilAccountInactive** | Pointer to **float32** |  | [optional] 
**TotalUserCount** | Pointer to **float32** |  | [optional] 
**EnabledUserCount** | Pointer to **float32** |  | [optional] 
**PaidUserCount** | Pointer to **float32** |  | [optional] 
**FreeUsers** | Pointer to **float32** |  | [optional] 
**Subscribed** | Pointer to **bool** |  | [optional] 
**PaymentType** | Pointer to **string** |  | [optional] 
**DiscountCode** | Pointer to **string** |  | [optional] 
**DiscountType** | Pointer to **string** |  | [optional] 
**PromoDescription** | Pointer to **string** |  | [optional] 
**PromoRedeemBy** | Pointer to **time.Time** |  | [optional] 
**PromoCode** | Pointer to **string** |  | [optional] 
**Plan** | Pointer to **float32** |  | [optional] 
**Currency** | Pointer to [**GetMe200ResponseTeamCurrency**](GetMe200ResponseTeamCurrency.md) |  | [optional] 
**BillingCurrency** | Pointer to [**GetMe200ResponseTeamCurrency**](GetMe200ResponseTeamCurrency.md) |  | [optional] 
**BillingFrequency** | Pointer to **string** |  | [optional] 
**CreationDate** | Pointer to **time.Time** |  | [optional] 
**TimeZone** | Pointer to **string** |  | [optional] 
**StripeCustomerId** | Pointer to **string** |  | [optional] 
**Campaign** | Pointer to **string** |  | [optional] 
**IsReferred** | Pointer to **bool** |  | [optional] 
**CreditUsage** | Pointer to **float32** |  | [optional] 
**CreditQuota** | Pointer to **float32** |  | [optional] 
**CreditPackage** | Pointer to **string** |  | [optional] 
**EmailTrackingSubdomain** | Pointer to **string** |  | [optional] 
**EmailTrackingDomain** | Pointer to [**GetMe200ResponseTeamEmailTrackingDomain**](GetMe200ResponseTeamEmailTrackingDomain.md) |  | [optional] 
**AutomatedTagging** | Pointer to **bool** |  | [optional] 
**Domain** | Pointer to **string** |  | [optional] 

## Methods

### NewGetMe200ResponseTeam

`func NewGetMe200ResponseTeam() *GetMe200ResponseTeam`

NewGetMe200ResponseTeam instantiates a new GetMe200ResponseTeam object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetMe200ResponseTeamWithDefaults

`func NewGetMe200ResponseTeamWithDefaults() *GetMe200ResponseTeam`

NewGetMe200ResponseTeamWithDefaults instantiates a new GetMe200ResponseTeam object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *GetMe200ResponseTeam) GetId() float32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *GetMe200ResponseTeam) GetIdOk() (*float32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *GetMe200ResponseTeam) SetId(v float32)`

SetId sets Id field to given value.

### HasId

`func (o *GetMe200ResponseTeam) HasId() bool`

HasId returns a boolean if a field has been set.

### GetName

`func (o *GetMe200ResponseTeam) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *GetMe200ResponseTeam) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *GetMe200ResponseTeam) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *GetMe200ResponseTeam) HasName() bool`

HasName returns a boolean if a field has been set.

### GetTrackingToken

`func (o *GetMe200ResponseTeam) GetTrackingToken() string`

GetTrackingToken returns the TrackingToken field if non-nil, zero value otherwise.

### GetTrackingTokenOk

`func (o *GetMe200ResponseTeam) GetTrackingTokenOk() (*string, bool)`

GetTrackingTokenOk returns a tuple with the TrackingToken field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrackingToken

`func (o *GetMe200ResponseTeam) SetTrackingToken(v string)`

SetTrackingToken sets TrackingToken field to given value.

### HasTrackingToken

`func (o *GetMe200ResponseTeam) HasTrackingToken() bool`

HasTrackingToken returns a boolean if a field has been set.

### GetDaysUntilAccountInactive

`func (o *GetMe200ResponseTeam) GetDaysUntilAccountInactive() float32`

GetDaysUntilAccountInactive returns the DaysUntilAccountInactive field if non-nil, zero value otherwise.

### GetDaysUntilAccountInactiveOk

`func (o *GetMe200ResponseTeam) GetDaysUntilAccountInactiveOk() (*float32, bool)`

GetDaysUntilAccountInactiveOk returns a tuple with the DaysUntilAccountInactive field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDaysUntilAccountInactive

`func (o *GetMe200ResponseTeam) SetDaysUntilAccountInactive(v float32)`

SetDaysUntilAccountInactive sets DaysUntilAccountInactive field to given value.

### HasDaysUntilAccountInactive

`func (o *GetMe200ResponseTeam) HasDaysUntilAccountInactive() bool`

HasDaysUntilAccountInactive returns a boolean if a field has been set.

### GetTotalUserCount

`func (o *GetMe200ResponseTeam) GetTotalUserCount() float32`

GetTotalUserCount returns the TotalUserCount field if non-nil, zero value otherwise.

### GetTotalUserCountOk

`func (o *GetMe200ResponseTeam) GetTotalUserCountOk() (*float32, bool)`

GetTotalUserCountOk returns a tuple with the TotalUserCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalUserCount

`func (o *GetMe200ResponseTeam) SetTotalUserCount(v float32)`

SetTotalUserCount sets TotalUserCount field to given value.

### HasTotalUserCount

`func (o *GetMe200ResponseTeam) HasTotalUserCount() bool`

HasTotalUserCount returns a boolean if a field has been set.

### GetEnabledUserCount

`func (o *GetMe200ResponseTeam) GetEnabledUserCount() float32`

GetEnabledUserCount returns the EnabledUserCount field if non-nil, zero value otherwise.

### GetEnabledUserCountOk

`func (o *GetMe200ResponseTeam) GetEnabledUserCountOk() (*float32, bool)`

GetEnabledUserCountOk returns a tuple with the EnabledUserCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnabledUserCount

`func (o *GetMe200ResponseTeam) SetEnabledUserCount(v float32)`

SetEnabledUserCount sets EnabledUserCount field to given value.

### HasEnabledUserCount

`func (o *GetMe200ResponseTeam) HasEnabledUserCount() bool`

HasEnabledUserCount returns a boolean if a field has been set.

### GetPaidUserCount

`func (o *GetMe200ResponseTeam) GetPaidUserCount() float32`

GetPaidUserCount returns the PaidUserCount field if non-nil, zero value otherwise.

### GetPaidUserCountOk

`func (o *GetMe200ResponseTeam) GetPaidUserCountOk() (*float32, bool)`

GetPaidUserCountOk returns a tuple with the PaidUserCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaidUserCount

`func (o *GetMe200ResponseTeam) SetPaidUserCount(v float32)`

SetPaidUserCount sets PaidUserCount field to given value.

### HasPaidUserCount

`func (o *GetMe200ResponseTeam) HasPaidUserCount() bool`

HasPaidUserCount returns a boolean if a field has been set.

### GetFreeUsers

`func (o *GetMe200ResponseTeam) GetFreeUsers() float32`

GetFreeUsers returns the FreeUsers field if non-nil, zero value otherwise.

### GetFreeUsersOk

`func (o *GetMe200ResponseTeam) GetFreeUsersOk() (*float32, bool)`

GetFreeUsersOk returns a tuple with the FreeUsers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFreeUsers

`func (o *GetMe200ResponseTeam) SetFreeUsers(v float32)`

SetFreeUsers sets FreeUsers field to given value.

### HasFreeUsers

`func (o *GetMe200ResponseTeam) HasFreeUsers() bool`

HasFreeUsers returns a boolean if a field has been set.

### GetSubscribed

`func (o *GetMe200ResponseTeam) GetSubscribed() bool`

GetSubscribed returns the Subscribed field if non-nil, zero value otherwise.

### GetSubscribedOk

`func (o *GetMe200ResponseTeam) GetSubscribedOk() (*bool, bool)`

GetSubscribedOk returns a tuple with the Subscribed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubscribed

`func (o *GetMe200ResponseTeam) SetSubscribed(v bool)`

SetSubscribed sets Subscribed field to given value.

### HasSubscribed

`func (o *GetMe200ResponseTeam) HasSubscribed() bool`

HasSubscribed returns a boolean if a field has been set.

### GetPaymentType

`func (o *GetMe200ResponseTeam) GetPaymentType() string`

GetPaymentType returns the PaymentType field if non-nil, zero value otherwise.

### GetPaymentTypeOk

`func (o *GetMe200ResponseTeam) GetPaymentTypeOk() (*string, bool)`

GetPaymentTypeOk returns a tuple with the PaymentType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentType

`func (o *GetMe200ResponseTeam) SetPaymentType(v string)`

SetPaymentType sets PaymentType field to given value.

### HasPaymentType

`func (o *GetMe200ResponseTeam) HasPaymentType() bool`

HasPaymentType returns a boolean if a field has been set.

### GetDiscountCode

`func (o *GetMe200ResponseTeam) GetDiscountCode() string`

GetDiscountCode returns the DiscountCode field if non-nil, zero value otherwise.

### GetDiscountCodeOk

`func (o *GetMe200ResponseTeam) GetDiscountCodeOk() (*string, bool)`

GetDiscountCodeOk returns a tuple with the DiscountCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDiscountCode

`func (o *GetMe200ResponseTeam) SetDiscountCode(v string)`

SetDiscountCode sets DiscountCode field to given value.

### HasDiscountCode

`func (o *GetMe200ResponseTeam) HasDiscountCode() bool`

HasDiscountCode returns a boolean if a field has been set.

### GetDiscountType

`func (o *GetMe200ResponseTeam) GetDiscountType() string`

GetDiscountType returns the DiscountType field if non-nil, zero value otherwise.

### GetDiscountTypeOk

`func (o *GetMe200ResponseTeam) GetDiscountTypeOk() (*string, bool)`

GetDiscountTypeOk returns a tuple with the DiscountType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDiscountType

`func (o *GetMe200ResponseTeam) SetDiscountType(v string)`

SetDiscountType sets DiscountType field to given value.

### HasDiscountType

`func (o *GetMe200ResponseTeam) HasDiscountType() bool`

HasDiscountType returns a boolean if a field has been set.

### GetPromoDescription

`func (o *GetMe200ResponseTeam) GetPromoDescription() string`

GetPromoDescription returns the PromoDescription field if non-nil, zero value otherwise.

### GetPromoDescriptionOk

`func (o *GetMe200ResponseTeam) GetPromoDescriptionOk() (*string, bool)`

GetPromoDescriptionOk returns a tuple with the PromoDescription field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromoDescription

`func (o *GetMe200ResponseTeam) SetPromoDescription(v string)`

SetPromoDescription sets PromoDescription field to given value.

### HasPromoDescription

`func (o *GetMe200ResponseTeam) HasPromoDescription() bool`

HasPromoDescription returns a boolean if a field has been set.

### GetPromoRedeemBy

`func (o *GetMe200ResponseTeam) GetPromoRedeemBy() time.Time`

GetPromoRedeemBy returns the PromoRedeemBy field if non-nil, zero value otherwise.

### GetPromoRedeemByOk

`func (o *GetMe200ResponseTeam) GetPromoRedeemByOk() (*time.Time, bool)`

GetPromoRedeemByOk returns a tuple with the PromoRedeemBy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromoRedeemBy

`func (o *GetMe200ResponseTeam) SetPromoRedeemBy(v time.Time)`

SetPromoRedeemBy sets PromoRedeemBy field to given value.

### HasPromoRedeemBy

`func (o *GetMe200ResponseTeam) HasPromoRedeemBy() bool`

HasPromoRedeemBy returns a boolean if a field has been set.

### GetPromoCode

`func (o *GetMe200ResponseTeam) GetPromoCode() string`

GetPromoCode returns the PromoCode field if non-nil, zero value otherwise.

### GetPromoCodeOk

`func (o *GetMe200ResponseTeam) GetPromoCodeOk() (*string, bool)`

GetPromoCodeOk returns a tuple with the PromoCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromoCode

`func (o *GetMe200ResponseTeam) SetPromoCode(v string)`

SetPromoCode sets PromoCode field to given value.

### HasPromoCode

`func (o *GetMe200ResponseTeam) HasPromoCode() bool`

HasPromoCode returns a boolean if a field has been set.

### GetPlan

`func (o *GetMe200ResponseTeam) GetPlan() float32`

GetPlan returns the Plan field if non-nil, zero value otherwise.

### GetPlanOk

`func (o *GetMe200ResponseTeam) GetPlanOk() (*float32, bool)`

GetPlanOk returns a tuple with the Plan field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlan

`func (o *GetMe200ResponseTeam) SetPlan(v float32)`

SetPlan sets Plan field to given value.

### HasPlan

`func (o *GetMe200ResponseTeam) HasPlan() bool`

HasPlan returns a boolean if a field has been set.

### GetCurrency

`func (o *GetMe200ResponseTeam) GetCurrency() GetMe200ResponseTeamCurrency`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *GetMe200ResponseTeam) GetCurrencyOk() (*GetMe200ResponseTeamCurrency, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *GetMe200ResponseTeam) SetCurrency(v GetMe200ResponseTeamCurrency)`

SetCurrency sets Currency field to given value.

### HasCurrency

`func (o *GetMe200ResponseTeam) HasCurrency() bool`

HasCurrency returns a boolean if a field has been set.

### GetBillingCurrency

`func (o *GetMe200ResponseTeam) GetBillingCurrency() GetMe200ResponseTeamCurrency`

GetBillingCurrency returns the BillingCurrency field if non-nil, zero value otherwise.

### GetBillingCurrencyOk

`func (o *GetMe200ResponseTeam) GetBillingCurrencyOk() (*GetMe200ResponseTeamCurrency, bool)`

GetBillingCurrencyOk returns a tuple with the BillingCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBillingCurrency

`func (o *GetMe200ResponseTeam) SetBillingCurrency(v GetMe200ResponseTeamCurrency)`

SetBillingCurrency sets BillingCurrency field to given value.

### HasBillingCurrency

`func (o *GetMe200ResponseTeam) HasBillingCurrency() bool`

HasBillingCurrency returns a boolean if a field has been set.

### GetBillingFrequency

`func (o *GetMe200ResponseTeam) GetBillingFrequency() string`

GetBillingFrequency returns the BillingFrequency field if non-nil, zero value otherwise.

### GetBillingFrequencyOk

`func (o *GetMe200ResponseTeam) GetBillingFrequencyOk() (*string, bool)`

GetBillingFrequencyOk returns a tuple with the BillingFrequency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBillingFrequency

`func (o *GetMe200ResponseTeam) SetBillingFrequency(v string)`

SetBillingFrequency sets BillingFrequency field to given value.

### HasBillingFrequency

`func (o *GetMe200ResponseTeam) HasBillingFrequency() bool`

HasBillingFrequency returns a boolean if a field has been set.

### GetCreationDate

`func (o *GetMe200ResponseTeam) GetCreationDate() time.Time`

GetCreationDate returns the CreationDate field if non-nil, zero value otherwise.

### GetCreationDateOk

`func (o *GetMe200ResponseTeam) GetCreationDateOk() (*time.Time, bool)`

GetCreationDateOk returns a tuple with the CreationDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreationDate

`func (o *GetMe200ResponseTeam) SetCreationDate(v time.Time)`

SetCreationDate sets CreationDate field to given value.

### HasCreationDate

`func (o *GetMe200ResponseTeam) HasCreationDate() bool`

HasCreationDate returns a boolean if a field has been set.

### GetTimeZone

`func (o *GetMe200ResponseTeam) GetTimeZone() string`

GetTimeZone returns the TimeZone field if non-nil, zero value otherwise.

### GetTimeZoneOk

`func (o *GetMe200ResponseTeam) GetTimeZoneOk() (*string, bool)`

GetTimeZoneOk returns a tuple with the TimeZone field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeZone

`func (o *GetMe200ResponseTeam) SetTimeZone(v string)`

SetTimeZone sets TimeZone field to given value.

### HasTimeZone

`func (o *GetMe200ResponseTeam) HasTimeZone() bool`

HasTimeZone returns a boolean if a field has been set.

### GetStripeCustomerId

`func (o *GetMe200ResponseTeam) GetStripeCustomerId() string`

GetStripeCustomerId returns the StripeCustomerId field if non-nil, zero value otherwise.

### GetStripeCustomerIdOk

`func (o *GetMe200ResponseTeam) GetStripeCustomerIdOk() (*string, bool)`

GetStripeCustomerIdOk returns a tuple with the StripeCustomerId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStripeCustomerId

`func (o *GetMe200ResponseTeam) SetStripeCustomerId(v string)`

SetStripeCustomerId sets StripeCustomerId field to given value.

### HasStripeCustomerId

`func (o *GetMe200ResponseTeam) HasStripeCustomerId() bool`

HasStripeCustomerId returns a boolean if a field has been set.

### GetCampaign

`func (o *GetMe200ResponseTeam) GetCampaign() string`

GetCampaign returns the Campaign field if non-nil, zero value otherwise.

### GetCampaignOk

`func (o *GetMe200ResponseTeam) GetCampaignOk() (*string, bool)`

GetCampaignOk returns a tuple with the Campaign field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaign

`func (o *GetMe200ResponseTeam) SetCampaign(v string)`

SetCampaign sets Campaign field to given value.

### HasCampaign

`func (o *GetMe200ResponseTeam) HasCampaign() bool`

HasCampaign returns a boolean if a field has been set.

### GetIsReferred

`func (o *GetMe200ResponseTeam) GetIsReferred() bool`

GetIsReferred returns the IsReferred field if non-nil, zero value otherwise.

### GetIsReferredOk

`func (o *GetMe200ResponseTeam) GetIsReferredOk() (*bool, bool)`

GetIsReferredOk returns a tuple with the IsReferred field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsReferred

`func (o *GetMe200ResponseTeam) SetIsReferred(v bool)`

SetIsReferred sets IsReferred field to given value.

### HasIsReferred

`func (o *GetMe200ResponseTeam) HasIsReferred() bool`

HasIsReferred returns a boolean if a field has been set.

### GetCreditUsage

`func (o *GetMe200ResponseTeam) GetCreditUsage() float32`

GetCreditUsage returns the CreditUsage field if non-nil, zero value otherwise.

### GetCreditUsageOk

`func (o *GetMe200ResponseTeam) GetCreditUsageOk() (*float32, bool)`

GetCreditUsageOk returns a tuple with the CreditUsage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreditUsage

`func (o *GetMe200ResponseTeam) SetCreditUsage(v float32)`

SetCreditUsage sets CreditUsage field to given value.

### HasCreditUsage

`func (o *GetMe200ResponseTeam) HasCreditUsage() bool`

HasCreditUsage returns a boolean if a field has been set.

### GetCreditQuota

`func (o *GetMe200ResponseTeam) GetCreditQuota() float32`

GetCreditQuota returns the CreditQuota field if non-nil, zero value otherwise.

### GetCreditQuotaOk

`func (o *GetMe200ResponseTeam) GetCreditQuotaOk() (*float32, bool)`

GetCreditQuotaOk returns a tuple with the CreditQuota field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreditQuota

`func (o *GetMe200ResponseTeam) SetCreditQuota(v float32)`

SetCreditQuota sets CreditQuota field to given value.

### HasCreditQuota

`func (o *GetMe200ResponseTeam) HasCreditQuota() bool`

HasCreditQuota returns a boolean if a field has been set.

### GetCreditPackage

`func (o *GetMe200ResponseTeam) GetCreditPackage() string`

GetCreditPackage returns the CreditPackage field if non-nil, zero value otherwise.

### GetCreditPackageOk

`func (o *GetMe200ResponseTeam) GetCreditPackageOk() (*string, bool)`

GetCreditPackageOk returns a tuple with the CreditPackage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreditPackage

`func (o *GetMe200ResponseTeam) SetCreditPackage(v string)`

SetCreditPackage sets CreditPackage field to given value.

### HasCreditPackage

`func (o *GetMe200ResponseTeam) HasCreditPackage() bool`

HasCreditPackage returns a boolean if a field has been set.

### GetEmailTrackingSubdomain

`func (o *GetMe200ResponseTeam) GetEmailTrackingSubdomain() string`

GetEmailTrackingSubdomain returns the EmailTrackingSubdomain field if non-nil, zero value otherwise.

### GetEmailTrackingSubdomainOk

`func (o *GetMe200ResponseTeam) GetEmailTrackingSubdomainOk() (*string, bool)`

GetEmailTrackingSubdomainOk returns a tuple with the EmailTrackingSubdomain field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmailTrackingSubdomain

`func (o *GetMe200ResponseTeam) SetEmailTrackingSubdomain(v string)`

SetEmailTrackingSubdomain sets EmailTrackingSubdomain field to given value.

### HasEmailTrackingSubdomain

`func (o *GetMe200ResponseTeam) HasEmailTrackingSubdomain() bool`

HasEmailTrackingSubdomain returns a boolean if a field has been set.

### GetEmailTrackingDomain

`func (o *GetMe200ResponseTeam) GetEmailTrackingDomain() GetMe200ResponseTeamEmailTrackingDomain`

GetEmailTrackingDomain returns the EmailTrackingDomain field if non-nil, zero value otherwise.

### GetEmailTrackingDomainOk

`func (o *GetMe200ResponseTeam) GetEmailTrackingDomainOk() (*GetMe200ResponseTeamEmailTrackingDomain, bool)`

GetEmailTrackingDomainOk returns a tuple with the EmailTrackingDomain field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmailTrackingDomain

`func (o *GetMe200ResponseTeam) SetEmailTrackingDomain(v GetMe200ResponseTeamEmailTrackingDomain)`

SetEmailTrackingDomain sets EmailTrackingDomain field to given value.

### HasEmailTrackingDomain

`func (o *GetMe200ResponseTeam) HasEmailTrackingDomain() bool`

HasEmailTrackingDomain returns a boolean if a field has been set.

### GetAutomatedTagging

`func (o *GetMe200ResponseTeam) GetAutomatedTagging() bool`

GetAutomatedTagging returns the AutomatedTagging field if non-nil, zero value otherwise.

### GetAutomatedTaggingOk

`func (o *GetMe200ResponseTeam) GetAutomatedTaggingOk() (*bool, bool)`

GetAutomatedTaggingOk returns a tuple with the AutomatedTagging field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAutomatedTagging

`func (o *GetMe200ResponseTeam) SetAutomatedTagging(v bool)`

SetAutomatedTagging sets AutomatedTagging field to given value.

### HasAutomatedTagging

`func (o *GetMe200ResponseTeam) HasAutomatedTagging() bool`

HasAutomatedTagging returns a boolean if a field has been set.

### GetDomain

`func (o *GetMe200ResponseTeam) GetDomain() string`

GetDomain returns the Domain field if non-nil, zero value otherwise.

### GetDomainOk

`func (o *GetMe200ResponseTeam) GetDomainOk() (*string, bool)`

GetDomainOk returns a tuple with the Domain field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDomain

`func (o *GetMe200ResponseTeam) SetDomain(v string)`

SetDomain sets Domain field to given value.

### HasDomain

`func (o *GetMe200ResponseTeam) HasDomain() bool`

HasDomain returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


