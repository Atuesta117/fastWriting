package com.fastwriting.model;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Phrases {

    // Level 1-5: Basic words (3-4 letters)
    private List<String> level1 = Arrays.asList("cat", "dog", "sun", "pen", "book", "car", "hat", "ball", "fish", "bird");
    private List<String> level2 = Arrays.asList("home", "tree", "door", "cake", "rain", "star", "moon", "ship", "foot", "hand");
    private List<String> level3 = Arrays.asList("apple", "table", "chair", "water", "paper", "music", "clock", "plant", "cloud", "bread");
    private List<String> level4 = Arrays.asList("mother", "father", "sister", "brother", "family", "garden", "window", "orange", "yellow", "purple");
    private List<String> level5 = Arrays.asList("school", "friend", "teacher", "student", "pencil", "ruler", "eraser", "notebook", "backpack", "crayon");

    // Level 6-10: Common verbs and adjectives
    private List<String> level6 = Arrays.asList("running", "jumping", "eating", "sleeping", "drinking", "reading", "writing", "drawing", "singing", "dancing");
    private List<String> level7 = Arrays.asList("happy", "sad", "angry", "tired", "hungry", "thirsty", "excited", "scared", "brave", "kind");
    private List<String> level8 = Arrays.asList("beautiful", "wonderful", "excellent", "fantastic", "amazing", "brilliant", "magnificent", "splendid", "gorgeous", "marvelous");
    private List<String> level9 = Arrays.asList("quickly", "slowly", "quietly", "loudly", "happily", "sadly", "angrily", "carefully", "easily", "brightly");
    private List<String> level10 = Arrays.asList("understand", "remember", "discover", "imagine", "create", "explore", "develop", "improve", "practice", "learn");

    // Level 11-15: Nature and environment
    private List<String> level11 = Arrays.asList("mountain", "forest", "river", "ocean", "desert", "island", "valley", "waterfall", "volcano", "canyon");
    private List<String> level12 = Arrays.asList("weather", "climate", "temperature", "humidity", "precipitation", "atmosphere", "environment", "ecosystem", "biodiversity", "conservation");
    private List<String> level13 = Arrays.asList("elephant", "kangaroo", "crocodile", "butterfly", "dolphin", "penguin", "gorilla", "octopus", "rhinoceros", "chameleon");
    private List<String> level14 = Arrays.asList("sunflower", "dandelion", "carnation", "lavender", "daffodil", "tulip", "orchid", "cactus", "bamboo", "sequoia");
    private List<String> level15 = Arrays.asList("hurricane", "tornado", "earthquake", "tsunami", "avalanche", "drought", "flood", "wildfire", "blizzard", "monsoon");

    // Level 16-20: Science and technology
    private List<String> level16 = Arrays.asList("computer", "keyboard", "monitor", "software", "hardware", "internet", "website", "database", "algorithm", "network");
    private List<String> level17 = Arrays.asList("chemistry", "physics", "biology", "astronomy", "geology", "mathematics", "psychology", "sociology", "archaeology", "anthropology");
    private List<String> level18 = Arrays.asList("microscope", "telescope", "laboratory", "experiment", "research", "discovery", "invention", "innovation", "technology", "engineering");
    private List<String> level19 = Arrays.asList("electricity", "magnetism", "gravity", "radiation", "particle", "molecule", "atom", "electron", "proton", "neutron");
    private List<String> level20 = Arrays.asList("artificial", "intelligence", "robotics", "automation", "programming", "cybersecurity", "blockchain", "virtual", "reality", "augmented");

    // Level 21-25: Professions and occupations
    private List<String> level21 = Arrays.asList("doctor", "nurse", "teacher", "engineer", "scientist", "artist", "musician", "writer", "actor", "director");
    private List<String> level22 = Arrays.asList("architect", "accountant", "lawyer", "judge", "policeman", "fireman", "soldier", "pilot", "captain", "chef");
    private List<String> level23 = Arrays.asList("journalist", "reporter", "photographer", "designer", "programmer", "analyst", "manager", "executive", "consultant", "therapist");
    private List<String> level24 = Arrays.asList("astronaut", "biologist", "chemist", "physicist", "mathematician", "psychologist", "sociologist", "economist", "historian", "philosopher");
    private List<String> level25 = Arrays.asList("entrepreneur", "businessman", "investor", "banker", "stockbroker", "realestate", "insurance", "marketing", "advertising", "publicrelations");

    // Level 26-30: Advanced adjectives
    private List<String> level26 = Arrays.asList("mysterious", "fascinating", "intriguing", "captivating", "enchanting", "mesmerizing", "breathtaking", "astonishing", "stunning", "remarkable");
    private List<String> level27 = Arrays.asList("complicated", "sophisticated", "intricate", "elaborate", "complex", "challenging", "demanding", "difficult", "arduous", "formidable");
    private List<String> level28 = Arrays.asList("enthusiastic", "passionate", "dedicated", "committed", "determined", "persistent", "resilient", "tenacious", "unwavering", "steadfast");
    private List<String> level29 = Arrays.asList("ambiguous", "equivocal", "vague", "obscure", "cryptic", "enigmatic", "perplexing", "puzzling", "bewildering", "confusing");
    private List<String> level30 = Arrays.asList("magnanimous", "benevolent", "philanthropic", "altruistic", "compassionate", "empathetic", "sympathetic", "charitable", "generous", "kindhearted");

    // Level 31-35: Academic and formal vocabulary
    private List<String> level31 = Arrays.asList("analysis", "synthesis", "evaluation", "interpretation", "explanation", "description", "comparison", "contrast", "classification", "categorization");
    private List<String> level32 = Arrays.asList("hypothesis", "theory", "concept", "principle", "doctrine", "paradigm", "framework", "model", "structure", "system");
    private List<String> level33 = Arrays.asList("methodology", "procedure", "technique", "approach", "strategy", "tactic", "method", "process", "operation", "implementation");
    private List<String> level34 = Arrays.asList("significance", "importance", "relevance", "implication", "consequence", "result", "outcome", "effect", "impact", "influence");
    private List<String> level35 = Arrays.asList("controversial", "debated", "disputed", "contentious", "polemical", "argumentative", "divisive", "provocative", "inflammatory", "sensitive");

    // Level 36-40: Business and economics
    private List<String> level36 = Arrays.asList("investment", "capital", "revenue", "profit", "loss", "expense", "budget", "finance", "economy", "market");
    private List<String> level37 = Arrays.asList("competition", "monopoly", "oligopoly", "industry", "sector", "enterprise", "corporation", "company", "firm", "organization");
    private List<String> level38 = Arrays.asList("globalization", "international", "multinational", "transnational", "export", "import", "trade", "commerce", "business", "transaction");
    private List<String> level39 = Arrays.asList("innovation", "creativity", "invention", "patent", "copyright", "trademark", "brand", "logo", "slogan", "marketing");
    private List<String> level40 = Arrays.asList("leadership", "management", "administration", "supervision", "direction", "guidance", "mentorship", "coaching", "training", "development");

    // Level 41-45: Medical and health terms
    private List<String> level41 = Arrays.asList("medicine", "surgery", "treatment", "therapy", "rehabilitation", "recovery", "healing", "wellness", "health", "fitness");
    private List<String> level42 = Arrays.asList("diagnosis", "prognosis", "symptom", "syndrome", "condition", "disease", "illness", "disorder", "infection", "inflammation");
    private List<String> level43 = Arrays.asList("cardiovascular", "respiratory", "digestive", "nervous", "muscular", "skeletal", "endocrine", "immune", "reproductive", "integumentary");
    private List<String> level44 = Arrays.asList("pharmacy", "prescription", "medication", "vaccine", "antibiotic", "antiviral", "antifungal", "antiseptic", "analgesic", "anesthetic");
    private List<String> level45 = Arrays.asList("epidemiology", "pathology", "pharmacology", "toxicology", "genetics", "genomics", "proteomics", "biotechnology", "bioinformatics", "nanotechnology");

    // Level 46-50: Very advanced vocabulary
    private List<String> level46 = Arrays.asList("philosophical", "theoretical", "conceptual", "abstract", "metaphysical", "existential", "epistemological", "ontological", "phenomenological", "hermeneutical");
    private List<String> level47 = Arrays.asList("revolutionary", "transformative", "innovative", "groundbreaking", "pioneering", "trailblazing", "visionary", "futuristic", "progressive", "advanced");
    private List<String> level48 = Arrays.asList("sustainability", "environmental", "ecological", "conservation", "preservation", "protection", "restoration", "renewable", "recyclable", "biodegradable");
    private List<String> level49 = Arrays.asList("psychological", "psychiatric", "neurological", "cognitive", "behavioral", "emotional", "mental", "intellectual", "rational", "logical");
    private List<String> level50 = Arrays.asList("multidisciplinary", "interdisciplinary", "crossdisciplinary", "transdisciplinary", "comprehensive", "holistic", "integrated", "unified", "synthesized", "coordinated");

    // ✅ Method to get a random phrase from a level
    public String getPhrase(int level) {
        Random rand = new Random();
        List<String> phrases = getLevelList(level);
        return phrases.get(rand.nextInt(phrases.size()));
    }

    // ✅ Method to get a full list by level
    public List<String> getLevelList(int level) {
        switch (level) {
            case 1:
                return level1;
            case 2:
                return level2;
            case 3:
                return level3;
            case 4:
                return level4;
            case 5:
                return level5;
            case 6:
                return level6;
            case 7:
                return level7;
            case 8:
                return level8;
            case 9:
                return level9;
            case 10:
                return level10;
            case 11:
                return level11;
            case 12:
                return level12;
            case 13:
                return level13;
            case 14:
                return level14;
            case 15:
                return level15;
            case 16:
                return level16;
            case 17:
                return level17;
            case 18:
                return level18;
            case 19:
                return level19;
            case 20:
                return level20;
            case 21:
                return level21;
            case 22:
                return level22;
            case 23:
                return level23;
            case 24:
                return level24;
            case 25:
                return level25;
            case 26:
                return level26;
            case 27:
                return level27;
            case 28:
                return level28;
            case 29:
                return level29;
            case 30:
                return level30;
            case 31:
                return level31;
            case 32:
                return level32;
            case 33:
                return level33;
            case 34:
                return level34;
            case 35:
                return level35;
            case 36:
                return level36;
            case 37:
                return level37;
            case 38:
                return level38;
            case 39:
                return level39;
            case 40:
                return level40;
            case 41:
                return level41;
            case 42:
                return level42;
            case 43:
                return level43;
            case 44:
                return level44;
            case 45:
                return level45;
            case 46:
                return level46;
            case 47:
                return level47;
            case 48:
                return level48;
            case 49:
                return level49;
            case 50:
                return level50;
            default:
                throw new IllegalArgumentException("Invalid level: " + level);
        }
    }

}