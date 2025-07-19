package com.wearl.aichatbot;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChatBotGUI {

    private static JTextArea chatArea;
    private static JTextField inputField;

    public static void launchGUI() {
        JFrame frame = new JFrame("AI ChatBot - Java Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);
        frame.setLayout(new BorderLayout());

        chatArea = new JTextArea();
        chatArea.setEditable(false);
        chatArea.setLineWrap(true);
        chatArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(chatArea);

        inputField = new JTextField();
        JButton sendButton = new JButton("Send");

        JPanel inputPanel = new JPanel(new BorderLayout());
        inputPanel.add(inputField, BorderLayout.CENTER);
        inputPanel.add(sendButton, BorderLayout.EAST);

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(inputPanel, BorderLayout.SOUTH);

        // Send message action
        ActionListener sendAction = e -> sendMessage();

        sendButton.addActionListener(sendAction);
        inputField.addActionListener(sendAction); // Press enter

        frame.setVisible(true);
    }

    private static void sendMessage() {
        String userText = inputField.getText().trim();
        if (userText.isEmpty()) return;

        chatArea.append("You: " + userText + "\n");
        inputField.setText("");

        String reply = generateReply(userText);
        chatArea.append("Bot: " + reply + "\n");

        // Speak the reply
        TTSUtil.speak(reply);
    }

    private static String generateReply(String input) {
        input = input.toLowerCase();

        if (input.contains("hello")) return "Hi there!";
        if (input.contains("hy")) return "Hi Saurabhh Boss";
        if (input.contains("how are you")) return "I'm doing great!";
        if (input.contains("bye")) return "Goodbye!";
        return "Sorry, I don't understand.";
    }
}
