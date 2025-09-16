package com.fastwriting.model;

import java.util.*;

public class Phrases {

    // Level 1 - Easy words
    private List<String> level1 = Arrays.asList(
            "cat",
            "dog",
            "sun",
            "pen",
            "book"
    );

    private List<String> level2 = Arrays.asList(
            "apple",
            "table",
            "chair",
            "house",
            "tree"
    );

    private List<String> level3 = Arrays.asList(
            "running fast",
            "blue sky",
            "open door",
            "big house",
            "red car"
    );

    private List<String> level4 = Arrays.asList(
            "happy child",
            "green garden",
            "reading books",
            "jumping rope",
            "playing ball"
    );

    private List<String> level5 = Arrays.asList(
            "beautiful flowers",
            "learning English",
            "writing notes",
            "driving cars",
            "eating pizza"
    );

    private List<String> level6 = Arrays.asList(
            "the bus is late",
            "she likes music",
            "the phone is new",
            "I have homework",
            "we love movies"
    );

    private List<String> level7 = Arrays.asList(
            "the dog is barking",
            "children are playing",
            "he is studying hard",
            "they are traveling soon",
            "I am learning Java"
    );

    private List<String> level8 = Arrays.asList(
            "the computer is broken",
            "the teacher is speaking",
            "students are working together",
            "we are planning a trip",
            "the sun is shining brightly"
    );

    private List<String> level9 = Arrays.asList(
            "I am reading an interesting book",
            "the children are playing outside",
            "he is running very fast today",
            "she is watching a funny movie",
            "they are studying for the exam"
    );

    private List<String> level10 = Arrays.asList(
            "the library is full of students",
            "we are preparing for the project",
            "the train arrives at the station",
            "she is writing a long article",
            "I am practicing my typing speed"
    );

    private List<String> level11 = Arrays.asList(
            "effective communication is very important",
            "the engineer is designing a new bridge",
            "the doctor is working at the hospital",
            "the artist is painting a beautiful picture",
            "the team is training for the competition"
    );

    private List<String> level12 = Arrays.asList(
            "technology is advancing very quickly",
            "the company is expanding to new countries",
            "the students are presenting their projects",
            "the musician is playing a wonderful song",
            "the professor is explaining a complex topic"
    );

    private List<String> level13 = Arrays.asList(
            "scientific research helps humanity grow",
            "the architect is building a modern house",
            "the pilot is flying the plane safely",
            "the lawyer is preparing the documents",
            "the farmer is working in the field"
    );

    private List<String> level14 = Arrays.asList(
            "global cooperation promotes world peace",
            "the scientist discovered a new formula",
            "artificial intelligence is transforming industries",
            "the writer is publishing a new book",
            "the programmer is fixing the software bug"
    );

    private List<String> level15 = Arrays.asList(
            "critical thinking is essential in modern society",
            "the globalization brings challenges and opportunities",
            "the athlete is preparing for the Olympics",
            "the journalist is writing an important article",
            "the student is learning computer science"
    );

    private List<String> level16 = Arrays.asList(
            "renewable energy is important for the future",
            "the government is creating new policies",
            "the doctor is researching a new medicine",
            "the company is hiring talented workers",
            "the team is solving complex problems"
    );

    private List<String> level17 = Arrays.asList(
            "environmental protection is a global responsibility",
            "the teacher is motivating the students",
            "the manager is leading the project successfully",
            "the engineer is testing the new machine",
            "the family is planning their vacation"
    );

    private List<String> level18 = Arrays.asList(
            "the scientist is working on climate change solutions",
            "the artist is performing in front of thousands of people",
            "the politician is giving an inspiring speech",
            "the astronaut is exploring outer space",
            "the musician is recording a new album"
    );

    private List<String> level19 = Arrays.asList(
            "the university is investing in advanced research programs",
            "the company is launching an innovative product",
            "the writer is creating a fascinating fantasy novel",
            "the director is making a historical movie",
            "the athlete is breaking world records"
    );

    private List<String> level20 = Arrays.asList(
            "artificial intelligence will shape the future of humanity",
            "the importance of education cannot be underestimated",
            "the economy is influenced by international relations",
            "sustainable development is vital for the environment",
            "the philosopher is questioning the meaning of life"
    );

    // ✅ Method to get a random phrase from a level
    public String getPhrase(int level) {
        Random rand = new Random();
        List<String> phrases = getLevelList(level);
        return phrases.get(rand.nextInt(phrases.size()));
    }

    // ✅ Method to get a full list by level
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
            case 16: return level16;
            case 17: return level17;
            case 18: return level18;
            case 19: return level19;
            case 20: return level20;
            default: throw new IllegalArgumentException("Invalid level: " + level);
        }
    }

}
