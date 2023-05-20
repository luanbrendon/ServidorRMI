@echo off

if exist target (
echo *** Iniciando RMI Registry ***
cd target\classes
start rmiregistry 1099
)else (
echo *** Diretorio target nao existe ***
)
pause