//
// GetMe200Response.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct GetMe200Response: Codable, JSONEncodable, Hashable {

    public var id: Double?
    public var team: GetMe200ResponseTeam?
    public var group: Double?
    public var amountOfTrialDaysEarned: Double?
    public var hasReceivedAccountSuggestions: Bool?
    public var hasArchivedContacts: Bool?
    public var notificationChannelId: String?
    public var needsPassword: Bool?
    public var disabled: Bool?
    public var creationDate: Date?
    public var modificationDate: Date?
    public var _prefix: String?
    public var firstname: String?
    public var middle: String?
    public var lastname: String?
    public var suffix: String?
    public var name: String?
    public var email: String?
    public var domain: String?
    public var picture: String?
    public var type: String?
    public var isAdmin: Bool?
    public var creditUsage: Double?
    public var isImporting: Bool?
    public var syncStatus: String?
    public var calendarSyncStatus: String?
    public var firstCalendarSyncDone: Bool?
    public var trialExpired: Bool?
    public var trialExpiryDate: Date?
    public var trialExtended: Bool?
    public var restricted: Bool?
    public var restrictedReason: String?
    public var teamDiscountCode: String?
    public var referralCode: String?
    public var referralReward: Double?
    public var isDelinquent: Bool?
    public var socialProfiles: [GetMe200ResponseSocialProfilesInner]?
    public var phoneNumbers: [GetMe200ResponsePhoneNumbersInner]?
    public var positions: [GetContacts200ResponseInnerPositionsInner]?
    public var addresses: [AnyCodable]?
    public var tags: [AnyCodable]?
    public var intercomHash: String?
    public var firstDayOfWeek: Double?
    public var amPmNotation: Bool?
    public var autoFindEmailLinkedin: Bool?
    public var dataSourcesToReconnect: [GetMe200ResponseDataSourcesToReconnectInner]?
    public var dataSources: [GetMe200ResponseDataSourcesInner]?
    public var planFlags: AnyCodable?
    public var flags: [GetMe200ResponseFlagsInner]?
    public var role: GetMe200ResponseRole?
    public var callLogSyncDate: Date?
    public var twoFaEnabled: Bool?

    public init(id: Double? = nil, team: GetMe200ResponseTeam? = nil, group: Double? = nil, amountOfTrialDaysEarned: Double? = nil, hasReceivedAccountSuggestions: Bool? = nil, hasArchivedContacts: Bool? = nil, notificationChannelId: String? = nil, needsPassword: Bool? = nil, disabled: Bool? = nil, creationDate: Date? = nil, modificationDate: Date? = nil, _prefix: String? = nil, firstname: String? = nil, middle: String? = nil, lastname: String? = nil, suffix: String? = nil, name: String? = nil, email: String? = nil, domain: String? = nil, picture: String? = nil, type: String? = nil, isAdmin: Bool? = nil, creditUsage: Double? = nil, isImporting: Bool? = nil, syncStatus: String? = nil, calendarSyncStatus: String? = nil, firstCalendarSyncDone: Bool? = nil, trialExpired: Bool? = nil, trialExpiryDate: Date? = nil, trialExtended: Bool? = nil, restricted: Bool? = nil, restrictedReason: String? = nil, teamDiscountCode: String? = nil, referralCode: String? = nil, referralReward: Double? = nil, isDelinquent: Bool? = nil, socialProfiles: [GetMe200ResponseSocialProfilesInner]? = nil, phoneNumbers: [GetMe200ResponsePhoneNumbersInner]? = nil, positions: [GetContacts200ResponseInnerPositionsInner]? = nil, addresses: [AnyCodable]? = nil, tags: [AnyCodable]? = nil, intercomHash: String? = nil, firstDayOfWeek: Double? = nil, amPmNotation: Bool? = nil, autoFindEmailLinkedin: Bool? = nil, dataSourcesToReconnect: [GetMe200ResponseDataSourcesToReconnectInner]? = nil, dataSources: [GetMe200ResponseDataSourcesInner]? = nil, planFlags: AnyCodable? = nil, flags: [GetMe200ResponseFlagsInner]? = nil, role: GetMe200ResponseRole? = nil, callLogSyncDate: Date? = nil, twoFaEnabled: Bool? = nil) {
        self.id = id
        self.team = team
        self.group = group
        self.amountOfTrialDaysEarned = amountOfTrialDaysEarned
        self.hasReceivedAccountSuggestions = hasReceivedAccountSuggestions
        self.hasArchivedContacts = hasArchivedContacts
        self.notificationChannelId = notificationChannelId
        self.needsPassword = needsPassword
        self.disabled = disabled
        self.creationDate = creationDate
        self.modificationDate = modificationDate
        self._prefix = _prefix
        self.firstname = firstname
        self.middle = middle
        self.lastname = lastname
        self.suffix = suffix
        self.name = name
        self.email = email
        self.domain = domain
        self.picture = picture
        self.type = type
        self.isAdmin = isAdmin
        self.creditUsage = creditUsage
        self.isImporting = isImporting
        self.syncStatus = syncStatus
        self.calendarSyncStatus = calendarSyncStatus
        self.firstCalendarSyncDone = firstCalendarSyncDone
        self.trialExpired = trialExpired
        self.trialExpiryDate = trialExpiryDate
        self.trialExtended = trialExtended
        self.restricted = restricted
        self.restrictedReason = restrictedReason
        self.teamDiscountCode = teamDiscountCode
        self.referralCode = referralCode
        self.referralReward = referralReward
        self.isDelinquent = isDelinquent
        self.socialProfiles = socialProfiles
        self.phoneNumbers = phoneNumbers
        self.positions = positions
        self.addresses = addresses
        self.tags = tags
        self.intercomHash = intercomHash
        self.firstDayOfWeek = firstDayOfWeek
        self.amPmNotation = amPmNotation
        self.autoFindEmailLinkedin = autoFindEmailLinkedin
        self.dataSourcesToReconnect = dataSourcesToReconnect
        self.dataSources = dataSources
        self.planFlags = planFlags
        self.flags = flags
        self.role = role
        self.callLogSyncDate = callLogSyncDate
        self.twoFaEnabled = twoFaEnabled
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case id
        case team
        case group
        case amountOfTrialDaysEarned = "amount_of_trial_days_earned"
        case hasReceivedAccountSuggestions = "has_received_account_suggestions"
        case hasArchivedContacts = "has_archived_contacts"
        case notificationChannelId = "notification_channel_id"
        case needsPassword = "needs_password"
        case disabled
        case creationDate = "creation_date"
        case modificationDate = "modification_date"
        case _prefix = "prefix"
        case firstname
        case middle
        case lastname
        case suffix
        case name
        case email
        case domain
        case picture
        case type
        case isAdmin = "is_admin"
        case creditUsage = "credit_usage"
        case isImporting = "is_importing"
        case syncStatus = "sync_status"
        case calendarSyncStatus = "calendar_sync_status"
        case firstCalendarSyncDone = "first_calendar_sync_done"
        case trialExpired = "trial_expired"
        case trialExpiryDate = "trial_expiry_date"
        case trialExtended = "trial_extended"
        case restricted
        case restrictedReason = "restricted_reason"
        case teamDiscountCode = "team_discount_code"
        case referralCode = "referral_code"
        case referralReward = "referral_reward"
        case isDelinquent = "is_delinquent"
        case socialProfiles = "social_profiles"
        case phoneNumbers = "phone_numbers"
        case positions
        case addresses
        case tags
        case intercomHash = "intercom_hash"
        case firstDayOfWeek = "first_day_of_week"
        case amPmNotation = "am_pm_notation"
        case autoFindEmailLinkedin = "auto_find_email_linkedin"
        case dataSourcesToReconnect = "data_sources_to_reconnect"
        case dataSources = "data_sources"
        case planFlags = "plan_flags"
        case flags
        case role
        case callLogSyncDate = "call_log_sync_date"
        case twoFaEnabled = "two_fa_enabled"
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(id, forKey: .id)
        try container.encodeIfPresent(team, forKey: .team)
        try container.encodeIfPresent(group, forKey: .group)
        try container.encodeIfPresent(amountOfTrialDaysEarned, forKey: .amountOfTrialDaysEarned)
        try container.encodeIfPresent(hasReceivedAccountSuggestions, forKey: .hasReceivedAccountSuggestions)
        try container.encodeIfPresent(hasArchivedContacts, forKey: .hasArchivedContacts)
        try container.encodeIfPresent(notificationChannelId, forKey: .notificationChannelId)
        try container.encodeIfPresent(needsPassword, forKey: .needsPassword)
        try container.encodeIfPresent(disabled, forKey: .disabled)
        try container.encodeIfPresent(creationDate, forKey: .creationDate)
        try container.encodeIfPresent(modificationDate, forKey: .modificationDate)
        try container.encodeIfPresent(_prefix, forKey: ._prefix)
        try container.encodeIfPresent(firstname, forKey: .firstname)
        try container.encodeIfPresent(middle, forKey: .middle)
        try container.encodeIfPresent(lastname, forKey: .lastname)
        try container.encodeIfPresent(suffix, forKey: .suffix)
        try container.encodeIfPresent(name, forKey: .name)
        try container.encodeIfPresent(email, forKey: .email)
        try container.encodeIfPresent(domain, forKey: .domain)
        try container.encodeIfPresent(picture, forKey: .picture)
        try container.encodeIfPresent(type, forKey: .type)
        try container.encodeIfPresent(isAdmin, forKey: .isAdmin)
        try container.encodeIfPresent(creditUsage, forKey: .creditUsage)
        try container.encodeIfPresent(isImporting, forKey: .isImporting)
        try container.encodeIfPresent(syncStatus, forKey: .syncStatus)
        try container.encodeIfPresent(calendarSyncStatus, forKey: .calendarSyncStatus)
        try container.encodeIfPresent(firstCalendarSyncDone, forKey: .firstCalendarSyncDone)
        try container.encodeIfPresent(trialExpired, forKey: .trialExpired)
        try container.encodeIfPresent(trialExpiryDate, forKey: .trialExpiryDate)
        try container.encodeIfPresent(trialExtended, forKey: .trialExtended)
        try container.encodeIfPresent(restricted, forKey: .restricted)
        try container.encodeIfPresent(restrictedReason, forKey: .restrictedReason)
        try container.encodeIfPresent(teamDiscountCode, forKey: .teamDiscountCode)
        try container.encodeIfPresent(referralCode, forKey: .referralCode)
        try container.encodeIfPresent(referralReward, forKey: .referralReward)
        try container.encodeIfPresent(isDelinquent, forKey: .isDelinquent)
        try container.encodeIfPresent(socialProfiles, forKey: .socialProfiles)
        try container.encodeIfPresent(phoneNumbers, forKey: .phoneNumbers)
        try container.encodeIfPresent(positions, forKey: .positions)
        try container.encodeIfPresent(addresses, forKey: .addresses)
        try container.encodeIfPresent(tags, forKey: .tags)
        try container.encodeIfPresent(intercomHash, forKey: .intercomHash)
        try container.encodeIfPresent(firstDayOfWeek, forKey: .firstDayOfWeek)
        try container.encodeIfPresent(amPmNotation, forKey: .amPmNotation)
        try container.encodeIfPresent(autoFindEmailLinkedin, forKey: .autoFindEmailLinkedin)
        try container.encodeIfPresent(dataSourcesToReconnect, forKey: .dataSourcesToReconnect)
        try container.encodeIfPresent(dataSources, forKey: .dataSources)
        try container.encodeIfPresent(planFlags, forKey: .planFlags)
        try container.encodeIfPresent(flags, forKey: .flags)
        try container.encodeIfPresent(role, forKey: .role)
        try container.encodeIfPresent(callLogSyncDate, forKey: .callLogSyncDate)
        try container.encodeIfPresent(twoFaEnabled, forKey: .twoFaEnabled)
    }
}

