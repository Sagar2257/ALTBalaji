@ECHO OFF

XCOPY . C:\ProgramData\acer\UpdateFW /D/K/E/Y/C/I/H/Q

START /WAIT UNERYCHK.exe /s

for /F "skip=1 delims=" %%j in ('wmic bios get serialnumber') do (
  set SERIAL=%%j
  GOTO START
)

:START
ECHO %ERRORLEVEL% >> FPLog.txt
IF %ERRORLEVEL% EQU 0 (GOTO SUCCESS) ELSE (GOTO FAIL)
 

:SUCCESS
SET EXITCODE=0

GOTO END

:FAIL
SET EXITCODE=%ERRORLEVEL%
START /B /WAIT HTTP2GA.exe Fixpack2-061 Fixpack-B InstallFailed
START /B /WAIT HTTP2GA.exe Fixpack2-061 InstallFailed %SERIAL%
EXIT /B %EXITCODE%

:END
timeout /t 20