const nums = [1, 2, 3, 4];
const array = [nums.length];
let total = 1;

var produto = nums.map((num) => {
    return total *= num;
});

console.log(total)

// const nums = [1, 2, 3, 4];
// let total = 1;

// for(let aux = 0; aux < nums.length; aux ++) {
//     total *= nums[aux];
//     console.log(nums[aux])
// }

// console.log(total)