

# PostContactsRequestInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**owner** | **BigDecimal** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**prefix** | **String** |  |  [optional] |
|**firstname** | **String** |  |  [optional] |
|**middle** | **String** |  |  [optional] |
|**lastname** | **String** |  |  [optional] |
|**suffix** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**picture** | **String** |  |  [optional] |
|**account** | **BigDecimal** | Any existing account will be removed from the contact when specifically passing &#x60;null&#x60;! |  [optional] |
|**birthDate** | **OffsetDateTime** |  |  [optional] |
|**optOut** | **Boolean** |  |  [optional] |
|**optOutDate** | **OffsetDateTime** |  |  [optional] |
|**optOutCampaign** | **String** |  |  [optional] |
|**bounced** | **Boolean** |  |  [optional] |
|**bouncedDate** | **OffsetDateTime** |  |  [optional] |
|**files** | **List&lt;Object&gt;** |  |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**address** | [**PostContactsRequestInnerAddress**](PostContactsRequestInnerAddress.md) |  |  [optional] |
|**addresses** | [**List&lt;PostContactsRequestInnerAddress&gt;**](PostContactsRequestInnerAddress.md) |  |  [optional] |
|**phoneNumber** | **String** |  |  [optional] |
|**mobilePhoneNumber** | **String** |  |  [optional] |
|**homePhoneNumber** | **String** |  |  [optional] |
|**faxNumber** | **String** |  |  [optional] |
|**phoneNumbers** | [**List&lt;PostContactsRequestInnerPhoneNumbersInner&gt;**](PostContactsRequestInnerPhoneNumbersInner.md) |  |  [optional] |
|**position** | [**PostContactsRequestInnerPosition**](PostContactsRequestInnerPosition.md) |  |  [optional] |
|**positions** | [**List&lt;PostContactsRequestInnerPosition&gt;**](PostContactsRequestInnerPosition.md) |  |  [optional] |
|**socialProfiles** | **List&lt;String&gt;** |  |  [optional] |
|**custom** | **Object** |  |  [optional] |



