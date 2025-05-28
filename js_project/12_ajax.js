const data = { name: "User", event: "Seminar" };
setTimeout(() => {
  fetch("https://jsonplaceholder.typicode.com/posts", {
    method: "POST",
    body: JSON.stringify(data),
    headers: { "Content-Type": "application/json" }
  })
  .then(res => res.json())
  .then(res => console.log("Success", res))
  .catch(err => console.error("Error", err));
}, 2000);
