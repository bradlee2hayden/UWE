@echo off
@echo
@echo Import Bitsum Highest Performance
powercfg -import "C:\_\Power Plans\Bitsum Highest Performance.pow" 77777777-7777-7777-7777-777777777777
@echo
@echo SETACTIVE Bitsum Highest Performance
powercfg -SETACTIVE "77777777-7777-7777-7777-777777777777"
@echo
@echo Delete Balanced
powercfg -delete 381b4222-f694-41f0-9685-ff5bb260df2e
@echo
@echo Delete High performance
powercfg -delete 8c5e7fda-e8bf-4a96-9a85-a6e23a8c635c
@echo
@echo Delete Power saver
powercfg -delete a1841308-3541-4fab-bc81-f71556f20b4a
@echo
@echo Disable hibernate
powercfg -h off
@echo
@echo Disable HPET
bcdedit /deletevalue useplatformclock
@echo
@echo Disable dynamic tick (laptop power savings)
bcdedit /set disabledynamictick yes
@echo
@echo Disable synthetic timers
bcdedit /set useplatformtick yes
@echo
@echo Boot timeout 10
bcdedit /timeout 10
@echo
@echo Disable nx
bcdedit /set nx optout
@echo
@echo Disable boot screen animation
bcdedit /set bootux disabled
@echo
@echo Speed up boot times
bcdedit /set bootmenupolicy standard
@echo
@echo Remove windows login logo
bcdedit /set quietboot yes
@echo
@echo Disable boot logo
bcdedit /set {globalsettings} custom:16000067 true
@echo
@echo Disable spinning animation
bcdedit /set {globalsettings} custom:16000069 true
@echo
@echo Disable boot messages
bcdedit /set {globalsettings} custom:16000068 true
@echo
pause
