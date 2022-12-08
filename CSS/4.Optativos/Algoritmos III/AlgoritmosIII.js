function a(x,y){
    return 5;
}
console.log(a(5,5))

function a(x,y){
    z = []
    z.push(x);
    z.push(y);
    z.push(5);
    console.log(z);
    return z;
}
b = a(2,2)
console.log(b);
console.log(a(6,8));

function a(x){
    z = [];
    z.push(x);
    z.pop();
    z.push(x);
    z.push(x);
    return z;
}
y = a(2);
y.push(5);
console.log(y);

function a(x){
    z = [];
    z.push(x);
    z.pop();
    z.push(x);
    z.push(x);
    return z;
}
y = a(2);
y.push(5);
console.log(y);

function a(x){
    if(x[0] < x[1]) {
        return true;
    }
    else {
        return false;
    }
}
b = a([2,3,4,5])
console.log(b);

function a(x) {
    for(var i, i=0; i< x.length; i++){
        if (x[i] > 0) {
            x[i] = "Coding";
        }
    }
    return x;
}
console.log(a([1,2,3,4]))


function a(x){
    for(var i=0; i<x.length; i++){
        if(x[i] > 5){
            x[i]="Codign";
        } else if (x[i] < 0){
            x[i] ="Dojo";
        }
    }
    return x;
}
console.log(a([5, 7, -1, 4]))

function a(x){
    if(x[0]> x[1]){
        return x[1];
    }
    return 10;
}
b = a([5, 10])
console.log(b)


function sum(x){
    sum = 0;
    for(var i=0; i<x.length; i++){
        sum = sum + x[i];
        console.log(sum);
    }
    return sum;
}

function printAverage(x){
    sum = 0;
    for(i=0; i< x.length; i++){
        sum += x[i];
    }
    prom = sum / x.length;
    return prom;
}
y = printAverage([1,2,3]);
console.log(y); // should log 2

y = printAverage([2,5,8]);
console.log(y); // should log 5

function returnOddArray(){
    arr = [];
	for(i=0; i<= 255; i++){
		if(i % 2 == 1){
            arr.push(i);
        }
	}
    return arr;	
}
y = returnOddArray();
console.log(y); // should log [1,3,5,...,253,255]


function squareValue(x){
    // your code here
    var arr = [];
    for(var i = 0; i< x.length; i++){
        arr.push(x[i] * x[i]);
    }
    return arr;
}
y = squareValue([1,2,3]);
console.log(y); // should log [1,4,9]

y = squareValue([2,5,8]);
console.log(y); // should log [4,25,64]