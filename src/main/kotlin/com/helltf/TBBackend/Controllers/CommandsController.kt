package com.helltf.TBBackend.Controllers

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.helltf.TBBackend.Entities.Channel
import com.helltf.TBBackend.Entities.Command
import com.helltf.TBBackend.Repositories.CommandsRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/v1/")
class CommandsController: Controller() {

    @Autowired
    lateinit var commandsRepository: CommandsRepository;

    val mapper: ObjectMapper = ObjectMapper()

    @GetMapping("/commands")
    fun getCommands():ResponseEntity<JsonNode>{
        val commandsList: MutableList<Command> = commandsRepository.findAll()

        val commandsJson:JsonNode = removeID(mapper.valueToTree(commandsList))

        return ResponseEntity<JsonNode>(commandsJson, HttpStatus.OK)
    }
}