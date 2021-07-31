package com.github.kinglongchen.apiplugin.services

import com.github.kinglongchen.apiplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
