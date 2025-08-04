@echo off
javac -d out shell/main/Main.java
if errorlevel 1 goto end
java -cp out shell.main.Main
