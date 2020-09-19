package com.akhettar.telnet.server;


public class ServerLauncher {

    /**
     * Main method.
     * 
     * @param args
     */
    public static void main(String[] args) {

        // launch the server
        new TelnetServer(args.length == 0 ? null : args[0]).run();
    }
}
