// Mock async call using fetch
fetch("https://jsonplaceholder.typicode.com/posts")
  .then(res => res.json())
  .then(data => console.log(data))
  .catch(err => console.error(err));

async function loadData() {
  try {
    console.log("Loading...");
    let res = await fetch("https://jsonplaceholder.typicode.com/posts");
    let data = await res.json();
    console.log(data);
  } catch (e) {
    console.error(e);
  }
}
