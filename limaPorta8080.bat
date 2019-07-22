ECHO OFF
ECHO Trabalhando na limpesa de suas portas 
FOR /F "tokens=5 delims= " %%P IN ('netstat -a -n -o ^| findstr :8080') DO TaskKill.exe /PID %%P /F

ECHO Terminei o trabalho
