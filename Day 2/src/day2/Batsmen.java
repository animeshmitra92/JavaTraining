package day2;

class Batsmen extends MensTeam
{
    int numberOfCenturies;
    int numberOfHalfCenturies;

    Batsmen(String name, int matchesPlayed, int runsScored, int numberOfCenturies, int numberOfHalfCenturies)
    {
        super(name, matchesPlayed, runsScored);
        this.numberOfCenturies = numberOfCenturies;
        this.numberOfHalfCenturies = numberOfHalfCenturies;
    }

    void openInnings()
    {
    }

    void makeCentury()
    {
    }
    
    void makeHalfCentury()
    {
    }

    
}