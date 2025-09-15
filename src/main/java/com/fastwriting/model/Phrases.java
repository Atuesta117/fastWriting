package com.fastwriting.model;

import java.util.*;

public class Phrases {

    // Phrase lists by level
    private List<String> level1 = Arrays.asList(
            "Hello",
            "My name is Ana",
            "It is a cat"
    );

    private List<String> level2 = Arrays.asList(
            "Today is sunny",
            "I have a dog",
            "Let's go home"
    );

    private List<String> level3 = Arrays.asList(
            "The house is big",
            "The sky is light blue",
            "I have many flowers"
    );

    private List<String> level4 = Arrays.asList(
            "The dog sleeps peacefully",
            "We will go to the park tomorrow",
            "The beach is very close"
    );

    private List<String> level5 = Arrays.asList(
            "The train goes very fast",
            "I am learning programming",
            "The children play in the yard"
    );

    private List<String> level6 = Arrays.asList(
            "The plane took off in the morning",
            "The mountains have bright snow",
            "It is important to study every day"
    );

    private List<String> level7 = Arrays.asList(
            "The teacher explained the difficult lesson",
            "The summer is hot in my city",
            "I prefer reading adventure books"
    );

    private List<String> level8 = Arrays.asList(
            "The scientist discovered a new formula",
            "The ocean has an immense depth",
            "The friends traveled together on vacation"
    );

    private List<String> level9 = Arrays.asList(
            "The library is full of knowledge",
            "It is essential to practice every day",
            "The electric car is more ecological"
    );

    private List<String> level10 = Arrays.asList(
            "The writer drafted an interesting novel",
            "The computer needs constant maintenance",
            "The students prepare their final presentations"
    );

    private List<String> level11 = Arrays.asList(
            "Effective communication is essential at work",
            "The architect designed a modern and elegant building",
            "The athlete trained intensely for the competition"
    );

    private List<String> level12 = Arrays.asList(
            "Technology is advancing rapidly in today’s world",
            "Democracy requires active citizen participation",
            "The musicians performed a wonderful symphony"
    );

    private List<String> level13 = Arrays.asList(
            "Scientific research drives human development",
            "The engineers built an impressive bridge",
            "Biodiversity is fundamental for the ecosystem"
    );

    private List<String> level14 = Arrays.asList(
            "The knowledge acquired must be applied responsibly",
            "International cooperation promotes world peace",
            "Artificial intelligence transforms modern industry"
    );

    private List<String> level15 = Arrays.asList(
            "Object-oriented programming facilitates modularity",
            "Globalization generates complex challenges and opportunities",
            "Critical thinking is indispensable in today’s society"
    );

    // Method to get a random phrase by level
    public String getPhrase(int level) {
        Random rand = new Random();

        switch (level) {
            case 1: return level1.get(rand.nextInt(level1.size()));
            case 2: return level2.get(rand.nextInt(level2.size()));
            case 3: return level3.get(rand.nextInt(level3.size()));
            case 4: return level4.get(rand.nextInt(level4.size()));
            case 5: return level5.get(rand.nextInt(level5.size()));
            case 6: return level6.get(rand.nextInt(level6.size()));
            case 7: return level7.get(rand.nextInt(level7.size()));
            case 8: return level8.get(rand.nextInt(level8.size()));
            case 9: return level9.get(rand.nextInt(level9.size()));
            case 10: return level10.get(rand.nextInt(level10.size()));
            case 11: return level11.get(rand.nextInt(level11.size()));
            case 12: return level12.get(rand.nextInt(level12.size()));
            case 13: return level13.get(rand.nextInt(level13.size()));
            case 14: return level14.get(rand.nextInt(level14.size()));
            case 15: return level15.get(rand.nextInt(level15.size()));
            default:
                throw new IllegalArgumentException("Invalid level: " + level);
        }
    }

    // ✅ New method: Get the entire list for a level
    public List<String> getLevelList(int level) {
        switch (level) {
            case 1: return level1;
            case 2: return level2;
            case 3: return level3;
            case 4: return level4;
            case 5: return level5;
            case 6: return level6;
            case 7: return level7;
            case 8: return level8;
            case 9: return level9;
            case 10: return level10;
            case 11: return level11;
            case 12: return level12;
            case 13: return level13;
            case 14: return level14;
            case 15: return level15;
            default:
                throw new IllegalArgumentException("Invalid level: " + level);
        }
    }
}
