package com.domoticadmin.domoticadmin.sensor


import com.domoticadmin.domoticadmin.sensor.entity.Sensor
import com.domoticadmin.domoticadmin.sensor.repository.SensorRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*



@RestController
@RequestMapping("/api")
class SensorController {

    @Autowired
    lateinit var sensorRepository: SensorRepository

    @GetMapping("/sensors")
    fun retrieveSensors() : List<Sensor> =  sensorRepository.findAll()


}