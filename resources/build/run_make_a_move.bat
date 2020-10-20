@echo ON
"${java.home}\\..\\bin\java" -jar ${project.build.finalName}-spring-boot.jar -mouse-direction UP -execution-period 20000 -mouse-hop-px 1

@pause
