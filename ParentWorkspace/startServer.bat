@echo off
@echo "####################################################"
@echo "####################################################"
@echo Compiling Modules
@echo "####################################################"
@echo "####################################################"

:: command to build and compile spring project
mvn clean install

@echo "####################################################"
@echo "####################################################"
@echo Starting Server
@echo "####################################################"
@echo "####################################################"

::change directory to Spring Module
cd SpringModule

::command to run the spring server.
mvn spring-boot:run
