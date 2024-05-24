# PutWorkflowsIdAudienceRecordIdRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Exited** | Pointer to **bool** | Setting &#x60;exited&#x60; to &#x60;true&#x60; will exit the entity from the workflow. Setting &#x60;exited&#x60; to &#x60;false&#x60; will re-enter the entity into the workflow. | [optional] 
**MetGoal** | Pointer to **bool** | Setting &#x60;met_goal&#x60; of a workflow record to &#x60;false&#x60; is currently not possible. | [optional] 

## Methods

### NewPutWorkflowsIdAudienceRecordIdRequest

`func NewPutWorkflowsIdAudienceRecordIdRequest() *PutWorkflowsIdAudienceRecordIdRequest`

NewPutWorkflowsIdAudienceRecordIdRequest instantiates a new PutWorkflowsIdAudienceRecordIdRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPutWorkflowsIdAudienceRecordIdRequestWithDefaults

`func NewPutWorkflowsIdAudienceRecordIdRequestWithDefaults() *PutWorkflowsIdAudienceRecordIdRequest`

NewPutWorkflowsIdAudienceRecordIdRequestWithDefaults instantiates a new PutWorkflowsIdAudienceRecordIdRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetExited

`func (o *PutWorkflowsIdAudienceRecordIdRequest) GetExited() bool`

GetExited returns the Exited field if non-nil, zero value otherwise.

### GetExitedOk

`func (o *PutWorkflowsIdAudienceRecordIdRequest) GetExitedOk() (*bool, bool)`

GetExitedOk returns a tuple with the Exited field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExited

`func (o *PutWorkflowsIdAudienceRecordIdRequest) SetExited(v bool)`

SetExited sets Exited field to given value.

### HasExited

`func (o *PutWorkflowsIdAudienceRecordIdRequest) HasExited() bool`

HasExited returns a boolean if a field has been set.

### GetMetGoal

`func (o *PutWorkflowsIdAudienceRecordIdRequest) GetMetGoal() bool`

GetMetGoal returns the MetGoal field if non-nil, zero value otherwise.

### GetMetGoalOk

`func (o *PutWorkflowsIdAudienceRecordIdRequest) GetMetGoalOk() (*bool, bool)`

GetMetGoalOk returns a tuple with the MetGoal field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetGoal

`func (o *PutWorkflowsIdAudienceRecordIdRequest) SetMetGoal(v bool)`

SetMetGoal sets MetGoal field to given value.

### HasMetGoal

`func (o *PutWorkflowsIdAudienceRecordIdRequest) HasMetGoal() bool`

HasMetGoal returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


