void setup() {
  emptyLine("");
  filledLine("prints line");
  hiMyName("Tobias", 22);
}
//empty line
String emptyLine(String a) {
  print(a);
  return a;
}
//filled line
String filledLine(String a) {
  print(a);
  return a;
}

String hiMyName(String a, int b) {
  print("My name is ", a, "I am ", b, "old ");
  return a + b;
}
