let events = [];
events.push({ name: "Concert", category: "Music" });

const musicEvents = events.filter(e => e.category === "Music");

const displayCards = events.map(e => `Event: ${e.name}`);

console.log(displayCards);
