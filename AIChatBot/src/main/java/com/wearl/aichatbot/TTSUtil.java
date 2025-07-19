package com.wearl.aichatbot;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class TTSUtil {

    private static final String VOICENAME = "kevin16";
    private static Voice voice;

    static {
        try {
            System.setProperty("freetts.voices",
                    "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
            voice = VoiceManager.getInstance().getVoice(VOICENAME);
            if (voice == null) {
                throw new IllegalStateException("Cannot find voice: " + VOICENAME);
            }
            voice.allocate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void speak(String text) {
        if (voice != null) {
            voice.speak(text);
        }
    }
}
