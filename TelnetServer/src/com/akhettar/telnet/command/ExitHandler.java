package com.akhettar.telnet.command;


public class ExitHandler implements CommandHandler {

    @Override
    public String handle() {

        return "\nGoodbye... \nConnection aborted...";
    }

}
