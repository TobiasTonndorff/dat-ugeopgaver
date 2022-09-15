int [] arrInt = {4, 2, 3, 1, 2, 4};
String [] arrStr = {"Tub", "Oliver", "Marcus"};
boolean [] arrBool = {false, true, false};

// start
void setup() {
 printStrArr(arrStr);
 println(sumArr(arrInt));
 println(avg(arrInt));
 println(insSort(arrInt));
}

void printStrArr(String[] arr) {
  for(String str : arr) {
    println(str);
  }
}

int sumArr(int[] arr) {
  int sum = 0;
  for(int i : arr) sum += i;
  return sum;
}

int avg(int[] arr) {
  return sumArr(arr) / arr.length;
}

int [] insSort(int [] arr) {
  int key, p;
  for(int i = 0; i < arr.length; i++) {
    
    key = arr[i];
    p = i - 1;
    
    while( p >= 0 && arr[p] > key) {
      arr[p+1] = arr[p];
      p = p - 1;
    }
    arr[p+1] = key;
  }
  return arr;
}
 
