# coding: utf-8

"""
    Salesflare API

    # Introduction  ## Getting Started  The Salesflare API allows you to access and build your own applications or integrations that interact with Salesflare.  The Salesflare API provides a RESTful interface with JSON-formatted responses to access most Salesflare resources.  ## Authentication  The Salesflare API uses bearer token based authentication, which means you need to use the key-value pair \"Authorization : Bearer APIKEY\" in the header to authenticate.  You can make an API key in [\"Settings\" > \"API keys\"](https://app.salesflare.com/#/settings/apikeys).  Click on the large orange \"+\" button on the bottom right of the screen to create an API key.  ![Screenshot API Key Settings](https://lib.salesflare.com/api_docs/screenshot_settings_apikeys.png)  ## Requests  All requests must be sent using HTTPS with TLS 1.2 or higher. Please make sure your developer tools support this version of TLS as older versions or SSL are not supported for security reasons.  For PUT or POST requests (e.g. create, update), the payload must be provided as JSON in the request body.  ## Responses  Responses use HTTP status codes, with the most typical ones being:  | Code                   | Meaning               | |------------------------|-----------------------| | Successful Responses                           | | 200                    | OK                    | | Error Responses                                | | 400                    | Bad Request           | | 401                    | Unauthorized          | | 404                    | Not Found             | | 429                    | Too Many Requests     | | 500                    | Internal Server Error |  ## Testing  We recommend testing our API with Postman.  ### Download specification  Our API is documented following the OpenAPI specification. You can download it [here](https://api.salesflare.com/openapi.json)  ### Import in Postman  To import the collection, open Postman and click Import, then select \"Import From Link\"  Copy & Paste the following link and press the \"Import\" button:  > https://api.salesflare.com/openapi.json  ![Screenshot Postman Import](https://lib.salesflare.com/api_docs/screenshot_postman_import.png)  ## Support  For API questions and support, please email support@salesflare.com or click the chat bubble below.

    The version of the OpenAPI document: 1.0.0
    Contact: support@salesflare.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from datetime import datetime
from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictFloat, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional, Union
from typing_extensions import Annotated
from salesflare.models.post_contacts_request_inner_address import PostContactsRequestInnerAddress
from salesflare.models.post_contacts_request_inner_phone_numbers_inner import PostContactsRequestInnerPhoneNumbersInner
from salesflare.models.post_contacts_request_inner_position import PostContactsRequestInnerPosition
from typing import Optional, Set
from typing_extensions import Self

class PostContactsRequestInner(BaseModel):
    """
    PostContactsRequestInner
    """ # noqa: E501
    owner: Optional[Union[StrictFloat, StrictInt]] = None
    email: Optional[Annotated[str, Field(strict=True, max_length=1000)]] = None
    prefix: Optional[StrictStr] = None
    firstname: Optional[StrictStr] = None
    middle: Optional[StrictStr] = None
    lastname: Optional[StrictStr] = None
    suffix: Optional[StrictStr] = None
    name: Optional[StrictStr] = None
    picture: Optional[Annotated[str, Field(strict=True, max_length=500)]] = None
    account: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Any existing account will be removed from the contact when specifically passing `null`!")
    birth_date: Optional[datetime] = None
    opt_out: Optional[StrictBool] = Field(default=None, alias="opt-out")
    opt_out_date: Optional[datetime] = Field(default=None, alias="opt-out_date")
    opt_out_campaign: Optional[StrictStr] = Field(default=None, alias="opt-out_campaign")
    bounced: Optional[StrictBool] = None
    bounced_date: Optional[datetime] = None
    files: Optional[List[Dict[str, Any]]] = None
    tags: Optional[List[StrictStr]] = None
    address: Optional[PostContactsRequestInnerAddress] = None
    addresses: Optional[List[PostContactsRequestInnerAddress]] = None
    phone_number: Optional[StrictStr] = None
    mobile_phone_number: Optional[StrictStr] = None
    home_phone_number: Optional[StrictStr] = None
    fax_number: Optional[StrictStr] = None
    phone_numbers: Optional[List[PostContactsRequestInnerPhoneNumbersInner]] = None
    position: Optional[PostContactsRequestInnerPosition] = None
    positions: Optional[List[PostContactsRequestInnerPosition]] = None
    social_profiles: Optional[List[StrictStr]] = None
    custom: Optional[Dict[str, Any]] = None
    __properties: ClassVar[List[str]] = ["owner", "email", "prefix", "firstname", "middle", "lastname", "suffix", "name", "picture", "account", "birth_date", "opt-out", "opt-out_date", "opt-out_campaign", "bounced", "bounced_date", "files", "tags", "address", "addresses", "phone_number", "mobile_phone_number", "home_phone_number", "fax_number", "phone_numbers", "position", "positions", "social_profiles", "custom"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of PostContactsRequestInner from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of address
        if self.address:
            _dict['address'] = self.address.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in addresses (list)
        _items = []
        if self.addresses:
            for _item in self.addresses:
                if _item:
                    _items.append(_item.to_dict())
            _dict['addresses'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in phone_numbers (list)
        _items = []
        if self.phone_numbers:
            for _item in self.phone_numbers:
                if _item:
                    _items.append(_item.to_dict())
            _dict['phone_numbers'] = _items
        # override the default output from pydantic by calling `to_dict()` of position
        if self.position:
            _dict['position'] = self.position.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in positions (list)
        _items = []
        if self.positions:
            for _item in self.positions:
                if _item:
                    _items.append(_item.to_dict())
            _dict['positions'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of PostContactsRequestInner from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "owner": obj.get("owner"),
            "email": obj.get("email"),
            "prefix": obj.get("prefix"),
            "firstname": obj.get("firstname"),
            "middle": obj.get("middle"),
            "lastname": obj.get("lastname"),
            "suffix": obj.get("suffix"),
            "name": obj.get("name"),
            "picture": obj.get("picture"),
            "account": obj.get("account"),
            "birth_date": obj.get("birth_date"),
            "opt-out": obj.get("opt-out"),
            "opt-out_date": obj.get("opt-out_date"),
            "opt-out_campaign": obj.get("opt-out_campaign"),
            "bounced": obj.get("bounced"),
            "bounced_date": obj.get("bounced_date"),
            "files": obj.get("files"),
            "tags": obj.get("tags"),
            "address": PostContactsRequestInnerAddress.from_dict(obj["address"]) if obj.get("address") is not None else None,
            "addresses": [PostContactsRequestInnerAddress.from_dict(_item) for _item in obj["addresses"]] if obj.get("addresses") is not None else None,
            "phone_number": obj.get("phone_number"),
            "mobile_phone_number": obj.get("mobile_phone_number"),
            "home_phone_number": obj.get("home_phone_number"),
            "fax_number": obj.get("fax_number"),
            "phone_numbers": [PostContactsRequestInnerPhoneNumbersInner.from_dict(_item) for _item in obj["phone_numbers"]] if obj.get("phone_numbers") is not None else None,
            "position": PostContactsRequestInnerPosition.from_dict(obj["position"]) if obj.get("position") is not None else None,
            "positions": [PostContactsRequestInnerPosition.from_dict(_item) for _item in obj["positions"]] if obj.get("positions") is not None else None,
            "social_profiles": obj.get("social_profiles"),
            "custom": obj.get("custom")
        })
        return _obj


