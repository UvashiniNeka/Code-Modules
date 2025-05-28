const events = [{ name: "Art Fair", date: "2025-09-01", seats: 20 }];
const [event] = events;
const { name, date } = event;
console.log(`${name} on ${date}`);

const copy = [...events];
