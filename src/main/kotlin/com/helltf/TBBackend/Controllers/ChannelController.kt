package com.helltf.TBBackend.Controllers

import com.helltf.TBBackend.Entities.Channel
import com.helltf.TBBackend.Entities.Name
import com.helltf.TBBackend.Repositories.ChannelRepository
import com.helltf.TBBackend.Repositories.NameRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*


@RestController
@RequestMapping("/api/v1/")
class ChannelController {

    @Autowired
    lateinit var nameRepository: NameRepository;

    @GetMapping("/channels")
    fun getAllChannels(): MutableList<Name> {
        nameRepository.save(Name("Test12332"))
        return nameRepository.findAll();
    }
}