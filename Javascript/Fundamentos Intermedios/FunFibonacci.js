// Fibonacci Function #1 (No recursivo)

function fib(n){
    var a = 0;
    var b = 1;

    console.log(a);
    console.log(b);

    for(i = 3; i < n; i++){
        var c = a + b;
        console.log(c);
        a = b;
        b = c;
    }
}
// fib(12);

// Fibonacci Function #2 (Recursivo) 0 1 1 2 3 5 8 13 21 34 55 89
function fib(n){
    if(n == 0 || n == 1){
        return n;
    } else {
        return fib(n - 1) + fib(n - 2);
    }
}

for (var i = 0; i < 12; i++){
    console.log(fib(i));
}