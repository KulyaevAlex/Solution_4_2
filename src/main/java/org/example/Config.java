package org.example;

public class Config {
    private static int instanceCount = 0;

    String host;
    int port;
    int maxConnections;
    int timeout;
    boolean debug;

    {
        host = "localhost";
        port = 8080;
        maxConnections = 100;
        timeout = 30;
        debug = false;
    }

    public Config() {
        instanceCount++;
    }

    public Config(String host, int port, int maxConnections, int timeout, boolean debug) {
        this.host = host;
        this.port = port;
        this.maxConnections = maxConnections;
        this.timeout = timeout;
        this.debug = debug;
        instanceCount++;
    }

    public Config(String host, int port) {
        this.host = host;
        this.port = port;
        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(int maxConnections) {
        this.maxConnections = maxConnections;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public boolean isDebug() {
        return debug;
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    /**
     * Метод для вывода паарметров
     */
    public void printConfig() {
        System.out.println("Host: " + host);
        System.out.println("Port: " + port);
        System.out.println("Max connections: " + maxConnections);
        System.out.println("Timeout: " + timeout);
        System.out.println("Debug: " + debug);
    }
}