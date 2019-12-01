public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Cherno Alpha");
        jaegerOne.setMark("Mark 1");
        jaegerOne.setSpeed(8);
        jaegerOne.setHeight(10.8f);
        jaegerOne.drift();
        jaegerOne.scanKaiju();
        jaegerOne.useVortexCannon();
        System.out.println("We have  jaegers - " + jaegerOne.getModelName());
        System.out.println("They have model mark - " + jaegerOne.getMark());
        System.out.println("They have speed- " + jaegerOne.getSpeed());
        System.out.println("Their height  - " + jaegerOne.getHeight());
    }
}