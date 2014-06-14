echo off
echo ============================================
echo Preparando para executar SableCC.
echo ============================================
rmdir /Q /S .\compilador
rmdir /Q /S ..\src\compilador
echo ============================================
echo Executando SableCC
echo ============================================
java -jar .\sablecc.jar .\especificacao.txt
md ..\src\compilador
echo ============================================
echo Movendo arquivos para compilador\src
echo ============================================
xcopy /-Y /S .\compilador\* ..\src\compilador

echo Execucao finalizada com sucesso

rmdir /Q /S .\compilador
pause