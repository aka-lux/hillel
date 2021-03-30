package com.zakharchenko.homeworks.homework_18;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.jfr.FlightRecorderListener;

import java.io.*;
import java.net.Socket;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;

public class MySocket {

    public static void main(String[] args) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();
        String request = "GET /users/5 HTTP/1.1\n" +
                "Host: jsonplaceholder.typicode.com\n" +
                "\n\n";
        int ch;
        String line;
        StringBuilder buffer = new StringBuilder();

        try {
            Socket clientSocket = new Socket("172.64.200.15", 80);  //172.64.200.15  //jsonplaceholder.typicode.com

            InputStream inputStream = clientSocket.getInputStream();
            OutputStream outputStream = clientSocket.getOutputStream();

            outputStream.write(request.getBytes(StandardCharsets.UTF_8));
            while ((ch = inputStream.read()) != -1) {
                buffer.append((char) ch);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        int jsonStartPosition = buffer.toString().indexOf("{\n");
        line = buffer.toString().substring(jsonStartPosition);

        try {
            User user = objectMapper.readValue(line, User.class);
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
