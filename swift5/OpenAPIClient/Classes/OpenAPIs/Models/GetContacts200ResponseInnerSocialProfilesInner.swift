//
// GetContacts200ResponseInnerSocialProfilesInner.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct GetContacts200ResponseInnerSocialProfilesInner: Codable, JSONEncodable, Hashable {

    public var id: Double
    public var type: String?
    public var url: String?
    public var username: String?

    public init(id: Double, type: String? = nil, url: String? = nil, username: String? = nil) {
        self.id = id
        self.type = type
        self.url = url
        self.username = username
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case id
        case type
        case url
        case username
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(id, forKey: .id)
        try container.encodeIfPresent(type, forKey: .type)
        try container.encodeIfPresent(url, forKey: .url)
        try container.encodeIfPresent(username, forKey: .username)
    }
}

