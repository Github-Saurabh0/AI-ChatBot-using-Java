import java.util.*;

public class ChatBot {
    private static final Map<String, String> responses = new HashMap<>();

    static {
        responses.put("hello", "Hi there! How can I help you?");
        responses.put("hi", "Hello! What can I do for you?");
        responses.put("how are you", "I'm just a bot, but I'm doing great!");
        responses.put("bye", "Goodbye! Have a nice day.");
        responses.put("thanks", "You're welcome!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Java AI ChatBot! Type 'exit' to quit.");

        while (true) {
            System.out.print("You: ");
            String input = scanner.nextLine().toLowerCase().trim();

            if (input.equals("exit")) {
                System.out.println("Bot: Bye! See you soon.");
                break;
            }

            boolean found = false;
            for (String key : responses.keySet()) {
                if (input.contains(key)) {
                    System.out.println("Bot: " + responses.get(key));
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Bot: Sorry, I don't understand that.");
            }
        }

        scanner.close();
    }
}
