@echo off
reg add HKCU\Console /v VirtualTerminalLevel /t REG_DWORD /d 1 /f > nul
javac -d out shell/main/Main.java
if errorlevel 1 goto end
java -cp out shell.main.Main
