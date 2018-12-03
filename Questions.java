package com.example.ashnaanil.myapplicationmonday2;

public class Questions {

    public String mQuestions[] = {
            "Which is the biggest country in the world?",
            "Which is the biggest animal in the world?",
            "Which is the biggest planet?",
            "Which car brand has 4 rings in the world?",
            "Which is the smallest country in the world?",
            "Which is the smallest dog in the world?",
            "Which is the smallest planet?",
            "What is the Capital city of Spain?",
            "Who won the 2018 FIFA World Cup?",
            "Bees are found on every continent of earth except for one, which is it?",
            "This is the star closest to our solar system other than the Sun",
            "Which of the following foods contains its own immune system?"
    };

    private String mChoices[][] = {
            {"Russia", "USA", "China", "UK"},
            {"Blue Whale", "Mammoth", "African Elephant", "Shark"},
            {"Earth", "Jupiter", "Uranus", "Mars"},
            {"Ford", "Audi", "BMW", "Lexus"},
            {"Monaco", "San Marino", "Vatican City", "Nauru"},
            {"Pomeranian", "Pug", "French Bulldog", "Chihuahua"},
            {"Earth", "Venus", "Saturn", "Pluto"},
            {"Barcelona" , "Madrid", "Seville" , "Ibiza"},
            {"Spain", "Argentina", "France", "Croatia"},
            {"Asia", "Antarctica" , "Europe" , "Australia"},
            {"Altair", "Alpha Centauri B ", "Alpha Centauri A", "Proxima Centauri"},
            {"Eggplants" , "Mushrooms" , "Pears" , "Vanilla Beans"}
    };

    private String mCorrectAnswers[] = {"Russia", "Blue Whale", "Jupiter", "Audi", "Vatican City", "Chihuahua", "Pluto", "Madrid", "France", "Antarctica", "Proxima Centauri", "Mushrooms"};

    public String getQuestions(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a) {
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a) {
        String choice = mChoices[a][2];
        return choice;
    }

    public String getChoice4(int a) {
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
