const nums = [1, 2, 3, 4, 5];

const result = nums.map(nums => nums * 2);
const even = nums.filter(nums =>nums % 2 === 0);
const sum = nums.reduce((acc, num) => acc + num,0);
console.log(result);
console.log(even);
console.log(sum);
for (let i = 0; i < 3; i++) {
    setTimeout(() => console.log(i), 0);
}