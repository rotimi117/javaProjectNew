package Television;

import java.util.Arrays;

public class NigeriaZone {
    public static final User NORTH_CENTRAL = ;
    private int[] state;

    public class NigeriaZones {

        private int[] state;

        public int[] getState(){
            return state;
        }

        public static void main(String[] args){
            Television.NigeriaZone[] myStates = Television.NigeriaZone.values();
            for (Television.NigeriaZone stateNow: myStates){
                System.out.println(stateNow + " " + Arrays.toString(stateNow.state));
            }

        }

        private static Television.NigeriaZone[] values() {
            return new Television.NigeriaZone[0];
        }

    }

    private static NigeriaZone[] values() {
        return new NigeriaZone[0];
    }

}
