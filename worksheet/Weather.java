public class Weather {

    public static void main(String[] args) {
        Weather weather1 = new Weather();
        Weather weather2 = new Weather();
        System.out.println(weather1.checkWeatherCondition("snowy"));
        System.out.println(weather2.checkWeatherCondition("rainy"));

    }

    public String checkWeatherCondition(String weatherCondition) {

        switch (weatherCondition) {
            case "sunny": return "wear sunglasses";
            case "windy": return "wear jacket";
            case "rainy": return "take umbrella";
            case "snowy": return "stay at home";
            default: return "check your weather";

        }
    }
}
