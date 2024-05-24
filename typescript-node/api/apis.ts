export * from './contactsApi';
import { ContactsApi } from './contactsApi';
export * from './groupsApi';
import { GroupsApi } from './groupsApi';
export * from './regionalSettingsApi';
import { RegionalSettingsApi } from './regionalSettingsApi';
export * from './usersApi';
import { UsersApi } from './usersApi';
export * from './workflowsApi';
import { WorkflowsApi } from './workflowsApi';
import * as http from 'http';

export class HttpError extends Error {
    constructor (public response: http.IncomingMessage, public body: any, public statusCode?: number) {
        super('HTTP request failed');
        this.name = 'HttpError';
    }
}

export { RequestFile } from '../model/models';

export const APIS = [ContactsApi, GroupsApi, RegionalSettingsApi, UsersApi, WorkflowsApi];
