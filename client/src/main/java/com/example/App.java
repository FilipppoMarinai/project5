package com.example;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            Socket socket = new Socket("127.0.0.1", 8080);

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            ObjectMapper objectMapper = new ObjectMapper();
            
            String classe = in.readLine();

            Aula c = objectMapper.readValue(classe, Aula.class);

            System.out.println(c.toString());

            socket.close();
            out.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
