package dairyApp;

import java.util.ArrayList;
import java.util.List;

public class Dairy {
    private boolean isLocked = true;
    private List<Gist> gists = new ArrayList<>();
    private int gistCount;
    private String password;
    public Dairy(String username, String password) {
    this.password = password;
    }

    public boolean isLocked() {
        return isLocked;
    }
    public void unlockWith(String password) {
        boolean passwordIsCorrect = password.equals(this.password);
        if(passwordIsCorrect) unlockDiary();
    }
    private void unlockDiary() {
        isLocked = false;
    }
    public void lock() {
        isLocked = true;
    }
    public void addGist(String title, String body) {
        Gist newGist = new Gist(title, body);
        gists.add(new Gist(title, body));
    }
    public int countGist() {
     return gists.size();
    }

    public Gist findGistByTitle(String title) {
        for (Gist gist: gists){
            if(gist.getTitle().equals(title)) return gist;
        }
        return null;
    }
}
