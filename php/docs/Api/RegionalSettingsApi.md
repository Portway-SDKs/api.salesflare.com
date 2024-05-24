# OpenAPI\Client\RegionalSettingsApi

All URIs are relative to https://api.salesflare.com, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getCurrencies()**](RegionalSettingsApi.md#getCurrencies) | **GET** /currencies | List supported currencies |


## `getCurrencies()`

```php
getCurrencies(): \OpenAPI\Client\Model\GetCurrencies200ResponseInner[]
```

List supported currencies

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\RegionalSettingsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->getCurrencies();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RegionalSettingsApi->getCurrencies: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**\OpenAPI\Client\Model\GetCurrencies200ResponseInner[]**](../Model/GetCurrencies200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `*/*`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
