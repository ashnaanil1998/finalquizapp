package com.example.ashnaanil.myapplicationmonday2;

public class Questions {

    public String myQuestions[] = {
            "Which is the biggest country in the world?",
            "Which is the biggest animal in the world?",
            "Which is the biggest planet?",
            "Which car brand has 4 rings?",
            "Which is the smallest country in the world?",
            "Which is the smallest dog in the world?",
            "Which is the smallest planet?",
            "What is the Capital city of Spain?",
            "Who won the 2018 FIFA World Cup?",
            "Bees are found on every continent of earth except for one, which is it?",
            "This is the star closest to our solar system other than the Sun",
            "Which of the following foods contains its own immune system?",
            "What is the country of origin of the Zodiac signs?",
            "How many Zodiac signs are there?",
            "Tropical monsoon and equatorial climate are kinds of",
            "Percentage of salt water present on surface of earth is",
            "A female donkey is called a what?",
            "What is the Capital city of India?",
            "Which country has the big ben",
            "Which country was Hitler born in?",
            "What is the Capital city of China?",
            "Which is the biggest city in the world?"
    };

    private String myChoices[][] = {
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
            {"Eggplants" , "Mushrooms" , "Pears" , "Vanilla Beans"},
            {"China", "USA", "Greece", "Egypt"},
            {"twelve" , "forty-eight" , "ten" , "three"},
            {"polar" , "temperate", "tropical" , "frontal"},
            {"75%" , "80%", "90%" , "97%"},
            {"Mule" , "Jenny" , "Donkey" , "Horse"},
            {"New Delhi", "Mumbai", "Bangalore" , "Goa"},
            {"Australia", "South Africa" , "England" , "France"},
            {"Germany", "Poland" , "Austria", "Ukraine"},
            {"Shanghai" , "Beijing", "Hong Kong", "Hangzhou"},
            {"Mumbai" , "London", "Seoul", "Sao Paulo"}
    };

    private String myCorrectAnswers[] = {"Russia", "Blue Whale", "Jupiter", "Audi", "Vatican City", "Chihuahua", "Pluto", "Madrid", "France", "Antarctica", "Proxima Centauri", "Mushrooms", "Egypt", "twelve", "tropical", "97%", "Jenny", "New Delhi", "England", "Austria", "Beijing", "Seoul"};

    public String getQuestions(int a) {
        String question = myQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice = myChoices[a][0];
        return choice;
    }

    public String getChoice2(int a) {
        String choice = myChoices[a][1];
        return choice;
    }

    public String getChoice3(int a) {
        String choice = myChoices[a][2];
        return choice;
    }

    public String getChoice4(int a) {
        String choice = myChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a) {
        String answer = myCorrectAnswers[a];
        return answer;
    }

}
