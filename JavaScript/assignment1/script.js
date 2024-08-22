var input1 = document.getElementById("input1");
var input2 = document.getElementById("input2");

var add = document.getElementById("add");
var sub = document.getElementById("sub");
var mul = document.getElementById("mul");
var div = document.getElementById("div");

add.addEventListener("click", () => {
  let num1 = Number(input1.value);
  let num2 = Number(input2.value);
  //   console.log(`Addition is : ${num1 + num2}`);
  result.innerHTML = `Addition is : ${num1 + num2}`;
  //   alert(`Addition is : ${num1 + num2}`);
});

sub.addEventListener("click", () => {
  let num1 = Number(input1.value);
  let num2 = Number(input2.value);
  //   console.log(`Suubtraction is : ${num1 - num2}`);
  //   alert(`Suubtraction is : ${num1 - num2}`);
  result.innerHTML = `Subtraction is : ${num1 - num2}`;
});

mul.addEventListener("click", () => {
  let num1 = Number(input1.value);
  let num2 = Number(input2.value);
  //   console.log(`Multiplication is : ${num1 * num2}`);
  //   alert(`Multiplication is : ${num1 * num2}`);
  result.innerHTML = `Multiplication is : ${num1 * num2}`;
});

div.addEventListener("click", () => {
  let num1 = Number(input1.value);
  let num2 = Number(input2.value);
  try {
    if (num2 == 0) {
      alert("cannot divide by zero");
    }
    result.innerHTML = `Division is : ${num1 / num2}`;
  } catch (error) {
    console.log(error);
  }
  //   console.log(`Division is : ${num1 / num2}`);
  //   alert(`Division is : ${num1 / num2}`);
});
