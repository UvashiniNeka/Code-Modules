const events = [
  { name: "Music Fest", date: "2025-07-01", seats: 10 },
  { name: "Past Event", date: "2023-01-01", seats: 0 },
];

events.forEach(event => {
  if (new Date(event.date) > new Date() && event.seats > 0) {
    console.log(`${event.name} is available`);
  }
});

function register(event) {
  try {
    if (event.seats > 0) {
      event.seats--;
    } else {
      throw new Error("No seats available");
    }
  } catch (e) {
    console.error(e.message);
  }
}
