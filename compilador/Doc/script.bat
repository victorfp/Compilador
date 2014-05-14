echo off
echo Preparando para executar SableCC.
rmdir /Q /S ..\src\compilador
echo Executando SableCC
java -jar .\sablecc.jar .\especificacao.txt
move .\compilador ..\src
pause