mkdir C:\GTMPatiel
cd C:\GTMPatiel
:: Copie le projet
call mvn scm:checkout  -DconnectionUrl=scm:git:https://github.com/BenKapoor/partielV2.git 

cd target\checkout\GTMPatiel

:: build
call mvn clean package

:: deploie
copy C:\GTMPatiel\target\checkout\partielV2\GTMPatielPRESENTATION.war

:: call Mettre le chemin de tomcat/startup.bat

start chrome http://localhost:8080/partielV2/
