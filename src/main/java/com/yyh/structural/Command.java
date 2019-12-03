package main.java.com.yyh.structural;

public class Command {
    class RemoteCommand {
        void excute(){}
        void undo(){}
    }
    class RemoteControl {
        RemoteCommand[] onCommands;
        RemoteCommand[] offCommands;
        RemoteCommand undo;

        public RemoteControl() {
            onCommands = new RemoteCommand[7];
            offCommands = new RemoteCommand[7];
        }
        void setControl(int slot, RemoteCommand onCommand, RemoteCommand offCommand) {
            onCommands[slot] = onCommand;
            offCommands[slot] = offCommand;
        }

        void onButtonPush(int slot) {
            onCommands[slot].excute();
            undo = onCommands[slot];
        }

        void offButtonPush(int slot) {
            offCommands[slot].excute();
            undo = offCommands[slot];
        }

        void undoButtonPush() {
            undo.excute();
        }
    }
}
