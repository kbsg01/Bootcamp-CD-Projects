// Ex1
for(var i=0; i<5;i++){   
    console.log(i);
 }
//  output: 0, 1, 2, 3, 4
//  variable    | i           |
//  value       | 0=>1=2=>3=>4|

// Ex2
for(var i=0; i<5; i++)
{
   i = i + 1;  
   console.log(i);
}
//  output: 1, 3, 5
//  variable    | i               |
//  value       | 0=>1=>2=>3=>4=>5|

// Ex3
for(var i=0; i<5; i++)
{
   i = i + 3; 
   console.log(i);
}
//  output: 3, 7
//  variable    | i       |
//  value       | 0=>3=>4=>7|

// Ex4
function y(num1, num2){   
    return num1+num2;
 }
 console.log(y(2,3))
 console.log(y(3,5))
//  output: 5, 8
//  variable    | y      |
//  value       | 5 => 8 |

// Ex5
function y(num1, num2){
    console.log(num1);   
    return num1+num2;
 }
 console.log(y(2,3))
 console.log(y(3,5))
//  output: 2, 5, 3, 8
//  variable    | y      |
//  value       | 2=>5=>3=>8 |

// Ex6
a = 15;
console.log(a);
function y(a){
   console.log(a);   
   return a;
}
b = y(10);
console.log(b);

//  output: 15, 10, 10
//  variable    | a              | b
//  value       | 15=>10         | 10

// Ex7
a = 15;
console.log(a);
function y(a){
   console.log(a);   
   return a*2;
}
b = y(10);
console.log(b);

//  output: 15, 10, 20
//  variable    | a           | b
//  value       | 15=>10      | 10