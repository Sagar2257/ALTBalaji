@ECHO OFF

for /F "skip=1 delims=" %%j in ('wmic bios get serialnumber') do (
  set SERIAL=%%j
  GOTO START
)

:START
ECHO %SERIAL% >> FpCheckLog.txt
START /B /WAIT AcerDriveUpgradeDetect.exe
IF %ERRORLEVEL% EQU 1 (GOTO SUCCESS) ELSE (GOTO FAIL)


:SUCCESS
SET EXITCODE=0
START /B /WAIT HTTP2GA.exe Fixpack3-022 Fixpack-D NeedUpdate
ECHO %EXITCODE% >> FpCheckLog.txt
GOTO END

:FAIL
SET EXITCODE=1
START /B /WAIT HTTP2GA.exe Fixpack3-022 Fixpack-D Don'tNeedUpdate
START /B /WAIT HTTP2GA.exe Fixpack3-022 Don'tNeedUpdate %SERIAL%
ECHO %EXITCODE% >> FpCheckLog.txt
GOTO END

:END
EXIT /B %EXITCODE%