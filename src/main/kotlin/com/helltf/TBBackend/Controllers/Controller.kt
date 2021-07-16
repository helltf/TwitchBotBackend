package com.helltf.TBBackend.Controllers

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.node.ObjectNode

open class Controller {
    fun removeID(jsonList: JsonNode) : JsonNode {
        //jsonList.map { element -> (element as ObjectNode).remove("id")}
        return jsonList
    }
}