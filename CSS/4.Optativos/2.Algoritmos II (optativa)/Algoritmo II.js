// funcion 1
function printUpTo(x) {
  // your code here
  for (var i = 0; i <= x; i++) {
    if (i > 0 && i <= x) {
      console.log(i);
    }
    else if (i < 0 && i <= x) {
      console.log('falso');
    }
  }
}
    printUpTo(1000); // debería imprimir todos los enteros de 1 to 1000
    y = printUpTo(-10); // debería imprimir false
    console.log(y); // debería imprimir false

// funcion 2

function printSum(x) {
  var sum = 0;
  //your code here
  for (var i = 1; i <= x; i++){
    sum = sum + i;
    console.log(i,sum);
  }
  return sum
}
y = printSum(255) // debería imprimir todos los enteros de 0 a 255 y que cada entero imprima la suma parcial.
console.log(y) // // debería imprimir 32640

// funcion 3

function printSumArray(x) {
  var sum = 0;
  for(var i=0; i<x.length; i++) {
    //your code here
    sum = sum + x[i];
  }
  return sum;
}
console.log( printSumArray([1,2,3]) ); // debería imprimir 6

// funcion 4

function largestElement (x){
  var largest= x[0];
  for(var i=0; i< x.length; i++){
    if(x[i] > largest)
    largest = x[i];
  }
  return largest;
}
console.log(largestElement([5,7,4,10,20]));