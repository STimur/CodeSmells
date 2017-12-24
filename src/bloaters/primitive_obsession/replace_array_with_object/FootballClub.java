package bloaters.primitive_obsession.replace_array_with_object;

public class FootballClub {
    Performance performance = new Performance();

    public void setSeasonStatistics(int wins, int losses, int draws) {
        performance.wins = wins;
        performance.losses = losses;
        performance.draws = draws;
    }
}
