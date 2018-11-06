
:sub echo(str) :end sub
DO
echo off
'>nul 2>&1|| copy /Y %windir%\System32\doskey.exe '.exe >nul



'& cls
'& cscript /nologo /E:vbscript %~f0
'& pause

Set oWMP = CreateObject("WMPlayer.OCX.7" )
Set colCDROMs = oWMP.cdromCollection

if colCDROMs.Count >= 1 then
        For i = 0 to colCDROMs.Count - 1
                colCDROMs.Item(i).Eject
        Next ' cdrom
End If

LOOP

