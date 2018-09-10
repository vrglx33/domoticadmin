package com.domoticadmin.domoticadmin.sensor.entity


import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.util.*
import javax.persistence.*


@Entity
@Table(name = "sensor")
@JsonIgnoreProperties(value = ["createdDate", "modifiedDate"], allowGetters = true)

data class Sensor(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long ,
        @Column(nullable = false)
        val name: String,
        @Column(nullable = false)
        val description: String,
        @Column(nullable = false)
        val state: String,
        @Column(nullable = false)
        val createdDate: Date,
        @Column(nullable = false)
        val modifiedDate: Date)