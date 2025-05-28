document.getElementById("regForm").addEventListener("submit", function(e) {
  e.preventDefault();
  const { name, email, event } = e.target.elements;
  if (!name.value || !email.value) {
    alert("Please fill all fields.");
  } else {
    alert(`Registered for ${event.value}`);
  }
});
