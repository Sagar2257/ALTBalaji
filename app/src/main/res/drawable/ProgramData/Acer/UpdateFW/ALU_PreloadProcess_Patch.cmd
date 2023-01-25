
pushd "%~dp0"
:: 0 : success
:: 1 : fail
SET err=0
IF EXIST C:\Recovery\OEM\RestoreOEMCustomize\DeleteFileList.txt (
	del /f /q C:\Recovery\OEM\RestoreOEMCustomize\DeleteFileList.txt
)
IF EXIST C:\Recovery\OEM\RestoreOEMCustomize\DeleteFolderList.txt (
	del /f /q C:\Recovery\OEM\RestoreOEMCustomize\DeleteFolderList.txt
)
IF EXIST C:\Recovery\OEM\RestoreOEMCustomize\DeleteFileList.txt		set err=1
IF EXIST C:\Recovery\OEM\RestoreOEMCustomize\DeleteFolderList.txt	set err=1

:END
popd
exit /b %err%