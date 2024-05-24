/**
 * JS spread operator (...) allows us to quickly copy all or part of an existing 
 * array or object into another array or object
 * 
 */

const numbers1=[5,6,7];
const numbers2=[8,9,10];
const combinedNumbers = [...numbers1, ...numbers2];
console.log(combinedNumbers);

/**
 * The spread operator is often used in combination with destructuring
 */

const numbers =[10,11,12,13,14,15];
const [ten,eleven, ...rest]=numbers;//destructuring of numbers array
console.log(ten);
console.log(eleven);
console.log(rest);


const myHouse={
    builders:"DLF",
    unitSizes:1800,
    aptSizes: "3BHK"
}

const updateHouse={
    builders:"Raheja",
    unitSize:2800,
    aptSize: "3BHK+Servant",
    facilitie:"5star"
 }

 const myUpdatedHouse={...myHouse,...updateHouse};
 console.log(myUpdatedHouse);
