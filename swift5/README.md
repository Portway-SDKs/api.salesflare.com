# Swift5 API client for OpenAPIClient

# Introduction

## Getting Started

The Salesflare API allows you to access and build your own applications or integrations that interact with Salesflare.

The Salesflare API provides a RESTful interface with JSON-formatted responses to access most Salesflare resources.

## Authentication

The Salesflare API uses bearer token based authentication, which means you need to use the key-value pair \"Authorization : Bearer APIKEY\" in the header to authenticate.

You can make an API key in [\"Settings\" > \"API keys\"](https://app.salesflare.com/#/settings/apikeys).

Click on the large orange \"+\" button on the bottom right of the screen to create an API key.

![Screenshot API Key Settings](https://lib.salesflare.com/api_docs/screenshot_settings_apikeys.png)

## Requests

All requests must be sent using HTTPS with TLS 1.2 or higher. Please make sure your developer tools support this version of TLS as older versions or SSL are not supported for security reasons.

For PUT or POST requests (e.g. create, update), the payload must be provided as JSON in the request body.

## Responses

Responses use HTTP status codes, with the most typical ones being:

| Code                   | Meaning               |
|------------------------|-----------------------|
| Successful Responses                           |
| 200                    | OK                    |
| Error Responses                                |
| 400                    | Bad Request           |
| 401                    | Unauthorized          |
| 404                    | Not Found             |
| 429                    | Too Many Requests     |
| 500                    | Internal Server Error |

## Testing

We recommend testing our API with Postman.

### Download specification

Our API is documented following the OpenAPI specification. You can download it [here](https://api.salesflare.com/openapi.json)

### Import in Postman

To import the collection, open Postman and click Import, then select \"Import From Link\"

Copy & Paste the following link and press the \"Import\" button:

> https://api.salesflare.com/openapi.json

![Screenshot Postman Import](https://lib.salesflare.com/api_docs/screenshot_postman_import.png)

## Support

For API questions and support, please email support@salesflare.com or click the chat bubble below.

## Overview
This API client was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.  By using the [openapi-spec](https://github.com/OAI/OpenAPI-Specification) from a remote server, you can easily generate an API client.

- API version: 1.0.0
- Package version: 
- Generator version: 7.6.0
- Build package: org.openapitools.codegen.languages.Swift5ClientCodegen

## Installation

### Carthage

Run `carthage update`

### CocoaPods

Run `pod install`

## Documentation for API Endpoints

All URIs are relative to *https://api.salesflare.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ContactsAPI* | [**getContacts**](docs/ContactsAPI.md#getcontacts) | **GET** /contacts | List contacts
*ContactsAPI* | [**postContacts**](docs/ContactsAPI.md#postcontacts) | **POST** /contacts | Create a contact
*GroupsAPI* | [**getGroups**](docs/GroupsAPI.md#getgroups) | **GET** /groups | List groups
*RegionalSettingsAPI* | [**getCurrencies**](docs/RegionalSettingsAPI.md#getcurrencies) | **GET** /currencies | List supported currencies
*UsersAPI* | [**getMe**](docs/UsersAPI.md#getme) | **GET** /me | Get current user&#39;s details
*WorkflowsAPI* | [**putWorkflowsIdAudienceRecordId**](docs/WorkflowsAPI.md#putworkflowsidaudiencerecordid) | **PUT** /workflows/{id}/audience/{record_id} | Re-enter or exit an entity from a workflow


## Documentation For Models

 - [GetContacts200ResponseInner](docs/GetContacts200ResponseInner.md)
 - [GetContacts200ResponseInnerAccount](docs/GetContacts200ResponseInnerAccount.md)
 - [GetContacts200ResponseInnerAddressesInner](docs/GetContacts200ResponseInnerAddressesInner.md)
 - [GetContacts200ResponseInnerOwner](docs/GetContacts200ResponseInnerOwner.md)
 - [GetContacts200ResponseInnerPhoneNumbersInner](docs/GetContacts200ResponseInnerPhoneNumbersInner.md)
 - [GetContacts200ResponseInnerPositionsInner](docs/GetContacts200ResponseInnerPositionsInner.md)
 - [GetContacts200ResponseInnerSocialProfilesInner](docs/GetContacts200ResponseInnerSocialProfilesInner.md)
 - [GetContacts200ResponseInnerTagsInner](docs/GetContacts200ResponseInnerTagsInner.md)
 - [GetCurrencies200ResponseInner](docs/GetCurrencies200ResponseInner.md)
 - [GetMe200Response](docs/GetMe200Response.md)
 - [GetMe200ResponseDataSourcesInner](docs/GetMe200ResponseDataSourcesInner.md)
 - [GetMe200ResponseDataSourcesToReconnectInner](docs/GetMe200ResponseDataSourcesToReconnectInner.md)
 - [GetMe200ResponseFlagsInner](docs/GetMe200ResponseFlagsInner.md)
 - [GetMe200ResponsePhoneNumbersInner](docs/GetMe200ResponsePhoneNumbersInner.md)
 - [GetMe200ResponseRole](docs/GetMe200ResponseRole.md)
 - [GetMe200ResponseRolePermissions](docs/GetMe200ResponseRolePermissions.md)
 - [GetMe200ResponseSocialProfilesInner](docs/GetMe200ResponseSocialProfilesInner.md)
 - [GetMe200ResponseTeam](docs/GetMe200ResponseTeam.md)
 - [GetMe200ResponseTeamCurrency](docs/GetMe200ResponseTeamCurrency.md)
 - [GetMe200ResponseTeamEmailTrackingDomain](docs/GetMe200ResponseTeamEmailTrackingDomain.md)
 - [PostContacts200ResponseInner](docs/PostContacts200ResponseInner.md)
 - [PostContactsRequestInner](docs/PostContactsRequestInner.md)
 - [PostContactsRequestInnerAddress](docs/PostContactsRequestInnerAddress.md)
 - [PostContactsRequestInnerPhoneNumbersInner](docs/PostContactsRequestInnerPhoneNumbersInner.md)
 - [PostContactsRequestInnerPosition](docs/PostContactsRequestInnerPosition.md)
 - [PutWorkflowsIdAudienceRecordId200Response](docs/PutWorkflowsIdAudienceRecordId200Response.md)
 - [PutWorkflowsIdAudienceRecordIdRequest](docs/PutWorkflowsIdAudienceRecordIdRequest.md)


<a id="documentation-for-authorization"></a>
## Documentation For Authorization

Endpoints do not require authorization.


## Author

support@salesflare.com

