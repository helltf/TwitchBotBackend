package com.helltf.TBBackend.Repositories

import com.helltf.TBBackend.Entities.Channel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ChannelRepository : JpaRepository<Channel, Int>{

}