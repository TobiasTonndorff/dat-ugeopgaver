String[] arrStud = {"Tobias", "Seb", "Oliver", "Marcus", "Julius", "Jack", "Anders", "Carsten", "Rasmus", "Bjarke"};
 Teacher Jørg = new Teacher("Jörg", 33, false);
  Student Tobias = new Student("Tobias", 22, true, "Datamatiker B");
  Student Oliver = new Student("oliver", 21, true, "Datamatiker B");



void setup() {
  
  println(Tobias.name, Tobias.datamatikerTeam, Oliver.name, Oliver.datamatikerTeam);
  println(Jørg.name, Jørg.age, Jørg.isFemale);
}
