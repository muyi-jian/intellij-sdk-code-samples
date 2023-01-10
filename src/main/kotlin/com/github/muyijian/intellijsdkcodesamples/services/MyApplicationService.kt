package com.github.muyijian.intellijsdkcodesamples.services

import com.github.muyijian.intellijsdkcodesamples.MyBundle

class MyApplicationService {

    init {
        println(MyBundle.message("applicationService"))

        System.getenv("CI")
            ?: TODO("Don't forget to remove all non-needed sample code files with their corresponding registration entries in `plugin.xml`.")
    }
}
