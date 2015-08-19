package day2;

class WicketKeeperMen extends MensTeam
{
    int numberOfCatches;
    int numberOfStumpings;
    
    WicketKeeperMen(String name, int matchesPlayed, int runsScored, int numberOfCatches, int numberOfStumpings)
    {
        super(name, matchesPlayed, runsScored);
        this.numberOfCatches = numberOfCatches;
        this.numberOfStumpings = numberOfStumpings;
    }

    void keepWickets()
    {
    }
    
    void stumpBatsmen()
    {
    }
    
    void makeAppeals()
    {
    }

    
}
