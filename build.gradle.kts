plugins {
	java
	id("org.springframework.boot") version "3.1.1"
	id("io.spring.dependency-management") version "1.1.0"
	id("org.liquibase.gradle") version "2.0.4"
}

group = "com.travelly"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jdbc")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("in.yajnesh.util:java-util:1.0.0")
	implementation("util:util:0.1.0-SNAPSHOT")
	compileOnly("org.projectlombok:lombok")
	developmentOnly("org.springframework.boot:spring-boot-docker-compose")
	runtimeOnly("org.postgresql:postgresql")
	liquibaseRuntime("org.liquibase', name: 'liquibase-core', version: '4.23.0")
	liquibaseRuntime("org.liquibase:liquibase-groovy-dsl:2.1.1")
	liquibaseRuntime("org.postgresql', name: 'postgresql', version: '42.6.0")
	annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
	annotationProcessor("org.projectlombok:lombok")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
