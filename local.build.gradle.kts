// WARNING:
// > Only the main project build scripts and precompiled project script plugins have type-safe model accessors.
// > Initialization scripts, settings scripts, script plugins do not.
// > These limitations will be removed in a future Gradle release.
// See https://docs.gradle.org/7.1.1/userguide/kotlin_dsl.html#type-safe-accessors
import net.linguica.gradle.maven.settings.MavenSettingsPlugin
import org.gradle.api.publish.PublishingExtension

version = project.findProperty("application.version")?.toString() ?: "0.0.0-SNAPSHOT"

buildscript {
    repositories {
        gradlePluginPortal()
    }
    dependencies {
        classpath("net.linguica.gradle:maven-settings-plugin:0.5")
    }
}

apply(plugin = "maven-publish")
apply<MavenSettingsPlugin>()

configure<JavaPluginExtension> {
    targetCompatibility = JavaVersion.VERSION_13
}

configure<PublishingExtension> {
    repositories {
        maven {
            name = "equisoft-plan-sdk"
            url = uri("https://maven.pkg.github.com/kronostechnologies/equisoft-plan-sdk-kotlin")
            credentials {
                name = "gprWrite"
                username = project.findProperty("gpr.user")?.toString()
                    ?: System.getenv("GPR_USER")
                    ?: System.getenv("GHCR_USER")
                password = project.findProperty("gpr.key")?.toString()
                    ?: System.getenv("GPR_TOKEN")
                    ?: System.getenv("GHCR_TOKEN")
            }
        }
    }

    publications {
        create<MavenPublication>("gpr") {
            from(components["java"])
        }
    }
}
