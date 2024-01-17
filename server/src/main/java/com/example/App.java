package com.example;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
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
        try{
            ServerSocket server = new ServerSocket(8080);
            System.out.println("Server avviato");

            Socket socket = server.accept();

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            ArrayList<Studente> studenti = new ArrayList<>();

            Studente s1 = new Studente("Mario", "Rossi");
            Studente s2 = new Studente("Luca", "Gialli");
            Studente s3 = new Studente("Paolo", "Bianchi");
            Studente s4 = new Studente("Gianluca", "Verdi");

            studenti.add(s1);
            studenti.add(s2);
            studenti.add(s3);
            studenti.add(s4);

            Aula classe = new Aula("5", "C", "IA", studenti);

            ObjectMapper objectMapper = new ObjectMapper();

            String c = objectMapper.writeValueAsString(classe);

            out.writeBytes(c + "\n");

            server.close();
            in.close();

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
