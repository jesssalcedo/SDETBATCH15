package Class25;

public class MovAbleTester {

    public static void main(String[] args) {

        Washable [] washAbles={new SmartWatch(),
                    new Inverter(),new Phone()};

            for(Washable w:washAbles){
                w.wash();
            }
        }
    }
