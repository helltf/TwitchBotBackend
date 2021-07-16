package com.helltf.TBBackend.Repositories

import com.helltf.TBBackend.Entities.Channel
import com.helltf.TBBackend.Entities.Command
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CommandsRepository : JpaRepository<Command, Int> {}