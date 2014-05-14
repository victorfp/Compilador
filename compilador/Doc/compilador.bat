echo off

java -jar .\compilador.jar ..\Teste\*.txt
move .\compilador ..\src
pause