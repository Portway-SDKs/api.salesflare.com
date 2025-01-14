//
// GetContacts200ResponseInnerAccount.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct GetContacts200ResponseInnerAccount: Codable, JSONEncodable, Hashable {

    public var id: Double
    public var picture: String?
    public var name: String?
    public var domain: String?

    public init(id: Double, picture: String? = nil, name: String? = nil, domain: String? = nil) {
        self.id = id
        self.picture = picture
        self.name = name
        self.domain = domain
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case id
        case picture
        case name
        case domain
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(id, forKey: .id)
        try container.encodeIfPresent(picture, forKey: .picture)
        try container.encodeIfPresent(name, forKey: .name)
        try container.encodeIfPresent(domain, forKey: .domain)
    }
}

