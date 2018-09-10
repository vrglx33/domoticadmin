package com.domoticadmin.domoticadmin.sensor.repository

import com.domoticadmin.domoticadmin.sensor.entity.Sensor
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository



@Repository
interface SensorRepository : JpaRepository<Sensor, Long>