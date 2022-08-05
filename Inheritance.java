class Home {
  void stay() {
    System.out.println("In Home");
  }
}
class Work extends Home {
  void wfh() {
    System.out.println("Working from home");
  }
}
class Inheritance {
  public static void main(String args[]) {
    Work w = new Work();
    w.wfh();
    w.stay();
  }
}
