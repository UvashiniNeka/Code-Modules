const events = [
  { name: "Yoga Class", seats: 10 }
];

const container = document.getElementById("events");
events.forEach(e => {
  const card = document.createElement("div");
  card.innerText = `${e.name} - Seats: ${e.seats}`;
  container.appendChild(card);
});
