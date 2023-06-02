public enum Exercise {

    North_Central("Benue","FCT","Kogi","Kwara","Nasarawa","Niger","Plateau"),
    North_East("Adamawa","Bauchi","Borno","Gombe","Taraba","Yobe"),
    North_West("Kaduna", "Katsina", "Kano", "Kebbi", "Sokoto", "Jigawa","Zamfara"),
    South_East("Abia", "Anambra", "Ebonyi", "Enugu", "Imo"),
    South_South("Akwa-Ibom", "Bayelsa", "Cross-River", "Delta", "Edo", "Rivers"),
    South_West("Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo");




    private String[] state;
    Exercise(String... state){
        this.state = state;

    }
    public String[] getState(){
        return state;
    }
    public static void main(String[] args) {
        Exercise[] myState = Exercise.values();
        for (Exercise stateNow: myState);

    }

}
