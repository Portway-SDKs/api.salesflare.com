//
// PostContactsRequestInner.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct PostContactsRequestInner: Codable, JSONEncodable, Hashable {

    static let emailRule = StringRule(minLength: nil, maxLength: 1000, pattern: nil)
    static let pictureRule = StringRule(minLength: nil, maxLength: 500, pattern: nil)
    public var owner: Double?
    public var email: String?
    public var _prefix: String?
    public var firstname: String?
    public var middle: String?
    public var lastname: String?
    public var suffix: String?
    public var name: String?
    public var picture: String?
    /** Any existing account will be removed from the contact when specifically passing `null`! */
    public var account: Double?
    public var birthDate: Date?
    public var optOut: Bool?
    public var optOutDate: Date?
    public var optOutCampaign: String?
    public var bounced: Bool?
    public var bouncedDate: Date?
    public var files: [AnyCodable]?
    public var tags: [String]?
    public var address: PostContactsRequestInnerAddress?
    public var addresses: [PostContactsRequestInnerAddress]?
    public var phoneNumber: String?
    public var mobilePhoneNumber: String?
    public var homePhoneNumber: String?
    public var faxNumber: String?
    public var phoneNumbers: [PostContactsRequestInnerPhoneNumbersInner]?
    public var position: PostContactsRequestInnerPosition?
    public var positions: [PostContactsRequestInnerPosition]?
    public var socialProfiles: [String]?
    public var custom: AnyCodable?

    public init(owner: Double? = nil, email: String? = nil, _prefix: String? = nil, firstname: String? = nil, middle: String? = nil, lastname: String? = nil, suffix: String? = nil, name: String? = nil, picture: String? = nil, account: Double? = nil, birthDate: Date? = nil, optOut: Bool? = nil, optOutDate: Date? = nil, optOutCampaign: String? = nil, bounced: Bool? = nil, bouncedDate: Date? = nil, files: [AnyCodable]? = nil, tags: [String]? = nil, address: PostContactsRequestInnerAddress? = nil, addresses: [PostContactsRequestInnerAddress]? = nil, phoneNumber: String? = nil, mobilePhoneNumber: String? = nil, homePhoneNumber: String? = nil, faxNumber: String? = nil, phoneNumbers: [PostContactsRequestInnerPhoneNumbersInner]? = nil, position: PostContactsRequestInnerPosition? = nil, positions: [PostContactsRequestInnerPosition]? = nil, socialProfiles: [String]? = nil, custom: AnyCodable? = nil) {
        self.owner = owner
        self.email = email
        self._prefix = _prefix
        self.firstname = firstname
        self.middle = middle
        self.lastname = lastname
        self.suffix = suffix
        self.name = name
        self.picture = picture
        self.account = account
        self.birthDate = birthDate
        self.optOut = optOut
        self.optOutDate = optOutDate
        self.optOutCampaign = optOutCampaign
        self.bounced = bounced
        self.bouncedDate = bouncedDate
        self.files = files
        self.tags = tags
        self.address = address
        self.addresses = addresses
        self.phoneNumber = phoneNumber
        self.mobilePhoneNumber = mobilePhoneNumber
        self.homePhoneNumber = homePhoneNumber
        self.faxNumber = faxNumber
        self.phoneNumbers = phoneNumbers
        self.position = position
        self.positions = positions
        self.socialProfiles = socialProfiles
        self.custom = custom
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case owner
        case email
        case _prefix = "prefix"
        case firstname
        case middle
        case lastname
        case suffix
        case name
        case picture
        case account
        case birthDate = "birth_date"
        case optOut = "opt-out"
        case optOutDate = "opt-out_date"
        case optOutCampaign = "opt-out_campaign"
        case bounced
        case bouncedDate = "bounced_date"
        case files
        case tags
        case address
        case addresses
        case phoneNumber = "phone_number"
        case mobilePhoneNumber = "mobile_phone_number"
        case homePhoneNumber = "home_phone_number"
        case faxNumber = "fax_number"
        case phoneNumbers = "phone_numbers"
        case position
        case positions
        case socialProfiles = "social_profiles"
        case custom
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(owner, forKey: .owner)
        try container.encodeIfPresent(email, forKey: .email)
        try container.encodeIfPresent(_prefix, forKey: ._prefix)
        try container.encodeIfPresent(firstname, forKey: .firstname)
        try container.encodeIfPresent(middle, forKey: .middle)
        try container.encodeIfPresent(lastname, forKey: .lastname)
        try container.encodeIfPresent(suffix, forKey: .suffix)
        try container.encodeIfPresent(name, forKey: .name)
        try container.encodeIfPresent(picture, forKey: .picture)
        try container.encodeIfPresent(account, forKey: .account)
        try container.encodeIfPresent(birthDate, forKey: .birthDate)
        try container.encodeIfPresent(optOut, forKey: .optOut)
        try container.encodeIfPresent(optOutDate, forKey: .optOutDate)
        try container.encodeIfPresent(optOutCampaign, forKey: .optOutCampaign)
        try container.encodeIfPresent(bounced, forKey: .bounced)
        try container.encodeIfPresent(bouncedDate, forKey: .bouncedDate)
        try container.encodeIfPresent(files, forKey: .files)
        try container.encodeIfPresent(tags, forKey: .tags)
        try container.encodeIfPresent(address, forKey: .address)
        try container.encodeIfPresent(addresses, forKey: .addresses)
        try container.encodeIfPresent(phoneNumber, forKey: .phoneNumber)
        try container.encodeIfPresent(mobilePhoneNumber, forKey: .mobilePhoneNumber)
        try container.encodeIfPresent(homePhoneNumber, forKey: .homePhoneNumber)
        try container.encodeIfPresent(faxNumber, forKey: .faxNumber)
        try container.encodeIfPresent(phoneNumbers, forKey: .phoneNumbers)
        try container.encodeIfPresent(position, forKey: .position)
        try container.encodeIfPresent(positions, forKey: .positions)
        try container.encodeIfPresent(socialProfiles, forKey: .socialProfiles)
        try container.encodeIfPresent(custom, forKey: .custom)
    }
}

