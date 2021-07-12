package com.helltf.TBBackend.Controllers

import com.helltf.TBBackend.Entities.Channel
import com.helltf.TBBackend.Repositories.ChannelRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*
import java.util.function.Consumer


@RestController
@RequestMapping("/api/v1/")
class ChannelController {

    @Autowired
    lateinit var channelRepository: ChannelRepository

    @GetMapping("/channels")
    fun getAllChannels(): ResponseEntity<List<Channel>> {

        val result:List<Channel> = prepareResult(channelRepository.findAll())
        return ResponseEntity<List<Channel>>(result, HttpStatus.OK)
    }

    private fun prepareResult(channelList: List<Channel>): List<Channel> {


        return removeID(channelList);
    }

    private fun removeID(channelList: List<Channel>) : List<Channel>{
        channelList.forEach(
                Consumer { channel -> channel.setId(0)}
        )
        return channelList
    }
}