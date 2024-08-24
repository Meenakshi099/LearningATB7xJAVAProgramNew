package multipleInheritenance;

public class WagnoR implements Engine{


        void drive(){
            startEngine();
            stopEngine();
        }

        @Override
        public void startEngine() {
            System.out.println("Wagon R i starting");
        }

        @Override
        public void stopEngine() {
            System.out.println("Wagon R i Stopping");
        }
}
