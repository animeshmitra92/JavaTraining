package day2;

class Batswomen extends WomensTeam
{
    int numberOfCenturies;
    int numberOfHalfCenturies;

    Batswomen(String name, int matchesPlayed, int runsScored, int numberOfCenturies, int numberOfHalfCenturies)
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
