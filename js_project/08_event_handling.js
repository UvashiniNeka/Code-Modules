document.getElementById("registerBtn").onclick = () => alert("Registered!");
document.getElementById("categorySelect").onchange = e => console.log("Category:", e.target.value);
document.getElementById("searchBox").onkeydown = e => console.log("Key:", e.key);
