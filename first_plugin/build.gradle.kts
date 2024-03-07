plugins {
    id("java-gradle-plugin") //会自动引入java-library、gradleApi()
    id("org.jetbrains.kotlin.jvm") //支持kotlin编写插件
    id("maven-publish") //发布到maven
}

gradlePlugin {
    plugins {
        create("firstPlugin") {
            group = "com.mozhimen.study.plugin"
            version = "1.0.0"
            id = "com.mozhimen.study.plugin.first" //插件的唯一标识，使用插件的时候就是这个id
            implementationClass = "com.mozhimen.study.plugin.first.FirstPlugin" //FirstPlugin的全类名 取代resources声明
        }
    }
}

publishing {
    repositories {
        maven {
            url = uri("../repos")
        }
    }
}

dependencies{
    implementation("com.android.tools.build:gradle:8.2.2")
}