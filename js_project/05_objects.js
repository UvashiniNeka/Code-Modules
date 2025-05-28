function Event(name, date, seats) {
  this.name = name;
  this.date = date;
  this.seats = seats;
}

Event.prototype.checkAvailability = function () {
  return this.seats > 0;
};

const meetup = new Event("Workshop", "2025-08-01", 20);
console.log(Object.entries(meetup));
