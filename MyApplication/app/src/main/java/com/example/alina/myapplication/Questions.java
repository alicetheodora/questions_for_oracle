package com.example.alina.myapplication;


public class Questions {

    public String mQuestions[]={
        "Care este sportul tau preferat?",
        "Ce hobby-uri ai?" ,
        "Care fel de localuri preferi?",
        "Cand ai citit ultima data o carte?",
        "Ce fel de carti preferi?",
        "Ce film ai vazut in ultimul timp?",
        "Ce ti-a captat atentia?",
        "Gatesti? Daca da, ce cultura iubesti?",
        "Urmezi studii universitare?",
        "Ce ai vrea sa faci dupa ce termini?",
        "Esti intr-o relatie?",
        "Care este cel mai frumos lucru pe care l-ai facut alaturi de prietenul/a ta/tau?",
        "Care este scopul tau in viata?",
        "Te consideri un om fericit?",
        "Ce ai schimba daca te-ai intoarce in trecut?",
        "Ce tip de muzica preferi?",
        "Care este cantaretul favorit?",
        "Consideri muzica actuala,mai buna decat cea de acum 10,20,30 ani?",
        "Ce ai schimba la ea?",
        "Esti o persoana patriotica?",
        "Te consideri un om perfect?",
        "Ce ai schimba la tine?",
        "Ce faci cand un prieten are nevoie de tine?",
        "Esti o persoana optimista ?",
        "Esti pregatit/a sa te schimbi?"
    };

    private String mChoices[][]={
        {"footbal","inotul","nu am","alt sport"},
        {"muzica","citirea cartilor","calatorii","muzica"},
        {"unde este multa muzica","nu frecventez localurile","unde este liniste","nu am un reper"},
        {"nu imi amintesc","in ultima saptamana","acum un an","azi"},
        {"tragice/drama","haioase","dragoste","aventura"},
        {"aventura","thriller","iubire","science fiction"},
        {"actorii","povestea","nimic","totul"},
        {"asiatica","nu","romaneasca","italieneasca"},
        {"da","nu","am intentia","nu ma intereseaza"},
        {"sa ma angajez in domeniu","nu m-am gandit","nu stiu ce urmeaza sa se intample maine","sunt angajat"},
        {"nu","da","nu ma intreba","vreau sa gasesc pe cineva"},
        {"am calatorit intr-un loc fantastic","nimic deosebit","am participat alaturi de el la un concurs/l-am sustinut","o cina romantica"},
        {"sa imi fac o cariera","sa ma casatoresc","sa ma distrez","sa devin milionar"},
        {"nu","da","desigur","inca lucrez la asta"},
        {"nimic","prietenii","pe mine","atitudinea vis-a-vis de viata"},
        {"rock","pop","clasic","manele"},
        {"Florin Salam/Nicolae Guta","Inna/Andra/Dorian","Mickael Jackson/Celine Dion/Justin Biber","Irina Loghin/Fuego"},
        {"nu","da","nu ma intereseaza","chiar nu stiu"},
        {"totul","nimic","cantaretii","cuvintele"},
        {"da","nu","tin cu cine are dreptate","imi iubesc tara si originile"},
        {"da","nu stiu","nu","bineinteles"},
        {"atitudinea","nimic","corpul","ceeea ce fac acum"},
        {"il ajut","nu stiu","daca pot ,bineinteles","il indrum ce sa faca"},
        {"da","nu","nu intotdeauna","nu stiu ce sa raspund"},
        {"da","nu","niciodata","de ce as face asta?"}
    };

    private String mCorrectAnswers[]={
            "footbal","inotul","nu am","alt sport",
            "muzica","citirea cartilor","calatorii","muzica",
            "unde este multa muzica","nu frecventez localurile","unde este liniste","nu am un reper",
            "nu imi amintesc","in ultima saptamana","acum un an","azi",
            "tragice/drama","haioase","dragoste","aventura",
            "aventura","thriller","iubire","science fiction",
            "actorii","povestea","nimic","totul",
            "asiatica","nu","romaneasca","italieneasca",
            "da","nu","am intentia","nu ma intereseaza",
            "sa ma angajez in domeniu","nu m-am gandit","nu stiu ce urmeaza sa se intample maine","sunt angajat",
            "nu","da","nu ma intreba","vreau sa gasesc pe cineva",
            "am calatorit intr-un loc fantastic","nimic deosebit","am participat alaturi de el la un concurs/l-am sustinut","o cina romantica",
            "sa imi fac o cariera","sa ma casatoresc","sa ma distrez","sa devin milionar",
            "nu","da","desigur","inca lucrez la asta",
            "nimic","prietenii","pe mine","atitudinea vis-a-vis de viata",
            "rock","pop","clasic","manele",
            "Florin Salam/Nicolae Guta","Inna/Andra/Dorian","Mickael Jackson/Celine Dion/Justin Biber","Irina Loghin/Fuego",
            "nu","da","nu ma intereseaza","chiar nu stiu",
            "totul","nimic","cantaretii","cuvintele",
            "da","nu","tin cu cine are dreptate","imi iubesc tara si originile",
            "da","nu stiu","nu","bineinteles",
            "atitudinea","nimic","corpul","ceeea ce fac acum",
            "il ajut","nu stiu","daca pot ,bineinteles","il indrum ce sa faca",
            "da","nu","nu intotdeauna","nu stiu ce sa raspund",
            "da","nu","niciodata","de ce as face asta?"
    };

    public String getQuestion(int a){
         String question = mQuestions[a];
         return question;
    }

    public String getChoice1(int a){
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a){
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a){
        String choice = mChoices[a][2];
        return choice;
    }

    public String getChoice4(int a){
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer =mCorrectAnswers[a];
        return answer;
    }


}
