@echo off
javac -d out shell/Main.java
if errorlevel 1 goto end
java -cp out shell.Main
:end
rmdir /s /q out
