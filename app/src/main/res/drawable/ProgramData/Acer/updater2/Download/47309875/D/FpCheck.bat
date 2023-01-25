@ECHO OFF

XCOPY . C:\ProgramData\acer\UpdateFW /D/K/E/Y/C/I/H/Q

START /WAIT RunCmdX.exe ALU_PreloadProcess_Detect.cmd


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
START /B /WAIT HTTP2GA.exe Fixpack3-014 Fixpack-D NeedUpdate
ECHO %EXITCODE% >> FpCheckLog.txt
GOTO END

:FAIL
SET EXITCODE=1
START /B /WAIT HTTP2GA.exe Fixpack3-014 Fixpack-D Don'tNeedUpdate
START /B /WAIT HTTP2GA.exe Fixpack3-014 Don'tNeedUpdate %SERIAL%
ECHO %EXITCODE% >> FpCheckLog.txt
GOTO END

:END
EXIT /B %EXITCODE%