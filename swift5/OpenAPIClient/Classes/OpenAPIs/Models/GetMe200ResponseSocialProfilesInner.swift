//
// GetMe200ResponseSocialProfilesInner.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct GetMe200ResponseSocialProfilesInner: Codable, JSONEncodable, Hashable {

    public var id: Double?
    public var username: String?
    public var url: String?
    public var type: String?

    public init(id: Double? = nil, username: String? = nil, url: String? = nil, type: String? = nil) {
        self.id = id
        self.username = username
        self.url = url
        self.type = type
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case id
        case username
        case url
        case type
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(id, forKey: .id)
        try container.encodeIfPresent(username, forKey: .username)
        try container.encodeIfPresent(url, forKey: .url)
        try container.encodeIfPresent(type, forKey: .type)
    }
}

