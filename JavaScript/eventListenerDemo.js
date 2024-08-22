var id = document.getElementById("heading");

id.addEventListener("click", () => {
  alert("Button is clicked");
  id.innerHTML = "second button shifted";
});
