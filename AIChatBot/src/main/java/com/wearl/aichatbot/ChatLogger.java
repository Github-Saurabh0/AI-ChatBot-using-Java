/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wearl.aichatbot;

/**
 *
 * @author Saurabh
 */

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ChatLogger {

    private static final String LOG_FOLDER = "chat_logs/";

    public static void logMessage(String message) {
        try {
            // Create folder if not exists
            File dir = new File(LOG_FOLDER);
            if (!dir.exists()) dir.mkdirs();

            // File name = chat_YYYY-MM-DD.txt
            String fileName = "chat_" + new SimpleDateFormat("yyyy-MM-dd").format(new Date()) + ".txt";
            File file = new File(LOG_FOLDER + fileName);

            // Append message
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            writer.write(message);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.err.println("❌ Failed to log message: " + e.getMessage());
        }
    }
}
