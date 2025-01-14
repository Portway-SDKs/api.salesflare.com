//
// GetMe200ResponseTeamCurrency.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct GetMe200ResponseTeamCurrency: Codable, JSONEncodable, Hashable {

    public var id: Double?
    public var html: String?
    public var iso: String?

    public init(id: Double? = nil, html: String? = nil, iso: String? = nil) {
        self.id = id
        self.html = html
        self.iso = iso
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case id
        case html
        case iso
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(id, forKey: .id)
        try container.encodeIfPresent(html, forKey: .html)
        try container.encodeIfPresent(iso, forKey: .iso)
    }
}

