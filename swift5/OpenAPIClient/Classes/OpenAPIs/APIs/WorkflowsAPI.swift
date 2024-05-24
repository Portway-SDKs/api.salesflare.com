//
// WorkflowsAPI.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

open class WorkflowsAPI {

    /**
     Re-enter or exit an entity from a workflow
     
     - parameter id: (path)  
     - parameter recordId: (path) This is the entity id. For email workflows this should be the contact id. 
     - parameter body: (body)  (optional)
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func putWorkflowsIdAudienceRecordId(id: Double, recordId: Double, body: PutWorkflowsIdAudienceRecordIdRequest? = nil, apiResponseQueue: DispatchQueue = OpenAPIClientAPI.apiResponseQueue, completion: @escaping ((_ data: PutWorkflowsIdAudienceRecordId200Response?, _ error: Error?) -> Void)) -> RequestTask {
        return putWorkflowsIdAudienceRecordIdWithRequestBuilder(id: id, recordId: recordId, body: body).execute(apiResponseQueue) { result in
            switch result {
            case let .success(response):
                completion(response.body, nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     Re-enter or exit an entity from a workflow
     - PUT /workflows/{id}/audience/{record_id}
     - parameter id: (path)  
     - parameter recordId: (path) This is the entity id. For email workflows this should be the contact id. 
     - parameter body: (body)  (optional)
     - returns: RequestBuilder<PutWorkflowsIdAudienceRecordId200Response> 
     */
    open class func putWorkflowsIdAudienceRecordIdWithRequestBuilder(id: Double, recordId: Double, body: PutWorkflowsIdAudienceRecordIdRequest? = nil) -> RequestBuilder<PutWorkflowsIdAudienceRecordId200Response> {
        var localVariablePath = "/workflows/{id}/audience/{record_id}"
        let idPreEscape = "\(APIHelper.mapValueToPathItem(id))"
        let idPostEscape = idPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{id}", with: idPostEscape, options: .literal, range: nil)
        let recordIdPreEscape = "\(APIHelper.mapValueToPathItem(recordId))"
        let recordIdPostEscape = recordIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{record_id}", with: recordIdPostEscape, options: .literal, range: nil)
        let localVariableURLString = OpenAPIClientAPI.basePath + localVariablePath
        let localVariableParameters = JSONEncodingHelper.encodingParameters(forEncodableObject: body)

        let localVariableUrlComponents = URLComponents(string: localVariableURLString)

        let localVariableNillableHeaders: [String: Any?] = [
            :
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<PutWorkflowsIdAudienceRecordId200Response>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return localVariableRequestBuilder.init(method: "PUT", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: false)
    }
}