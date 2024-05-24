# OpenAPI\Client\ContactsApi

All URIs are relative to https://api.salesflare.com, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getContacts()**](ContactsApi.md#getContacts) | **GET** /contacts | List contacts |
| [**postContacts()**](ContactsApi.md#postContacts) | **POST** /contacts | Create a contact |


## `getContacts()`

```php
getContacts($id, $name, $email, $phone_number, $domain, $modification_after, $modification_before, $creation_after, $creation_before, $account, $tag, $tag_name, $position_role, $address_country, $address_state_region, $address_city, $include_archived, $search, $type, $limit, $offset, $custom, $order_by, $q): \OpenAPI\Client\Model\GetContacts200ResponseInner[]
```

List contacts

### Example

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

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | [**float[]**](../Model/float.md)|  | [optional] |
| **name** | **string**|  | [optional] |
| **email** | **string**|  | [optional] |
| **phone_number** | **string**|  | [optional] |
| **domain** | **string**|  | [optional] |
| **modification_after** | **\DateTime**|  | [optional] |
| **modification_before** | **\DateTime**|  | [optional] |
| **creation_after** | **\DateTime**|  | [optional] |
| **creation_before** | **\DateTime**|  | [optional] |
| **account** | [**float[]**](../Model/float.md)|  | [optional] |
| **tag** | [**float[]**](../Model/float.md)|  | [optional] |
| **tag_name** | [**string[]**](../Model/string.md)|  | [optional] |
| **position_role** | [**string[]**](../Model/string.md)|  | [optional] |
| **address_country** | [**string[]**](../Model/string.md)|  | [optional] |
| **address_state_region** | [**string[]**](../Model/string.md)|  | [optional] |
| **address_city** | [**string[]**](../Model/string.md)|  | [optional] |
| **include_archived** | **bool**|  | [optional] |
| **search** | **string**|  | [optional] |
| **type** | **string**|  | [optional] |
| **limit** | **float**|  | [optional] [default to 20.0] |
| **offset** | **float**|  | [optional] [default to 0.0] |
| **custom** | **string**|  | [optional] |
| **order_by** | [**string[]**](../Model/string.md)| Can be just &#39;key&#39; e.g. &#39;name&#39; or &#39;key sortOrder&#39; e.g. &#39;name desc&#39;. Defaults to asc. | [optional] |
| **q** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\GetContacts200ResponseInner[]**](../Model/GetContacts200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `*/*`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `postContacts()`

```php
postContacts($force, $body): \OpenAPI\Client\Model\PostContacts200ResponseInner[]
```

Create a contact

When payload is an array you will get an array back, if just an object or an array with 1 item you get an object back

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\ContactsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$force = true; // bool | When force is false, the contact will not be created if a contact with the same email address used to exist.
$body = array(new \OpenAPI\Client\Model\PostContactsRequestInner()); // \OpenAPI\Client\Model\PostContactsRequestInner[]

try {
    $result = $apiInstance->postContacts($force, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ContactsApi->postContacts: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **force** | **bool**| When force is false, the contact will not be created if a contact with the same email address used to exist. | [optional] [default to true] |
| **body** | [**\OpenAPI\Client\Model\PostContactsRequestInner[]**](../Model/PostContactsRequestInner.md)|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\PostContacts200ResponseInner[]**](../Model/PostContacts200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `*/*`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
