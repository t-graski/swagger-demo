/**
 * Bookstore API
 * Bookstore API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { Person } from './person';


export interface Book { 
    id?: number;
    title?: string;
    author?: Person;
    pages?: number;
    available?: boolean;
}
