function greeting() {
  var msg = "hii";

  function sayHi() {
    console.log(msg);
  }
  return sayHi;
}
let hi = greeting();
hi();
