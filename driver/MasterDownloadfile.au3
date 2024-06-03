Sleep(3000)
ConsoleWrite("Before ControlFocus: " & @CRLF)
ControlFocus("Open", "", "Edit1")

Sleep(5000)

; Send the file location with date and time
ControlSend("Open", "", "Edit1", $CmdLine[1])

Sleep(3000)
ConsoleWrite("Before ControlClick: " & @CRLF)
ControlClick("Open", "", "Button1")
