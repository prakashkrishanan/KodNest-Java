let x=10;

function demo(){
console.log(x);
}

demo();
let name="Prakash";
console.log("Hello "+name);
let name1="Saranya";
console.log(`Hi ${name1}`);
const arr=[10,20];

var [a,b]=arr;

console.log(a);
const user={
name2:"Prakash",
age:21
};

const {name2,age}=user;
console.log(user);
const a1=[1,2];

const b1=[...a1,3,4];

console.log(b1);
function sum(...nums){
return nums;
}

console.log(sum(1,2,3));