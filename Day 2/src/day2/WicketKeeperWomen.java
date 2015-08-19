package day2;

class WicketKeeperWomen extends WomensTeam
{
    int numberOfCatches;
    int numberOfStumpings;
    
    WicketKeeperWomen(String name, int matchesPlayed, int runsScored, int numberOfCatches, int numberOfStumpings)
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

