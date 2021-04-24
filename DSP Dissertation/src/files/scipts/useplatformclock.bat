@echo off
bcdedit /set nolowmem Yes
bcdedit /deletevalue useplatformclock
bcdedit /set hypervisorlaunchtype off
bcdedit /set disabledynamictick yes
bcdedit /set useplatformtick yes

echo.
pause