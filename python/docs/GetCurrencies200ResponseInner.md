# GetCurrencies200ResponseInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **float** |  | [optional] 
**iso** | **str** |  | [optional] 
**html** | **str** |  | [optional] 

## Example

```python
from salesflare.models.get_currencies200_response_inner import GetCurrencies200ResponseInner

# TODO update the JSON string below
json = "{}"
# create an instance of GetCurrencies200ResponseInner from a JSON string
get_currencies200_response_inner_instance = GetCurrencies200ResponseInner.from_json(json)
# print the JSON string representation of the object
print(GetCurrencies200ResponseInner.to_json())

# convert the object into a dict
get_currencies200_response_inner_dict = get_currencies200_response_inner_instance.to_dict()
# create an instance of GetCurrencies200ResponseInner from a dict
get_currencies200_response_inner_from_dict = GetCurrencies200ResponseInner.from_dict(get_currencies200_response_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


