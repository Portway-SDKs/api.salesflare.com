

# GetMe200ResponseTeam


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **BigDecimal** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**trackingToken** | **String** |  |  [optional] |
|**daysUntilAccountInactive** | **BigDecimal** |  |  [optional] |
|**totalUserCount** | **BigDecimal** |  |  [optional] |
|**enabledUserCount** | **BigDecimal** |  |  [optional] |
|**paidUserCount** | **BigDecimal** |  |  [optional] |
|**freeUsers** | **BigDecimal** |  |  [optional] |
|**subscribed** | **Boolean** |  |  [optional] |
|**paymentType** | [**PaymentTypeEnum**](#PaymentTypeEnum) |  |  [optional] |
|**discountCode** | **String** |  |  [optional] |
|**discountType** | **String** |  |  [optional] |
|**promoDescription** | **String** |  |  [optional] |
|**promoRedeemBy** | **OffsetDateTime** |  |  [optional] |
|**promoCode** | **String** |  |  [optional] |
|**plan** | **BigDecimal** |  |  [optional] |
|**currency** | [**GetMe200ResponseTeamCurrency**](GetMe200ResponseTeamCurrency.md) |  |  [optional] |
|**billingCurrency** | [**GetMe200ResponseTeamCurrency**](GetMe200ResponseTeamCurrency.md) |  |  [optional] |
|**billingFrequency** | [**BillingFrequencyEnum**](#BillingFrequencyEnum) |  |  [optional] |
|**creationDate** | **OffsetDateTime** |  |  [optional] |
|**timeZone** | **String** |  |  [optional] |
|**stripeCustomerId** | **String** |  |  [optional] |
|**campaign** | **String** |  |  [optional] |
|**isReferred** | **Boolean** |  |  [optional] |
|**creditUsage** | **BigDecimal** |  |  [optional] |
|**creditQuota** | **BigDecimal** |  |  [optional] |
|**creditPackage** | [**CreditPackageEnum**](#CreditPackageEnum) |  |  [optional] |
|**emailTrackingSubdomain** | **String** |  |  [optional] |
|**emailTrackingDomain** | [**GetMe200ResponseTeamEmailTrackingDomain**](GetMe200ResponseTeamEmailTrackingDomain.md) |  |  [optional] |
|**automatedTagging** | **Boolean** |  |  [optional] |
|**domain** | **String** |  |  [optional] |



## Enum: PaymentTypeEnum

| Name | Value |
|---- | -----|
| STRIPE | &quot;stripe&quot; |
| FREE | &quot;free&quot; |
| APPSTACK | &quot;appstack&quot; |



## Enum: BillingFrequencyEnum

| Name | Value |
|---- | -----|
| MONTHLY | &quot;monthly&quot; |
| ANNUALLY | &quot;annually&quot; |



## Enum: CreditPackageEnum

| Name | Value |
|---- | -----|
| S | &quot;S&quot; |
| M | &quot;M&quot; |
| L | &quot;L&quot; |
| XL | &quot;XL&quot; |



