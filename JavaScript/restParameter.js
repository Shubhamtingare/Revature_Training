function calculation(...input) {
  let sum = 0;
  for (let i of input) {
    sum += i;
  }
  return sum;
}

console.log(calculation(1, 2));
console.log(calculation(1, 2, 3));
console.log(calculation(1, 2, 3, 4));
console.log(calculation(1, 2, 3, 4, 5));
