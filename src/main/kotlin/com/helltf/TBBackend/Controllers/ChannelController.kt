package com.helltf.TBBackend.Controllers

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.node.ObjectNode
import com.helltf.TBBackend.Entities.Channel
import com.helltf.TBBackend.Repositories.ChannelRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/v1/")
class ChannelController {

    @Autowired
    lateinit var channelRepository: ChannelRepository

    val mapper:ObjectMapper = ObjectMapper()

    @GetMapping("/channels")
    fun getAllChannels(): ResponseEntity<JsonNode> {
        val channelList:List<Channel> =channelRepository.findAll()
        val channelJson:JsonNode = prepareResult(mapper.valueToTree(channelList))

        return ResponseEntity<JsonNode>(channelJson, HttpStatus.OK)
    }

    private fun prepareResult(channelList: JsonNode): JsonNode {

        return removeID(channelList);
    }

    private fun removeID(channelList: JsonNode) : JsonNode{
        channelList.map { channel -> (channel as ObjectNode).remove("id")}
        channelList.removeAll { channel -> channel.get("currConnected").asInt() == 0  }
        return channelList
    }
}