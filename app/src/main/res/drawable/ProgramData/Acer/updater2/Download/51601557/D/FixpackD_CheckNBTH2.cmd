
rem Check product is NB by registry and OS is Windows 10 TH2.

REG QUERY HKEY_LOCAL_MACHINE\SOFTWARE\OEM\Metadata /v Sys | find /i "PTB"
echo Check NB with result '%errorlevel%', 0 means NB.
if "%errorlevel%" neq "0" exit /b %errorlevel%

ver | find /i "10586"
echo Check TH2 with result '%errorlevel%', 0 means TH2.


exit /b %errorlevel%