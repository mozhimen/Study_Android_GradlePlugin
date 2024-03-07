package com.mozhimen.study.plugin.first

import org.gradle.api.Plugin
import org.gradle.api.Project

class FirstPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        println("Hello First Gradle Plugin")
    }
}