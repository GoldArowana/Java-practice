package com.aries.learn.vertx.core.example;

import io.vertx.core.Vertx;
import io.vertx.core.file.FileSystem;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        FileSystem fileSystem = vertx.fileSystem();
        FileSystem file = fileSystem.createFile("./createFileTest", (h) -> {
            System.out.println(h);
        });
        vertx.close();
    }
}
