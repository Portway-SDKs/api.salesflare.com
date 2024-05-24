# salesflare

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


## Installation & Usage

### Requirements

PHP 7.4 and later.
Should also work with PHP 8.0.

### Composer

To install the bindings via [Composer](https://getcomposer.org/), add the following to `composer.json`:

```json
{
  "repositories": [
    {
      "type": "vcs",
      "url": "https://github.com/GIT_USER_ID/GIT_REPO_ID.git"
    }
  ],
  "require": {
    "GIT_USER_ID/GIT_REPO_ID": "*@dev"
  }
}
```

Then run `composer install`

### Manual Installation

Download the files and include `autoload.php`:

```php
<?php
require_once('/path/to/salesflare/vendor/autoload.php');
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');




$apiInstance = new OpenAPI\Client\Api\ContactsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$id = array(3.4); // float[]
$name = 'name_example'; // string
$email = 'email_example'; // string
$phone_number = 'phone_number_example'; // string
$domain = 'domain_example'; // string
$modification_after = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime
$modification_before = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime
$creation_after = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime
$creation_before = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime
$account = array(3.4); // float[]
$tag = array(3.4); // float[]
$tag_name = array('tag_name_example'); // string[]
$position_role = array('position_role_example'); // string[]
$address_country = array('address_country_example'); // string[]
$address_state_region = array('address_state_region_example'); // string[]
$address_city = array('address_city_example'); // string[]
$include_archived = True; // bool
$search = 'search_example'; // string
$type = 'type_example'; // string
$limit = 20.0; // float
$offset = 0.0; // float
$custom = 'custom_example'; // string
$order_by = array('order_by_example'); // string[] | Can be just 'key' e.g. 'name' or 'key sortOrder' e.g. 'name desc'. Defaults to asc.
$q = 'q_example'; // string

try {
    $result = $apiInstance->getContacts($id, $name, $email, $phone_number, $domain, $modification_after, $modification_before, $creation_after, $creation_before, $account, $tag, $tag_name, $position_role, $address_country, $address_state_region, $address_city, $include_archived, $search, $type, $limit, $offset, $custom, $order_by, $q);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ContactsApi->getContacts: ', $e->getMessage(), PHP_EOL;
}

```

## API Endpoints

All URIs are relative to *https://api.salesflare.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ContactsApi* | [**getContacts**](docs/Api/ContactsApi.md#getcontacts) | **GET** /contacts | List contacts
*ContactsApi* | [**postContacts**](docs/Api/ContactsApi.md#postcontacts) | **POST** /contacts | Create a contact
*GroupsApi* | [**getGroups**](docs/Api/GroupsApi.md#getgroups) | **GET** /groups | List groups
*RegionalSettingsApi* | [**getCurrencies**](docs/Api/RegionalSettingsApi.md#getcurrencies) | **GET** /currencies | List supported currencies
*UsersApi* | [**getMe**](docs/Api/UsersApi.md#getme) | **GET** /me | Get current user&#39;s details
*WorkflowsApi* | [**putWorkflowsIdAudienceRecordId**](docs/Api/WorkflowsApi.md#putworkflowsidaudiencerecordid) | **PUT** /workflows/{id}/audience/{record_id} | Re-enter or exit an entity from a workflow

## Models

- [GetContacts200ResponseInner](docs/Model/GetContacts200ResponseInner.md)
- [GetContacts200ResponseInnerAccount](docs/Model/GetContacts200ResponseInnerAccount.md)
- [GetContacts200ResponseInnerAddressesInner](docs/Model/GetContacts200ResponseInnerAddressesInner.md)
- [GetContacts200ResponseInnerOwner](docs/Model/GetContacts200ResponseInnerOwner.md)
- [GetContacts200ResponseInnerPhoneNumbersInner](docs/Model/GetContacts200ResponseInnerPhoneNumbersInner.md)
- [GetContacts200ResponseInnerPositionsInner](docs/Model/GetContacts200ResponseInnerPositionsInner.md)
- [GetContacts200ResponseInnerSocialProfilesInner](docs/Model/GetContacts200ResponseInnerSocialProfilesInner.md)
- [GetContacts200ResponseInnerTagsInner](docs/Model/GetContacts200ResponseInnerTagsInner.md)
- [GetCurrencies200ResponseInner](docs/Model/GetCurrencies200ResponseInner.md)
- [GetMe200Response](docs/Model/GetMe200Response.md)
- [GetMe200ResponseDataSourcesInner](docs/Model/GetMe200ResponseDataSourcesInner.md)
- [GetMe200ResponseDataSourcesToReconnectInner](docs/Model/GetMe200ResponseDataSourcesToReconnectInner.md)
- [GetMe200ResponseFlagsInner](docs/Model/GetMe200ResponseFlagsInner.md)
- [GetMe200ResponsePhoneNumbersInner](docs/Model/GetMe200ResponsePhoneNumbersInner.md)
- [GetMe200ResponseRole](docs/Model/GetMe200ResponseRole.md)
- [GetMe200ResponseRolePermissions](docs/Model/GetMe200ResponseRolePermissions.md)
- [GetMe200ResponseSocialProfilesInner](docs/Model/GetMe200ResponseSocialProfilesInner.md)
- [GetMe200ResponseTeam](docs/Model/GetMe200ResponseTeam.md)
- [GetMe200ResponseTeamCurrency](docs/Model/GetMe200ResponseTeamCurrency.md)
- [GetMe200ResponseTeamEmailTrackingDomain](docs/Model/GetMe200ResponseTeamEmailTrackingDomain.md)
- [PostContacts200ResponseInner](docs/Model/PostContacts200ResponseInner.md)
- [PostContactsRequestInner](docs/Model/PostContactsRequestInner.md)
- [PostContactsRequestInnerAddress](docs/Model/PostContactsRequestInnerAddress.md)
- [PostContactsRequestInnerPhoneNumbersInner](docs/Model/PostContactsRequestInnerPhoneNumbersInner.md)
- [PostContactsRequestInnerPosition](docs/Model/PostContactsRequestInnerPosition.md)
- [PutWorkflowsIdAudienceRecordId200Response](docs/Model/PutWorkflowsIdAudienceRecordId200Response.md)
- [PutWorkflowsIdAudienceRecordIdRequest](docs/Model/PutWorkflowsIdAudienceRecordIdRequest.md)

## Authorization
Endpoints do not require authorization.

## Tests

To run the tests, use:

```bash
composer install
vendor/bin/phpunit
```

## Author

support@salesflare.com

## About this package

This PHP package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: `1.0.0`
    - Generator version: `7.6.0`
- Build package: `org.openapitools.codegen.languages.PhpClientCodegen`
