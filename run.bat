@echo off
if exist out (
    java -cp out shell.main.Main
) else (
    javac -d out shell/main/*.java
    java -cp out shell.main.Main
)
