public class ObjectArraySample {

  public static void main(String[] args) {
    Sample[] samples = new Sample[3];
    samples[0] = new Sample();
    samples[1] = new Sample();
    samples[2] = new Sample();

    for (Sample sample : samples) {
      sample.hello();
    }
  }
}
