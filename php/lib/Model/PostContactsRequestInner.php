<?php
/**
 * PostContactsRequestInner
 *
 * PHP version 7.4
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Salesflare API
 *
 * # Introduction  ## Getting Started  The Salesflare API allows you to access and build your own applications or integrations that interact with Salesflare.  The Salesflare API provides a RESTful interface with JSON-formatted responses to access most Salesflare resources.  ## Authentication  The Salesflare API uses bearer token based authentication, which means you need to use the key-value pair \"Authorization : Bearer APIKEY\" in the header to authenticate.  You can make an API key in [\"Settings\" > \"API keys\"](https://app.salesflare.com/#/settings/apikeys).  Click on the large orange \"+\" button on the bottom right of the screen to create an API key.  ![Screenshot API Key Settings](https://lib.salesflare.com/api_docs/screenshot_settings_apikeys.png)  ## Requests  All requests must be sent using HTTPS with TLS 1.2 or higher. Please make sure your developer tools support this version of TLS as older versions or SSL are not supported for security reasons.  For PUT or POST requests (e.g. create, update), the payload must be provided as JSON in the request body.  ## Responses  Responses use HTTP status codes, with the most typical ones being:  | Code                   | Meaning               | |------------------------|-----------------------| | Successful Responses                           | | 200                    | OK                    | | Error Responses                                | | 400                    | Bad Request           | | 401                    | Unauthorized          | | 404                    | Not Found             | | 429                    | Too Many Requests     | | 500                    | Internal Server Error |  ## Testing  We recommend testing our API with Postman.  ### Download specification  Our API is documented following the OpenAPI specification. You can download it [here](https://api.salesflare.com/openapi.json)  ### Import in Postman  To import the collection, open Postman and click Import, then select \"Import From Link\"  Copy & Paste the following link and press the \"Import\" button:  > https://api.salesflare.com/openapi.json  ![Screenshot Postman Import](https://lib.salesflare.com/api_docs/screenshot_postman_import.png)  ## Support  For API questions and support, please email support@salesflare.com or click the chat bubble below.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@salesflare.com
 * Generated by: https://openapi-generator.tech
 * Generator version: 7.6.0
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\Model;

use \ArrayAccess;
use \OpenAPI\Client\ObjectSerializer;

/**
 * PostContactsRequestInner Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class PostContactsRequestInner implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'postContacts_request_inner';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'owner' => 'float',
        'email' => 'string',
        'prefix' => 'string',
        'firstname' => 'string',
        'middle' => 'string',
        'lastname' => 'string',
        'suffix' => 'string',
        'name' => 'string',
        'picture' => 'string',
        'account' => 'float',
        'birth_date' => '\DateTime',
        'opt_out' => 'bool',
        'opt_out_date' => '\DateTime',
        'opt_out_campaign' => 'string',
        'bounced' => 'bool',
        'bounced_date' => '\DateTime',
        'files' => 'object[]',
        'tags' => 'string[]',
        'address' => '\OpenAPI\Client\Model\PostContactsRequestInnerAddress',
        'addresses' => '\OpenAPI\Client\Model\PostContactsRequestInnerAddress[]',
        'phone_number' => 'string',
        'mobile_phone_number' => 'string',
        'home_phone_number' => 'string',
        'fax_number' => 'string',
        'phone_numbers' => '\OpenAPI\Client\Model\PostContactsRequestInnerPhoneNumbersInner[]',
        'position' => '\OpenAPI\Client\Model\PostContactsRequestInnerPosition',
        'positions' => '\OpenAPI\Client\Model\PostContactsRequestInnerPosition[]',
        'social_profiles' => 'string[]',
        'custom' => 'object'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'owner' => null,
        'email' => null,
        'prefix' => null,
        'firstname' => null,
        'middle' => null,
        'lastname' => null,
        'suffix' => null,
        'name' => null,
        'picture' => null,
        'account' => null,
        'birth_date' => 'date-time',
        'opt_out' => null,
        'opt_out_date' => 'date-time',
        'opt_out_campaign' => null,
        'bounced' => null,
        'bounced_date' => 'date-time',
        'files' => null,
        'tags' => null,
        'address' => null,
        'addresses' => null,
        'phone_number' => null,
        'mobile_phone_number' => null,
        'home_phone_number' => null,
        'fax_number' => null,
        'phone_numbers' => null,
        'position' => null,
        'positions' => null,
        'social_profiles' => null,
        'custom' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'owner' => false,
        'email' => false,
        'prefix' => false,
        'firstname' => false,
        'middle' => false,
        'lastname' => false,
        'suffix' => false,
        'name' => false,
        'picture' => false,
        'account' => false,
        'birth_date' => false,
        'opt_out' => false,
        'opt_out_date' => false,
        'opt_out_campaign' => false,
        'bounced' => false,
        'bounced_date' => false,
        'files' => false,
        'tags' => false,
        'address' => false,
        'addresses' => false,
        'phone_number' => false,
        'mobile_phone_number' => false,
        'home_phone_number' => false,
        'fax_number' => false,
        'phone_numbers' => false,
        'position' => false,
        'positions' => false,
        'social_profiles' => false,
        'custom' => false
    ];

    /**
      * If a nullable field gets set to null, insert it here
      *
      * @var boolean[]
      */
    protected array $openAPINullablesSetToNull = [];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPITypes()
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPIFormats()
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of nullable properties
     *
     * @return array
     */
    protected static function openAPINullables(): array
    {
        return self::$openAPINullables;
    }

    /**
     * Array of nullable field names deliberately set to null
     *
     * @return boolean[]
     */
    private function getOpenAPINullablesSetToNull(): array
    {
        return $this->openAPINullablesSetToNull;
    }

    /**
     * Setter - Array of nullable field names deliberately set to null
     *
     * @param boolean[] $openAPINullablesSetToNull
     */
    private function setOpenAPINullablesSetToNull(array $openAPINullablesSetToNull): void
    {
        $this->openAPINullablesSetToNull = $openAPINullablesSetToNull;
    }

    /**
     * Checks if a property is nullable
     *
     * @param string $property
     * @return bool
     */
    public static function isNullable(string $property): bool
    {
        return self::openAPINullables()[$property] ?? false;
    }

    /**
     * Checks if a nullable property is set to null.
     *
     * @param string $property
     * @return bool
     */
    public function isNullableSetToNull(string $property): bool
    {
        return in_array($property, $this->getOpenAPINullablesSetToNull(), true);
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'owner' => 'owner',
        'email' => 'email',
        'prefix' => 'prefix',
        'firstname' => 'firstname',
        'middle' => 'middle',
        'lastname' => 'lastname',
        'suffix' => 'suffix',
        'name' => 'name',
        'picture' => 'picture',
        'account' => 'account',
        'birth_date' => 'birth_date',
        'opt_out' => 'opt-out',
        'opt_out_date' => 'opt-out_date',
        'opt_out_campaign' => 'opt-out_campaign',
        'bounced' => 'bounced',
        'bounced_date' => 'bounced_date',
        'files' => 'files',
        'tags' => 'tags',
        'address' => 'address',
        'addresses' => 'addresses',
        'phone_number' => 'phone_number',
        'mobile_phone_number' => 'mobile_phone_number',
        'home_phone_number' => 'home_phone_number',
        'fax_number' => 'fax_number',
        'phone_numbers' => 'phone_numbers',
        'position' => 'position',
        'positions' => 'positions',
        'social_profiles' => 'social_profiles',
        'custom' => 'custom'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'owner' => 'setOwner',
        'email' => 'setEmail',
        'prefix' => 'setPrefix',
        'firstname' => 'setFirstname',
        'middle' => 'setMiddle',
        'lastname' => 'setLastname',
        'suffix' => 'setSuffix',
        'name' => 'setName',
        'picture' => 'setPicture',
        'account' => 'setAccount',
        'birth_date' => 'setBirthDate',
        'opt_out' => 'setOptOut',
        'opt_out_date' => 'setOptOutDate',
        'opt_out_campaign' => 'setOptOutCampaign',
        'bounced' => 'setBounced',
        'bounced_date' => 'setBouncedDate',
        'files' => 'setFiles',
        'tags' => 'setTags',
        'address' => 'setAddress',
        'addresses' => 'setAddresses',
        'phone_number' => 'setPhoneNumber',
        'mobile_phone_number' => 'setMobilePhoneNumber',
        'home_phone_number' => 'setHomePhoneNumber',
        'fax_number' => 'setFaxNumber',
        'phone_numbers' => 'setPhoneNumbers',
        'position' => 'setPosition',
        'positions' => 'setPositions',
        'social_profiles' => 'setSocialProfiles',
        'custom' => 'setCustom'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'owner' => 'getOwner',
        'email' => 'getEmail',
        'prefix' => 'getPrefix',
        'firstname' => 'getFirstname',
        'middle' => 'getMiddle',
        'lastname' => 'getLastname',
        'suffix' => 'getSuffix',
        'name' => 'getName',
        'picture' => 'getPicture',
        'account' => 'getAccount',
        'birth_date' => 'getBirthDate',
        'opt_out' => 'getOptOut',
        'opt_out_date' => 'getOptOutDate',
        'opt_out_campaign' => 'getOptOutCampaign',
        'bounced' => 'getBounced',
        'bounced_date' => 'getBouncedDate',
        'files' => 'getFiles',
        'tags' => 'getTags',
        'address' => 'getAddress',
        'addresses' => 'getAddresses',
        'phone_number' => 'getPhoneNumber',
        'mobile_phone_number' => 'getMobilePhoneNumber',
        'home_phone_number' => 'getHomePhoneNumber',
        'fax_number' => 'getFaxNumber',
        'phone_numbers' => 'getPhoneNumbers',
        'position' => 'getPosition',
        'positions' => 'getPositions',
        'social_profiles' => 'getSocialProfiles',
        'custom' => 'getCustom'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$openAPIModelName;
    }


    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->setIfExists('owner', $data ?? [], null);
        $this->setIfExists('email', $data ?? [], null);
        $this->setIfExists('prefix', $data ?? [], null);
        $this->setIfExists('firstname', $data ?? [], null);
        $this->setIfExists('middle', $data ?? [], null);
        $this->setIfExists('lastname', $data ?? [], null);
        $this->setIfExists('suffix', $data ?? [], null);
        $this->setIfExists('name', $data ?? [], null);
        $this->setIfExists('picture', $data ?? [], null);
        $this->setIfExists('account', $data ?? [], null);
        $this->setIfExists('birth_date', $data ?? [], null);
        $this->setIfExists('opt_out', $data ?? [], null);
        $this->setIfExists('opt_out_date', $data ?? [], null);
        $this->setIfExists('opt_out_campaign', $data ?? [], null);
        $this->setIfExists('bounced', $data ?? [], null);
        $this->setIfExists('bounced_date', $data ?? [], null);
        $this->setIfExists('files', $data ?? [], null);
        $this->setIfExists('tags', $data ?? [], null);
        $this->setIfExists('address', $data ?? [], null);
        $this->setIfExists('addresses', $data ?? [], null);
        $this->setIfExists('phone_number', $data ?? [], null);
        $this->setIfExists('mobile_phone_number', $data ?? [], null);
        $this->setIfExists('home_phone_number', $data ?? [], null);
        $this->setIfExists('fax_number', $data ?? [], null);
        $this->setIfExists('phone_numbers', $data ?? [], null);
        $this->setIfExists('position', $data ?? [], null);
        $this->setIfExists('positions', $data ?? [], null);
        $this->setIfExists('social_profiles', $data ?? [], null);
        $this->setIfExists('custom', $data ?? [], null);
    }

    /**
    * Sets $this->container[$variableName] to the given data or to the given default Value; if $variableName
    * is nullable and its value is set to null in the $fields array, then mark it as "set to null" in the
    * $this->openAPINullablesSetToNull array
    *
    * @param string $variableName
    * @param array  $fields
    * @param mixed  $defaultValue
    */
    private function setIfExists(string $variableName, array $fields, $defaultValue): void
    {
        if (self::isNullable($variableName) && array_key_exists($variableName, $fields) && is_null($fields[$variableName])) {
            $this->openAPINullablesSetToNull[] = $variableName;
        }

        $this->container[$variableName] = $fields[$variableName] ?? $defaultValue;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if (!is_null($this->container['email']) && (mb_strlen($this->container['email']) > 1000)) {
            $invalidProperties[] = "invalid value for 'email', the character length must be smaller than or equal to 1000.";
        }

        if (!is_null($this->container['picture']) && (mb_strlen($this->container['picture']) > 500)) {
            $invalidProperties[] = "invalid value for 'picture', the character length must be smaller than or equal to 500.";
        }

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets owner
     *
     * @return float|null
     */
    public function getOwner()
    {
        return $this->container['owner'];
    }

    /**
     * Sets owner
     *
     * @param float|null $owner owner
     *
     * @return self
     */
    public function setOwner($owner)
    {
        if (is_null($owner)) {
            throw new \InvalidArgumentException('non-nullable owner cannot be null');
        }
        $this->container['owner'] = $owner;

        return $this;
    }

    /**
     * Gets email
     *
     * @return string|null
     */
    public function getEmail()
    {
        return $this->container['email'];
    }

    /**
     * Sets email
     *
     * @param string|null $email email
     *
     * @return self
     */
    public function setEmail($email)
    {
        if (is_null($email)) {
            throw new \InvalidArgumentException('non-nullable email cannot be null');
        }
        if ((mb_strlen($email) > 1000)) {
            throw new \InvalidArgumentException('invalid length for $email when calling PostContactsRequestInner., must be smaller than or equal to 1000.');
        }

        $this->container['email'] = $email;

        return $this;
    }

    /**
     * Gets prefix
     *
     * @return string|null
     */
    public function getPrefix()
    {
        return $this->container['prefix'];
    }

    /**
     * Sets prefix
     *
     * @param string|null $prefix prefix
     *
     * @return self
     */
    public function setPrefix($prefix)
    {
        if (is_null($prefix)) {
            throw new \InvalidArgumentException('non-nullable prefix cannot be null');
        }
        $this->container['prefix'] = $prefix;

        return $this;
    }

    /**
     * Gets firstname
     *
     * @return string|null
     */
    public function getFirstname()
    {
        return $this->container['firstname'];
    }

    /**
     * Sets firstname
     *
     * @param string|null $firstname firstname
     *
     * @return self
     */
    public function setFirstname($firstname)
    {
        if (is_null($firstname)) {
            throw new \InvalidArgumentException('non-nullable firstname cannot be null');
        }
        $this->container['firstname'] = $firstname;

        return $this;
    }

    /**
     * Gets middle
     *
     * @return string|null
     */
    public function getMiddle()
    {
        return $this->container['middle'];
    }

    /**
     * Sets middle
     *
     * @param string|null $middle middle
     *
     * @return self
     */
    public function setMiddle($middle)
    {
        if (is_null($middle)) {
            throw new \InvalidArgumentException('non-nullable middle cannot be null');
        }
        $this->container['middle'] = $middle;

        return $this;
    }

    /**
     * Gets lastname
     *
     * @return string|null
     */
    public function getLastname()
    {
        return $this->container['lastname'];
    }

    /**
     * Sets lastname
     *
     * @param string|null $lastname lastname
     *
     * @return self
     */
    public function setLastname($lastname)
    {
        if (is_null($lastname)) {
            throw new \InvalidArgumentException('non-nullable lastname cannot be null');
        }
        $this->container['lastname'] = $lastname;

        return $this;
    }

    /**
     * Gets suffix
     *
     * @return string|null
     */
    public function getSuffix()
    {
        return $this->container['suffix'];
    }

    /**
     * Sets suffix
     *
     * @param string|null $suffix suffix
     *
     * @return self
     */
    public function setSuffix($suffix)
    {
        if (is_null($suffix)) {
            throw new \InvalidArgumentException('non-nullable suffix cannot be null');
        }
        $this->container['suffix'] = $suffix;

        return $this;
    }

    /**
     * Gets name
     *
     * @return string|null
     */
    public function getName()
    {
        return $this->container['name'];
    }

    /**
     * Sets name
     *
     * @param string|null $name name
     *
     * @return self
     */
    public function setName($name)
    {
        if (is_null($name)) {
            throw new \InvalidArgumentException('non-nullable name cannot be null');
        }
        $this->container['name'] = $name;

        return $this;
    }

    /**
     * Gets picture
     *
     * @return string|null
     */
    public function getPicture()
    {
        return $this->container['picture'];
    }

    /**
     * Sets picture
     *
     * @param string|null $picture picture
     *
     * @return self
     */
    public function setPicture($picture)
    {
        if (is_null($picture)) {
            throw new \InvalidArgumentException('non-nullable picture cannot be null');
        }
        if ((mb_strlen($picture) > 500)) {
            throw new \InvalidArgumentException('invalid length for $picture when calling PostContactsRequestInner., must be smaller than or equal to 500.');
        }

        $this->container['picture'] = $picture;

        return $this;
    }

    /**
     * Gets account
     *
     * @return float|null
     */
    public function getAccount()
    {
        return $this->container['account'];
    }

    /**
     * Sets account
     *
     * @param float|null $account Any existing account will be removed from the contact when specifically passing `null`!
     *
     * @return self
     */
    public function setAccount($account)
    {
        if (is_null($account)) {
            throw new \InvalidArgumentException('non-nullable account cannot be null');
        }
        $this->container['account'] = $account;

        return $this;
    }

    /**
     * Gets birth_date
     *
     * @return \DateTime|null
     */
    public function getBirthDate()
    {
        return $this->container['birth_date'];
    }

    /**
     * Sets birth_date
     *
     * @param \DateTime|null $birth_date birth_date
     *
     * @return self
     */
    public function setBirthDate($birth_date)
    {
        if (is_null($birth_date)) {
            throw new \InvalidArgumentException('non-nullable birth_date cannot be null');
        }
        $this->container['birth_date'] = $birth_date;

        return $this;
    }

    /**
     * Gets opt_out
     *
     * @return bool|null
     */
    public function getOptOut()
    {
        return $this->container['opt_out'];
    }

    /**
     * Sets opt_out
     *
     * @param bool|null $opt_out opt_out
     *
     * @return self
     */
    public function setOptOut($opt_out)
    {
        if (is_null($opt_out)) {
            throw new \InvalidArgumentException('non-nullable opt_out cannot be null');
        }
        $this->container['opt_out'] = $opt_out;

        return $this;
    }

    /**
     * Gets opt_out_date
     *
     * @return \DateTime|null
     */
    public function getOptOutDate()
    {
        return $this->container['opt_out_date'];
    }

    /**
     * Sets opt_out_date
     *
     * @param \DateTime|null $opt_out_date opt_out_date
     *
     * @return self
     */
    public function setOptOutDate($opt_out_date)
    {
        if (is_null($opt_out_date)) {
            throw new \InvalidArgumentException('non-nullable opt_out_date cannot be null');
        }
        $this->container['opt_out_date'] = $opt_out_date;

        return $this;
    }

    /**
     * Gets opt_out_campaign
     *
     * @return string|null
     */
    public function getOptOutCampaign()
    {
        return $this->container['opt_out_campaign'];
    }

    /**
     * Sets opt_out_campaign
     *
     * @param string|null $opt_out_campaign opt_out_campaign
     *
     * @return self
     */
    public function setOptOutCampaign($opt_out_campaign)
    {
        if (is_null($opt_out_campaign)) {
            throw new \InvalidArgumentException('non-nullable opt_out_campaign cannot be null');
        }
        $this->container['opt_out_campaign'] = $opt_out_campaign;

        return $this;
    }

    /**
     * Gets bounced
     *
     * @return bool|null
     */
    public function getBounced()
    {
        return $this->container['bounced'];
    }

    /**
     * Sets bounced
     *
     * @param bool|null $bounced bounced
     *
     * @return self
     */
    public function setBounced($bounced)
    {
        if (is_null($bounced)) {
            throw new \InvalidArgumentException('non-nullable bounced cannot be null');
        }
        $this->container['bounced'] = $bounced;

        return $this;
    }

    /**
     * Gets bounced_date
     *
     * @return \DateTime|null
     */
    public function getBouncedDate()
    {
        return $this->container['bounced_date'];
    }

    /**
     * Sets bounced_date
     *
     * @param \DateTime|null $bounced_date bounced_date
     *
     * @return self
     */
    public function setBouncedDate($bounced_date)
    {
        if (is_null($bounced_date)) {
            throw new \InvalidArgumentException('non-nullable bounced_date cannot be null');
        }
        $this->container['bounced_date'] = $bounced_date;

        return $this;
    }

    /**
     * Gets files
     *
     * @return object[]|null
     */
    public function getFiles()
    {
        return $this->container['files'];
    }

    /**
     * Sets files
     *
     * @param object[]|null $files files
     *
     * @return self
     */
    public function setFiles($files)
    {
        if (is_null($files)) {
            throw new \InvalidArgumentException('non-nullable files cannot be null');
        }
        $this->container['files'] = $files;

        return $this;
    }

    /**
     * Gets tags
     *
     * @return string[]|null
     */
    public function getTags()
    {
        return $this->container['tags'];
    }

    /**
     * Sets tags
     *
     * @param string[]|null $tags tags
     *
     * @return self
     */
    public function setTags($tags)
    {
        if (is_null($tags)) {
            throw new \InvalidArgumentException('non-nullable tags cannot be null');
        }
        $this->container['tags'] = $tags;

        return $this;
    }

    /**
     * Gets address
     *
     * @return \OpenAPI\Client\Model\PostContactsRequestInnerAddress|null
     */
    public function getAddress()
    {
        return $this->container['address'];
    }

    /**
     * Sets address
     *
     * @param \OpenAPI\Client\Model\PostContactsRequestInnerAddress|null $address address
     *
     * @return self
     */
    public function setAddress($address)
    {
        if (is_null($address)) {
            throw new \InvalidArgumentException('non-nullable address cannot be null');
        }
        $this->container['address'] = $address;

        return $this;
    }

    /**
     * Gets addresses
     *
     * @return \OpenAPI\Client\Model\PostContactsRequestInnerAddress[]|null
     */
    public function getAddresses()
    {
        return $this->container['addresses'];
    }

    /**
     * Sets addresses
     *
     * @param \OpenAPI\Client\Model\PostContactsRequestInnerAddress[]|null $addresses addresses
     *
     * @return self
     */
    public function setAddresses($addresses)
    {
        if (is_null($addresses)) {
            throw new \InvalidArgumentException('non-nullable addresses cannot be null');
        }
        $this->container['addresses'] = $addresses;

        return $this;
    }

    /**
     * Gets phone_number
     *
     * @return string|null
     */
    public function getPhoneNumber()
    {
        return $this->container['phone_number'];
    }

    /**
     * Sets phone_number
     *
     * @param string|null $phone_number phone_number
     *
     * @return self
     */
    public function setPhoneNumber($phone_number)
    {
        if (is_null($phone_number)) {
            throw new \InvalidArgumentException('non-nullable phone_number cannot be null');
        }
        $this->container['phone_number'] = $phone_number;

        return $this;
    }

    /**
     * Gets mobile_phone_number
     *
     * @return string|null
     */
    public function getMobilePhoneNumber()
    {
        return $this->container['mobile_phone_number'];
    }

    /**
     * Sets mobile_phone_number
     *
     * @param string|null $mobile_phone_number mobile_phone_number
     *
     * @return self
     */
    public function setMobilePhoneNumber($mobile_phone_number)
    {
        if (is_null($mobile_phone_number)) {
            throw new \InvalidArgumentException('non-nullable mobile_phone_number cannot be null');
        }
        $this->container['mobile_phone_number'] = $mobile_phone_number;

        return $this;
    }

    /**
     * Gets home_phone_number
     *
     * @return string|null
     */
    public function getHomePhoneNumber()
    {
        return $this->container['home_phone_number'];
    }

    /**
     * Sets home_phone_number
     *
     * @param string|null $home_phone_number home_phone_number
     *
     * @return self
     */
    public function setHomePhoneNumber($home_phone_number)
    {
        if (is_null($home_phone_number)) {
            throw new \InvalidArgumentException('non-nullable home_phone_number cannot be null');
        }
        $this->container['home_phone_number'] = $home_phone_number;

        return $this;
    }

    /**
     * Gets fax_number
     *
     * @return string|null
     */
    public function getFaxNumber()
    {
        return $this->container['fax_number'];
    }

    /**
     * Sets fax_number
     *
     * @param string|null $fax_number fax_number
     *
     * @return self
     */
    public function setFaxNumber($fax_number)
    {
        if (is_null($fax_number)) {
            throw new \InvalidArgumentException('non-nullable fax_number cannot be null');
        }
        $this->container['fax_number'] = $fax_number;

        return $this;
    }

    /**
     * Gets phone_numbers
     *
     * @return \OpenAPI\Client\Model\PostContactsRequestInnerPhoneNumbersInner[]|null
     */
    public function getPhoneNumbers()
    {
        return $this->container['phone_numbers'];
    }

    /**
     * Sets phone_numbers
     *
     * @param \OpenAPI\Client\Model\PostContactsRequestInnerPhoneNumbersInner[]|null $phone_numbers phone_numbers
     *
     * @return self
     */
    public function setPhoneNumbers($phone_numbers)
    {
        if (is_null($phone_numbers)) {
            throw new \InvalidArgumentException('non-nullable phone_numbers cannot be null');
        }
        $this->container['phone_numbers'] = $phone_numbers;

        return $this;
    }

    /**
     * Gets position
     *
     * @return \OpenAPI\Client\Model\PostContactsRequestInnerPosition|null
     */
    public function getPosition()
    {
        return $this->container['position'];
    }

    /**
     * Sets position
     *
     * @param \OpenAPI\Client\Model\PostContactsRequestInnerPosition|null $position position
     *
     * @return self
     */
    public function setPosition($position)
    {
        if (is_null($position)) {
            throw new \InvalidArgumentException('non-nullable position cannot be null');
        }
        $this->container['position'] = $position;

        return $this;
    }

    /**
     * Gets positions
     *
     * @return \OpenAPI\Client\Model\PostContactsRequestInnerPosition[]|null
     */
    public function getPositions()
    {
        return $this->container['positions'];
    }

    /**
     * Sets positions
     *
     * @param \OpenAPI\Client\Model\PostContactsRequestInnerPosition[]|null $positions positions
     *
     * @return self
     */
    public function setPositions($positions)
    {
        if (is_null($positions)) {
            throw new \InvalidArgumentException('non-nullable positions cannot be null');
        }
        $this->container['positions'] = $positions;

        return $this;
    }

    /**
     * Gets social_profiles
     *
     * @return string[]|null
     */
    public function getSocialProfiles()
    {
        return $this->container['social_profiles'];
    }

    /**
     * Sets social_profiles
     *
     * @param string[]|null $social_profiles social_profiles
     *
     * @return self
     */
    public function setSocialProfiles($social_profiles)
    {
        if (is_null($social_profiles)) {
            throw new \InvalidArgumentException('non-nullable social_profiles cannot be null');
        }
        $this->container['social_profiles'] = $social_profiles;

        return $this;
    }

    /**
     * Gets custom
     *
     * @return object|null
     */
    public function getCustom()
    {
        return $this->container['custom'];
    }

    /**
     * Sets custom
     *
     * @param object|null $custom custom
     *
     * @return self
     */
    public function setCustom($custom)
    {
        if (is_null($custom)) {
            throw new \InvalidArgumentException('non-nullable custom cannot be null');
        }
        $this->container['custom'] = $custom;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset): bool
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed|null
     */
    #[\ReturnTypeWillChange]
    public function offsetGet($offset)
    {
        return $this->container[$offset] ?? null;
    }

    /**
     * Sets value based on offset.
     *
     * @param int|null $offset Offset
     * @param mixed    $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value): void
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset): void
    {
        unset($this->container[$offset]);
    }

    /**
     * Serializes the object to a value that can be serialized natively by json_encode().
     * @link https://www.php.net/manual/en/jsonserializable.jsonserialize.php
     *
     * @return mixed Returns data which can be serialized by json_encode(), which is a value
     * of any type other than a resource.
     */
    #[\ReturnTypeWillChange]
    public function jsonSerialize()
    {
       return ObjectSerializer::sanitizeForSerialization($this);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        return json_encode(
            ObjectSerializer::sanitizeForSerialization($this),
            JSON_PRETTY_PRINT
        );
    }

    /**
     * Gets a header-safe presentation of the object
     *
     * @return string
     */
    public function toHeaderValue()
    {
        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


