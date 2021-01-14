import java.util.ArrayList;

public class Issue {
    String reporter; // who gives us the issue
    String title;
    String date;
    String priorities;
    String description;
    int likesCount;
    boolean isFixed;


    public Issue(String reporter, String title, String date, String priorities, String description, int likesCount, boolean isFixed) {
        this.reporter = reporter;
        this.title = title;
        this.date = date;
        this.priorities = priorities;
        this.description = description;
        this.likesCount = likesCount;
        this.isFixed = isFixed;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPriorities() {
        return priorities;
    }

    public void setPriorities(String priorities) {
        this.priorities = priorities;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    public boolean isFixed() {
        return isFixed;
    }

    public void setFixed(boolean fixed) {
        isFixed = fixed;
    }
    public ArrayList<Issue> getIssues(){
        ArrayList<Issue> issues = new ArrayList<>();
        issues.add(new Issue(//low. high. medium
                "Jameel","My computer is very slow","2020-01-25","low"
                ,"Every time I run my computer takes a lot of time to start even when I start chrome everything is slow please tell me what I have to do "
                ,1,true));
        issues.add(new Issue(
                "Nader","My computer doesn't work","2020-02-10","high"
                ,"after downloading a game from the browser. later I unzip it then when I try to run the game my computer has been off. next, I could not run my computer"
                ,2000,false));
        issues.add(new Issue(
                "Mira","Tires problem","2020-02-25","medium"
                ,"what should I do if the tire was crashed? I don't have any tool which tool I need to fix or replace. And what the best way to care tire"
                ,4998,true));
        issues.add(new Issue(
                "Nora","Best way to care skin","2020-01-25","low"
                ,"I suffer from acne it takes a lot of time and still not gone. I don't like now to see my face in the mirror. it is impossible how can I hide it and look pretty"
                ,68468,true));

        issues.add(new Issue(
                "Eri","Hole in the road","2021-01-14","high"
                ,"I found a big hole blocking the road, so I can't move my car to go to work. I don't have time, please tell me what to do"
                ,12165132,true));
        issues.add(new Issue(
                "Ali","How I can professional in Valorant","2020-01-25","low"
                ,"I tried to play the game for more than 60 hours. I can't win a ranked game. I am loser How can be pro in this game please because it is a very good game"
                ,6999999,false));
        return issues;
    }
}
