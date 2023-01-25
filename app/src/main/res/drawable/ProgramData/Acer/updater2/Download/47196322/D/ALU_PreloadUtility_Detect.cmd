@ECHO OFF
:QUERY
::: Return code:   
:::   0 is need to patch
:::   1 is skip the patch
reg query "HKLM\SOFTWARE\Microsoft\Windows\CurrentVersion\Run" /v "New Acer AlaunchX"
if %errorlevel% equ 0 goto :NeedPatch
reg query "HKLM\SOFTWARE\Microsoft\Windows\CurrentVersion\Run" /v "SwitchToDesktop"
if %errorlevel% equ 0 goto :NeedPatch
if not exist C:\OEM\CaringCenter\DRV goto :NeedPatch

:NoNeedPatch
exit /b 1

:NeedPatch
exit /b 0