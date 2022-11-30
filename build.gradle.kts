plugins {
    kotlin("multiplatform") version "1.7.21"
}

repositories {
    mavenCentral()
}

kotlin {
    linuxX64 {
        binaries {
            executable(listOf(DEBUG, RELEASE)) {
                entryPoint = "main"
            }
        }
    }

    sourceSets {
        /*
        create("anotherMain") {

        }

        named("linuxX64Main") {
            dependsOn(named("anotherMain").get())
        }
        */

        register("anotherMain") {

        }

        getByName("linuxX64Main") {
            dependsOn(getByName("anotherMain"))
        }
    }

}
