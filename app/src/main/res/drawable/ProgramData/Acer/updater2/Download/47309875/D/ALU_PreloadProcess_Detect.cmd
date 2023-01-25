
@ECHO OFF
::: Return code:   
:::   0 is need to patch
:::   1 is skip the patch
SET err=1
IF EXIST C:\Recovery\OEM\RestoreOEMCustomize\DeleteFileList.txt 	SET err=0
IF EXIST C:\Recovery\OEM\RestoreOEMCustomize\DeleteFolderList.txt	SET err=0

exit /b %err%