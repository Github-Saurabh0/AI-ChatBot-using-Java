# Java AI ChatBot

A beginner-to-intermediate level AI ChatBot project built in Java with advanced features like Swing GUI, GPT API integration, text-to-speech, and chat logging.

## Project Structure

```
AIChatBot/
├── src/
│   └── com/
│       └── wearl/
│           └── aichatbot/
│               ├── ChatBotGUI.java         // Swing-based GUI
│               ├── GPTService.java         // OpenAI GPT API handler
│               ├── TTSUtil.java            // FreeTTS integration
│               ├── ChatLogger.java         // Chat history logger
│               └── Main.java               // Entry point to launch GUI
│
├── lib/                                     // FreeTTS JAR dependencies
│   ├── freetts-1.2.2.jar                    // FreeTTS Core Engine
│   ├── cmulex.jar                           // Lexicon data
│   ├── cmutimelex.jar                       // Timing lexicon
│   └── cmu_us_kal.jar                       // Voice (Kevin16)
│
├── config/
│   └── config.properties                    // Stores OpenAI API Key
│
├── chat_logs/                               // Daily chat history
│   └── chat_2025-07-19.txt                  // Example log file
│
├── .nb-configuration/                              // NetBeans project config
│
├── target/                                  // Compiled classes (Maven)
│   └── ...                                  // auto-generated
│
├── README.md                                // Project overview & setup
├── pom.xml                                  // Maven project file
└── .gitignore                               // (optional) Git exclusions

```

## Features

- GUI-based chat interface using Java Swing
- Connects to OpenAI GPT API for smart responses
- Speaks responses using FreeTTS (offline)
- Saves chat history in `.txt` files with date-based naming
- FreeTTS 1.2.2 integrated
- Uses system scope for local JARs
- Simple Java console app
- Maven-compatible


## How to Run

1. Clone or download the repository.
2. Open in NetBeans (or any Java IDE).
3. Add the FreeTTS JAR to your classpath.
4. Add your OpenAI API key in `config/config.properties`.
5. Run `Main.java`.

## Requirements

- Java 8+
- FreeTTS JAR
- Internet connection (for GPT API)
- NetBeans or IntelliJ IDEA (recommended)

## Coming Soon

- Dark mode UI toggle
- Personalized memory feature
- Voice input support


## Output
>  "Hello Saurabh! Your Java AI chatbot is ready to speak using FreeTTS."

## Author
[Saurabh Kushwaha](https://www.linkedin.com/in/saurabh884095/)
