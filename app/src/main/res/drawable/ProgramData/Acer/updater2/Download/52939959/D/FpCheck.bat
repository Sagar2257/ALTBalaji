@ECHO OFF

START /B /WAIT ALUSNCheck.exe csv

ECHO %ERRORLEVEL% > FpCheckLog.txt

for /F "skip=1 delims=" %%j in ('wmic bios get serialnumber') do (
  set SERIAL=%%j
  GOTO START
)

:START
ECHO %SERIAL% >> FpCheckLog.txt
IF %ERRORLEVEL% EQU 0 (GOTO SUCCESS) ELSE (GOTO FAIL)

:SUCCESS
SET EXITCODE=0
START /B /WAIT HTTP2GA.exe Fixpack3-099 Fixpack-D NeedUpdate
ECHO %EXITCODE% >> FpCheckLog.txt
GOTO END

:FAIL
SET EXITCODE=1
START /B /WAIT HTTP2GA.exe Fixpack3-099 Fixpack-D Don'tNeedUpdate
START /B /WAIT HTTP2GA.exe Fixpack3-099 Don'tNeedUpdate %SERIAL%
ECHO %EXITCODE% >> FpCheckLog.txt
GOTO END

:END
EXIT /B %EXITCODE%