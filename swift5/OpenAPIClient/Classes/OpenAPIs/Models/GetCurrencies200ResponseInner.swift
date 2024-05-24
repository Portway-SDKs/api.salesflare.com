//
// GetCurrencies200ResponseInner.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct GetCurrencies200ResponseInner: Codable, JSONEncodable, Hashable {

    public var id: Double?
    public var iso: String?
    public var html: String?

    public init(id: Double? = nil, iso: String? = nil, html: String? = nil) {
        self.id = id
        self.iso = iso
        self.html = html
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case id
        case iso
        case html
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(id, forKey: .id)
        try container.encodeIfPresent(iso, forKey: .iso)
        try container.encodeIfPresent(html, forKey: .html)
    }
}
