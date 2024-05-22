/**
 * An array is a special variable, which can hold more than one value
 * In JS an array is an object datatype 
 */
const students=["Karthik","Rajesh","Mohit"]; //arrays of strings
const numbers=[4,5,6,8,10,9,7];//arrays of numbers
const mixvalues=["Karthik",5,5.55,new Date()];//Different datatypes data is allowed in JS arrays
console.log(mixvalues);
console.log(numbers);
console.log(students);
console.log(typeof(mixvalues));
console.log(typeof(numbers));
console.log(typeof(students));
console.log("*********************************************")
const persons=[];
persons[0]="Rahul";
persons[1]="Prabhat";

const fruits= new Array("Mango","Apple","Banana");
let fruit = fruits[0];
console.log(fruit);
console.log("*********************************************")
//Loop to access all items from array fruits
for(let f in fruits){
    if(fruits[f] == "Mango"){
        console.log("Mango fruit is present in an array");
    }
    console.log(fruits[f]);
}
