//
// Testsuite.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class Testsuite: JSONEncodable {
    /** Test suite ID */
    public var id: String?
    /** Test suite  Name */
    public var name: String?
    /** Test suite  description */
    public var desc: String?
    /** Test suite  project id */
    public var project: String?
    /** User who created test suite */
    public var createdBy: String?
    /** User who uodated test suite */
    public var updatedBy: String?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["_id"] = self.id
        nillableDictionary["name"] = self.name
        nillableDictionary["desc"] = self.desc
        nillableDictionary["project"] = self.project
        nillableDictionary["createdBy"] = self.createdBy
        nillableDictionary["updatedBy"] = self.updatedBy
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
